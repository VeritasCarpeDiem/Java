/*
Program Name: main
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: The main driver function for Persona and Employee class
*/
package com.JinKim.School;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class main
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        DecimalFormat twoDigit =new DecimalFormat("0.00");

        Employee Bob= new Employee("Bob",30,12345,20,13.5 );

        Bob.PrintInfo(); //print employee information

        System.out.println("Weekly pay is $"+Bob.CalculateWeeklyPay());

    }
}
