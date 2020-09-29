package com.example.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Students : ");
        Double students = scn.nextDouble();
        System.out.print("Teachers : ");
        Double teachers = scn.nextDouble();
        System.out.print("Capacity : ");
        Double capacity = scn.nextDouble();

        Integer buses = (int) (((students+teachers-1)+(capacity-((students+teachers-1)%capacity)))/capacity);
        Integer overflow = (int) (((students+teachers)%capacity));
        System.out.println("\nBuses required      : " + buses);
        System.out.println("Overflow passengers : " + overflow);
    }
}