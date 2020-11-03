package com.demoapp.demoapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRControllers {
    @GetMapping("/hsbc/hr")
    public String aboutUs() {
        return "Hello We Are HR";
    }

}
