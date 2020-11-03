package com.sqlex.sqlex.Controllers;

import java.util.List;
import java.util.Optional;

import com.sqlex.sqlex.Entities.College;
import com.sqlex.sqlex.Repos.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    CollegeRepo repo;

    @GetMapping("/showByName/{name}")
    public List<College> showByName(@PathVariable("name") String name)
    {
        return repo.findByName(name);
    }

    @GetMapping("/saveRecord")
    public String saveRecord() {
        College student = new College();

        student.setRegno(101);
        student.setName("Alexander");
        student.setMarks(98);

        repo.save(student);

        return "Record Saved";
    }

    @PostMapping("/recordEntry")
    public void RecordInsert(@RequestBody College ref) 
    {
        repo.save(ref);    
    }

    @GetMapping("/showRecord/{regNo}")
    public College showRecord(@PathVariable("regNo") int regNo) {
        Optional<College> optRef = repo.findById(regNo);
        College ref=null;
        if(optRef.isPresent())
        {
            ref = optRef.get();
        }
        return ref;

       
    }

    @GetMapping("/saveRecord2/{regNo}/{name}/{marks}")
    public String saveRecord(@PathVariable("regNo") int regNo, @PathVariable("name") String name, @PathVariable("marks") int marks)
    {
        College student = new College();

        student.setRegno(regNo);
        student.setName(name);
        student.setMarks(marks);

        repo.save(student);

        return "Record Saved";
    }

}
