package vacheck.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vacheck.demo.model.Usuario;
import vacheck.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	@Autowired//inyectamos listo para utilizar
	UsuarioRepository usuarioRepository;
	
	public List<Usuario>getAll(){
		return usuarioRepository.findAll();//devuelve todo lo que tenemos en la base de datos
	}
	
	
	public void save(Usuario u) {
		usuarioRepository.saveAndFlush(u);
	}


	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
		
	}


	public Usuario getById(Integer id) {
		
		
		return usuarioRepository.getOne(id);
	}
	
	
}
