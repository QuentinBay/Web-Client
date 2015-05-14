<%-- 
    Document   : InscriptionClient
    Created on : 13 mai 2015, 09:41:06
    Author     : quentin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>InscriptionClient</title>
    </head>
    <body>
        <form method="post" action="/RoutardWeb/ConfirmationEnvoieMail.jsp">
            <fieldset>
                <label for="civilite">civilité: </label>
                <SELECT name="civilite" size="1">
                    <OPTION>M
                    <OPTION>Mme
                </SELECT>
                <br />
                
                <label for="nom">nom: </label>
                <input type="text" id="nom" name="nom" value="" size="50" maxlength="50" />
                <br />
                
                <label for="prenom">prenom: </label>
                <input type="text" id="prenom" name="prenom" value="" size="50" maxlength="50" />
                <br />
                
                <label for="adresse">adresse: <span class="requis"></span></label>
                <input type="text" id="adresse" name="adresse" value="" size="50" maxlength="60" />
                <br />
                
                <label for="codePostal">code postal: <span class="requis"></span></label>
                <input type="text" id="codePostal" name="codePostal" value="" size="20" maxlength="60" />
                <label for="ville">ville: <span class="requis"></span></label>
                <input type="text" id="ville" name="ville" value="" size="20" maxlength="60" />
                <br />
                
                <label for="pays">pays: <span class="requis"></span></label>
                <input type="text" id="pays" name="pays" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">@mail: <span class="requis"></span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                

                <label for="telephone">téléphone: <span class="requis"></span></label>
                <input type="text" id="telephone" name="telephone" value="" size="20" maxlength="20" />
                <br />
                <br/>
                
                <label for="conditions"><span style="font-weight:bold;">Termes et conditions d'utilisation:</span></label>
                <br/>
                <label for="blabla"><span style="font-size:12px;">Blablabla !</span></label>
                <br/>
                <br/>
                
                <input type="checkbox" name="acceptation" value="J'accepte" class="sansLabel"/>J'accepte
                
                <br/>
                <br/>                
                <input type="submit" value="OK" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>
