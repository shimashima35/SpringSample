<%-- 
    Document   : welcome
    Created on : 2015/10/02, 18:55:25
    Author     : Yoshikazu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <title>Welcome</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Products</h1>
                    <c:forEach items="${item}" var="products">
                    <p> Name:${name}</p>
                    <p> Price:${price}</p>
                    </c:forEach>
                </div>
            </div>
        </section>
    </body>
</html>