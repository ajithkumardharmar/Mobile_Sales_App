<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<% String name =(String)session.getAttribute("name");
    if(name ==(null)){
    	response.sendRedirect("index.jsp");
    	}%>
    	
    	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Mobile_page</title>
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
    
    .table1  {
        padding: 5px;
        
    }
     .table1 td  {
        padding: 8px;
        text-align: center;
    }
    
    .button1 {
        text-decoration: none;
        position: relative;
        
        top:20px;
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
        background-color: cornsilk;
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

<body>
    <h2 class="h2_1">Mobile Sales App</h2>

    <div class="top_nav">

        <ul>
            <li><a class="active" href="MobilePage.jsp	">Home</a></li>
            <li><a href="ViewOrders.jsp">My Orders</a></li>
            <li><a href="#contact">Cart</a></li>
            <li><a href="#contact">Contact us</a></li>
            <li><a href="#about us">About us</a></li>
            <li style="float: right;"><a href="index.jsp">Login</a></li>
            <li style="float: right;"><a href="AdminLogin.jsp">Admin</a></li>
            
        </ul>


    </div>
    <div class="body_main">
        <br>
        <input class="top_nav_in1" type="search">
        <button class="top_nav_bu1">Search</button><br>

        <marquee class="mar1" behavior="" direction="">New Smartphone Offer Available upto 15% Discount</marquee>
        
        <table style="margin-left: 122px;" class="table1">
            <tr>
                <th><a id="41" href="MobileInfo.jsp"><img src="https://rukminim1.flixcart.com/image/312/312/k9loccw0/mobile/p/z/q/apple-iphone-se-mxd02hn-a-original-imafrcpjfehbbqgb.jpeg?q=70" alt=""></a>                </th>
                <th><a id="42" href="MobileInfoPoco.jsp"><img src="https://rukminim1.flixcart.com/image/312/312/ku4ezrk0/mobile/b/o/m/c31-mzb0a0min-poco-original-imag7bzqxekkpkrv.jpeg?q=70" alt=""></a></th>
                <th><a href="MobileInfoRealme.jsp"><img src="https://rukminim1.flixcart.com/image/312/312/ktx9si80/mobile/q/a/c/narzo-50a-rmx3430-realme-original-imag75kybaer8scz.jpeg?q=70" alt=""></a></th>
                <th><a href="MobileInfoRealme8i.jsp"><img src="https://rukminim1.flixcart.com/image/312/312/ktbu6q80/mobile/x/w/y/8i-rmx3151-realme-original-imag6zhnabagtrzu.jpeg?q=70" alt=""></a></th>
            </tr>
		
            <tr>
                <br>
                <td> <br> APPLE iPhone SE (Black, 64 GB)

                </td>
                <td><br>POCO C31 (Shadow Gray, 64 GB) </td>
                <td><br>realme Narzo 50A (Oxygen Green, 64 GB)</td>
                <td><br>realme 8i (Space Black, 64 GB)</td>
            </tr>
              <tr>
                <br>
                <td> <br> 29000 </td>
                <td><br>16000 </td>
                <td><br>13000</td>
                <td><br>14000</td>
            </tr>
            <tr>

                <td><a class="button1" href="MobileInfo.jsp">Buy</a>
                </td>
                <td><a class="button1" href="#MobileInfo.jsp">Buy</a>
                </td>
                <td><a class="button1" href="#as">Buy</a>
                </td>
                <td><a class="button1" href="#as">Buy</a>
                </td>
            </tr>

        </table>
        <br> <br><br> <br>
        <table style="margin-left: 122px;" class="table1">
            <tr>
                <th><img  src="https://rukminim1.flixcart.com/image/312/312/knyxqq80/mobile/1/c/5/a53s-5g-cph2321-oppo-original-imag2gwzzxmkwgsn.jpeg?q=70" alt="">
                    <br>
                </th>
                <th><img src="https://rukminim1.flixcart.com/image/312/312/kg8avm80/mobile/n/2/u/apple-iphone-12-mini-dummyapplefsn-original-imafwgbf4pvjhypq.jpeg?q=70" alt=""></th>
                <th><img src="https://rukminim1.flixcart.com/image/312/312/klicfww0/mobile/m/v/g/9-power-b089ms8wgp-redmi-original-imagym4xguhgzzxr.jpeg?q=70" alt=""></th>
                <th><img src="https://rukminim1.flixcart.com/image/312/312/kua4r680/mobile/x/x/k/9-activ-m2006c3mii-redmi-original-imag7fng7kfzcfzz.jpeg?q=70" alt=""></th>
            </tr>

            <tr>
                <br>
                <td> <br>OPPO A53s 5G (Crystal Blue, 128 GB)

                </td>
                <td><br>APPLE iPhone 12 (Blue, 128 GB) </td>
                <td><br>REDMI 9 Power (Fiery Red, 64 GB)</td>
                <td><br>REDMI 9 Activ (Carbon Black, 128 GB)</td>
            </tr>
            <tr>
                <br>
                <td> <br> 29000 </td>
                <td><br>40000 </td>
                <td><br>13000</td>
                <td><br>14999</td>
            </tr>
            <tr>

                <td><a class="button1" href="#as">Buy</a>
                </td>
                <td><a class="button1" href="#as">Buy</a>
                </td>
                <td><a class="button1" href="#as">Buy</a>
                </td>
                <td><a class="button1" href="#as">Buy</a>
                </td>
            </tr>
        </table>



    </div>




</body>

</html>