package com.Entities;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Candidate {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long candId;
    private String fName;
    private String mName;
    private String lName;
    private String visDay;
    private String visMonth;
    private String visYear;
    private String postDay;
    private String postMonth;
    private String postYear;
    private String CTC;
    private int noRounds;
    @Column(length=1000)
    private String Exp;
    @ManyToOne
    private Company company;
	
    public long getCandId() {
		return candId;
	}
	public void setCandId(long candId) {
		this.candId = candId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getVisDay() {
		return visDay;
	}
	public void setVisDay(String visDay) {
		this.visDay = visDay;
	}
	public String getVisMonth() {
		return visMonth;
	}
	public void setVisMonth(String visMonth) {
		this.visMonth = visMonth;
	}
	public String getVisYear() {
		return visYear;
	}
	public void setVisYear(String visYear) {
		this.visYear = visYear;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String cTC) {
		CTC = cTC;
	}
	public int getNoRounds() {
		return noRounds;
	}
	public void setNoRounds(int noRounds) {
		this.noRounds = noRounds;
	}
	public String getExp() {
		return Exp;
	}
	public void setExp(String exp) {
		Exp = exp;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String getPostDay() {
		return postDay;
	}
	public void setPostDay(String postDay) {
		this.postDay = postDay;
	}
	public String getPostMonth() {
		return postMonth;
	}
	public void setPostMonth(String postMonth) {
		this.postMonth = postMonth;
	}
	public String getPostYear() {
		return postYear;
	}
	public void setPostYear(String postYear) {
		this.postYear = postYear;
	}
	
	
	public void setpostDate() {
		LocalDate ld= LocalDate.now();//Here I am setting the date on which expereince will be posted...
		postDay=Integer.toString(ld.getDayOfMonth());
		postMonth=ld.getMonth().toString();
	    postYear=Integer.toString(ld.getYear());
	}
    
    
 }
