package com.example.exercise7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        //initial inputs
        System.out.print("Salary: ");
        Double salary = scn.nextDouble();
        System.out.print("401(k): ");
        Double retirement = (scn.nextDouble())/100;
        System.out.print("Federal Tax: ");
        Double federal = (scn.nextDouble())/100;
        System.out.print("State Tax: ");
        Double state = (scn.nextDouble())/100;

        //Math section
        Double paycheckGross = salary/24;
        Double afterRetire = paycheckGross-(paycheckGross*retirement);
        Double afterFederal = afterRetire*federal;
        Double afterState = afterRetire*state;
        Double paycheckNet = afterRetire-afterFederal-afterState;

        //Final output
        System.out.println("\n$"+decimalFormat.format(paycheckNet));
    }
}
