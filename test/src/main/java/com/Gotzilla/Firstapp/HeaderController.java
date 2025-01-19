package com.Gotzilla.Firstapp;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {
    
    @GetMapping("test-header")
    public String testHeader(
        @RequestHeader("Accept-Encoding")   String  HeaderFromRequest,
        @RequestHeader("myHeader") String   header2
    ){
        System.out.println(HeaderFromRequest);
        System.out.println(header2);
        return header2;
    }

    @GetMapping("test-header-2")
    public String testHeader(
        @RequestHeader Map<String, String>  header
    ){
        return header.get("myHeader".toLowerCase()  );
    }
}
