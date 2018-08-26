/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session2;

import java.util.Scanner;

/**
 *
 * @author Senior Steps
 */
public class Functions
{

    public static double HarmonicSum(int n)
    {

        double res = 0.0;

        for (int i = 1; i < n; i++)
        {
            System.out.println(1.0 / i);
            res += (1.0 / i);
        }
        return res;

    }

    public static double PI(int n)
    {
        double res = 0.0;
        int sign = 1;
        for (int i = 1; i < n; i += 2)
        {
            res += (1.0 / i) * sign;
            sign = sign * -1;
        }
        return res * 4.0;
    }

    public static double factorial(int n)
    {
        double res = 1;
        for (int i = 1; i <= n; i++)
        {
            res *= i;

        }
        return res;
    }

    public static double Pow(int x, int y)
    {

        double res = 1;
        for (int i = 0; i < y; i++)
        {
            res *= x;
        }

        return res;

    }

    public static double Sin(int x)
    {

        double res = 0.0;
        int sign = 1;
        for (int i = 1; i < 10; i += 2)
        {

            res += sign * (Pow(x, i) / factorial(i));
            sign = -1 * sign;
        }

        return res;
    }

    public static void ScanArray(int arr[])
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
    }

    public static int SumArray(int arr[])
    {

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    public static int LinearSearch(int arr[], int value)
    {

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == value)
            {
                return i;
            }
        }

        return -1;
    }

    public static void ReverseArray(int arr[])
    {

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--)
        {
            //swap 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void bubbleSearch(int arr[])
    {

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void InsertionSort(int arr[])
    {
        /*
         mark first element as sorted
         for each unsorted element X
         'extract' the element X
         for j = lastSortedIndex down to 0
         if current element j > X
         move sorted element to the right by 1
         break loop and insert X here*/
        for (int i = 1; i < arr.length; i++)
        {
            int x = arr[i];
            int j = i - 1;
            for (; j >= 0; j--)
            {
                if (arr[j] > x)
                {
                    arr[j + 1] = arr[j];
                } else
                {
                    break;
                }
            }
            arr[j+1] = x;
        }

    }
    
    public static int binarySearch(int arr[],int value){
        
        int start=0,end=arr.length;
        
        while(start<end){
            int mid =(start+end)/2;
            if (value == arr[mid])
                return mid;
            else if (arr[mid] > value)
                end=mid-1;
            else if (arr[mid] <value)
                start=mid+1;
            
        }
        
        return -1;
    }
    public static void main(String args[])
    {

        double res = HarmonicSum(1000);
        System.out.println("Harmonic sum = " + res);
        double pi = PI(1000);
        System.out.println("PI = " + pi);
        double sinx = Sin(120);
        System.out.println("sinx = " + sinx);

        int arr[] = new int[5];
        System.out.println("please enter array values ");
        ScanArray(arr);
        //int sum = SumArray(arr);
        //System.out.println("array sum = " + sum);
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        
    }

}
