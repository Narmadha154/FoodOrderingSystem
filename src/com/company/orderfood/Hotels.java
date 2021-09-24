package com.company.orderfood;

import java.util.HashMap;
import java.util.Scanner;

public class Hotels {
    static Scanner sc=new Scanner(System.in);
    public static void selectHotel(){
        System.out.println("Please choose the hotel");
        System.out.println("1) AryaBhavan Hotel");
        System.out.println("2) Saravana Bhavan Hotel");
        System.out.println("3) Priyam Hotel");
        System.out.println("4) Exit");
        System.out.println("Please select the hotel");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Welcome to Hotel Arya Bhavan");
                chooseFood();
                break;
            case 2:
                System.out.println("Welcome to Hotel Saravana Bhavan");
                chooseFood();
                break;
            case 3:
                System.out.println("Welcome to Hotel Priyam");
                chooseFood();
                break;
            case 4:
                return;
        }
    }
    public static void chooseFood() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 70);
        map.put(2, 100);
        map.put(3, 90);
        map.put(4, 15);
        map.put(5, 75);
        map.put(6, 80);
        map.put(7, 90);
        map.put(8, 120);
        map.put(9, 35);
        int amount = 0;
        System.out.println("Please choose the food");
        System.out.println("1) Sandwich         70");
        System.out.println("2) Pizza            100");
        System.out.println("3) Fried_Rice       90");
        System.out.println("4) Parotta          15");
        System.out.println("5) Noodles          75");
        System.out.println("6) Chicken_Rice     80");
        System.out.println("7) Chicken_Briyani  90");
        System.out.println("8) Prawn            120");
        System.out.println("9) Faloda           35");
        System.out.println("10) Cart");
        System.out.println("11) Exit");
        while (true) {
            System.out.println("Please enter your choice:");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 9) {
                amount += map.get(choice);
            }
            else if (choice == 10) {
                System.out.println("------------------Cart-------------------");
                System.out.println("Your Total Order Amount is "+amount);
                System.out.println("Do you wish to order(y=1/n=0):");
                int ans=sc.nextInt();
                if(ans==1){
                    System.out.println("Your Order Placed.Have a Tasty Food....");
                    return;
                }
                else{
                    System.out.println("Do You Wish to cancel any item or add any time in your cart:");
                    System.out.println("1) Add Item");
                    System.out.println("2) Cancel Item");
                    System.out.println("3) Cancel Order");
                    int wish=sc.nextInt();
                    if(wish==2){
                        System.out.println("Which item you want to cancel ?");
                        choice=sc.nextInt();
                        amount-=map.get(choice);
                    }
                    else if(wish==3){
                        System.out.println("Your Order is Cancelled");
                        return;
                    }
                }
            }
           else if (choice == 11) {
                return;
            }
        }
    }
}
