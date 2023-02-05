package com.gl.sra.service;

import java.util.List;

import com.gl.sra.entity.Student;

public interface StudentService {
	
	List<Student> listAll();
	
	void save(Student student);
	
	Student	findById(int id);
	
	void deleteById(int id);
	
}
