package com.jaimetorres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paciente {
	
	@Id
	private Integer id;
	private Integer numeroIdentificacion;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(Integer numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
