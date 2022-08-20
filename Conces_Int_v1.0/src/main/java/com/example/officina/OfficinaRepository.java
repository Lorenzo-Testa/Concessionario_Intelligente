package com.example.officina;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficinaRepository  extends CrudRepository<Officina, String>{

}
