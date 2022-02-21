package com.santander.model;

import java.util.ArrayList;
import java.util.List;

public class AllClients {
    private static List<ClientModel> clients = new ArrayList<>();
    public void add(ClientModel clientModel){
        AllClients.clients.add(clientModel);
    }
    public List<ClientModel> showAllClients(){
        return AllClients.clients;
    }
}
