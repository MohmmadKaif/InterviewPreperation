package com.BackendOperations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entities.Candidate;
import com.Entities.Company;

public class DbDataExtractor{
private connectionProvider cp;
private SessionFactory SF;	
Session session;
Query query;
public List<Candidate> getAllExperiences( String comId ) {
	 cp=new connectionProvider();
     SF=cp.getSessionFacotry();
	 session=SF.openSession();
     List<Candidate>candidates;    
     Company company;
 
	 String q1="from  Candidate c where c.company='"+comId+"'" ;
   query=null;
	 query=session.createQuery(q1);
	 candidates=query.list();
     
	 session.close();
     SF.close();
     return candidates;
}

public Company getCompany(String comId) {
	Company company=null;
	cp=new connectionProvider();
    SF=cp.getSessionFacotry();
	session=SF.openSession();
	String q2="from  Company c where c.comId='"+comId+"'";
	
	query=null;
	query=session.createQuery(q2);
	company=(Company)query.list().get(0);
	session.close();
	SF.close();
	return company;
}


public List<Company> getAllCompanies(){
	cp=new connectionProvider();
    SF=cp.getSessionFacotry();
	session=SF.openSession();
    List<Company>companies=new ArrayList<  >();   
	String q="from Company";
    query=session.createQuery(q);
    companies=query.list();
    session.close();
    SF.close();
    return companies;
}


}
