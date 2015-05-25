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
        <script type="text/javascript">
            function open_infos()
            {
                width = 300;
                height = 150;
                if(window.innerWidth)
                {
                    var left = (window.innerWidth-width)/2;
                    var top = (window.innerHeight-height)/2;
                }
                else
                {
                    var left = (document.body.clientWidth-width)/2;
                    var top = (document.body.clientHeight-height)/2;
                }
                window.open('/RoutardWeb/ConfirmationEnvoieMail.jsp','ConfirmationInscription',
                            'menubar=no, scrollbars=no, top='+top+', left='+left+', \n\
                            width='+width+', height='+height+'');
            }  
        </script>
    </head>
    <body>
        <form method="post" action="ActionServlet?todo=inscriptionClient">
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
                
                <label for="adresse">adresse:</label>
                <input type="text" id="adresse" name="adresse" value="" size="50" maxlength="60" />
                <br />
                
                <label for="codePostal">code postal:</label>
                <input type="text" id="codePostal" name="codePostal" value="" size="20" maxlength="60" />
                <label for="ville">ville:</label>
                <input type="text" id="ville" name="ville" value="" size="20" maxlength="60" />
                <br />
                
                <label for="pays">pays:</label>
                <input type="text" id="pays" name="pays" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">@mail:</label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                

                <label for="telephone">téléphone: </label>
                <input type="text" id="telephone" name="telephone" value="" size="20" maxlength="20" />
                <br />
                <br/>
                
                <label for="conditions">
                    <span style="font-weight:bold;">
                        Termes et conditions d'utilisation:
                    </span>
                </label>
                <br/>
                <label for="blabla">
                    <span style="font-size:12px;">
                        Blablabla !
                    </span>
                </label>
                <br/>
                <br/>
                
                <input type="checkbox" name="acceptation" value="yes"/>J'accepte les termes et conditions d'utilisation
                
                <br/>
                <br/>
                <a href="#null" onclick="javascript:open_infos();">
                    <input type="submit" value="OK" />
                </a>
                
                <br />
            </fieldset>
        </form>
    </body>
</html>
