/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String s1 = x.nextLine();
        Double num1 = null;
        try {
            num1 = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("Enter the rate of interest: ");
        String s2 = x.nextLine();
        Double num2 = null;
        try {
            num2 = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }
        System.out.print("Enter the number of years: ");
        String s3 = x.nextLine();
        Double num3 = null;
        try {
            num3 = Double.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        double n1 = num1;
        double n2 = num2/100;
        double n3 = num3;
        double a1 = n1*(1+n2*n3);
        double a2 = Math.ceil(a1*100);
        double a3 = a2/100;

        System.out.println("After "+n1+" years at "+num2+"%, the investment will be worth $"+a3);

        System.exit(0);
    }
}