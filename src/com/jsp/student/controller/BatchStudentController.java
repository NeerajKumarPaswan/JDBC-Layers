package com.jsp.student.controller;

import java.util.ArrayList;

import com.jsp.student.dao.StudentCrud;
import com.jsp.student.dto.Student;

public class BatchStudentController {
	public static void main(String[] args) {
		StudentCrud studentCrud=new StudentCrud();
		
		Student s1=new Student();
		s1.setId(90);
		s1.setName("James");
		s1.setEmail("james@mail.com");
		
		Student s2=new Student();
		s2.setId(91);
		s2.setName("John");
		s2.setEmail("john@mail.com");
		
		Student s3=new Student();
		s3.setId(92);
		s3.setName("Adam");
		s3.setEmail("adam@mail.com");
		
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		studentCrud.batchExecution(arrayList);
		
	}

}
