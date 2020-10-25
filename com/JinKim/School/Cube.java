/*
Program Name: Cube
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: A program that inherits Square class. It has additional data field depth and function ComputerVolume.
*/
package com.JinKim.School;

public class Cube extends Square
{
    private int depth;

    //default constructor:
    Cube()
    {
        length=0;
        width=0;
        depth=0;
    }
    //parameterized constructor:
    Cube(int l, int w,int d)
    {
        length=l;
        width=w;
        depth=d;
    }
    //overridden function
    public double ComputeSurfaceArea()
    {
        return super.ComputeSurfaceArea();
    }
    public double ComputeVolume()
    {
        return depth*super.surfaceArea;
    }
}
