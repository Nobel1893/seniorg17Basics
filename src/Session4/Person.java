/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session4;

/**
 *
 * @author Administrator
 */
public abstract class Person {
    String name;
    String address;
    
    public Person(String name,String address){
        this.name=name;
        this.address= address;
       
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return address;
    }

  public abstract void View();
            
    
    
    
}
