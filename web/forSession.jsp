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

<h1> Here are the session details</h1>
<form action="sessions" method="Post">
    <% String Email = (String) session.getAttribute("email");
        String Password = (String) session.getAttribute("password");%>
    <p> Your e-mail is : <%=Email%></p>
    <p>Your password is : <%=Password%></p>
    <p> Session id is : <%=session.getId()%><p>

</form>
</body>
</html>
