package com.demo.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.demo.model.Student;
import com.demo.service.RegistrationService;

@Controller
public class MVCController 
{
	@Autowired
	private RegistrationService service;
	
    public MVCController()
    {
    	System.out.println("Fornt-Controller invoked");
    }
    
    @RequestMapping(value="/")
    public String homepage()
    {
    	return "Registration.jsp";
    }
    
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public ModelAndView registerForm(Student student)
    {
    	service.StudentRegistrationService(student);
    	return new ModelAndView("success.jsp").addObject("success", "Record Successfuly Inserted");
    }
    @RequestMapping(value = "/viewAllStudents")
    public ModelAndView viewAllStudent()
    {
    	List<Student> allStudents = service.viewAllStudentsService();
		/*
		 * for(int i=0;i<allStudents.size();i++) {
		 * System.out.println(allStudents.get(i).getId()+"\t"+allStudents.get(i).getName
		 * ()+"\t"+allStudents.get(i).getAge()
		 * +"\t"+allStudents.get(i).getAddress()+"\t"+allStudents.get(i).getCourse()); }
		 */
    		return new ModelAndView ("AllStudens.jsp").addObject("Students", allStudents); 
    }
}
