package com.kk.OneToMany;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany 
{
	public static void main(String[] args) 
	{	
		System.out.println( "Hello Kapil!" );
	    System.out.println( "Project started!" );
	   
	    SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session sess= factory.openSession();
	    Transaction tx= sess.beginTransaction();
		
/*	    Question ques= new Question();
	    ques.setQuesId(100);
	    ques.setQues("What is Java?");
	    
	    Answer ans= new Answer();
	    ans.setAnsId(200);
	    ans.setAnswer("Java is a programming language.");
	    
	    Answer ans1= new Answer();
	    ans1.setAnsId(201);
	    ans1.setAnswer("Java is thread safe and portable.");
	    
	    sess.save(ques);
	    sess.save(ans);
	    sess.save(ans1);
	    
	    List<Answer> list= new ArrayList<Answer>();
	    list.add(ans1);
	    list.add(ans);
	    
	    ques.setAnswer(list);
	    ans.setQues(ques);
	    ans1.setQues(ques);
*/	    
	    Question ques1= (Question) sess.get(Question.class,100);
	
/*	    // Lazy loading
	    System.out.println(ques1.getQuesId());
	    System.out.println(ques1.getQues());
	    System.out.println(ques1.getAnswer().size());
	    
*/
	 // Eager loading
	    System.out.println(ques1.getQuesId());
	    System.out.println(ques1.getQues());
	    System.out.println(ques1.getAnswer().size());
	    
/*	    for(Answer a : ques1.getAnswer())
	    {
	    	System.out.println(a.getAnswer());
	    }
*/	   
    
	    tx.commit();
	    sess.close();		
	}
}
