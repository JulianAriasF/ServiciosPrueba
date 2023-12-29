package com.jaimetorres.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimetorres.entity.Medicina;
import com.jaimetorres.entity.PacienteDto;
import com.jaimetorres.repository.IMedicoAgendaRepo;
import com.jaimetorres.repository.IPacienteRepo;
import com.jaimetorres.service.IPacienteService;

@Service
public class PacienteServiceImp implements IPacienteService {

	@Autowired
	 IPacienteRepo pacienteRepo;
	@Autowired
	IMedicoAgendaRepo MedicoRepo;
	
	@Override
	public List<Medicina> buscarMedicinaByPaciente(Integer identificacion) {
		List<Medicina> medicina = pacienteRepo.medicamentoByPaciente(identificacion);
		return medicina;
	}
	@Override
	public List<PacienteDto> PacienteByAgenda(String fecha, String horaInicio,String horaFin) {
		 List<PacienteDto> listAgenda = MedicoRepo.PacienteByAgenda(fecha, horaInicio, horaFin);
		return listAgenda;
	}

}