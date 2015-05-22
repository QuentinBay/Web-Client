<%-- 
    Document   : DetailsOffres
    Created on : 14 mai 2015, 20:17:35
    Author     : quentin
--%>
<%@page import="routard.Voyage"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="routard.Voyage" %>
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
            //On recupere les donnees de l'action
            List<Voyage> voyages = (List<Voyage>)request.getAttribute("voyages");
        %>
        
        <!-- Affichons la liste des voyages -->
        <c:if test="${voyages!= null}" >
            
        
            <c:forEach var="voyage" items="${voyages}">
                <li> ${voyage.getNom()} </li>
                <li> ${voyage.getDtype()} ( ${voyage.getDuree()} jours ) </li>
                <li> ${voyage.getDescription()} </li>
                <br/>
            </c:forEach>
        </c:if>
        <!-- bouton de retour -->
        <a href="ActionServlet?todo=composerVoyage"> 
            <span style="position: absolute; right: 50px">
                <input type="button" value="Retour" class="sansLabel"/>
            </span>
        </a>
    </body>
</html>
