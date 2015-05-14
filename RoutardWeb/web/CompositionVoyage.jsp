<%-- 
    Document   : CompositionVoyage
    Created on : 14 mai 2015, 19:24:25
    Author     : quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CompositionVoyage</title>
    </head>
    <body>
        
        <form method="post" action="/RoutardWeb/DetailsOffres.jsp">
            <fieldset>
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
                <SELECT name="destination" size="1">
                    <OPTION> 
                </SELECT>
                </span>
                <br />
                <br />
                <label for="typeVoyage"><span style="margin-left: 100px;">Type voyage:</span></label>
                <input type="checkbox" name="sejour" value="" class="sansLabel">Sejour
                <br/>
                <span style="margin-left: 210px;">
                    <input type="checkbox" name="circuit" value="" class="sansLabel"/>Circuit
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
