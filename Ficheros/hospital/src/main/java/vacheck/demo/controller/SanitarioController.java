package vacheck.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.Sanitario;
import vacheck.demo.service.SanitarioService;

import java.util.ArrayList;
import java.util.List;



@Controller
public class SanitarioController {

    @Autowired
    SanitarioService SanitarioService;

    @RequestMapping("/sanitario")
    public String listadoSanitario(Model model) {
        List<Sanitario> sanitarios = SanitarioService.getAll();

        model.addAttribute("listaSanitario", sanitarios);

        return "sanitario/index";
    }

    @PostMapping("/sanitario/save")
    public String saveSanitario(Sanitario s) {

        SanitarioService.save(s);
        return "redirect:/sanitario";

    }

    @RequestMapping("/sanitario/add")
    public String addSanitario(Model model) {
        model.addAttribute("sanitario", new vacheck.demo.service.SanitarioService());
        return "sanitario/add";
    }

    @RequestMapping("/sanitario/edit/{IdSanitario}")
    public String editSanitario(@PathVariable("IdSanitario") Integer IdSanitario, Model model) {
        model.addAttribute("sanitario", SanitarioService.getById(IdSanitario));
        return "Sanitario/add";
    }

    @RequestMapping("/sanitario/view/{IdSanitario}")
    public String viewSanitario(@PathVariable("IdSanitario") Integer IdSanitario, Model model) {
        model.addAttribute("sanitario", SanitarioService.getById(IdSanitario));
        return "sanitario/view";
    }

    @RequestMapping("/sanitario/delete/{IdSanitario}")
    public String deleteSanitario(@PathVariable("IdSanitario") Integer IdSanitario) {
        SanitarioService.delete(IdSanitario);
        return "redirect:/sanitario";
    }
}