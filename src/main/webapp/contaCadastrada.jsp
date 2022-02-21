<%
   String accountNumber = (String)request.getAttribute("account");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Banco Santande: Sucesso</title>
</head>
<body>
    <h1> <%= accountNumber %> Conta cadastrada com sucesso</h1><br/>
    <a href="/">Voltar</a>
</body>
</html>
