package vacheck.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableroController {
    @RequestMapping("/tablero")
    public String example()
    {
        return "tablero/tablero";
    }
}
