package com.crosales.entity;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)  //suprime la serialización de propiedades del JSON
public class PokemonRespuesta2 {
	
	private int id;
    private ArrayList<PokemonAPI2> forms;   // ArrayList del objeto PokemonAPI2
    private ArrayList<Types> types;         // ArrayList del objeto Types
    
    
    /*Getters y setters*/
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<PokemonAPI2> getForms() {
		return forms;
	}

	public void setForms(ArrayList<PokemonAPI2> forms) {
		this.forms = forms;
	}

	public ArrayList<Types> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<Types> types) {
		this.types = types;
	}

    
}
