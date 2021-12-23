package com.mobilesalesapp.user;

import java.io.IOException;

import com.mobilesalesapp.impl.AdminImpl;
import com.mobilesalesapp.model.RegisterPojo;
import com.mobilesalesapp.model.UpdateWalletPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addWallet")
public class AddWalletServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("add");
		int userId=Integer.parseInt(req.getParameter("walletUserId"));
		double addAmount=Double.parseDouble(req.getParameter("walletAmount"));
		System.out.println(userId+"add"+addAmount);
	
		RegisterPojo wallet=new RegisterPojo(userId,addAmount);
		AdminImpl adminAddAmount=new AdminImpl();
		int i=adminAddAmount.addWalletAmount(wallet);
		
			try {
				if(i>0) {
					System.out.println("success");
					res.sendRedirect("ViewUser.jsp");
				}
				
				else {
					System.out.println("not success");
					res.sendRedirect("ViewUser.jsp");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}

}
