/*
Program Name: Create a New Array
Programmer: Jin Kim
Date: 10/2
Version: 1.2
Description: A program that initializes a array with even integers from 2 to 20 and reverse it.
*/
package com.JinKim.School;

public class NewArray
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{2,4,6,8,10,12,14,16,18,20}; //initialize an array with even numbers 2 to 20

        for (int i= 0; i < arr.length; i++) //print the array
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println(); //skip a line

        arr=ReverseArray(arr); //call the function ReverseArray, then set the old arr to the reversed arr

        //print the reversed arr
        for (int j : arr)  //foreach loop
        {
            System.out.print(j + " ");
        }
    }
    private static int[] ReverseArray(int[] arr) //return type is an array
    {
        int[] ReverseArr=new int[10]; //create a new arr with size 10

        for (int i = 0; i < arr.length; i++)
        {
            ReverseArr[i]=arr[arr.length-i-1]; //fill the contents of the new arr starting with the last element of the old arr. Repeat this backwards process
        }
        return ReverseArr; //return the reversed array
    }
}
