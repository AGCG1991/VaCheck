package vacheck.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import vacheck.demo.model.Vacuna;


public class VacunaTest {
	
	Vacuna vacuna;

	@BeforeEach
	public void init() {
		vacuna= new Vacuna();
	}
	@AfterEach
	public void terminate() {
		vacuna = null;
	}
	
	@Test
	public void marcaNoEsUnaCadenaVacia() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> vacuna.setMarca(""));
		assertEquals("Cadena vacia no valida", exception.getMessage());
		
	}
	
	@Test
	public void DosisNoNegativa() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> vacuna.setDosisenstock(-1));
		assertEquals("La dosis debe ser positiva", exception.getMessage());
	}
	
	
	
}

