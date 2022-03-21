<%--
  Created by IntelliJ IDEA.
  User: Solveen
  Date: 3/16/2022
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="sessions" method="Post">
    <%
        String Email = (String) session.getAttribute("email");
        String Password = (String) session.getAttribute("password");%>
    <p> Hello : <%=Email%>
    </p>

    <input type ='hidden' name='Email' value = <%=Email%> >
    <a href=""><input type ='submit' value = 'Submit'></a>
</form>
</body>
</html>
