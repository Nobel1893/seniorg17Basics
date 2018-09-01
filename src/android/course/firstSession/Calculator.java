/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android.course.firstSession;

import java.util.Scanner;

/**
 *
 * @author Senior Steps
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter num1 value");//how to print output
        int num1 = input.nextInt();//how to scan input
        System.out.println("please enter num2 value");//how to print output
        int num2 = input.nextInt();//how to scan input

        System.out.println("1- add\n"
                + "2- for sub\n"
                + "3- for mult\n"
                + "4- for division\n");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("res = " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println("res " + (num1 - num2));
                break;
            }
            case 3: {
                System.out.println("res " + (num1 * num2));
                break;
            }
            case 4: {
                if (num2==0){
                    System.out.println("num2 is zero");
                }else 
                System.out.println("res " + (num1 / num2));
                break;
         
            }
 
        }

    }
}
