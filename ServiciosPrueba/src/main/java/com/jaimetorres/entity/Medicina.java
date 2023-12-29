package com.jaimetorres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicina {
	
	@Id
	private Long id;
	private Integer idCita;
	private Integer numeroLote;
	private String nombreMedicina;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getIdCita() {
		return idCita;
	}
	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
	public Integer getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}
	public String getNombreMedicina() {
		return nombreMedicina;
	}
	public void setNombreMedicina(String nombreMedicina) {
		this.nombreMedicina = nombreMedicina;
	}
	

}

