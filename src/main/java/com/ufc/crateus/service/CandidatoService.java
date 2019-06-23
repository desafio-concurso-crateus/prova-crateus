package com.ufc.crateus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.crateus.model.Candidato;
import com.ufc.crateus.repository.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	
	
	public void cadastrarCandidato(Candidato candidato) {
		candidatoRepository.save(candidato);
	}



	public List<Candidato> listar() {
		return candidatoRepository.findAll();
	}
	
	
	public List<Candidato> listarPorOrdemAlfabetica() {
		return candidatoRepository.findAllByOrderByNomeAsc();
	}
	
	

}
