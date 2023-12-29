package com.jaimetorres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jaimetorres.entity.PacienteDto;


public interface IMedicoAgendaRepo extends JpaRepository<PacienteDto, Long>{

	@Query( value = "select p.id,p.nombre, p.apellido from paciente p inner join cita c on p.id = c.id_paciente"
			+ " inner join medico me on me.id = c.id_medico where c.fecha = :fecha and "
			+ "c.hora between :horaInicio and :horaFin", nativeQuery = true)
	List<PacienteDto> PacienteByAgenda(@Param("fecha") String fecha,@Param("horaInicio") String horaInicio,@Param("horaFin") String horaFin);
}
