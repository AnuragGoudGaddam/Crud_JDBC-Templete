package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentDetails;

@Repository
public class StudentJdbc implements StudentMethods {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer save(StudentDetails studentDetails) {
		String query= "INSERT INTO student_table( Id,name,Address,phoneNumber)VALUES(?,?,?,?)";
     Object[] input = {studentDetails.getId(),studentDetails.getName(),studentDetails.getAddress(),studentDetails.getPhoneNumber()};
     return jdbcTemplate.update(query, input);
	}

	@Override
	public Integer update(StudentDetails studentDetails) {
		String query="UPDATE student_table SET name=? , Address=? , phoneNumber=? WHERE Id = ? ";
		Object[] args= {studentDetails.getName(),studentDetails.getAddress(),studentDetails.getPhoneNumber(),studentDetails.getId()};
		return jdbcTemplate.update(query,args);
	}

	@Override
	public StudentDetails findById(Integer id) {
		String query= "SELECT * FROM student_table WHERE Id = ?";
		Object []args = {id};
		return jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(StudentDetails.class),args);
	}

	@Override
	public Integer deleteByID(Integer id) {
		String query= "DELETE FROM student_table WHERE Id=? ";
		Object[] args={id};
		return jdbcTemplate.update(query,args);
	}

	@Override
	public List<StudentDetails> findAll() {
		String query="SELECT * FROM student_table";
		return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(StudentDetails.class));
	}


}
