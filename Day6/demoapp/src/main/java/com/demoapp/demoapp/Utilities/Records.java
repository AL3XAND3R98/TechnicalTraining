package com.demoapp.demoapp.Utilities;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Records {
    ArrayList<String> employees = new ArrayList<String>();

    public Records() {
        employees.add("niklas");
        employees.add("test");
    }

    public ArrayList<String> showEmployees() {
        return employees;
    }

    public void addRecord(String name) {
        employees.add(name);
    }

    public void removeRecord(int num) {
        employees.remove(num);
    }
}