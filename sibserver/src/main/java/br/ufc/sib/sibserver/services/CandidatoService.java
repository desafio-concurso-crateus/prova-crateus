package br.ufc.sib.sibserver.services;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.sib.sibserver.model.Candidato;
import br.ufc.sib.sibserver.repositories.CandidatoRepository;
import br.ufc.sib.sibserver.services.exception.CampoInvalidoException;
import br.ufc.sib.sibserver.services.exception.RegistroJaExistenteException;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public Candidato insert(Candidato candidato)
			throws CampoInvalidoException, RegistroJaExistenteException {
		if (!validate(candidato.getEmail()))
			throw new CampoInvalidoException("EMAIL", candidato.getEmail());
		if (candidato.getNome().length() < 3 || candidato.getNome().length() > 60)
			throw new CampoInvalidoException("NOME", candidato.getNome());
		Optional<Candidato> optionalCandidato = candidatoRepository.findById(candidato.getCpf());

		if (optionalCandidato.isPresent())
			throw new RegistroJaExistenteException("CPF", candidato.getCpf());

		return candidatoRepository.save(candidato);

	}

	private static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
}
