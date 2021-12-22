<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.mobilesalesapp.impl.*" import ="java.sql.*" %>
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
            <li><a href="MobilePage.jsp">Home</a></li>
            <li style="float: right;"><a href="AdminLogin.jsp">Sign out</a></li>
            <li style="float: right;"><a class="active" href="AdminMain.jsp">Admin</a></li>
            <li><a href="#contact">Contact us</a></li>
            <li><a href="#about us">About us</a></li>
           

        </ul>


    </div><br><br><br>
    <%
    ListAllProductImpl listAllProductDao =new ListAllProductImpl();
            ResultSet rs=listAllProductDao.viewProduct();
    %>
    <table style="width: 90%;margin-left: 70px;">
    <tr>
     <th>Product Id</th>
    <th>Product Name</th>
    <th>Description</th>
    <th>Standard Price</th>
    <th>List Price</th>
    <th>Actions</th>
    </tr>
    <%while(rs.next()){ %>
    
    
    <tr>
    <td><%=rs.getInt(1) %></td>
    <td><%=rs.getString(2) %></td>
    <td><%=rs.getString(3) %></td>
    <td><%=rs.getString(4) %></td>
    <td><%=rs.getString(5) %></td>
    <td> <form action="deleteProduct" method="post">
   	 	  Product Id : <input type="text" value=<%=rs.getInt(1) %> disabled  name="deleteId" id="brand_textbox" pattern="[0-9]{1,8}" maxlength="8" required class="deleteId"><br><br>
       <button type="submit" class="btn_add">Delete</button><br><br>
         <%if(session.getAttribute("deleteInfo")!=null){ %>
            <h4 style="color: green"><%=session.getAttribute("deleteInfo") %></h4>
            <%} %>
        </form>
        <form action="updateProduct" method="post">
        
        Product Id : <input type="text" name="updateId" value=<%=rs.getInt(1) %> disabled id="brand_textbox" pattern="[0-9]{1,8}" maxlength="8" required class="updateId"><br><br>
        <label class="add_label1">Standard_cost :</label>
         <input type="text" name="updateStandardPrice" id="brand_textbox" pattern="[0-9]{1,8}" maxlength="8" required class="add_inputs1"><br><br>

            <label class="add_label2">List Price :</label>
            <input type="text" name="updateListPrice" id="brand_textbox"  pattern="[0-9]{1,8}" maxlength="8" required class="add_inputs2"><br><br>
        	<button type="submit" class="btn_add">Update</button><br><br>
        	 <%if(session.getAttribute("updateInfo")!=null){ %>
            <h4 style="color: green"><%=session.getAttribute("updateInfo") %></h4>
            <%} %>
        </form>
        </td>
    </tr>
    <%} %>
    </table>

</body>
</html>