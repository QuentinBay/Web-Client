<%-- 
    Document   : CompositionVoyage
    Created on : 14 mai 2015, 19:24:25
    Author     : quentin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="routard.Pays" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CompositionVoyage</title>
    </head>
    <body>
        
        <form method="post" action="ActionServlet?todo=detaillerOffres">
            <fieldset>
                <!--<input type="hidden" name="todo" value="detaillerOffres"/>-->
                <!-- bouton de deconnexion -->
                <a href="/RoutardWeb/index.jsp"> 
                    <span style="position: absolute; right: 50px">
                        <input type="button" value="Deconnexion" class="sansLabel"/>
                    </span>
                </a>
                <br/>
                <br/>
                
                <label><span style="font-weight:bold;">Composer votre voyage :</span></label>
                <br />
                <br />
                <span style="margin-left: 100px;">
                <label for="destination">Destination:</label>
                
                <%
                    List<Pays> listePays = (List<Pays>)request.getAttribute("listePays");
                %>
                
                <SELECT name="destination" size="1">
                    <OPTION>Toutes les destinations
                    <c:forEach var="pays" items="${listePays}">
                        <OPTION value="${pays.getId()}"> ${pays.getNom()}
                    </c:forEach>
                    
                </SELECT>
                </span>
                <br />
                <br />
                <p>OU</p>
                <br />
                <br />
                <label><span style="margin-left: 100px;">Type voyage:</span></label>
                <input type="radio" name="typeVoyage" value="sejour" class="sansLabel">Sejour
                <br/>
                <span style="margin-left: 210px;">
                    <input type="radio" name="typeVoyage" value="circuit" class="sansLabel"/>Circuit
                </span>
                <br />
                <br />
                <br />
                <span style="margin-left: 100px;">
                    <input type="submit" value="Consultez nos offres!" class="sansLabel" />
                </span>
                <br />
                
                
            </fieldset>
        </form>
    </body>
</html>
