package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsultaController {
	
	
	@RequestMapping("/consulta")
	public String listadoConsulta() {
		return "consulta/index";
	}
	
	
	@RequestMapping("/consulta/add")
	public String addConsulta() {
		return "consulta/add";
	}
	
	
	@RequestMapping("/consulta/edit/{id}")
	public String editConsulta() {
		return "consulta/edit";
	}
	
	
	@RequestMapping("/consulta/delete/{id}")
	public String deleteConsulta() {
		return "redirect/:consulta";
	}
	
	
	
}
