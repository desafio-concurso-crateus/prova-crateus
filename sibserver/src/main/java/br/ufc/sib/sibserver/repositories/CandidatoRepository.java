package br.ufc.sib.sibserver.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufc.sib.sibserver.model.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, String	> {

}
