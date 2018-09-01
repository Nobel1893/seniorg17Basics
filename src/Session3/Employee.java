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
public class Employee {
    String name;
    String nationalId;
    char gender;
    int availablePermessionHours;
    int availableVacations;
    double actualSalary;
    static double salary=1500;
    static double deductionPerHour=15.5;
    static double deductionPerDay = 85.5;

    public Employee() {
    name= "";
    nationalId= "";
    gender = ' ';
    availablePermessionHours=20;
    availableVacations=15;
    actualSalary = salary; 
    }
    public Employee(String name,String nationalId,char gender){
        this.name=name;
        this.nationalId=nationalId;
        this.gender=gender;
        this.availablePermessionHours=20;
        this.availableVacations=15;
        this.actualSalary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNationalId() {
        return nationalId;
    }

    public char getGender() {
        return gender;
    }
    
    
    public void View(){
        System.out.println("Name : "+name);
        System.out.println("salary : "+actualSalary);
        System.out.println("National ID : "+nationalId);
    }
    
    public void ViewDetailed(){
        this.View();
        System.out.println("Vacations = "+availableVacations);
        System.out.println("hours = "+availablePermessionHours);
    }
    
    public void takeVacation(int numOfDays){
        availableVacations-=numOfDays;
        if(availableVacations<0)calculateActualSalary();
    }
    public void takePermessionHours(int numOfHours){
        availablePermessionHours-=numOfHours;
        if (numOfHours<0)calculateActualSalary();
    }
    
    public double calculateActualSalary(){
        actualSalary= salary;
        if (availableVacations <0){
            actualSalary= actualSalary+(availableVacations*deductionPerDay); 
        }
        if(availablePermessionHours < 0){
            actualSalary = actualSalary + (availablePermessionHours*deductionPerHour);
        }
        return actualSalary;
    }
    
   public void  FreeAll(){
        actualSalary= salary;
        availablePermessionHours= 20;
        availableVacations=15;
    }
    
}
