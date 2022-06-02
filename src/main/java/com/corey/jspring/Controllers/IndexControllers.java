package com.corey.jspring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexControllers {
    @GetMapping("/")
    public String index(Model model){
        return "Index";

    }
    @GetMapping("/NumberCruncher")
    public String NumberCruncher(Model model){
        return "Layouts/NumberCruncher/Index";
    }

}

