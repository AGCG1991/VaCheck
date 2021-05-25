package vacheck.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vacheck.demo.model.Paciente;

@Controller
public class PacienteController {
	@RequestMapping("/paciente")
	public String listadoPaciente(Model model) {
		List<Paciente> paciente = new ArrayList<>();

		Paciente p = new Paciente();
		p.setIdPaciente("Pablo");
		paciente.add(p);

		model.addAttribute("listaPaciente", paciente);

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