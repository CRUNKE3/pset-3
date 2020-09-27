package com.example.exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Amount : ");
        double totalAmount = scn.nextDouble();

        int quarters = (int) ((totalAmount - (totalAmount % 0.25)) / 0.25);
        int dimes = (int) (((totalAmount-(quarters*0.25))-((totalAmount-(quarters*0.25))%0.1))/0.1);
        int nickels = (int) (((totalAmount-(quarters*0.25)-(dimes*0.1))-((totalAmount-(quarters*0.25)-(dimes*0.1))%0.05))/0.05);
        int pennies = (int) (((totalAmount-(quarters*0.25)-(dimes*0.1)-(nickels*0.05))/0.01)+1);
        System.out.println("Quarters : "+quarters);
        System.out.println("Dimes    : "+dimes);
        System.out.println("Nickles  : "+nickels);
        System.out.println("Pennies  : "+pennies);

    }
}
