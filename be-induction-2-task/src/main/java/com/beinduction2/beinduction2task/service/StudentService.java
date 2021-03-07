package com.beinduction2.beinduction2task.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.beinduction2.beinduction2task.model.Student;

@Service
public class StudentService {

	public String getbyNameandNim(String name, String nim) {
		
		return "Hello my name is " + name + " and my nim is " + nim;
	}
	
	public HttpStatus postStudent(Student student){
		
		return HttpStatus.OK;
	}
	
	public List<Student> uploadStudent(List<Student> student){
		
		return student;
	}
	
	public Student postNim(Student student){
		
		throw new ResponseStatusException(HttpStatus.CONFLICT, "Student with nim:" + student.getNim() + " already exist.");
	}
}
