package com.santander.model;

import java.util.ArrayList;
import java.util.List;

public class AllAgencies {
    private static List<AgencyModel> Agencies = new ArrayList<>();
    public void add(AgencyModel agency){
        AllAgencies.Agencies.add(agency);
    }
    public List<AgencyModel> showAllAgencies(){
        return AllAgencies.Agencies;
    }
}
