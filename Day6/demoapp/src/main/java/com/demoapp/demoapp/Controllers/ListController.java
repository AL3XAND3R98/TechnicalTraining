package com.demoapp.demoapp.Controllers;

import java.util.ArrayList;

import com.demoapp.demoapp.Utilities.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @Autowired
    Records rec;

    @GetMapping("/names")
    public ArrayList<String> aboutUs() {
        return rec.showEmployees();
    }

    @GetMapping("/names/add/{name}")
    public String aboutUs(@PathVariable("name") String name) {
        rec.addRecord(name);
        return "Saved";
    }

}