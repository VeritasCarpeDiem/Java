/*
Program Name: Mortgage Class
Programmer: Jin Kim
Date: 10/17
Version: 1.4
Description: A program that calculates and displays the mortgage payment.
*/
package com.JinKim.School;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MortgageClass
{
    //initialize variables
    private double rate;
    private double term;
    private double principal; //this is the loan amount

    public MortgageClass()
    {
        rate=0;
        term=0;
        principal=0;
    }
    public MortgageClass(double r, double t, double p) //parameterized constructor
    {
        rate=r;
        term=t;
        principal=p;
    }

    //getter functions:
    public double getPrincipal()
    {
        return principal;
    }
    public double getTerm()
    {
        return term;
    }
    public double getRate()
    {
        return rate;
    }
    //setter functions:
    public void setPrincipal(double principal)
    {
        this.principal = principal;
    }

    public void setTerm(double term)
    {
        this.term = term;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    //method to display mortgage;
    public void DisplayMortgage()
    {
        DecimalFormat twoDigit=new DecimalFormat("0.00");
        //Display mortgage:
        System.out.println("Your mortgage is "+twoDigit.format(CalculateMortgage()));
    }
    //method to calculate mortgage
    public double CalculateMortgage()
    {
        double monthlyPayment=0.0;
        Scanner in= new Scanner(System.in);

        //Calculate the mortgage
        monthlyPayment = (principal * rate) /  (1.0 - Math.pow(rate + 1, -term));

        return monthlyPayment;
    }
}
