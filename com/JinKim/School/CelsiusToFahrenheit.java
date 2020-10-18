/*
Program Name: ConvertToFahrenheit
Programmer: Jin Kim
Date: 10/2
Version: 1.2
Description: A program that converts celsius to fahrenheit.
*/

package com.JinKim.School;
import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {

        System.out.print("Your temperature in Fahrenheit is " + ConvertToFahrenheit()); //call function

        //Test values: C=36.58 and 100
    }

    public static double ConvertToFahrenheit()
    {
        //initialize variables

        Scanner in=new Scanner(System.in);
        double Celsius;
        double Fahrenheit;

        do { //input validation

            System.out.print("Enter Celsius: ");
            Celsius=in.nextDouble();
            if(Celsius>=-30 && Celsius <=200 )
            {
                break;
            }
        }while(Celsius<=-30 && Celsius >=200);

        Fahrenheit= ((double)9/5* Celsius) + 32; //convert to fahrenheit

        return Fahrenheit; //return type is double
    }
}
