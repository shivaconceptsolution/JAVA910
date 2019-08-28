<%-- 
    Document   : index
    Created on : Aug 12, 2019, 12:47:28 PM
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
        <form action="RegSer" method="post">
            
            <input type="text" name="txtemail" placeholder="enter email" />
            <br>
            <br>
            <input type="password" name="txtpass" placeholder="Enter password" />
            <br>
            <br>
            <input type="text" name="mobileno" placeholder="Enter mobileno" />
            <br>
            <br>
            <input type="submit" name="btnsubmit" value="Insert" name="btnsubmit" />
            
            
            
        </form>
        <a href="login.jsp">Login Here</a>
    </body>
</html>
