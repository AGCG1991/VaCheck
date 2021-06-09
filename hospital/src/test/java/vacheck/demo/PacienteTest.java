package vacheck.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vacheck.demo.model.Paciente;

public class PacienteTest {
	
	Paciente paciente;
	
	@BeforeEach
	public void init() {
		paciente = new Paciente();
	}
	
	@AfterEach
	public void terminate() {
		paciente = null;
	}
	
	@Test
	public void inicialmenteNoHaFallecido() {
		assertEquals(paciente.isHaFallecido(),false);
	}
	
	@Test
	public void nombreNoEsUnaCadenaVacia() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> paciente.setNombre(""));
		assertEquals("Cadena vacia no valida.", exception.getMessage());
		
	}
	
	@Test
	public void apellidoNoEsUnaCadenaVacia() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> paciente.setApellido(""));
		assertEquals("Cadena vacia no valida.", exception.getMessage());
		
	}

}
