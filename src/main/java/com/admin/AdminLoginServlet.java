package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login_form")
public class AdminLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String AdminUserName=req.getParameter("admin");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		AdminDao admin=new AdminDao(AdminUserName, password);
		try {
			boolean flag=ServletConnection.login(admin);
			out.println(flag);
			if(flag) {
				res.sendRedirect("AdminMain.jsp");
				
			}
			else {
				HttpSession session=req.getSession();
				session.setAttribute("admin","Invalid Email or Password");
				res.sendRedirect("AdminLogin;.jsp");
				//out.println("Invalid username or Password");
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
