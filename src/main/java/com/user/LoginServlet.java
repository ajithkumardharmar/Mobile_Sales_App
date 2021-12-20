package com.user;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	
			try {
				boolean flag = UserDao.fetch(Login);
				//res.getWriter().println(flag);
				if(flag) {
					res.sendRedirect("MobilePage.jsp");
				}else {

					HttpSession session  = req.getSession();
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
