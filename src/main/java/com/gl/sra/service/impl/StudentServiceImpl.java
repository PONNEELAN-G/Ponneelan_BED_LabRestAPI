package com.gl.sra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.sra.entity.Student;
import com.gl.sra.repository.StudentRepository;
import com.gl.sra.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> listAll() {
		return studentRepository.findAll();	
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);	
	}
	
	@Override
	public Student findById(int id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		
		studentRepository.deleteById(id);		
	}

}
