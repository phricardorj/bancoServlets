package com.santander.controller;

import com.santander.model.AgencyModel;
import com.santander.model.AllAgencies;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Agency", value = "/agencia")
public class Agency extends HttpServlet {
    AllAgencies allAgencies = new AllAgencies();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agencyNumber = request.getParameter("agencyNumber");
        AgencyModel agency = new AgencyModel();
        agency.setNumberAgency(agencyNumber);
        allAgencies.add(agency);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("agenciaCadastrada.jsp");
        request.setAttribute("agency", agency.getNumberAgency());
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<AgencyModel> agencies = allAgencies.showAllAgencies();
        request.setAttribute("agencies", agencies);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaAgencias.jsp");
        requestDispatcher.forward(request, response);
    }

}
