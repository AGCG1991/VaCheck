package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.Sanitario;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IniciarSesionController {

    @RequestMapping("/")
    public String listadoSanitario(){
        List<Sanitario> IniciarSesion = new ArrayList<>();

        return "index";
    }

    @RequestMapping("/tablero/ablero")
    public String addIniciarSesion(Model model){
        return("/tablero");
    }

  
}