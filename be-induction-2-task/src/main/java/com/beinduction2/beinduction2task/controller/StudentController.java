package com.beinduction2.beinduction2task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beinduction2.beinduction2task.model.Student;
import com.beinduction2.beinduction2task.service.StudentService;


@RequestMapping("/api/v1/student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/{name}")
	public String getbyNameandNim(@PathVariable(value="name") String name, @RequestParam(value="nim") String nim) {
		
		return studentService.getbyNameandNim(name, nim);
	}
	
	@PostMapping("")
	public HttpStatus postStudent(@RequestBody Student student) {
		
		return studentService.postStudent(student);
	}
	
	@PostMapping("/upload")
	public List<Student> uploadStudent(@RequestBody List<Student> student) {
		
		return studentService.uploadStudent(student);
	}
	
	@PostMapping("/nim")
	public Student postbyNim(@RequestBody Student student) {
		
		return studentService.postNim(student);
	}
}
