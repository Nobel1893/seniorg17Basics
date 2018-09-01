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
public class numberReverse {
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
        System.out.println("please enter num value");//how to print output
       int num= input.nextInt();//how to scan input
        
        int d1=num%10;//first digit
        num=num/10;
        int d2=num%10;
        num/=10;
          System.out.println(" reverse = "+ ((d1*100)+(d2*10)+num));
        
    }
}
