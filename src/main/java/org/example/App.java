package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static double calculateSimpleInterest(double principal, double roi, int years)
    {
        double finalAmount = principal * (1 + (roi * years));
        return finalAmount;
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double roi = input.nextDouble() / 100;
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        double finalAmount = calculateSimpleInterest(principal, roi, years);
        System.out.println("After " + years + " years at " + (roi * 100) + "%, the investment will be worth $" + String.format("%.2f", finalAmount));
    }
}
