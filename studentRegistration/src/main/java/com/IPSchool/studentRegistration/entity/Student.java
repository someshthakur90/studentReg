package com.IPSchool.studentRegistration.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Student {
    @Id
    private long rollNumber;
    private String name;
    private String grade;
    private Date dob;
    private String address;

    public Student(long rollNumber, String name, String grade, Date dob, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        this.dob = dob;
        this.address = address;
    }

    public Student() {
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
