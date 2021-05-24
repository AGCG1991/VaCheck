package vacheck.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.CitaMedica;
import vacheck.demo.service.CitaMedicaService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CitaMedicaController {

    @Autowired
    CitaMedicaService citaMedicaService;

    @RequestMapping("/citamedica")
    public String listadoCitas(Model model) {
        List<CitaMedica> citas = citaMedicaService.getAll();
        /*List<CitaMedica> citas = new ArrayList<>();

        CitaMedica ci = new CitaMedica();

        ci.setIdCita(3);
        ci.setHospitalAsignado("Clinico");
        ci.setFechaCita(28/3/2021);
        citas.add(ci);
*/
        model.addAttribute("listaCitas", citas);

        return "citamedica/index";
    }

    @RequestMapping("/citamedica/add")
    public String addCita(Model model) {
        model.addAttribute("cita", new CitaMedica());
        return "citamedica/add";
    }

    @PostMapping("/citamedica/save")
    public String saveCita(CitaMedica ci){
        citaMedicaService.save(ci);
        return "redirect:/citamedica";
    }

    @RequestMapping("/citamedica/edit/{IdCita}")
    public String editCita(@PathVariable("IdCita") Integer IdCita, Model model) {
        model.addAttribute("cita", citaMedicaService.getById(IdCita));
        return "citamedica/add";
    }

    @RequestMapping("/citamedica/view/{IdCita}")
    public String viewCita(@PathVariable("IdCita") Integer IdCita, Model model) {
        model.addAttribute("cita", citaMedicaService.getById(IdCita));
        return "citamedica/view";
    }

    @RequestMapping("/citamedica/delete/{IdCita}")
    public String deleteCita(@PathVariable("IdCita") Integer IdCita) {
        citaMedicaService.delete(IdCita);
        return "redirect:/citamedica";
    }



}
