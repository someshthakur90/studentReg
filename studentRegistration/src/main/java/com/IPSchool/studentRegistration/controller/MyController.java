package com.IPSchool.studentRegistration.controller;

import com.IPSchool.studentRegistration.entity.Student;
import com.IPSchool.studentRegistration.service.serviceIface;
import com.IPSchool.studentRegistration.service.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private serviceIface service;
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/student")
    public List<Student> getStudents() {
        return this.service.getStudents();
    }
    @PostMapping("/student")
    public void addStudent(@RequestBody Student student) {
        this.service.addStudent(student);
    }
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        this.service.deleteStudent(id);
    }
    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable("id") Long id,@RequestParam(required = false) String name,@RequestParam(required = false) String address) {
        this.service.updateStudent(id,name,address);
    }
}
