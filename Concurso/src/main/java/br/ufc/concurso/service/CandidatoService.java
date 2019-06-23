package br.ufc.concurso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.concurso.entity.Candidato;
import br.ufc.concurso.repository.CandidatoRepository;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoRepository candidatoRepository;

	public Candidato addNovoCandidato(Candidato candidato) {
		return candidatoRepository.save(candidato);
	}
	
	public Candidato getByCpf(Candidato candidato) {
		return candidatoRepository.findByCpf(candidato.getCpf());
	}

}
