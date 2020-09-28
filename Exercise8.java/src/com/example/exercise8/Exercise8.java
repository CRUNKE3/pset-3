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

        Integer buses = (int) (((students+teachers-1)/capacity+0.5));
        Integer overflow = (int) (((students+teachers)%capacity));
        System.out.println("Buses required      : " + buses);
        System.out.println("Overflow passengers : " + overflow);
    }
}
