package com.BackendOperations;

import com.Entities.Candidate;
import com.Entities.Company;

public class DataSetter {
   public Company setCompanyData( String comId, String comName ) {
	   Company company=new Company();
	   company.setComId(comId);
	   company.setComName(comName);
	   return company;
	}

public void setCompanyDataForExisting(Company com , Candidate cand){
	com.getCandidates().add(cand);
}

public Candidate setCandidateData(String fName,String mName,String lName,
		String visDay, String visMonth, String visYear, String CTC , int noRounds,
		String Exp, Company company ){
	    Candidate candidate = new Candidate();
	
	
	
	candidate.setfName(fName);
    candidate.setmName(mName);
    candidate.setlNmae(lName);
    candidate.setVisDay(visDay);
    candidate.setVisMonth(visMonth);
    candidate.setVisYear(visYear);
    candidate.setCTC(CTC);
    candidate.setNoRounds(noRounds);
    candidate.setExp(Exp);
    candidate.setpostDate();
    candidate.setCompany(company);
    return  candidate;
           
}

public String manipulateExp( String Exp ) {
	String newExp="";
	String temp="";
	for(int i=0;i<Exp.length();i++) {
		
		if(Exp.charAt(i) =='\n'){
			temp+='`';
			newExp+=temp;
		    temp="";
		}
		else
		{
			temp+=Exp.charAt(i);
		}
	   
	}
	return newExp;
}



}
