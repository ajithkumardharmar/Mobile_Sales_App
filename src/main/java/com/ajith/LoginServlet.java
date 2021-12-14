package com.ajith;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add1")
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out=res.getWriter();
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		out.println(username +" "+password);
		
		LoginDao Login=new LoginDao(username,password);
		  
		
			try {
				boolean flag = NewConnection.fetch(Login);
				res.getWriter().println(flag);
				if(flag) {
					res.sendRedirect("MobilePage.html");
				}else {
					res.getWriter().println("Invalid Username or password!!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	
		
	}


}
