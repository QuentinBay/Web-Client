<%-- 
    Document   : index
    Created on : 13 mai 2015, 11:20:14
    Author     : quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Identification</title>
    </head>
    <body>
       
        <form method="post" action="/RoutardWeb/CompositionVoyage.jsp">
            <fieldset>
                <br />
                <label for="login">Login :</label>
                <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
                <br />
                <br />
                <label for="motdepasse">Mot de passe : </label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />
                <br />
                <br />
                <label for="Informations">Informations </label>
                <br />
                <br />
                <br />
                <input type="submit" value="Se connecter" class="sansLabel" />
                <a href="/RoutardWeb/InscriptionClient.jsp"> <input type="button" value="S'incrire" class="sansLabel"/></a>
                <br />
            </fieldset>
        </form>
    </body>
</html>
