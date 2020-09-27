package com.example.exercise3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        Scanner scn = new Scanner(System.in);

        System.out.print("Height : ");
        Double height = scn.nextDouble();
        System.out.print("Width  : ");
        Double width = scn.nextDouble();

        double areaInches = height*width;
        double areaMillimeters = areaInches*25.4;
        System.out.println(decimalFormat.format(areaMillimeters)+ " square millimeters");
    }
}
