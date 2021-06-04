package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableroController {
    @RequestMapping("/tablero/dashboard")
    public String example()
    {
        return "tablero/dashboard";
    }
}
