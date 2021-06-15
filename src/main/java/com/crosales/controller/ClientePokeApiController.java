package com.crosales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosales.entity.PokemonRespuesta;
import com.crosales.entity.PokemonRespuesta2;
import com.crosales.service.IPokemonService;



@RestController
@RequestMapping("/poke-cliente")
public class ClientePokeApiController {
	
	/* Inyectar el service para usar los metodos */
	@Autowired
	private IPokemonService servicePokemon;
	

	
	/*  
	/* MUESTRA A LOS 721 POKEMON DE LA API DE POKEMON.
	 * En el JSON devuelve los datos del Pokemon por number, name, url.
	 */
	@GetMapping("/pokemon")
	@ResponseStatus(HttpStatus.OK)
	public PokemonRespuesta obtenerTodosPoke(){
		return servicePokemon.traerTodosPokeApi();
	}
	
	
	/* MUESTRA A UN POKEMON DE LA API POR NOMBRE O ID.
	 * @PathVariable -> sirve para hacer el mapping de la Entity/modelo y la url, y poder escribir en la url el nombre o id del pokemon que se quiere buscar.
	 * En el JSON devuelve los datos del Pokemon por id, Array forms(name), Array types(name).
	 */
	@GetMapping("/pokemon/{name}")
	@ResponseStatus(HttpStatus.OK)
	public PokemonRespuesta2 buscarNombreIdPoke(@PathVariable("name") String name, Model model){
		PokemonRespuesta2 poke = servicePokemon.buscarPorNombreIdPoke(name);
		model.addAttribute("name", name);
		return poke;
	}
		
	
}
