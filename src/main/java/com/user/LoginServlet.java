package com.user;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.UserDao;
import com.pojo.LoginPojo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add1")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out=res.getWriter();
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		LoginPojo Login=new LoginPojo(username,password);
//		List<LoginPojo> user=UserDao.fetch(Login);
//	//	for(LoginPojo login : user) {}
//			String email = login.getUsername();
//			String pass = login.getPassword();
//			
		
	
	
			try {
				HttpSession session  = req.getSession();
				ResultSet ns = UserDao.fetch(Login);
				//res.getWriter().println(flag);
				if(ns.next()) {
					String userId=ns.getString(1);
					String email=ns.getString(3);
					String name=ns.getString(2);
					session.setAttribute("userId", userId);
					session.setAttribute("email", email);
					session.setAttribute("name", name);
					
					res.sendRedirect("MobilePage.jsp");
				}else {

					
					session.setAttribute("LoginResult", "invalid Email or password");
					System.out.println(session.getAttribute("LoginResult"));
					res.sendRedirect("index.jsp");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}


}
