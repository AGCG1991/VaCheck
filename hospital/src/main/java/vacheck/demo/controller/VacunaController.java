package vacheck.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import vacheck.demo.model.Vacuna;
import vacheck.demo.service.VacunaService;


@Controller
public class VacunaController {

	@Autowired
	VacunaService vacunaService;
	
    @RequestMapping("/vacuna")
    public String listadoVacunas(Model model) {
        List<Vacuna> vacunas = vacunaService.getAll();

        model.addAttribute("listaVacunas",vacunas);

        return "vacuna/index";
    }

    @RequestMapping("/vacuna/add")
    public String addVacunas(Model model) {
    	
    	model.addAttribute("vacuna", new Vacuna());
		return "vacuna/add";
    }
    
	@PostMapping("/vacuna/save")
	public String saveVacuna(Vacuna v) {
		vacunaService.save(v);
		return "redirect:/vacuna";
		
	}

    @RequestMapping("/vacuna/edit/{id}")
    public String editVacunas(@PathVariable("id") Integer id,Model model) {
    	model.addAttribute("vacuna",vacunaService.getById(id));
        return "vacuna/index";
    }

    @RequestMapping("/vacuna/delete/{id}")
    public String deleteVacunas(@PathVariable("id") Integer id) {
    	vacunaService.delete(id);
        return "redirect:/vacuna";
    }

	@RequestMapping("/vacuna/view/{id}")
	public String viewpaciente(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("vacuna",vacunaService.getById(id));
		return "vacuna/view";
	}
}
