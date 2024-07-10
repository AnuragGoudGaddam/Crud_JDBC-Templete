package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentDetails;

@Repository
public interface StudentMethods {
	
	Integer save(StudentDetails stuDetails);
	Integer update(StudentDetails studentDetails);
	StudentDetails findById(Integer id);
	Integer deleteByID(Integer id);
	List<StudentDetails> findAll();
	

}
