package com.JinKim.School;
// A good template for your labs and HWs
import java.util.Scanner;
public class Simple
{
    private int num1;
    private int num2;
    private int num3;

    //Default constructor
    public Simple()
    {}
    //constructor with three arguments
    public Simple(int n1,int n2,int n3)
    {
        num1=n1;
        num2=n2;
        num3=n3;
    }
    //getter methods or accessors
    public int getNum1()
    {return num1;}

    public int getNum2()
    {return num2;}

    public int getNum3()
    {return num3;}
    //setter methods or mutators
    public void setNum1(int a)
    {num1=a;}

    public void setNum2(int b)
    {num2=b;}

    public void setNum3(int c)
    {num3=c;}

    //to get total of numbers
    public int sum()
    {return num1+num2+num3;}

    //to get product of numbers
    public int product()
    {return num1*num2*num3;}

    //display method
    public void display()
    {
        System.out.println("The total is: "+sum()+
                "\nThe product is: "+product());
    }
    // Driver for class Simple
    public static void main(String [] args)
    {
        Scanner get = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter first number: ");
        x= get.nextInt();

        System.out.println("Enter second number: ");
        y= get.nextInt();

        System.out.println("Enter the third number: ");
        z= get.nextInt();

        Simple herNums = new Simple(x,y,z);
        herNums.display();

        Simple myNums = new Simple();//using default constructor
        myNums.display();

        Simple yourNums = new Simple(10,20,30);//using constructor with 3 arguments
        yourNums.display();

        System.out.println("num1 for object myNums is: "+myNums.getNum1());
        System.out.println("num1 for object yourNums is: "+yourNums.getNum1());

        myNums.setNum1(7);
        myNums.setNum2(9);
        myNums.setNum3(2);
        myNums.display();

    }
}//end class Simple