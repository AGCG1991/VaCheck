package vacheck.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.*;
import vacheck.demo.service.UsuarioService;
@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuario")
	public String listadoUsuarios(Model model) {
		List<Usuario> usuarios= usuarioService.getAll();
	
		model.addAttribute("listaUsuario",usuarios);
		
		return "usuario/index";
	}
	
	
	
	@RequestMapping("/usuario/add")
	public String addUsuario(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "usuario/add";
	}
	
	@PostMapping("/usuario/save")
	public String saveUsuario(Usuario u) {
		usuarioService.save(u);
		return "redirect:/usuario";
	}
	
	
	
	@RequestMapping("/usuario/edit/{id}")
	public String editusuario(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("usuario",usuarioService.getById(id));
		return "usuario/add";
	}
	
	@RequestMapping("/usuario/view/{id}")
	public String viewusuario(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("usuario",usuarioService.getById(id));
		return "usuario/view";
	}
	
	
	
	@RequestMapping("/usuario/delete/{id}")
	public String deleteUsuario(@PathVariable("id") Integer id) {
		usuarioService.delete(id);
		return "redirect:/usuario";
	}
	
}
