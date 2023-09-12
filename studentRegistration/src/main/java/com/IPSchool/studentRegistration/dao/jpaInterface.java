package com.IPSchool.studentRegistration.dao;

import com.IPSchool.studentRegistration.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jpaInterface extends JpaRepository<Student,Long> {
}
