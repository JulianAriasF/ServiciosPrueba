package com.jaimetorres.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jaimetorres.entity.Medicina;
import com.jaimetorres.entity.PacienteDto;

@Component
public interface IPacienteService {

	public List<Medicina> buscarMedicinaByPaciente( Integer identificacion);
		
	public List<PacienteDto> PacienteByAgenda( String fecha,String horaInicio,String horaFin);
}