package vacheck.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vacheck.demo.model.Consulta;


class ConsultaTest {

Consulta consulta;
	
	
	@BeforeEach
	public void init() {
		consulta= new Consulta();
	}
	@AfterEach
	public void terminate() {
		consulta = null;
	}
	
	
	@Test
public void IdNoEsNegativo() {
		
		
		 
		Exception exception = assertThrows(RuntimeException.class, ()-> consulta.setId(-1));
		assertEquals("No se admiten numeros negativos", exception.getMessage());
		
	}

	
	@Test
public void citaNoEsVacio() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> consulta.setCitaMedica(""));
		assertEquals("Cadena vacia no valida", exception.getMessage());
		
	
}
	@Test
	public void diagnosticoNoEsVacio() {
			
			Exception exception = assertThrows(RuntimeException.class, ()-> consulta.setDiagnostico(""));
			assertEquals("Cadena vacia no valida", exception.getMessage());
			
		
	}
	@Test
	public void enfermedadNoEsVacio() {
			
			Exception exception = assertThrows(RuntimeException.class, ()-> consulta.setEnfermedad(""));
			assertEquals("Cadena vacia no valida", exception.getMessage());
			
		
	}
	
	@Test
	public void vacunaNoEsVacio() {
			
			Exception exception = assertThrows(RuntimeException.class, ()-> consulta.setVacunaId(""));
			assertEquals("Cadena vacia no valida", exception.getMessage());
			
		
	}
	


}