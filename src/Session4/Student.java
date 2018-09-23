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
public class Student extends Person{
    
    ArrayList<String>courses;
    ArrayList<Integer>grades;
    
    public Student(String name,String address){
        super(name, address);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }
    
    
   public boolean AddCourseGrade(String courseName,int grade){
        
       for(int i=0;i<courses.size();i++){
           if (courses.get(i).equals(courseName)){
               grades.set(i,grade);
               return true;
           }
        }
       courses.add(courseName);
       grades.add(grade);
       return true;
    }
   
   public void printGrades(){
       
       for(int i = 0;i<courses.size();i++){
           System.out.println(courses.get(i)
           +" -> "+grades.get(i));
       }
   }

     public double getAvgGrade(){
       
            double sum=0.0;
           for(int i = 0;i<courses.size();i++)
                sum+=grades.get(i);     
            
           return sum/grades.size();
     }
   
public void View(){
      System.out.println("name : "+name);
      System.out.println("address : "+address);
           System.out.println("student");

      printGrades();
  }
            
    
}
