//main driver class
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

        ComplexNumber num1 = new ComplexNumber(4, 2);
        ComplexNumber num2 = new ComplexNumber(2, 1);

        //display imaginary numbers
        System.out.println("Imaginary Numbers:");
        num1.Display();
        num2.Display();

        //add imaginary numbers
        System.out.println("Sum:");
        ComplexNumber sum = new ComplexNumber();
        sum.Add(num1, num2);

        //subtract imaginary numbers
        System.out.println("Difference: ");
        ComplexNumber diff = new ComplexNumber();
        diff.Subtract(num1, num2);
    }
}
