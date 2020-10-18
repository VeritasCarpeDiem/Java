/*
Program Name: PenniesForPay
Programmer: Jin Kim
Date: 9/10
Version: 1.2
Description: A program that calculates total salary based on number of days inputted.
*/

package com.JinKim.School;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PenniesForPay
{
    public static void main(String[] args)
    {
        //initialize variables
        Scanner in = new Scanner(System.in);
        DecimalFormat twoDigit=new DecimalFormat("0.00");
        int days;
        double pennies=1; //starts with 1 penny the 1st day
        double money=0.0;


        do  //Input Validation
        {
            System.out.println("Enter the number of days: "); //Get User input
            days = in.nextInt();
            if(days >1 )
            {
                break;
            }
            System.out.println("Enter a day value greater than 1");
        }while(days < 1);

        for (int i = 1; i <= days; i++) //for loop to iterate thru number of days
        {
            if(i ==1)
            {
                System.out.println("Day " + i + " :" + "\t$" + 0.01);
                continue;
            }
            pennies*=2;
            money= 0.01*pennies;
            System.out.println("Day " + i + ": $" + money);
        }
        System.out.println("Total Salary for " + days + " days is: " + "$"+twoDigit.format(money));
    }
}
