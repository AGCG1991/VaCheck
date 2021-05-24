package vacheck.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vacheck.demo.model.Hospital;
import vacheck.demo.service.HospitalService;

@Controller
public class HospitalController {


	@Autowired
	HospitalService hospitalService;

	@RequestMapping("/hospital")
	public String listadoHospitales(Model model) {
		List<Hospital> hospitales= hospitalService.getAll();

		model.addAttribute("listaHospital",hospitales);

		return "hospital/index";
	}



	@RequestMapping("/hospital/add")
	public String addHospital(Model model) {
		model.addAttribute("hospital",new Hospital());
		return "hospital/add";
	}

	@PostMapping("/hospital/save")
	public String saveHospital(Hospital u) {
		hospitalService.save(u);
		return "redirect:/hospital";
	}



	@RequestMapping("/hospital/edit/{id}")
	public String edithospital(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("usuario",hospitalService.getById(id));
		return "hospital/add";
	}

	@RequestMapping("/hospital/view/{id}")
	public String viewhospital(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("hospital",hospitalService.getById(id));
		return "hospital/view";
	}



	@RequestMapping("/hospital/delete/{id}")
	public String deleteHospital(@PathVariable("id") Integer id) {
		hospitalService.delete(id);
		return "redirect:/hospital";
	}


}