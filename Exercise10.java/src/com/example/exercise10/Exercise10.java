package com.example.exercise10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.print("Fahrenheit : ");
        Double fahrenheit = scn.nextDouble();

        Double celsius = (fahrenheit-32)*(5/9);
        Double kelvin = celsius+273.15;
        System.out.println("Celsius : "+ decimalFormat.format(celsius));
        System.out.println("Kelvin  : "+ decimalFormat.format(kelvin));
    }
}
