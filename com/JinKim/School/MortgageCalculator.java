/*
Program Name: Mortgage Calculator
Programmer: Jin Kim
Date: 8/30
Version: 1.3
Description: A program that calculates and displays the mortgage payment.
*/

package com.JinKim.School;
import java.util.Scanner;

public class MortgageCalculator
{
    public static void main(String[] args)
    {
        //Declare variables
        double monthlyPayment, rate, term, principal;

        Scanner in = new Scanner(System.in);

        //Asks for user input
        System.out.println("Enter your principal, term, and interest rate respectively");

        //Gets user input
        principal=in.nextDouble();
        term= in.nextDouble();
        rate=in.nextDouble();

        //Calculate the mortgage
        term = term *12;
        rate = rate/1200.0;

        monthlyPayment = (principal * rate) /  (1.0 - Math.pow(rate + 1, -term));

        //Print the mortgage
        System.out.println("Your mortgage is: " + monthlyPayment);
    }
}
