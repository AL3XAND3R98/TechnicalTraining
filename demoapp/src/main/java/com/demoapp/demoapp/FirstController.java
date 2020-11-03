package com.demoapp.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @GetMapping("/hello")
    public String tree() {
        return "hello my friends";
    }

    @PostMapping("/hello")
    public String AboutUs() {
        return "we are working here";
    }

    @GetMapping("/info/{name}/{address}")
    public String information(@PathVariable("name") String name, @PathVariable("address") String addy)
    {
        return name +" lives At " + addy;
    }
    
}