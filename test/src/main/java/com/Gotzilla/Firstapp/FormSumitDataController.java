package com.Gotzilla.Firstapp;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormSumitDataController {
    
    @PostMapping("login")
    public String login(
        @ModelAttribute  UserCredential inputFromFormSubmit
    ){
        System.out.println("Username :"+inputFromFormSubmit.getUsername());
        System.out.println("Password :"+inputFromFormSubmit.getPassword());

        return String.format("%s : %s",inputFromFormSubmit.getUsername(),inputFromFormSubmit.getPassword());
    }
}
