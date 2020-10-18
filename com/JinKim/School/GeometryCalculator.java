/*
Program Name: Geometry Calculator
Programmer: Jin Kim
Date: 9/10
Version: 1.3
Description: A program that calculates the area of a circle, rectangle, and triangle, based on the user's input.
*/

package com.JinKim.School;
import java.util.Scanner;

public class GeometryCalculator
{
     public static void main(String[] args)
     {
         //initialize variables
        int input;
        double area;
        Scanner in= new Scanner(System.in);
        //Display Menu
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Area of Rectangle");
        System.out.println("3. Calculate Area of Triangle");
        System.out.println("4. Quit");
        //Get User Input
        input= in.nextInt();

        switch(input) //switch statement
        {
            case 1: //Area of Circle
                int radius=0;
                do
                {
                    //user input
                    System.out.println("Enter radius: ");
                    radius= in.nextInt();

                    if(IsInputValid(radius))//input validation
                    {
                        break;
                    }
                    System.out.println("Enter a radius greater than 0");

                }while(!IsInputValid(radius));

                area= 3.1415 * radius * radius; //calculate area

                System.out.println("Area of circle: "+area);
                break;
            case 2: //Area of Rectangle
                int length, width;

                do
                {
                    System.out.println("Enter length: ");//user input
                    length=in.nextInt();
                    System.out.println("Enter width: ");
                    width=in.nextInt();

                    if(IsInputValid(length,width)) //input validation
                    {
                        break;
                    }
                    System.out.println("Enter a length and width greater than 0");

                }while(!IsInputValid(length,width));

                area= length*width; //calculate area

                System.out.println("Area of rectangle: "+area);
                break;
            case 3: //Area of Triangle
                int base, height;

                do
                {//user input
                    System.out.println("Enter base: ");
                    base= in.nextInt();
                    System.out.println("Enter height: ");
                    height=in.nextInt();

                    if(IsInputValid(base,height)) //input validation
                    {
                        break;
                    }
                    System.out.println("Enter a base and height greater than 0");

                }while(!IsInputValid(base,height));

                area = base * height * .5; //calculate area
                System.out.println("Area of triangle: "+area);
                break;
            case 4: //Quit
                System.out.println("Program has ended");
                break;
            default: //case when user enters number NOT between 1-4
                System.out.println("Please enter a number between 1 and 4!");
                break;
        }

    }
    public static boolean IsInputValid(int input) //input validation function
    {
        return input > 0;
    }
    public static boolean IsInputValid(int input1, int input2) //overloaded function that takes 2 parameters
    {
        return input1 > 0 && input2 > 0;
    }
}
