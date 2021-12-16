package com.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addproduct")
public class AddProductServlet extends HttpServlet {
       public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	   String product_name=req.getParameter("product_name");
    	   String description=req.getParameter("description");
    	   String standard_cost=req.getParameter("standard_cost");
    	   String list_price=req.getParameter("list_price");
    	  //System.out.println(product_name);
//    	   PrintWriter out=res.getWriter();
//    	   out.println(product_name);
    	   
    	   AddProductDao obj=new AddProductDao(product_name,description,
    			   Double.parseDouble(standard_cost),Double.parseDouble(list_price));
    	   
    	   ProductConnect obj2=new ProductConnect();
    	   
			obj2.add(obj);
			res.sendRedirect("Adminhome.html");
		
    	   
       } 
}
