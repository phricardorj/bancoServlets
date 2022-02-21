package com.santander.controller;

import com.santander.model.AccountModel;
import com.santander.model.AllAccounts;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "Account", value = "/conta")
public class Account extends HttpServlet {
    AllAccounts allAccounts = new AllAccounts();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accountNumber = request.getParameter("accountNumber");
        AccountModel account = new AccountModel();
        account.setAccountNumber(accountNumber);
        allAccounts.add(account);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contaCadastrada.jsp");
        request.setAttribute("account", account.getAccountNumber());
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<AccountModel> accounts = allAccounts.showAllAccounts();
        request.setAttribute("accounts", accounts);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaContas.jsp");
        requestDispatcher.forward(request, response);
    }

}
