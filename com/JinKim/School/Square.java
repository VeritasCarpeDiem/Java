/*
Program Name: Square
Programmer: Jin Kim
Date: 10/24
Version: 1.2
Description: A program that has fields length, width, surfaceArea, and a function that calculates surfaceArea
*/
package com.JinKim.School;

public class Square
{
    protected int length;
    protected int width;
    protected double surfaceArea;
    //default constructor
    Square()
    {
        length=0;
        width=0;
        surfaceArea=0;
    }
    //parameterized constructor:
    Square(int l, int w)
    {
        length = l;
        width=w;
    }
    //getter and setter functions:
    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
       this.width = width;
    }

    public double ComputeSurfaceArea()
    {
        surfaceArea=length*width;
        return surfaceArea;
    }
}
