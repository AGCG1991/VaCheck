package vacheck.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vacheck.demo.model.Consulta;
import vacheck.demo.service.ConsultaService;

@Controller
public class ConsultaController {
	
	@Autowired
	ConsultaService consultaService;
	
	@RequestMapping("/consulta")
	public String listadoConsulta(Model model) {
		
		
		List <Consulta> consulta= consultaService.getAll();
		
		
		model.addAttribute("ListaConsultas", consulta);
		
		return "consulta/index";
	}
	
	
	@PostMapping("/consulta/save")
	public String saveConsulta(Consulta c) {
		
		consultaService.save(c);
		return "redirect:/consulta";
		
	}
	
	@RequestMapping("/consulta/add")
	public String addConsulta(Model model) {
		model.addAttribute("consulta", new Consulta());
		return "consulta/add";
	}
	

	
	 @RequestMapping("/consulta/edit/{id}")
	    public String editConsulta(@PathVariable("id") Integer id, Model model) {
	        model.addAttribute("consulta", consultaService.getById(id));
	        return "consulta/add";
	    }
	
	
	@RequestMapping("/consulta/delete/{id}")
	public String deleteConsulta(@PathVariable("id") Integer id) {
		consultaService.delete(id); 
		return "redirect:/consulta";
	}
	
	
		
	
	
}
