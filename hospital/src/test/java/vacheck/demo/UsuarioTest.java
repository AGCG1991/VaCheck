package vacheck.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import vacheck.demo.model.Usuario;


public class UsuarioTest {
	
	Usuario usuario;

	@BeforeEach
	public void init() {
		usuario= new Usuario();
	}
	@AfterEach
	public void terminate() {
		usuario = null;
	}
	
	@Test
	public void inicialmenteNoVacunado() {
		assertEquals(usuario.isEstaVacunado(),false);
	}
	@Test
	public void nombreNoEsUnaCadenaVacia() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> usuario.setNombre(""));
		assertEquals("Cadena vacia no valida", exception.getMessage());
		
	}
	
	@Test
	public void contrasenyaMayor() {
		
		Exception exception = assertThrows(RuntimeException.class, ()-> usuario.setContrasenya("123"));
		assertEquals("Minimo de 8 caracteres para la contraseña", exception.getMessage());
	}
	
	
	
}
