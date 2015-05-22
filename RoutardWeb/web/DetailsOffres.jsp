<%-- 
    Document   : DetailsOffres
    Created on : 14 mai 2015, 20:17:35
    Author     : quentin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DetailsOffres</title>
    </head>
    <body>
        <!-- bouton de deconnexion -->
        <a href="/RoutardWeb/index.jsp"> 
            <span style="position: absolute; right: 50px">
                <input type="button" value="Deconnexion" class="sansLabel"/>
            </span>
        </a>
        <br/>
        <br/>
        <span style="font-weight:bold;">Voici nos offres :</span>
        
        <br/>
        <br/>
        <%
            String dest = (String)request.getAttribute("dest");
            String type = (String)request.getAttribute("type");
        %>
        <p>
            ${dest}
            ${type}
        </p>
        
        <!-- bouton de retour -->
        <a href="ActionServlet?todo=composerVoyage"> 
            <span style="position: absolute; right: 50px">
                <input type="button" value="Retour" class="sansLabel"/>
            </span>
        </a>
    </body>
</html>
