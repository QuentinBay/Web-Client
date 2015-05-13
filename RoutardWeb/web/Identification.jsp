<%-- 
    Document   : Identification
    Created on : 13 mai 2015, 10:36:37
    Author     : quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <form method="post" action="">
            <fieldset>

                <label for="login">Login : <span class="requis">*</span></label>
                <input type="text" id="login" name="login" value="" size="20" maxlength="60" />
                <br />

                <label for="motdepasse">Mot de passe : <span class="requis">*</span></label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />
                <br />
                
                <label for="Informations">Informations <span class="requis"></span></label>
                
                <br />
                <br />
                <input type="submit" value="Se connecter" class="sansLabel" />
                <a href="http://localhost:8080/RoutardWeb/InscriptionClient.jsp"> <button type="button" value="OK" class="sansLabel"/></a>
                <br />
            </fieldset>
        </form>
    </body>
</html>
