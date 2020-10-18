/*
Program Name: Make Change
Programmer: Jin Kim
Date: 9/18
Version: 1.2
Description: A program that returns the amount of change as many half-dollars, then quarters, dimes, nickels, and pennies, in that order.
*/
package com.JinKim.School;
import java.util.Scanner;

public class MakeChange
{
    public static void main(String[] args)
    {
        //initialize variables
        Scanner in= new Scanner(System.in);
        double change=0.0;

        //ask user for input
        System.out.println("Enter change expressed in cents: ");

        change=in.nextDouble(); //get input

        ReturnChange(change); //call function

    }

    public static void ReturnChange(double change)
    {

        int half_dollars= Math.round((int)change/50); //explicitly cast double into int
        change=change%50; //get remainder of what is left and repeat the process
        int quarters=Math.round((int)change/25);
        change=change%25;
        int dimes=Math.round((int)change/10);
        change=change%10;
        int nickels=Math.round((int)change/5);
        change=change%5;
        int pennies=Math.round((int)change/1);

        //print the output
        System.out.println("Half Dollars: "+half_dollars);
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);

    }
}
