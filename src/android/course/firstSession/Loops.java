/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android.course.firstSession;

/**
 *
 * @author Senior Steps
 */
public class Loops {

    public static void main(String[] args) {
        //sum even numbers from 1 - > 100
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            sum += i;
        }

        System.out.println("sum of even numbers from 1 -> 100 " + sum);
        /***************************************/

        int fact = 1;
        int n = 6;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("factorial n = " + n);
        /***************************************/

        int x = 4, y = 5;
        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }

        System.out.println("x power y = " + res);
        /***************************************/
        //fibonancci series 
        int num=10;
        int last=1,blast=1;
        res=1;
        for (int i=2;i<=n;i++){
            res=last+blast;
            blast=last;
            last=res;
        }        
        System.out.println("fibonancci of n = "+res);
    
        /**************************************/
        //reversing a number
        n=123456;
        int rev=0;
        while (n!=0){
            int d=n%10;
            rev=(rev *10) +d;
            n=n/10;
        }
        System.out.println("reversing result = "+rev);
    }

}
