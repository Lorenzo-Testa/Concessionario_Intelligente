package com.example.interventi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventoRepository extends CrudRepository<Intervento, idIntervento>{

}
