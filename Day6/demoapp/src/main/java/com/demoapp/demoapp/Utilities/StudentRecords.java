package com.demoapp.demoapp.Utilities;

import java.util.ArrayList;

import com.demoapp.demoapp.Entities.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentRecords {
    ArrayList<Student> list = new ArrayList<Student>();

    public StudentRecords()
    {
        Student stu1 = new Student();
        stu1.regNo = 102;
        stu1.name = "Alex";
        stu1.marks=149;

        list.add(stu1);
    }

    public ArrayList<Student> showStudents()
    {
        return list;
    }

    public void addRecord(Student stu)
    {
        list.add(stu);
    }

    public ArrayList<Student> searchRecord(String name1) {

        ArrayList<Student> tmp = new ArrayList<Student>();

        for (Student stu : list) {
            if (stu.name.equals(name1)) {
                tmp.add(stu);
            }
        }
        return tmp;

    }
}
