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
public class CounterThread extends Thread{
    
    String ThreadName;

    public CounterThread(String ThreadName) {
        this.ThreadName = ThreadName;
    }
    
    
    
    @Override
    public void run(){
        
        for(int i=0;i<1000000;i++)
            System.out.println(ThreadName+" "+i);
        
    }
    
}
