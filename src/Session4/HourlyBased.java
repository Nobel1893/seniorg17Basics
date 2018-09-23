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
public class HourlyBased extends Employee{
    int workedHours;
    double hourRate;

    public HourlyBased(int workedHours, double hourRate, String name, int age) {
        super(name, age);
        this.workedHours = workedHours;
        this.hourRate = hourRate;
    }

    @Override
    public double CalculateSalary() {
        netPay = workedHours*hourRate;
        return netPay;
    }
    
    
    
    
    
}
