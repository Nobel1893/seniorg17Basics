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
public class SecondsConverter {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
        System.out.println("please enter seconds value");//how to print output
       int secs= input.nextInt();//how to scan input
        
        int hrs=secs/3600;
        secs = secs % 3600;
        int mins = secs/60;
        secs = secs % 60;
        System.out.println("hrs "+hrs +" mins "+ mins+" secs "+secs);
    }
}
