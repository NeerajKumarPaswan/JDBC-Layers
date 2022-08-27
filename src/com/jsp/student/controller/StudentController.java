package com.jsp.student.controller;

import com.jsp.student.dao.StudentCrud;
import com.jsp.student.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(2);
		student.setName("sandeep");
		student.setEmail("sandeep@mail.com");
		
		
		StudentCrud studentCrud=new StudentCrud();
		//studentCrud.saveStudent(student);
		
		//studentCrud.deleteStudentById(1234);
		
		//studentCrud.getStudentDetailsById(12);
		
		studentCrud.updateStudent(student);
	}

}
