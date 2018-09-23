/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author Administrator
 */
public class MainClass {
    
    public static void main(String args[]){
        
      CounterThread counterThread1 = new CounterThread("thread one");
      counterThread1.start();
       CounterThread counterThread2 = new CounterThread("thread two");
      counterThread2.start();
      CounterThread counterThread3 = new CounterThread("thread three");
      counterThread3.start();
      
      CounterRunnable counterRunnable=new CounterRunnable("mohamed");
      
      Thread th =new Thread(counterRunnable);
      th.start();
    }
}
