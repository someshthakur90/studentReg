package com.IPSchool.studentRegistration.service;

import com.IPSchool.studentRegistration.entity.Student;

import java.util.List;

public interface serviceIface {
    public List<Student> getStudents();
    public void addStudent(Student student);
    public void deleteStudent(Long id);
    public void updateStudent(Long id,String name,String address);
}
