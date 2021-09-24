package com.company.orderfood;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Account> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey");
        while(true){
            System.out.println("Welcome to food ordering system");
            System.out.println("1) Signup");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter your name:");
                    String name=sc.next();
                    System.out.println("Enter your age:");
                    int age=sc.nextInt();
                    System.out.println("Enter your email id:");
                    String email=sc.next();
                    System.out.println("Enter password:");
                    String password=sc.next();
                    if(password.length()<8||password.length()>12){
                        System.out.println("Your password length is inappropriate");
                        System.out.println("Length must between 8 to 12");
                        return;
                    }
                    System.out.println("Confirm password:");
                    String confirmPass=sc.next();
                    if(!confirmPass.equals(password)){
                        System.out.println("you have entered wrong password");
                        return;
                    }
                    System.out.println("Enter your mobile number:");
                    long mobNum=sc.nextLong();
                    Account acc=new Account();
                    acc.setAge(age);
                    acc.setName(name);
                    acc.setPassword(password);
                    acc.setMobNum(mobNum);
                    acc.setEmail(email);
                    AccountCreation.createAccount(acc,email,map);
                    break;
                case 2:
                    System.out.println("Enter your email id:");
                    String mail=sc.next();
                    System.out.println("Enter password:");
                    String pass=sc.next();
                    String user=Login.accountLogin(mail,map,pass);
                    System.out.println("Welcome"+" "+user+" "+"you have successfully logged in");
                    System.out.println("We provide two ways of search");
                    System.out.println("1) Search by hotels");
                    System.out.println("2) Search by food");
                    System.out.println("3) Exit");
                    System.out.println("Enter your choice");
                    int newChoice=sc.nextInt();
                    switch(newChoice){
                        case 1:
                            Hotels.selectHotel();
                            break;
                        case 2:
                            Hotels.chooseFood();
                            break;
                        case 3:
                            return;
                    }
                    break;
                case 3:
                    return;
            }
        }
    }
}
