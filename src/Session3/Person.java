/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session3;

/**
 *
 * @author Administrator
 */
public class Person {
   
   private  String name;
   private String address;
   private int age;
    char c ;   
    public Person() {
      name= "";
      age=20;
      address="";
    }
   
   public Person(String name,String address,int age){
       this.name=name;
       this.address=address;
       this.age=age;
       
   }
   public void setName(String name){
       this.name= name;
   }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
    public void view(){
        System.out.println("name : "+name);
        System.out.println("address : "+address);
        System.out.println("age : "+age);
    }
   
}
