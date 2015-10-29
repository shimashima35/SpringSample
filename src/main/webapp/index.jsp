<%-- 
    Document   : index
    Created on : 2015/10/29, 15:20:59
    Author     : Yoshikazu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>This is secured!</h1>
            <p>
                Hello <b><c:out value="${pageContext.request.remoteUser}"/></b>
            </p>
            <c:url var="logoutUrl" value="/logout"/>
            <form class="form-inline" action="${logoutUrl}" method="post">
                <input type="submit" value="Log out" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>
    </body>
</html>
