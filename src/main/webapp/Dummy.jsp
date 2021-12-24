<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.sql.*" import ="com.mobilesalesapp.connection.ConnectionPro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con=ConnectionPro.connect();
String query3="select * from photo where id=?";
System.out.println("hello");
PreparedStatement pre=con.prepareStatement(query3);
pre.setInt(1, 11);
ResultSet rs=pre.executeQuery();

System.out.println("vanakam mapla1");
//ResultSet rs2=st.executeQuery(query3);
System.out.println("hii dude");
//String photo="https://rukminim1.flixcart.com/image/312/312/k9loccw0/mobile/p/z/q/apple-iphone-se-mxd02hn-a-original-imafrcpjfehbbqgb.jpeg?q=70";%>
  <%if(rs.next()) { 
	//  System.out.println("hii dude");
    System.out.println(rs.getString(1));%>
    <img alt="not show" src="<%=(String)rs.getString(1) %>">
    
    <%} %>
    <img alt="not show" src="https://rukminim1.flixcart.com/image/312/312/k9loccw0/mobile/p/z/q/apple-iphone-se-mxd02hn-a-original-imafrcpjfehbbqgb.jpeg?q=70">
<img alt="" src="">
<% out.println("Hello world"); %>
</body>
</html>