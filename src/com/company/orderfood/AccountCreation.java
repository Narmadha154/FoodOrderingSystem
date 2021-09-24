package com.company.orderfood;

import java.util.HashMap;

public class AccountCreation {
    public static  void createAccount(Account acc,String email,HashMap<String,Account>map){
        if(map.get(email)==null){
            map.put(email,acc);
        }
        else{
            System.out.println("Account already exists.Please Login");
        }
      //  System.out.println("map"+map);
    }
}





