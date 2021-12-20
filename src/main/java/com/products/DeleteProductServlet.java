package com.products;

import java.io.IOException;

import com.dao.ProductDao;
import com.pojo.ProductPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		
		int productId=Integer.parseInt(req.getParameter("deleteId"));
		System.out.println("pro");
		ProductPojo obj1=new ProductPojo(productId);
		ProductDao obj2=new ProductDao();
		
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
