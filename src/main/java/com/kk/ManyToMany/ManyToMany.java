package com.kk.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		
		System.out.println( "Hello Kapil!" );
	    System.out.println( "Project started!" );
	   
	    SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session sess= factory.openSession();
	    Transaction tx= sess.beginTransaction();
		
	    Employee emp= new Employee();
	    emp.setEmpId(20L);
	    emp.setEmpName("Kapil Kr");
	    
	    Employee emp1= new Employee();
	    emp1.setEmpId(21L);
	    emp1.setEmpName("Anil Gupta");
	    
	    Employee emp2= new Employee();
	    emp2.setEmpId(22L);
	    emp2.setEmpName("Rahul Sharma");
	    
	   
	    Project pro= new Project();
	    pro.setProjectId(50L);
	    pro.setProjectName("Java Basics");
	    
	    Project pro1= new Project();
	    pro1.setProjectId(51L);
	    pro1.setProjectName("DBMS");
	    
	    Project pro2= new Project();
	    pro2.setProjectId(52L);
	    pro2.setProjectName("Python");
	    
	    sess.save(emp);
	    sess.save(emp1);
	    sess.save(emp2);
	    sess.save(pro);
	    sess.save(pro1);
	    sess.save(pro2);
	    
	    
	    List<Employee> empl= new ArrayList<Employee>();
	    List<Project> proj= new ArrayList<Project>();
	    
	    empl.add(emp);
	    empl.add(emp1);
	    empl.add(emp2);
	    
	    proj.add(pro);
	    proj.add(pro1);
	    proj.add(pro2);
	    
	    emp.setProject(proj);
	    emp1.setProject(proj);
	    pro.setEmp(empl);
	    pro1.setEmp(empl);
	    
	    for(Employee e : empl)
	    {
	    	System.out.println(e.getEmpId()+ " : "+ e.getEmpName());
	    	
	    }
	    
	    for(Project p : proj)
	    {
	    	System.out.println(p.getProjectId()+ " : "+p.getProjectName());
	    }
	    
	    
	    tx.commit();
	    sess.close();
	    

	}

}
