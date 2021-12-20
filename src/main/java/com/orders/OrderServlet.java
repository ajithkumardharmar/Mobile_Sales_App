package com.orders;

import com.dao.OrderDao;
import com.pojo.OrderPojo;
import com.pojo.UpdateWalletPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/buying")
public class OrderServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		HttpSession session =req.getSession();
		String user=(String)session.getAttribute("userId");
		int userId=Integer.parseInt(user);
		int productId=(int)session.getAttribute("productId");
		String address=req.getParameter("address");
		String pincode=req.getParameter("pincode");
		String fullAddress=address+"-"+pincode;
		String password=req.getParameter("password");
		double price=(double)session.getAttribute("price");
		
		UpdateWalletPojo obj1=new UpdateWalletPojo(userId,password,price);
		OrderDao Dao=new OrderDao();
		Dao.updateWallet(obj1);
		OrderPojo obj2=new OrderPojo(userId,productId,price,fullAddress);
		
		System.out.println("user"+userId);
	}

}
