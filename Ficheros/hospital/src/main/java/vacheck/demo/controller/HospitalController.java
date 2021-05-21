package vacheck.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vacheck.demo.model.Hospital;

@Controller
public class HospitalController {
	
	@RequestMapping("/hospital")
	public String listadoHospital() {
		//List<Hospital> hospitales= new ArrayList<>();
		return "hospital/index";
	}
	
	
	
	@RequestMapping("/hospital/add")
	public String addHospital(Model model) {
		return "hospital/add";
	}
	
	
	
	@RequestMapping("/hospital/edit/{id}")
	public String editHospital() {
		return "hospital/edit";
	}
	
	
	
	@RequestMapping("/hospital/delete/{id}")
	public String deleteHospital() {
		return "redirect/:hospital";
	}
	
	
	
}
