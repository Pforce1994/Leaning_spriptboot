package com.example.httpresponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @GetMapping("test-json")
    public UserData simpleReturn(){
        UserData userData = new UserData();
        userData.setFirstname("Firstname");
        userData.setLastname("lastname");
        return userData;
    }

    @GetMapping("test-401")
    public ResponseEntity<UserData> returnStatus401(
        @RequestParam("input") String input
    ){
        if ("hacker".equals(input)) {

            // ErrorObject errorObject = new ErrorObject();

            // case2
            UserData userData = new UserData();
            userData.setFirstname("Firstnam324e");
            userData.setLastname("lastname");
            return ResponseEntity.status(401).body(userData);

            // case3
            // return ResponseEntity.status(401).build();
        }else{
            UserData userData = new UserData();
            userData.setFirstname("Firstname");
            userData.setLastname("lastname");  
            return ResponseEntity.ok(userData);
        }
        
    }
}
