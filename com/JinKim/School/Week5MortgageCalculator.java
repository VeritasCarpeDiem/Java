/*
Program Name: Mortgage Calculator
Programmer: Jin Kim
Date: 9/24
Version: 1.4
Description: A program that calculates and displays the mortgage payment in 2 separate methods.
*/
package com.JinKim.School;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Week5MortgageCalculator
{
    public static void main(String[] args)
    {

        GetPrincipalRateTerm(); //call function
    }

    public static void GetPrincipalRateTerm()
    {
        //initialize variables
        double principal, rate;
        double term;
        Scanner in=new Scanner(System.in);
        DecimalFormat twoDigit=new DecimalFormat("0.00");

        //do-while loop for input validation
        do {
            System.out.print("Enter your principal: ");
            principal=in.nextDouble(); //get input
            if(principal >= 100000 && principal <= 1000000) //break if principal is in range
            {
                break;
            }
            System.out.println("Enter a principal greater than 100,000 and less than 1,000,000 inclusive.");
        }while(principal <= 100000 || principal >= 1000000);

        do { //input validation
            System.out.print("Enter your term: ");
            term= in.nextDouble();
            if(term >0)
            {
                break;
            }
            System.out.println("Enter a term greater than 0!");
        }while(term <0);

        do {
            System.out.print("Enter your interest rate: ");
            rate=in.nextDouble();
            if(rate >0)
            {
                break;
            }
            System.out.println("Enter a rate greater than 0!");
        }while(rate <0); //input validation

        System.out.println("Your monthly payment is: " +twoDigit.format(CalculateMonthlyPayment(principal,rate,term))); //print the result with two digits after decimal point
    }

    public static double CalculateMonthlyPayment(double principal,double rate, double term) //function parameters
    {
        double monthlypayment=0.0;

        monthlypayment = (principal * rate) /  (1.0 - Math.pow(rate + 1, -term)); //calculate monthlypayment

        return monthlypayment; //return a double
    }
}
