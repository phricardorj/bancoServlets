package com.santander.controller;

import com.santander.model.ClientModel;
import com.santander.model.AllClients;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Client", value = "/cliente")
public class Client extends HttpServlet {
    AllClients allClients = new AllClients();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientName = request.getParameter("clientName");
        ClientModel client = new ClientModel();
        client.setNome(clientName);
        allClients.add(client);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("clienteCadastrado.jsp");
        request.setAttribute("client", client.getNome());
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ClientModel> clients = allClients.showAllClients();
        request.setAttribute("clients", clients);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaClientes.jsp");
        requestDispatcher.forward(request, response);
    }
}
