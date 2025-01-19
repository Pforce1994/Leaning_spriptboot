package com.Gotzilla.Firstapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    
    @PostMapping("login-with-json")
    public String loginWithJson(
        @RequestBody    UserCredential inputFromFormSubmit
    )
    {
        return String.format("%s : %s",inputFromFormSubmit.getUsername(),inputFromFormSubmit.getPassword());
    }
}
