/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading.Task;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SearcherThread extends Thread implements OnValueFoundListener{
    String ThreadName;
    int value;
   int start,end;
    ArrayList<Integer> arrayList;
    static boolean isFound = false;

    public SearcherThread(String ThreadName, int value, int start, int end, ArrayList<Integer> arrayList) {
        this.ThreadName = ThreadName;
        this.value = value;
        this.start = start;
        this.end = end;
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        System.out.println(ThreadName+"is starting");
        
       for(int i=start;i<end;i++){
//           if(isFound==true){
//               System.err.println(ThreadName+" is stopped");
//               return;
//           }
           if(arrayList.get(i)==value){
//               isFound= true;
               System.err.println("value was found in index "+i+" by thread "+ThreadName);
               for(SearcherThread th:MainClass.ThreadsArray){
                   if(th!=this)
                        th.onValueFound();
               }
               return;
           }
       }
        System.out.println(ThreadName+" has finished");
    }

    @Override
    public void onValueFound() {
    
        System.out.println(ThreadName +" is inturrepted");
        stop();
    }
    
    
    
    
    
    
    
}
