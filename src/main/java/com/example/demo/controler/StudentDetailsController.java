 package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.StudentJdbc;
import com.example.demo.service.StudentJdbcService;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {
	@Autowired
	private StudentJdbcService stuJdbcService;

	@PostMapping("/createStudent")
	public Integer createStudent(@RequestBody StudentDetails studentDetails) {
		return stuJdbcService.save(studentDetails);
	}
     
	@PutMapping("/updateStudent/{id}")
	public Integer updateStudent(@PathVariable Integer id, @RequestBody StudentDetails studentDetails) {
		studentDetails.setId(id);
		return stuJdbcService.update(studentDetails);
	}
	
	@PutMapping("/update")
	public Integer updateS(@RequestBody StudentDetails studentDetails) {
		return stuJdbcService.update(studentDetails);
	}
	
	@GetMapping("/getStudentDetails/{id}")
	public StudentDetails studentDetailsById(@PathVariable Integer id) {
		return stuJdbcService.findById(id);
	}
	
	@DeleteMapping("/deleteId/{id}")
	public Integer deleteStudent(@PathVariable Integer id) {
		return stuJdbcService.deleteById(id);
	}
	
	@GetMapping("/GetAll")
	public List<StudentDetails> allStudentDetails(@RequestBody StudentDetails studentDetails){
		return stuJdbcService.findAll();
	}
	
//	@GetMapping("/GetAllStudent")
//	public List<StudentDetails> getAllStudentDetails (@RequestBody StudentDetails studentDetails){
//		return stuJdbcService.findAll();
//		
//	}
	
	

}
