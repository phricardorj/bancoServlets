<%@ page import="com.santander.model.ClientModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listando Clientes</title>
</head>
<body>
    <ul>
        <%
            List<ClientModel> clients = (List)request.getAttribute("clients");
            for(ClientModel clientModel : clients){
        %>
                <li><%= clientModel.getNome()%></li>

      <%
          }
      %>
    </ul>
    <br />
    <a href="/">Voltar</a>
</body>
</html>
