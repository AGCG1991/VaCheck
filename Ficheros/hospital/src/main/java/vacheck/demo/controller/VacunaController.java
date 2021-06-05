package vacheck.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import vacheck.demo.model.Vacuna;

@Controller
public class VacunaController {

    @RequestMapping("/vacuna")
    public String listadoVacunas(Model model) {
        List<Vacuna> vacunas = new ArrayList<>();

        Vacuna v = new Vacuna();
        v.setMarca("Pfizer");
        vacunas.add(v);

        v = new Vacuna();
        v.setMarca("Moderna");
        vacunas.add(v);

        v = new Vacuna();
        v.setMarca("AstraZeneca");
        vacunas.add(v);

        v = new Vacuna();
        v.setMarca("Johnson & Johnson");
        vacunas.add(v);

        model.addAttribute("listaVacunas",vacunas);

        return "vacuna/index";
    }


    @RequestMapping("/vacuna/add")
    public String addConsulta(Model model) {
        model.addAttribute("vacuna", new Vacuna());
        return "vacuna/add";
    }

    @RequestMapping("/vacuna/edit/{id}")
    public String editVacunas(Model model) {
        return "vacuna/index";
    }

    @RequestMapping("/vacuna/delete/{id}")
    public String deleteVacunas() {
        return "redirect:/vacuna";
    }

}
