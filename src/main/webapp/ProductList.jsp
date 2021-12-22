<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.mobilesalesapp.dao.*" import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 20px;
}
  .h2_1 {
        text-align: center;
        background-color: bisque;
    }
    ul {
        list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: brown;
    }
    
    li {
        float: left;
    }
    
    li a {
        display: block;
        color: white;
        text-align: center;
        padding: 12px 16px;
        text-decoration: none;
    }
    
    li a:hover {
        background-color: goldenrod;
    }
    
    .active {
        background-color: grey;
    }
       *{
    	margin: 0;
    	padding: 0;
		}
</style>
<body bgcolor="cornsilk">
    <h2 class="h2_1">Mobile Sales App</h2>

    <div class="top_nav">

        <ul>
            <li><a href="MobilePage.html">Home</a></li>
           <li><a href="ViewOrders.jsp">My Orders</a></li>
            <li><a href="ViewCart.jsp">Cart</a></li>
             <li style="float: right;"><a href="MobilePage.jsp">Sign out</a></li>
            <li style="float: right;"><a class="active" href="AdminLogin.jsp">Admin</a></li>
            <li><a href="#contact">Contact us</a></li>
            <li><a href="#about us">About us</a></li>
           

        </ul>


    </div><br><br><br>
    <%
    ResultSet rs=ListAllProductDao.viewProduct();
    %>
    <table style="width: 80%;margin-left: 100px;">
    <tr>
     <th>Product Id</th>
    <th>Product Name</th>
    <th>Description</th>
    <th>Standard Price</th>
    <th>List Price</th>
    </tr>
    <%while(rs.next()){ %>
    
    
    <tr>
    <td><%=rs.getString(1) %></td>
    <td><%=rs.getString(2) %></td>
    <td><%=rs.getString(3) %></td>
    <td><%=rs.getString(4) %></td>
    <td><%=rs.getString(5) %></td>
    </tr>
    <%} %>
    </table>

</body>
</html>