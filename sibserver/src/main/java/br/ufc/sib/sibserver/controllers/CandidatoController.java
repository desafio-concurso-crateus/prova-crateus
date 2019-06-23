package br.ufc.sib.sibserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.sib.sibserver.model.Candidato;
import br.ufc.sib.sibserver.services.CandidatoService;
import br.ufc.sib.sibserver.services.exception.CampoInvalidoException;
import br.ufc.sib.sibserver.services.exception.RegistroJaExistenteException;

@RestController
@RequestMapping("/api/candidatos")
public class CandidatoController {

	@Autowired
	private CandidatoService candidatoService;


	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Candidato> insert(@RequestBody Candidato candidato)
			throws CampoInvalidoException, RegistroJaExistenteException {
		
		return new ResponseEntity<Candidato>(candidatoService.insert(candidato), HttpStatus.OK);
	}

}
