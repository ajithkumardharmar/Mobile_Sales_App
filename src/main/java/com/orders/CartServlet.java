package com.orders;

import com.dao.CartDao;
import com.pojo.CartPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/addCart")
public class CartServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) {
		HttpSession session=req.getSession();
		String user = (String) session.getAttribute("userId");
		int userId = Integer.parseInt(user);
		int productId = (int) session.getAttribute("productId");
		CartPojo cartPojo=new CartPojo(userId,productId);
		CartDao  cartDao=new CartDao();
		cartDao.addCart(cartPojo);
		
	}
}
