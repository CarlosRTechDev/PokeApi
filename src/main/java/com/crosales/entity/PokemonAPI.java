package com.crosales.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)  //suprime la serialización de propiedades del JSON
public class PokemonAPI {

	/* Se crea el campo number ya que en la URL (Ejemplo: https://pokeapi.co/api/v2/pokemon?limit=721) no se cuenta con id, solo tiene los 
	 * parametros name y url*/
    private int number;
    private String name;
    private String url;

    
    /* GETTERS y SETTERS*/
    
    /* Se configura este método para cortar el numero la url del pokemon y así number tome el lugar como id */
	public int getNumber() {
		String[] urlPartes = url.split("/");
	    return Integer.parseInt(urlPartes[urlPartes.length - 1]);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
