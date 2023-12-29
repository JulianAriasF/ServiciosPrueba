package com.jaimetorres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jaimetorres.entity.Medicina;

@Repository
public interface IPacienteRepo extends JpaRepository<Medicina, Long> {

	@Query( value = "select me.* from medicina me inner join cita ci on me.id_cita = ci.id inner join paciente pa"
			+ " on ci.id_paciente = pa.id where pa.documento = :documento", nativeQuery = true)
	List<Medicina> medicamentoByPaciente(@Param("documento") Integer documento);
}

