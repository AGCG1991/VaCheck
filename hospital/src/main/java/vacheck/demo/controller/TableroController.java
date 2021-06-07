package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vacheck.demo.model.CitaMedica;

@Controller
public class TableroController {
    @RequestMapping("/tablero/dashboard")
    public String example()
    {
        return "tablero/dashboard";
    }



}
