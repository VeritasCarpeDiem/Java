/*
Program Name: DemoSquare
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: The main driver function for Square and Cube class
*/
package com.JinKim.School;

public class DemoSquare
{
    public static void main(String[] args)
    {
        Square s=new Square(6,4);

        System.out.println(s.ComputeSurfaceArea());

        Cube c=new Cube(2,2,2);

        System.out.println(c.ComputeSurfaceArea());

        System.out.println(c.ComputeVolume());
    }

}
