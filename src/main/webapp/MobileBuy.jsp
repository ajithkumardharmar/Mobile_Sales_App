<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MobileBuyingPage</title>
</head>
<style>
* {
	margin: 0;
	padding: 0;
}
.h2_1 {
	text-align: center;
	background-color: bisque;
}



.top_nav_in1 {
	position: relative;
	left: 500px;
	padding: 8px;
}

.top_nav_bu1 {
	position: relative;
	left: 520px;
	padding: 8px;
	background-color: cornflowerblue;
}

.top_nav_bu1 :hover {
	background-color: darkgreen;
	color: darkkhaki;
}

.table1 td {
	padding: 15px;
}

.button1 {
	text-decoration: none;
	position: relative;
	left: 60px;
	padding: 12px;
	padding-left: 32px;
	padding-right: 32px;
	color: blanchedalmond;
	border-radius: 12px;
	border-color: black;
	background-color: red;
}

.button1:hover {
	background-color: blue;
}

.mar1 {
	font-size: 30px;
	color: crimson;
}

.body_main {
	margin-top: 120px;
	margin-left: 240px;
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
.buy_div{
margin-left:400px;
margin-top:100px;
}
.buy_button{
position: relative;
	left: 80px;
	padding:12px;
	color: blanchedalmond;
	border-radius: 12px;
	
	background-color: rgb(83, 83, 204);
}
</style>
<body bgcolor="cornsilk">



     <% String name =(String)session.getAttribute("name");%>
      
      
      
	<h2 class="h2_1">Mobile Sales App</h2>

	<div class="top_nav">

		<ul>
			<li><a class="active" href="MobilePage.jsp">Home</a></li>
			<li><a href="ViewOrders.jsp">My Orders</a></li>
            <li><a href="ViewCart.jsp">Cart</a></li>
			<li><a href="#contact">Contact us</a></li>
			<li><a href="#about us">About us</a></li>
			<li style="float: right;"><a href="index.jsp">Logout</a></li>
			<li style="float: right;"><a href="AdminLogin.jsp">Admin</a></li>

		</ul>

	<%int price=(int)session.getAttribute("price"); %>

	</div></body>
	<div class="buy_div">
	<form action="buying" method="post"><br>
	<h4 style="margin-left: 50px;color: blue">Hello <%=name %></h4><br>
	
	Address : <input name="address" required="required" pattern="[a-zA-Z0-9\s,[]]{3,40}" type="text" ><br><br>
	Pincode : <input name="pincode" required="required" pattern="[0-9]{6}" maxlength="6" type="text"><br><br>
	Password: <input name="password" required="required" pattern="(?=.*\d)(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}" type="password"><br><br><br>
	<h4 style="margin-left: 20px">Mobile Price     :<%=price%></h4><br>
	<h4 style="margin-left: 20px">Discount 15%     :<%=(price*.15)%></h4><br>
	<%double total=price-(price*.15);%>
	<h4 style="margin-left: 20px;color: green">Total Price :<%=(price*.15)%></h4><br>
	<%session.setAttribute("total",total); %>	
	<%if(session.getAttribute("buying")!=null){ %>
	<h4 style="color:red;margin-left: 50px"><%=session.getAttribute("buying") %></h3><br>
	<%} %>
	
	<button class="buy_button" type="submit">Buy</button><br><br>
	
	</form>
	
	</div>
	<%session.removeAttribute("buying"); %>
</html>