package com.kk;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Project started!" );
    	 List<Courses> list= new ArrayList<Courses>();
    	    
    	    SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	    Session sess= factory.openSession();
    	    Transaction tx= sess.beginTransaction();
    	  
   	    Courses course= new Courses("Java","2 years");
    	    Courses course1= new Courses("DBMS","1 years");
    	    Courses course2= new Courses("Python","2.5 years");
    	    sess.save(course);
    	    sess.save(course1);
    	    sess.save(course2);
    	    
    	    list.add(course);
    	    list.add(course2);
    	    list.add(course1);
    	    
    	    Students student= new Students();
    	    student.setFirstName("Kapil");
    	    student.setLastName("Kr");
    	    student.setPhone("9988776655");
    	    student.setCourse(list);
    	    course.setStudent(student);
    	    
    	    Students student1= new Students();
    	    student1.setFirstName("John");
    	    student1.setLastName("Don");
    	    student1.setPhone("9999111122");
    	    course.setStudent(student1);
    	   // student1.setCourse(list);
    	    
    	    sess.save(student);
    	    sess.save(student1);
    	    
    	    
    	    	for(Courses c : list)
    	    	{
    	    		System.out.println(c);
    	    	}
    	    	
    	    	System.out.println(student);
    	    	System.out.println(student1);
    	    	
  	    	
    	    	tx.commit();
    	    	sess.close();
    	    	
//    	    	
//    	    	System.out.println(course1);	
//    	    	System.out.println(course);
//    	    	System.out.println(course2);
    }
}
