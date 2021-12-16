<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
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
            <li><a href="index1.jsp">Login</a></li>
            <li><a class="active" href="AdminLogin.jsp">Admin</a></li>
            <li><a href="#contact">Contact us</a></li>
            <li><a href="#about us">About us</a></li>
            <li style="float: right;"><a href="MobilePage.html">Sign out</a></li>

        </ul>


    </div>
    <%ListAllProduct obj=new ListAllProduct(); %>

</body>
</html>