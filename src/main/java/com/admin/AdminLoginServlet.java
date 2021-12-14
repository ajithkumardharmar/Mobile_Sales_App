package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login_form")
public class AdminLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String AdminUserName=req.getParameter("admin");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		try {
			boolean flag=ServletConnection.login(AdminUserName, password);
			out.println(flag);
			if(flag) {
				res.sendRedirect("Adminhome.html");
				
			}
			else {
				out.println("Invalid username or Password");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
