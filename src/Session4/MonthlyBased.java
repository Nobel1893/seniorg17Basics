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
public class MonthlyBased extends Employee{
    
    double Salary;

    public MonthlyBased(double Salary, String name, int age) {
        super(name, age);
        this.Salary = Salary;
    }

    @Override
    public double CalculateSalary() {
        netPay = Salary-(0.1*Salary);
        return netPay;
    }
    
    
    
    
    
}
