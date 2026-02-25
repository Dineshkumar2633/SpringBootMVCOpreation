package com.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.dao.RegistrationDAO;
import com.demo.model.Student;

@Service
public class RegistrationService 
{
	@Autowired
    private RegistrationDAO dao;
	
	public RegistrationService()
	{
		System.out.println("Registration Service Object Created");
	}
	
	public void StudentRegistrationService(Student student)
	{
		dao.StudentRegistrationDAO(student);
	}
	
	public List<Student> viewAllStudentsService()
	{
		List<Student> allStudents = dao.viewAllStudentsDAO(); 
	    return allStudents;
	}
}
