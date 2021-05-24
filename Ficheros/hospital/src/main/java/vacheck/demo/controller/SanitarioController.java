package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.Sanitario;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SanitarioController {

    @RequestMapping("/Sanitario")
    public String listadoSanitario(){
        List<Sanitario> Sanitario = new ArrayList<>();

        return "Sanitario/index";
    }

    @RequestMapping("/Sanitario/add")
    public String addSanitario(Model model){
        return("Sanitario/add");
    }

    @RequestMapping("/Sanitario/edit/{id}")
    public String editSanitario(Model model){
        return("Sanitario/edit");
    }

    @RequestMapping("/Sanitario/delete/{id}")
    public String deleteSanitario(){
        return listadoSanitario();
    }
}