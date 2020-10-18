/*
Program Name: Change for a Dollar Game
Programmer: Jin Kim
Date: 8/30
Version: 1.2
Description: A change-counting game that gets the user to enter the number of coins required to make exactly one dollar.
The program asks the user to enter the number of pennies, nickels, dimes, and quarters and if the user entered a total amount of 1 dollar, they win.
*/

package com.JinKim.School;

import java.util.Scanner;

public class ChangeForMoneyGame
{
    public static void main(String[] args) {
        //Declare variables
        int pennies, nickels, dimes, quarters;
        double total;

        Scanner in = new Scanner(System.in);

        //Display to user coins to input
        System.out.println("Enter the number of pennies,nickels, dimes, and quarters respectively: ");

        //Read user input
        pennies = in.nextInt();
        nickels = in.nextInt();
        dimes = in.nextInt();
        quarters = in.nextInt();

        //Calculate total
        total = 0.01 * pennies + 0.05 * nickels + 0.1 * dimes + 0.25 * quarters;

        //if/else statement: Display results
        if (total == 1)
        {
            System.out.println("Congrats! Your total is $1.00 You won!");
        }
        else if (total > 1)
        {
            System.out.println("Your total is greater than $1.00.");
        }
        else //case for when total < 1
        {
            System.out.println("Your total is less than $1.00");
        }
    }

}
