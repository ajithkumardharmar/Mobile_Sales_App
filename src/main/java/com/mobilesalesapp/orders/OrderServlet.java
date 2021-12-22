package com.mobilesalesapp.orders;

import java.sql.*;

import com.mobilesalesapp.dao.OrderDao;
import com.mobilesalesapp.model.OrderPojo;
import com.mobilesalesapp.model.UpdateWalletPojo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/buying")
public class OrderServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String user = (String) session.getAttribute("userId");
		int userId1 = Integer.parseInt(user);
		int userId = userId1;
		int productId = (int) session.getAttribute("productId");
		String address = req.getParameter("address");
		String pincode = req.getParameter("pincode");
		String fullAddress = address + "-" + pincode;
		String password = req.getParameter("password");
		int price = (int) session.getAttribute("price");
		System.out.println(userId + productId + fullAddress + password + price + userId);
		UpdateWalletPojo obj1 = new UpdateWalletPojo(userId, password, price);
		OrderDao orderDao = new OrderDao();

		int i = orderDao.updateWallet1(obj1);
		try {

			if (i > 0) {
				System.out.println("updatedWallet");
				OrderPojo obj2 = new OrderPojo(userId, productId, price, fullAddress);
				int j = orderDao.insertOrder(obj2);
				if (j > 0) {
					System.out.println("success");
					res.sendRedirect("OrderPlaced.jsp");
				} else {

					System.out.println("invalid data");
				}
			} else {
				session.setAttribute("buying", "Invalid Password");
				res.sendRedirect("MobileBuy.jsp");
				// System.out.println("invalid password");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("user0" + userId);
	}

}
