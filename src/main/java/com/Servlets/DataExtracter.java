package com.Servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BackendOperations.DataPersister;
import com.BackendOperations.DataSetter;

@WebServlet("/Extractor")
public class DataExtracter extends HttpServlet{
        public void doPost(HttpServletRequest req , HttpServletResponse res){
        DataSetter setter = new DataSetter();
        DataPersister DP=new DataPersister();
        String fName=req.getParameter("fName");
        String mName=req.getParameter("mName");
        String lName=req.getParameter("lName");
        String visDay=req.getParameter("visDay");
        String visMonth=req.getParameter("visMonth");
        String visYear=req.getParameter("visYear");
        String comId=req.getParameter("comId");
        String comName=req.getParameter("comName");
        int noRounds=Integer.parseInt(req.getParameter("noRounds"));
        String CTC=req.getParameter("ctc");
        String Exp=req.getParameter("exp");
        
        Exp=setter.manipulateExp(Exp);
        DP.persistData(comId, comName, fName, mName, lName, visDay, visMonth, visYear, CTC, noRounds, Exp);
        
        
        }
}
