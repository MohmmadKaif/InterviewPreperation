package com.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BackendOperations.DbDataExtractor;
import com.Entities.Candidate;
import com.Entities.Company;

@WebServlet("/dispExp")
public class ShowExperiences  extends HttpServlet {
     
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
         DbDataExtractor DDE=new DbDataExtractor(); 
		 String comId=req.getParameter("comId");		
	 	 List<Candidate> candidates= DDE.getAllExperiences(comId);
	     Company company =DDE.getCompany(comId);
	 	 req.setAttribute("cands", candidates);
	     req.setAttribute("coid", comId);
	     req.setAttribute("comname", company.getComName());
	     RequestDispatcher rd= req.getRequestDispatcher("showExp.jsp");
	     
	     
	     rd.forward(req, res);
	     
	 	 
	}
	
	
}
