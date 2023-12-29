package com.jaimetorres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cita {
	@Id
	private Integer id;
	private Integer idPaciente;
	private Integer idMedico;
	private String fecha;
	private String hora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
