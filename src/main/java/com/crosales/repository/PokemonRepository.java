package com.crosales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crosales.entity.Pokemon2;

//La interface se conecta con la clase Pokemon2 mediante Integer
public interface PokemonRepository extends JpaRepository<Pokemon2, Integer> {
	
	/* QUERY METHODS.
	 * Con JPA se pueden crear metodos de tipo Query(SQL) para buscar datos en especifico 
	 * como apodo o especie de un Pokemon e implementarlos en el PokemonServiceJpa. 
	 */
	List<Pokemon2> findByApodo(String apodo);
	List<Pokemon2> findByEspecie(String especie);

}
