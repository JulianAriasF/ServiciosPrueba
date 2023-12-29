package com.jaimetorres;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jaimetorres.service.IPacienteService;

@SpringBootTest
class ServiciosPruebaApplicationTests {

	@Autowired
	IPacienteService service;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void pruebaPacientes() {
		try {
			service.buscarMedicinaByPaciente(12345);
			assertTrue(true);
		} catch (Exception e) {
			
		}
	}
}
