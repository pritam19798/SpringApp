package com.thinkxfactor.demoApp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.thinkxfactor.demoApp.entity.Student;
import com.thinkxfactor.demoApp.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({ "/student" })
public class StudentController{


    @Autowired
    StudentRepository studendRepository;

    @GetMapping({"/liststudent"})
    public List<Student> liststudent(){
        List<Student> StudentList = new ArrayList<Student>();
        Student student = new Student("pritam","s_1","p1234","cse");
        StudentList.add(student);
        student = new Student("Ishita","s_2","i1234","cse");
        StudentList.add(student);
        student = new Student("riddhi","s_3","r1234","cse");
        StudentList.add(student);
        student = new Student("aritra","s_4","a1234","cse");
        StudentList.add(student);
        student = new Student("soumi","s_5","s1234","cse");
        StudentList.add(student);
        return StudentList;
    }
    @GetMapping({ "/studentobject" })
    public Student studentobject(@RequestParam("s")  String s) {
        String[] ar=s.split(",");
       Student student = new Student(ar[0],ar[1],ar[2],ar[3]);
        return student;
    }


    @GetMapping({"/get"})
    public Student get(@RequestParam Long id){
        Optional<Student> byId=studendRepository.findById(id);
        return byId.get();
    }

    @PostMapping({"/add"})
    public Student add(@RequestBody Student student){

        Student persistStudent=studendRepository.saveAndFlush(student);
        return persistStudent;

    }



}