<%@ page import="com.santander.model.AgencyModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listando Agências</title>
</head>
<body>
    <ul>
        <%
            List<AgencyModel> agency = (List)request.getAttribute("agencies");
            for(AgencyModel agencyModel : agency){
        %>
                <li><%= agencyModel.getNumberAgency()%></li>

      <%
          }
      %>
    </ul>
    <br/>
    <a href="/">Voltar</a>
</body>
</html>
