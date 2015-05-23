<%-- 
    Document   : ConfirmationEnvoieMail
    Created on : 13 mai 2015, 10:52:17
    Author     : quentin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation Envoie Mail</title>
    </head>
    <body>
        <br/>
        <p>Pensez à vérifier dans votre boîte mail la confirmation de votre inscrition !</p>
        <br/>
        <a href="ActionServlet?todo=composerVoyage">
            <input type="button" value="OK"/>
        </a>
        
        <%
            String mail = (String)request.getAttribute("inscription");
            System.out.println(mail);
        %>
    </body>
</html>
