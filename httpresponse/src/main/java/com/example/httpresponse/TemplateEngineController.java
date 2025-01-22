package com.example.httpresponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class TemplateEngineController {
    
    @GetMapping("test-template")
    public String renderMyTemplateEngine(
        @RequestParam("name") String name,
        Model model
    ){
        model.addAttribute("name", name);
        return "mytemplates.html";
    }
}
