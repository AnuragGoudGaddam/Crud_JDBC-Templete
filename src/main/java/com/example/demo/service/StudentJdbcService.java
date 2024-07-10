package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.StudentJdbc;
import com.example.demo.repository.StudentMethods;

@Service
public class StudentJdbcService {
	
	@Autowired
	private StudentMethods studentJdbc;

	
	
	public int save(StudentDetails studentDetails) {
		
		return studentJdbc.save(studentDetails);
	}
	
	public int update(StudentDetails studentDetails) {
		return studentJdbc.update(studentDetails);
	}
	
	public StudentDetails findById(Integer Id) {
		return studentJdbc.findById(Id);
	}
	public Integer deleteById(Integer Id) {
		return studentJdbc.deleteByID(Id);
	}
	public List<StudentDetails> findAll() {
		return studentJdbc.findAll();
	}

//	public Integer deleteById(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
