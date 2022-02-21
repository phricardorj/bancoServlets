package com.santander.model;

import java.util.ArrayList;
import java.util.List;

public class AllAccounts {
    private static List<AccountModel> accounts = new ArrayList<>();
    public void add(AccountModel accountModel){
        AllAccounts.accounts.add(accountModel);
    }
    public List<AccountModel> showAllAccounts(){
        return AllAccounts.accounts;
    }
}
