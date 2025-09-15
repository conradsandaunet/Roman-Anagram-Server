<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%
    String word = (String) request.getAttribute("word");
    List<String> anagrams = (List<String>) request.getAttribute("anagrams");
%>
<!doctype html>
<html>
<head><meta charset="UTF-8"><title>Anagram result</title></head>
<body>
<h1>Anagrams for: <%= word %></h1>
<ul>
    <% if (anagrams != null) for (String w : anagrams) { %>
    <li><%= w %></li>
    <% } %>
</ul>
<a href="index.jsp">Go back</a>
</body>
</html>