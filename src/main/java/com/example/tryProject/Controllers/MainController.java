package com.example.tryProject.Controllers;

import com.example.tryProject.models.OrderDetails;
import com.example.tryProject.repo.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @Autowired
    private OrderDetailsRepository orderRepo;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title","Main Window");
        model.addAttribute("name","John");
        return "home";
    }

    @GetMapping("/Services")
    public String Services(Model model) {
        model.addAttribute("title","Services");
        Iterable<OrderDetails> order = orderRepo.findAll();
        model.addAttribute("order",order);
        return "Services";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title","About Service");
        return "about";
    }
    
    @GetMapping("/order_done")
    public String order_done(Model model) {
        model.addAttribute("title","Order is Accepted");
        Iterable<OrderDetails> orderDone = orderRepo.findAll();
        model.addAttribute("order_done",orderDone);
        return "order_done";
    }

    @PostMapping("/Services")
    public String makeAnOrder(@RequestParam String customer_name, @RequestParam String customer_surname, @RequestParam Long customer_phone, @RequestParam Long order_numbers, @RequestParam String address, Model model) {
        
        return "redirect:/order_done";
    }

}





