/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session4;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Teacher extends Person{
    
    ArrayList<String> courses;
    
    public Teacher(String name,String address){
        super(name, address);
        courses = new ArrayList<>();
    }
    
    public boolean AddCourse(String courseName){
    
        for(int i=0;i<courses.size();i++){
            if (courses.get(i).equals(courseName)){
                return false;
            }
        }
        courses.add(courseName);
        return true;
    }
    public boolean removeCourse(String courseName){
        
        for(int i=0;i<courses.size();i++){
            if (courses.get(i).equals(courseName)){
                courses.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    public void print(){
        for(int i =0;i<courses.size();i++)
            System.out.println(courses.get(i));
    }
  
    public void View(){
      System.out.println("name : "+name);
      System.out.println("address : "+address);
        System.out.println("Teacher");
      print();
  }
            
    
    
    
    
    
    
    
}
