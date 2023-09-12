package com.IPSchool.studentRegistration.service;

import com.IPSchool.studentRegistration.dao.jpaInterface;
import com.IPSchool.studentRegistration.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements serviceIface{
    @Autowired
    private jpaInterface jpaInterface;

    public serviceImpl() {
    }
    public List<Student> getStudents() {
        return jpaInterface.findAll();
    }
    public void addStudent(Student student) {
        jpaInterface.save(student);
    }

    public void deleteStudent(Long id) {
        Student entity = jpaInterface.getById(id);
        jpaInterface.delete(entity);
    }

    public void updateStudent(Long id, String name, String address) {
        Student entity = jpaInterface.getById(id);
        entity.setName(name);
        entity.setAddress(address);
        jpaInterface.save(entity);
    }
}
