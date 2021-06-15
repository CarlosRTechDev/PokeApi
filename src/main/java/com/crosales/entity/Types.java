package com.crosales.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)  //suprime la serialización de propiedades del JSON
public class Types {
    
//	public int slot;
	public Type type;
	
	
	//Getters y Setters
	
//	public int getSlot() {
//		return slot;
//	}
//	public void setSlot(int slot) {
//		this.slot = slot;
//	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	
	

}
