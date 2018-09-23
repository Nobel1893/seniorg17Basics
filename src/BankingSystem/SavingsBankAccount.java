/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingSystem;

/**
 *
 * @author Administrator
 */
public class SavingsBankAccount extends BankAccount{
    
    double minimumBalance;

    public SavingsBankAccount() {
        super();
    minimumBalance=1000;
    Balance=minimumBalance;
    }
    public SavingsBankAccount(double Balance){
        super(Balance);
        this.minimumBalance= 1000;
    }

    @Override
    boolean WithDraw(double amount) {
        if(Balance-amount<minimumBalance){
            System.err.println("amount not valid");
            return false;
        }
        return super.WithDraw(amount);
    }

    @Override
    boolean Deposite(double amount) {
        if (amount<100){
            System.err.println("amount not valid");
            return false;
        }
        return super.Deposite(amount);
    }
    
    
    
    
    
    
    
}
