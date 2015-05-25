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
        <div>
            <p style="text-align:center">
                Pensez à vérifier dans votre boîte mail la confirmation de votre inscrition !
            </p>
        </div>
        <div>
            <span style="position: absolute; left: 120px"> 
                <FORM>
                    <INPUT TYPE="BUTTON" VALUE="OK" ONCLICK="window.close()">
                </FORM>
            </span>
        </div>
        <%
            String mail = (String)request.getAttribute("inscription");
            System.out.println(mail);
        %>
    </body>
</html>
