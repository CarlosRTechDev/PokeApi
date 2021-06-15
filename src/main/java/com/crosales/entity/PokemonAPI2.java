package com.crosales.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)  //suprime la serialización de propiedades del JSON
public class PokemonAPI2 {

    private String name;

    
    /*Getter y setter*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
