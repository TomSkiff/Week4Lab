<%-- 
    Document   : viewnote.jsp
    Created on : 2-Feb-2021, 1:25:28 PM
    Author     : Thomas Skiffington
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2> View Note</h2>
        <b>Title:</b> ${title}
        <h4>Contents:</h4>${content}<br><br>
        <a href="note?edit"> Edit</a>
    </body>
</html>
