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
import com.Entities.Company;

@WebServlet("/dispComp")
public class ShowCompanies extends HttpServlet {
   
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		DbDataExtractor DDE=new DbDataExtractor();     
		List<Company> companies;
		companies=DDE.getAllCompanies();		     
		     
		req.setAttribute("comp", companies);     
		RequestDispatcher rd=req.getRequestDispatcher("ShowComp.jsp");
		rd.forward(req, res);
		
	}
	
	
	
}
