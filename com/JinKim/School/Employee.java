/*
Program Name: Employee
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: Employee class inherits Person and has 2 additional fields: hours and rate. It also has a method to calculate weekly pay and invokes the super class's constructor
*/
package com.JinKim.School;

public class Employee extends Person
{
    private int hours;
    private double rate;

    //getter and setter methods:
    public double getRate()
    {
        return rate;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    public int getHours()
    {
        return hours;
    }
    public void setHours(int hours)
    {
        this.hours=hours;
    }
    //default constructor that invokes the super constructor
    Employee()
    {
         super();
    }
    //parameterized constructor that invokes the super parameterized constructor
    Employee(String name, int age, int SSN, int hours, double rate)
    {
        super(name, age, SSN); //call the super class's parameterized constructor
        this.hours=hours;
        this.rate=rate;
    }
    @Override
    public void PrintInfo()
    {
        super.PrintInfo();
    }
    //function to calculate weekly pay
    double CalculateWeeklyPay()
    {
        double weeklyPay=hours* rate;
        return weeklyPay;
    }
}
