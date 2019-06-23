package br.ufc.fortaleza.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.fortaleza.concurso.model.Candidate;
import br.ufc.fortaleza.concurso.repository.CandidateRepository;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository repository;
	
	public List<Candidate> listCandidates(){
		return (List<Candidate>) repository.findAll();
	}
	
	public Candidate addCandidate(Candidate candidate){
		return repository.save(candidate);
	}
}
