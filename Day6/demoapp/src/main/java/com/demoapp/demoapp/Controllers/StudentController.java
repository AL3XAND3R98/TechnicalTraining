package com.demoapp.demoapp.Controllers;

import java.util.ArrayList;

import com.demoapp.demoapp.Entities.Student;
import com.demoapp.demoapp.Utilities.StudentRecords;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
    @Autowired
    StudentRecords stuRef;

    @GetMapping("/showAllStudents")
    public ArrayList<Student> showStudents() 
    {
        return stuRef.showStudents();
    }

    @GetMapping("/saveRecord/{regNo}/{name}/{marks}")
    public String saveRecord(@PathVariable("regNo") int regNo1, @PathVariable("name") String name1, @PathVariable("marks") int marks1) 
    {
        Student ref=new Student();

        ref.regNo = regNo1;
        ref.name = name1;
        ref.marks = marks1;

        stuRef.addRecord(ref);
        return "Record Saved Successfully!";
    }

    @GetMapping("/searchRecord/{name}")
    public ArrayList<Student> searchRecord(@PathVariable("name") String name1) {

        ArrayList<Student> stuList = stuRef.searchRecord(name1);
        return stuList;
    }
    
}
