<%@ page import="com.santander.model.AccountModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listando Contas</title>
</head>
<body>
    <ul>
        <%
            List<AccountModel> accounts = (List)request.getAttribute("accounts");
            for(AccountModel accountModel : accounts){
        %>
                <li><%= accountModel.getAccountNumber()%></li>

      <%
          }
      %>
    </ul>
    <br />
    <a href="/">Voltar</a>
</body>
</html>
