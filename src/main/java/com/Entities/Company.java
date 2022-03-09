package com.Entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company{

	@Id
	private String comId;
    private String comName;
    @OneToMany(mappedBy="company")
    private List<Candidate> candidates;

 public String getComId() {
	return comId;
}
public void setComId(String comId) {
	this.comId = comId;
}
public String getComName() {
	return comName;
}
public void setComName(String comName) {
	this.comName = comName;
}
public List<Candidate> getCandidates() {
	return candidates;
}
public void setCandidates(List<Candidate> candidates) {
	this.candidates = candidates;
}

}
