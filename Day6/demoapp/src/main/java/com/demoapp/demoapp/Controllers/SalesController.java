package com.demoapp.demoapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class SalesController {
    
    @GetMapping("/hsbc/sales")
    public String aboutUs() {
        return "Hello We Are Sales";
    }

}
 