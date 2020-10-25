/*
Program Name: Person
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: The person class has a name, age, and SSN. It has a print info method that shows the information of the person.
*/
package com.JinKim.School;

public class Person
{
    protected String name;
    protected int age;
    protected int SSN;
    //default constructor
    Person()
    {
        name=" ";
        age=0;
        SSN=0;
    }
    //parameterized constructor
    Person(String name, int age, int SSN)
    {
        this.name=name;
        this.age=age;
        this.SSN=SSN;
    }
    public void PrintInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age:" +age);
        System.out.println("SSN: "+SSN);
    }

}
