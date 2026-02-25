package com.demo.dao;

import java.util.List; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.demo.model.Student;

@Repository
public class RegistrationDAO 
{
	@Autowired
	private SessionFactory fact;
    public RegistrationDAO()
    {
    	System.out.println("Registration DAO Created");
    }
    public void StudentRegistrationDAO(Student student)
    {
    	Session session = fact.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(student);
    	tx.commit();
    	System.out.println("Successfully Saved");
    }
    public List<Student> viewAllStudentsDAO()
    {
    	Session session = fact.openSession();
        List<Student> allStudents =  session.createQuery("from Student").getResultList();
    	return allStudents; 
    }
}
