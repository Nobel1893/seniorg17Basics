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
public class BankAccount {
    int accountId;
    double Balance;
    private static int IdsCounter=1000;
    Client owner;

    public BankAccount() {
        accountId= IdsCounter;
        IdsCounter++;
        Balance=0;
    }
    
    
      public BankAccount(double Balance) {
        accountId= IdsCounter;
        IdsCounter++;
        this.Balance=Balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    
    boolean WithDraw(double amount){
        if(Balance<amount){
            System.err.println("the balance is not sufficient");
            return false;
        }
        Balance-=amount;
        return true;
    }
    
    boolean Deposite(double amount){
        if(amount<=0){
            System.err.println("amount not valid");
            return false;
        }
        Balance+=amount;
        return true;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
      
    public void View (){
        owner.View();
    }
    
}
