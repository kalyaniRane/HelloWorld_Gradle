package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity hello(){
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }
    
    @GetMapping("/user")
    public ResponseEntity user(){
        return new ResponseEntity("John Demon", HttpStatus.OK);
    }	

}
