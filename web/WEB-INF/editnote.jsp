<%-- 
    Document   : editnote
    Created on : 2-Feb-2021, 1:25:45 PM
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
        <h2>Edit Note</h2>
        <form action="note" method="post">
            Title: <input type="text" name="title" value="${title}"><br>
            Contents: <textarea rows="4" cols="50" name="content">${content}</textarea> <br>
            <input type="submit" value="Save" >
        </form>
    </body>
</html>
