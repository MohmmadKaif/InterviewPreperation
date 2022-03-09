package com.BackendOperations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entities.Candidate;
import com.Entities.Company;

public class DataPersister {

   public void persistData( String comId, String comName,String fName,String mName,String lName,
			String visDay, String visMonth, String visYear, String CTC , int noRounds,
			String Exp){
	   DataSetter setter=new DataSetter();
	   connectionProvider cp=new connectionProvider();
	   
	   SessionFactory SF;
	   Session session;
	   Transaction tx;
       
	   Company com=null; 
	   Candidate cand=null; 
	   
	   SF=cp.getSessionFacotry();  
	   session=SF.openSession(); 
	   tx=session.beginTransaction(); 
	   
	   //Checking wheather current comapny is present or not in our data base....
	   com=(Company)session.get(Company.class,comId);
	   
	   
	   //If it is present we just need to add the new candidate to that existing company....
	   if( com!=null) {
		   //Creating the object of candidate by setting the data....
		   cand=setter.setCandidateData(fName, mName, lName, visDay, visMonth, visYear,  
				                        CTC, noRounds, Exp, com);
		   //Here we are setting the post date for our experience...
		   cand.setpostDate();
		   //Here calling a method designed to save the data in already existing company.... 
		   setter.setCompanyDataForExisting(com, cand); 
		   //Here Updating the data in company table...
		   session.saveOrUpdate(com);  
	   }
	   //This code will execute if the company is being entered in database for the first time....    
	   else{
		   com=setter.setCompanyData(comId, comName);
		   cand=setter.setCandidateData(fName, mName, lName, visDay, visMonth, visYear, CTC, 
				                        noRounds, Exp, com);
		   //Here we are setting the post date for our experience...
		   cand.setpostDate();
		   List<Candidate> candidates=new ArrayList<Candidate>();
		   candidates.add(cand);
		   com.setCandidates(candidates);
	       session.saveOrUpdate(com);
	   }
         session.saveOrUpdate(cand);
         tx.commit();
         session.close();
         SF.close();
         
   }

}
