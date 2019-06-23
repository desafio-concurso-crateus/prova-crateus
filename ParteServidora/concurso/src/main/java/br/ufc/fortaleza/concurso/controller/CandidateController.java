package br.ufc.fortaleza.concurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufc.fortaleza.concurso.model.Candidate;
import br.ufc.fortaleza.concurso.service.CandidateService;

@Controller
@RequestMapping("/api/candidate")
public class CandidateController {
	
	@Autowired
	private CandidateService candidateService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Candidate> listCandidate(){
		return candidateService.listCandidates();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidate addCandidate(@RequestBody Candidate candidate){
		return candidateService.addCandidate(candidate);
	}
}
