package com.student.Action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class regAction
 */
@WebServlet("/regAction")
public class regAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname = request.getParameter("uname");
		String ugmail = request.getParameter("ugmail");
		String pass = request.getParameter("pass");
		

		PrintWriter pr = response.getWriter();
		pr.println("Your Name : "+uname);
		pr.println("Your Gmail : "+ugmail);
		pr.println("Your Password : "+pass);
	
	
	
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		String name = request.getParameter("uname");
//		String gmail = request.getParameter("ugmail");
//		String password = request.getParameter("upass");
//		
//		PrintWriter pr = response.getWriter();
//		pr.println("Your Name : "+name);
//		pr.println("Your Gmail : "+gmail);
//		pr.println("Your Password : "+password);
		
		
	}

}
