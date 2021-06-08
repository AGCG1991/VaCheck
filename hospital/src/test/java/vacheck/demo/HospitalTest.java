package vacheck.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vacheck.demo.model.Hospital;


class HospitalTest {

Hospital hospital;

	@BeforeEach
	public void init() {
		hospital= new Hospital();
	}
	@AfterEach
	public void terminate() {
		hospital = null;
	}

	@Test
	public void nombreNoEsUnaCadenaVacia() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> hospital.setNombre(""));
		assertEquals("Cadena vacia no valida", exception.getMessage());
	}
	
	@Test
	public void NumeroVacunadosNoNegativo() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> hospital.setNumeroVacunados(-1));
		assertEquals("El numero de vacunados debe ser positivo", exception.getMessage());
	}
	
	
	
	
	
}
