package com.example.tryProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title","Main Window");
        model.addAttribute("name","John");
        return "home";
    }

    @GetMapping("/Services")
    public String Services(Model model) {
        model.addAttribute("title","Services");
        return "Services";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title","About Service");
        return "about";
    }
    


}
