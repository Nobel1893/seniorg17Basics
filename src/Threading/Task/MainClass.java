/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading.Task;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class MainClass {
    static ArrayList<SearcherThread> ThreadsArray=new ArrayList<>();
    public static void main(String args[]){
        
        ArrayList<Integer> values= new ArrayList<>(10000000);
        Random random = new Random();
        
        for(int i=0;i<10000000;i++){
            values.add(random.nextInt(100));
        }
        
        int v =500;
        values.set(random.nextInt(10000000),v);
        
        
        for(int i=0;i<10;i++){
            SearcherThread th = new SearcherThread("thread "+i, v, i*1000000,(i*1000000)+1000000, values);
            th.start();
            ThreadsArray.add(th);
        }
        
    }
}
