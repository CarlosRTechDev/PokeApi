package com.crosales.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.crosales.entity.Pokemon2;
import com.crosales.service.IPokemonService;



@RestController
@RequestMapping("/pokemon-db")
public class PokemonController {
	
	/* Inyectar el service para usar los metodos */
	@Autowired
	private IPokemonService servicePokemon;
	

	
	
	/* MUESTRA A TODOS LOS POKEMON BD */
	@GetMapping("/pokemon")
	@ResponseStatus(HttpStatus.OK)
	public List<Pokemon2> buscarTodos(){
		return servicePokemon.buscarTodos();
	}
	
	
	/* 
	 * Este metodo MUESTRA A LOS POKEMON POR APODO de la BD.
	 * @PathVariable -> sirve para hacer el mapping de la Entity/modelo y la url, y poder escribir en la url el apodo que se quiere buscar.
	 */
	@GetMapping("/pokemon/apodo/{apodo}")
	@ResponseStatus(HttpStatus.OK)
	public List<Pokemon2> buscarPokeApodo(@PathVariable("apodo") String apodo, Model model){
		List<Pokemon2> poke = servicePokemon.buscarPorApodo(apodo);
		model.addAttribute("apodo", apodo);
		return poke;
	}
	
	
	/* 
	 * Este metodo MUESTRA A LOS POKEMON POR ESPECIE de la BD.
	 * @PathVariable -> sirve para hacer el mapping de la Entity/modelo y la url, y poder escribir en la url la especie que se quiere buscar.
	 */
	@GetMapping("/pokemon/especie/{especie}")
	@ResponseStatus(HttpStatus.OK)
	public List<Pokemon2> buscarPokeEspecie(@PathVariable("especie") String especie, Model model){
		List<Pokemon2> poke = servicePokemon.buscarPorEspecie(especie);
		model.addAttribute("especie", especie);
		return poke;
	}

	
	/*
	 * GUARDA UN POKEMON en la BD con ataque, defensa y salud en aleatorio.
	 * Cuando se crea el registro manda el estatus HTTP: creado y la leyenda: Pokemon capturado!
	 */ 
	@PostMapping("/pokemon")
	@ResponseStatus(HttpStatus.CREATED)
	public String guardarPoke2(@RequestBody Pokemon2 pokemon){ 
		servicePokemon.guardarPokeAleatorio(pokemon);
		return "Pokemon capturado!";
	}
	
	
	/* CAPTURAR/GUARDAR UN POKEMON BD*/
//	@PostMapping("/pokemon")
//	public Pokemon2 guardar(@RequestBody Pokemon2 pokemon){ 
//		servicePokemon.guardar(pokemon);
//		return pokemon;
//	}
	
	

	

	
}	