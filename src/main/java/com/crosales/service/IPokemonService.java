package com.crosales.service;

import java.util.List;

import com.crosales.entity.Pokemon2;
import com.crosales.entity.PokemonRespuesta;
import com.crosales.entity.PokemonRespuesta2;



public interface IPokemonService {

	/* METODOS DE BASE DE DATOS H2 */
	List<Pokemon2> buscarTodos();
	List<Pokemon2> buscarPorApodo(String apodo);
	List<Pokemon2> buscarPorEspecie(String especie);
//	void guardar(Pokemon2 pokemon);
	void guardarPokeAleatorio(Pokemon2 pokemon);
	
	
	/* METODOS DE API DE POKEMON
	 * Se crearon dos entidades/modelos porque devulven diferentes resultados en el JSON de la API dependiendo de la URL a consultar
	 */
	public PokemonRespuesta traerTodosPokeApi();
	public PokemonRespuesta2 buscarPorNombreIdPoke(String name);
	
	
}
