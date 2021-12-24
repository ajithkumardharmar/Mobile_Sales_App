package com.mobilesalesapp.orders;



import java.io.IOException;

import com.mobilesalesapp.impl.OrderImpl;
import com.mobilesalesapp.model.OrderPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cancelOrder")
public class CancelServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		int orderId=Integer.parseInt( req.getParameter("cancelId"));
		System.out.println("cancelled"+orderId);
		OrderPojo orderPojo=new OrderPojo(0,orderId);
		OrderImpl orderImpl=new OrderImpl();
		orderImpl.orderCancel(orderPojo);
		try {
			res.sendRedirect("ViewOrders.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
