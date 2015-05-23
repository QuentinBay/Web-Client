<%-- 
    Document   : EnvoieMailDevis
    Created on : 23 mai 2015, 15:43:08
    Author     : quentin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EnvoieMailDevis</title>
    </head>
    <body>
        <br/>
        <%
            String info = (String)request.getAttribute("confirmation");
            
        %>
        <span>
            ${info}
        </span>
        <br/>
        <a href="ActionServlet?todo=detaillerOffres"> <input type="button" value="OK" class="sansLabel"/></a>
    </body>
</html>
