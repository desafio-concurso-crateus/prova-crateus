package com.ufc.crateus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.crateus.model.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long>{
	
	public List<Candidato> findAllByOrderByNomeAsc();

}
