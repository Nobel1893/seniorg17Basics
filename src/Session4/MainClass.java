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
public class MainClass {
    
    public static void main(String args[]){
        
        Person s = new Student("mohamed", "234");
        s.View();
//     
        Teacher t = new Teacher("teacher","qwert");
        t.AddCourse("c++");
        t.AddCourse("android");
        t.AddCourse("c++");
        t.print();
        
        
        Shape[]ShapesArr = new Shape[5];
        ShapesArr[0]= new Rectangle(20,30);
        ShapesArr[1] = new Triangle(100, 50);
        ShapesArr[2] = new Rectangle(70, 50);
        ShapesArr[3] = new Triangle(60, 50);
        ShapesArr[4] = new Rectangle(30, 50);
        for(int i=0;i<ShapesArr.length;i++)
            System.out.println(ShapesArr[i].CalculateArea());
        

        Employee[] arr= new Employee[3];
        arr[0]= new HourlyBased(20, 30, "Ahmed",20);
        arr[1] = new MonthlyBased(3000, "Mohamed", 50);
       arr[1] = new MonthlyBased(50000, "Mohamed", 50);

       for(int i=0;i<arr.length;i++)
            System.out.println(arr[i].CalculateSalary());
    }
}
