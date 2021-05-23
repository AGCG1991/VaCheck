package trabajo.vacheck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import trabajo.vacheck.hospital.Sanitario;

@Controller
public class SanitarioController {

    @RequestMapping("/Sanirario")
    public String listadoSanitario(){
        List<Sanitario> Sanitario = new arraylist<>();

        return "Sanitario/index";
    }

    @RequestMapping("/Sanirario/add")
    public String addSanitario(){
        return("Sanitario/add");
    }

    @RequestMapping("/Sanirario/edit/{id}")
    public String editSanitario(){
        return("Sanitario/edit");
    }

    @RequestMapping("/Sanirario/delete/{id}")
    public String deleteSanitario(){
        return listadoSanitario();
    }
}
