<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile Info Page</title>
</head>
<style>
.h2_1 {
	text-align: center;
	background-color: bisque;
}

.top_nav {
	/* background-color: brown;
        padding: 9px; */
	
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

.phoneInfo {
	margin-left: 250px;
	margin-top: -270px;
	font-size: 20px;
}
.but_log a{
	text-decoration:none;
	color:white;
 	padding: 12px;
 	margin-top:20px;
    margin-left: 100px;
    background-color: rgb(83, 83, 204);
    border-radius: 20px;

}
.but_log{
margin-top:40px;
}

* {
	margin: 0;
	padding: 0;
}
</style>
<body bgcolor="cornsilk">
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


	</div>
	<%session.setAttribute("productId", 42);
	  session.setAttribute("price", 16000);%>
	<div class="body_main">
	
		<a><img id="42"
			src="https://rukminim1.flixcart.com/image/312/312/ku4ezrk0/mobile/b/o/m/c31-mzb0a0min-poco-original-imag7bzqxekkpkrv.jpeg?q=70"
			alt=""></a>
		<div class="phoneInfo">
			<pre>POCO C31 (Royal Blue, 64 GB)
4.46,584 Ratings & 317 Reviews
4 GB RAM | 64 GB ROM | Expandable Upto 512 GB
16.59 cm (6.53 inch) HD+ Display
13MP + 2MP + 2MP | 5MP Front Camera
5000 mAh Lithium-ion Polymer Battery
MediaTek Helio G35 Processor
</pre>

			<div class="but_log">
				<a href="addCart">Add Cart</a> 
				<a href="MobileBuy.jsp">Buy</a>
			</div>
		</div>
	</div>


</body>
</html>