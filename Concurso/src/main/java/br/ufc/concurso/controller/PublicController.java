package br.ufc.concurso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufc.concurso.entity.Candidato;
import br.ufc.concurso.service.CandidatoService;

@Controller
@RequestMapping("/api/public")
public class PublicController {
	@Autowired
	private CandidatoService candidatoService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Candidato> addCandidato(@RequestBody Candidato candidato) {
		if (candidato.isValid()) {
			Candidato cand = candidatoService.getByCpf(candidato);
			if (cand == null)
				return new ResponseEntity<Candidato>(candidatoService.addNovoCandidato(candidato), HttpStatus.OK);
			return new ResponseEntity<Candidato>(HttpStatus.CONFLICT);

		}
		return new ResponseEntity<Candidato>(HttpStatus.BAD_REQUEST);
	}

}
