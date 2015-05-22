<%-- 
    Document   : DetailsOffres
    Created on : 14 mai 2015, 20:17:35
    Author     : quentin
--%>
<%@page import="routard.Voyage"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="routard.Voyage" %>
<%@page import="routard.Depart" %>
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
            List<Depart> departs = (List<Depart>)request.getAttribute("departs");
            String voyageId = (String)request.getAttribute("voyageId");
            String selection = (String)request.getAttribute("selection");
        %>
        
        <!-- Affichons la liste des voyages -->
        <c:if test="${voyages!= null}" >
        
            <c:forEach var="voyage" items="${voyages}">
                <c:if test="${Integer.parseInt(voyageId) == voyage.getId()}" >
                    <!-- On affiche le detail de ce voyage -->
                    <form method="post" action="ActionServlet?todo=creerDevis">
                        <fieldset>
                            <li> 
                                <span style="font-weight:bold;">${voyage.getNom()}</span>
                                - ${voyage.getDtype()} ( ${voyage.getDuree()} jours ) 
                                <span style="position: absolute; right: 100px">
                                    <input type="button" value="-"/>
                                </span>
                            </li>
                            <br/>
                            <li>Infos voyage :</li>
                            <li> ${voyage.getDescription()} </li>
                            <br/>

                            <label>Nb. personnes : </label>
                            <input type="text" id="nbPersonnes" name="nbPersonnes" value="" size="10" maxlength="20" />
                            <br />
                            <label>Choisissez le transport :</label>
                            <br />
                            <SELECT name="transport" size="1">
                                <OPTION>Depart-date-tarif-compagnie
                            </SELECT>
                            <br />
                            <br />
                            <input type="submit" value="Valider"/>
                        </fieldset>
                    </form>
                    <br />
                    <br />
                </c:if>
                <c:if test="${Integer.parseInt(voyageId) != voyage.getId()}" >
                    <!-- On n'affiche pas le detail de ce voyage -->
                    <form method="post" action="ActionServlet?todo=detaillerOffres">
                        <fieldset>
                            <li> 
                                <span style="font-weight:bold;">${voyage.getNom()}</span>
                                - ${voyage.getDtype()} ( ${voyage.getDuree()} jours ) 
                                <span style="position: absolute; right: 100px">
                                    <input type="submit" value="+"/>
                                </span>
                                <input type="hidden" name="voyage" value="${voyage.getId()}"/>
                                <input type="hidden" name="destination" value="${selection}"/>
                            </li>
                        </fieldset>
                    </form>
                    <br/>
                </c:if>
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
