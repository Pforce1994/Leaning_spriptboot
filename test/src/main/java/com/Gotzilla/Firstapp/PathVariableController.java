package com.Gotzilla.Firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/posts/{id}/commends/{commendId}")
    public String getPostId(
        @PathVariable("id") String postId,
        @PathVariable("commendId") String  input
    ){
        return String.format("id: %s commentId: %s", postId,input);
    }
    
}