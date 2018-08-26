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
public class BasicInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //scanner -> class name
        //input object name 
        //new Scanner () //initialzation
        //System.in //stream
        System.out.println("please enter y value");//how to print output
       int y= input.nextInt();//how to scan input
        
        int x=20;
        System.out.println(x);
        System.out.print("value of y "+y);
        /*******************************************************/
        
    }
    
}
