package com.demoapp.demoapp.Controllers;

import javax.websocket.server.PathParam;

import com.demoapp.demoapp.Utilities.Accounts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("/hsbc/accounts")
    public String tree() {
        return "hello my friends";
    }

    @GetMapping("/TaxCalculation/{salary}")
    public String taxCalc(@PathVariable("salary") int salary)
    {
        Accounts accts = new Accounts();
        float netTax = accts.taxCalculation(salary);
        return "Your total tax to pay for YTD is: "+ netTax;
    }


}