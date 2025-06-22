package com.nareshit.ecommerce.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/welcome")
    public String welcome(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "welcome";
    }

    @GetMapping("/admin")
    public String adminPage(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "admin";
    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "user";
    }
}
