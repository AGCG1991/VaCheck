package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.Sanitario;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SanitarioController {

    @RequestMapping("/sanitario")
    public String listadoSanitario(){
        List<Sanitario> Sanitario = new ArrayList<>();

        return "sanitario/index";
    }

    @RequestMapping("/sanitario/add")
    public String addSanitario(Model model){
        return("sanitario/add");
    }

    @RequestMapping("/sanitario/edit/{id}")
    public String editSanitario(Model model){
        return("sanitario/edit");
    }

    @RequestMapping("/sanitario/delete/{id}")
    public String deleteSanitario(){
        return listadoSanitario();
    }
}