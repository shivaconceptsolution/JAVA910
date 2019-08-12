<%-- 
    Document   : login
    Created on : Aug 12, 2019, 1:22:46 PM
    Author     : SHIVA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="LoginSer" method="post">
            
            <input type="text" name="txtemail" placeholder="enter email" />
            <br>
            <br>
            <input type="password" name="txtpass" placeholder="Enter password" />
           
            <br>
            <br>
            <input type="submit" name="btnsubmit" value="Login" name="btnsubmit" />
            
            
            
        </form>
        <a href="index.jsp">Register Here</a>
    </body>
</html>
