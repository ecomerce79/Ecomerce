package com.nareshit.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class Homecontroller {

    @GetMapping("/get")
    public ResponseEntity<String> getDetails(){
        return ResponseEntity.ok("hello World") ;
    }

}
