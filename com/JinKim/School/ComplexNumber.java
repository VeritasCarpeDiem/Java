/*
Program Name: Complex Number
Programmer: Jin Kim
Date: 10/17
Version: 1.4
Description: A program that adds, subtracts, and displays 2 complex numbers
*/
package com.JinKim.School;

public class ComplexNumber
{
    private int imaginary;
    private int real;

    //default constructor
    public ComplexNumber()
    {
        imaginary=0;
        real=0;
    }
    //parameterized constructor:
    public ComplexNumber(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    //setter functions:
    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }
    public void setReal(int real)
    {
        this.real = real;
    }
    //getter functions:
    public int getImaginary()
    {
        return imaginary;
    }
    public int getReal()
    {
        return real;
    }

    //Display function:
    public void Display()
    {
        System.out.println(real + "+" + imaginary + "i");
    }
    //Add method:
    public ComplexNumber Add(ComplexNumber num1, ComplexNumber num2)
    {
        ComplexNumber sum = new ComplexNumber(num1.real + num2.real, num1.imaginary + num2.imaginary);
        sum.Display();
        return sum;
    }
    //Subtract method:
    public ComplexNumber Subtract(ComplexNumber num1, ComplexNumber num2)
    {
        ComplexNumber diff = new ComplexNumber(num1.real - num2.real, num1.imaginary - num2.imaginary);
        diff.Display();
        return diff;
    }
}
