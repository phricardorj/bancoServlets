<%
   String agencyNumber = (String)request.getAttribute("agency");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Banco Santande: Sucesso</title>
</head>
<body>
    <h1> <%= agencyNumber%> Agência cadastrada com sucesso</h1> <br/>
    <a href="/">Voltar</a>
</body>
</html>
