package com.crosales.entity;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)  //suprime la serialización de propiedades del JSON
public class PokemonRespuesta {
	
	/* ArrayList del objeto PokemonAPI */
    private ArrayList<PokemonAPI> results;

    
    /*Getter y setter*/
	public ArrayList<PokemonAPI> getResults() {
		return results;
	}

	public void setResults(ArrayList<PokemonAPI> results) {
		this.results = results;
	}
 
}
