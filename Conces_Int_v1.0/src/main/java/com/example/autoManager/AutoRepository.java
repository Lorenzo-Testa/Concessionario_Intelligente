package com.example.autoManager;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends CrudRepository<Auto, String>{
	
	List<Auto> findAllByVendutaAndMarca(boolean b,String marca);
	
	/*
	@Query(value = "SELECT * FROM COUNTRY WHERE COUNTRY_NAME LIKE :cl")
    List<Auto> Nome(@Param("cl") String cl);
	 * se una quesry modifica il db:
	 * @Transactional
     *  @Modifying
	 */
}
