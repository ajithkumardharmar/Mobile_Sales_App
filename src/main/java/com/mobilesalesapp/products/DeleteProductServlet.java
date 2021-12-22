package com.mobilesalesapp.products;

import java.io.IOException;

import com.mobilesalesapp.impl.ProductImpl;
import com.mobilesalesapp.model.ProductPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		//int productId=Integer.parseInt(req.getParameter("deleteId"));
		String productId1=req.getParameter("deleteProductId");
		int productId=Integer.parseInt(productId1);
		System.out.println(productId);
		System.out.println("pro");
		ProductPojo obj1=new ProductPojo(productId);
		ProductImpl obj2=new ProductImpl();
		
		try {
			obj2.delete(obj1);
			HttpSession session=req.getSession();
			session.setAttribute("deleteInfo", "Successfully Deleted");
			res.sendRedirect("AdminMain.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
