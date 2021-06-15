package com.crosales.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Con la anotacion @Entity se puede mapear las propiedades de objeto-relacional */
@Entity
public class Pokemon2 {
    
	@Id //Con esta anotación se hace referencia a que es el id principal de la tabla (PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esta anotación tiene la función de id autoincrementable 
    private Integer id;
    
	@Column(name = "nombre", nullable = false) //@Column crea la columna nombre en la tabla, y con nullable = false se estable que el campo no puede ser nulo.
    private String nombre;
	
    @Column(name = "numero_poke", nullable = false)
    private Long numero_poke;
    
    @Column(name = "apodo", nullable = true) //@Column crea la columna apodo en la tabla, y con nullable = true se estable que el campo puede ser nulo.
    private String apodo;
    
    @Column(name = "especie", nullable = false)
    private String especie;
    
    @Column(name = "ataque", nullable = false)
    private Integer ataque;
    
    @Column(name = "defensa", nullable = false)
    private Integer defensa;
    
    @Column(name = "salud", nullable = false)
    private Integer salud;
    
    @Column(name = "tipos", nullable = false)
    private String tipos;

    
    //Creación de Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumeroPoke() {
		return numero_poke;
	}

	public void setNumeroPoke(Long numero_poke) {
		this.numero_poke = numero_poke;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefensa() {
		return defensa;
	}

	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	
	
	@Override
	public String toString() {
		return "Pokemon2 [id=" + id + ", nombre=" + nombre + ", numero_poke=" + numero_poke + ", apodo=" + apodo
				+ ", especie=" + especie + ", ataque=" + ataque + ", defensa=" + defensa + ", salud=" + salud
				+ ", tipos=" + tipos + "]";
	}
	

	
	
	
	
	

}
