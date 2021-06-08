package vacheck.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vacheck.demo.model.CitaMedica;

public class CitaMedicaTest {
	
	CitaMedica citamedica;
	
	@BeforeEach
	public void init1() {
		citamedica = new CitaMedica();
	}
	
	@AfterEach
	public void terminate() {
		citamedica = null;
	}
	
	@Test
	public void idCitaNoEstaVacio() {
		Exception e = assertThrows(RuntimeException.class, ()-> citamedica.setIdCita(-1));
		//assertEquals((citamedica.getIdCita() == null) || (citamedica.getIdCita() < 1) , false);
		assertEquals("ID de la cita no valido.", e.getMessage());
	}
	
	@Test
	public void fechaCitaExiste() {
		Exception e = assertThrows(RuntimeException.class, ()-> citamedica.setFechaCita(null));
		assertEquals("No hay fecha asignada.", e.getMessage());
	}
	
	@Test
	public void hospitalAsignadoExiste() {
		Exception e = assertThrows(RuntimeException.class, ()-> citamedica.setHospitalAsignado(""));
		assertEquals("No hay hospital asignado.", e.getMessage());
	}

}
