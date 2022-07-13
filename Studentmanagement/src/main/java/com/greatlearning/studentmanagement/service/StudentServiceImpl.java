package com.greatlearning.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.repository.StudentRepository;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	
	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}


	@Override
	public void save(Student thestudent) {
	
		studentRepository.save(thestudent);
		
	}


	@Override
	public Student findById(int id) {
		
		return studentRepository.findById(id).get();
		
	}


	@Override
	public void deleteById(int theId) {
		
		studentRepository.deleteById(theId);
		
	}

}
