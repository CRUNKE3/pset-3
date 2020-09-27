package com.example.exercise6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Wage      : ");
        Double wage = scn.nextDouble();
        System.out.print("Monday    : ");
        Double mondayHours = scn.nextDouble();
        System.out.print("Tuesday   : ");
        Double tuesdayHours = scn.nextDouble();
        System.out.print("Wednesday : ");
        Double wednesdayHours = scn.nextDouble();
        System.out.print("Thursday  : ");
        Double thursdayHours = scn.nextDouble();
        System.out.print("Friday    : ");
        Double fridayHours = scn.nextDouble();
        System.out.print("Saturday  : ");
        Double saturdayHours = scn.nextDouble();
        System.out.print("Sunday    : ");
        Double sundayHours = scn.nextDouble();

        Double weeklyGrossPay = wage*(mondayHours+tuesdayHours+wednesdayHours+thursdayHours+fridayHours+saturdayHours+sundayHours);
        System.out.println("\n$"+decimalFormat.format(weeklyGrossPay));
    }
}
