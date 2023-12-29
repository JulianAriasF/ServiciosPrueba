package com.jaimetorres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaimetorres.entity.Medicina;
import com.jaimetorres.entity.PacienteDto;
import com.jaimetorres.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	IPacienteService pacienteService;
	
	@GetMapping("/buscarMedicamento/{identificacion}")
	public  ResponseEntity<List<Medicina>>  buscar(@PathVariable Integer identificacion){
		List<Medicina> listMedicina = pacienteService.buscarMedicinaByPaciente(identificacion);
		return  new ResponseEntity<List<Medicina>>(listMedicina, HttpStatusCode.valueOf(200));
	}
	@GetMapping("/buscarAgenda/{fecha}/{horaInicio}/{horaFin}")
	public List<PacienteDto> agendaMedico(@PathVariable String fecha,@PathVariable String horaInicio, @PathVariable String horaFin ){
		List<PacienteDto> listAgenda = pacienteService.PacienteByAgenda(fecha, horaInicio, horaFin);
		return listAgenda;
	}
	
}