package br.ufc.concurso.repository;

import org.springframework.data.repository.CrudRepository;

import br.ufc.concurso.entity.Candidato;

public interface CandidatoRepository extends CrudRepository<Candidato, Integer> {

	Candidato findByCpf(String cpf);

}
