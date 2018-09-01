/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session3;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class MainClass {
    
    public static  void DrawTriangle(){
        int lines=5;
        for (int i=0;i<lines;i++){
            
            for(int j=0;j<=lines-i;j++)
                System.out.print(" " );
            
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            
            
            System.out.println("");
        }
        
    }
    public void MultiplicationTable(){
          for(int i=1;i<10;i++)
            System.out.print(i+"  ");
        
        System.out.println("");
        
        for(int i=1;i<10;i++)
        {
            System.out.print(i+"  ");
            for(int j =1;j<10;j++)
                if (i*j<10)
                System.out.print(i*j+"  ");
                else System.out.print(" "+i*j);
            
            System.out.println("");
        }
    }
    //Recursion
    
    public static int fact(int n){
        if (n==0||n==1) return 1;
        return n*fact(n-1);
    }
    
    int x;
    public static void printValues(int n){
        System.out.println(n);
        printValues(n+1);
        
        
    }
    public static void main(String args[]){
         Person p = new Person("Mohamed","123", 20);
         p.setName("ahmed");
         //Person.salary=300;
         p.view();
         
         Employee e =new Employee("Mohamed", "123", 'm');
         e.takeVacation(10);
         e.ViewDetailed();
         e.takeVacation(6);
         e.ViewDetailed();
         
         Scanner input = new Scanner(System.in);
        System.out.println("please enter n");
    //    int n = input.nextInt();
        //System.out.println();
//        input.Scanner()
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        
        System.out.println(arrayList.size());
        
        for(int i=0;i<arrayList.size();i++)
            System.out.print(arrayList.get(i)+" "); //sout arr[i]
        
      //  arrayList.set(6, 55);
      //  arrayList.add(6,50);// index should be less than size 
        arrayList.remove(5);//remove element at index 5
            
            
  //      printValues(10);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
    }
}
