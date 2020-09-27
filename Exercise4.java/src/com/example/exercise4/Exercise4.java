package com.example.exercise4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        Scanner scn = new Scanner(System.in);

        System.out.print("Height : ");
        Double height = scn.nextDouble()*2;
        System.out.print("Width  : ");
        Double width = scn.nextDouble()*2;

        double perimInches = height+width;
        double perimCenti = perimInches*2.54;
        System.out.println(decimalFormat.format(perimCenti)+ " centimeters");
    }
}
