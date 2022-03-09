package com.BackendOperations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Candidate;
import com.Entities.Company;

public class connectionProvider {
    private Configuration con;
	private SessionFactory SF;
	public SessionFactory getSessionFacotry() {
		con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Company.class).addAnnotatedClass(Candidate.class);
	    SF=con.buildSessionFactory();
	    return SF;
	}
	
	
}
