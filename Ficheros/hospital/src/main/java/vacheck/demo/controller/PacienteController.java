package vacheck.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vacheck.demo.model.Paciente;
import vacheck.demo.service.PacienteService;

@Controller
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	@RequestMapping("/paciente")
	public String listadoPaciente(Model model) {
		List<Paciente> pacientes = pacienteService.getAll();

		

		model.addAttribute("listaPaciente", pacientes);

		return "paciente/index";
	}


	@RequestMapping("/paciente/add")
	public String addPaciente(Model model) {
		model.addAttribute("paciente", new Paciente());
		return "paciente/add";
	}
	
	@PostMapping("/paciente/save")
	public String savePaciente(Paciente p) {
		pacienteService.save(p);
		return "redirect:/paciente";
	}

	@RequestMapping("/paciente/edit/{id}")
	public String editPaciente(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("paciente",pacienteService.getById(id));
		return "paciente/add";
	}
	
	@RequestMapping("/paciente/view/{id}")
	public String viewpaciente(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("paciente",pacienteService.getById(id));
		return "paciente/view";
	}


	@RequestMapping("/paciente/delete/{id}")
	public String deletePaciente(@PathVariable("id") Integer id) {
		pacienteService.delete(id);
		return "redirect:/paciente";
	}
}