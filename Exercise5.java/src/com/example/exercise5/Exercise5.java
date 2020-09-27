package com.example.exercise5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.print("Homework 1 : ");
        Double hw1 = grades.nextDouble();

        System.out.print("Homework 2 : ");
        Double hw2 = grades.nextDouble();

        System.out.print("Homework 3 : ");
        Double hw3 = grades.nextDouble();

        System.out.print("Quiz 1     : ");
        Double quiz1 = grades.nextDouble();

        System.out.print("Quiz 2     : ");
        Double quiz2 = grades.nextDouble();

        System.out.print("Test 1     : ");
        Double test1 = grades.nextDouble();

        Double hwAverage = (hw1+hw2+hw3)/3;
        Double quizAverage = (quiz1+quiz2)/2;
        Double finalGrade = (hwAverage*0.15)+(quizAverage*0.35)+(test1*0.5);

        System.out.println(decimalFormat.format(finalGrade)+"%");
    }
}
