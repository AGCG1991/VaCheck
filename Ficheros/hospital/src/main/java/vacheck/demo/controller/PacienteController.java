package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PacienteController {
	@RequestMapping("/paciente")
	public String listadoPaciente() {
		return "paciente/index";
	}
	
	
	@RequestMapping("/paciente/add")
	public String addPaciente() {
		return "paciente/add";
	}
	
	
	@RequestMapping("/paciente/edit/{id}")
	public String editPaciente() {
		return "paciente/edit";
	}
	
	
	@RequestMapping("/paciente/delete/{id}")
	public String deletePaciente() {
		return "redirect/:paciente";
	}
}
