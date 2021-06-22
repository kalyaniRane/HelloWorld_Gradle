package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity hello(){
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }
    
    @GetMapping("/user/{name}")
    public ResponseEntity user(@PathVariable String name){
        return new ResponseEntity("John Demon", HttpStatus.OK);
    }	

}
