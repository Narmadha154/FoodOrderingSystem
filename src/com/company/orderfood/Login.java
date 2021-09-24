package com.company.orderfood;

import java.util.HashMap;
public class Login {
    public static String accountLogin(String email,HashMap<String,Account>map,String password){
        String name="";
         if(map.get(email)==null){
             System.out.println("Account not exists");
         }
         else{
             Account acc=map.get(email);
             String check=acc.getPassword();
             if(check.equals(password)){
                 name=acc.getName();
             }
             else{
                 System.out.println("Your password doesn't match.Please enter correct password");
             }
         }
         return name;
    }
}
