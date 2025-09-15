<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h1>Roman Numerals</h1>
<p><%= request.getAttribute("number") %> =
    <b><%= request.getAttribute("roman") %></b></p>
<a href="index.jsp">Go back</a>
</body>
</html>