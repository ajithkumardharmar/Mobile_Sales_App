package com.user;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.dao.UserDao;
import com.pojo.RegisterPojo;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/reg")

public class RegServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name1");
		String email=req.getParameter("email");
		Long phone_number=Long.parseLong(req.getParameter("phone_number"));
		String password=req.getParameter("password");
		String confirm_password=req.getParameter("confirm_password");
		PrintWriter out=res.getWriter();
		//out.println(name+ email+ phone_number+ password+ confirm_password);
		 System.out.println(name+ email+ phone_number+ password+ confirm_password);
		
			
		RegisterPojo p=new RegisterPojo(name, email, phone_number, password, confirm_password);
		try {
			UserDao.Connect1(p);
			res.sendRedirect("index1.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
				
			
		
		
				
		
	}

}
