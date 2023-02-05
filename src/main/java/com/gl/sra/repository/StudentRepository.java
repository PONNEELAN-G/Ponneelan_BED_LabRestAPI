package com.gl.sra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.sra.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
