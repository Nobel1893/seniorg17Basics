/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BankingSystem {

    static ArrayList<Client> AllClients = new ArrayList<Client>();
    static ArrayList<BankAccount> AllBankAccounts = new ArrayList<BankAccount>();
    static Scanner input = new Scanner(System.in);
    public static int Search(int id) {
        int i=0;
        for (BankAccount ba: AllBankAccounts) {
            if (ba.getAccountId()== id) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public static void ViewAccount(int id) {

        int index = Search(id);
        if (index == -1) {
            System.err.println("no account found with this id");
            return;
        }
        AllBankAccounts.get(index).View();

    }
    private static void ShowAllAccounts() {
        
        for(BankAccount ba: AllBankAccounts){
            ba.View();
            System.out.println("*************************************");
            
        }
    }
    private static void RemoveAccount(int id) {
            int index = Search(id);
        if (index == -1) {
            System.err.println("no account found with this id");
            return;
        }
        AllBankAccounts.remove(index);
        AllClients.remove(index);
     
    }
    private static void Deposite(int id) {
              int index = Search(id);
        if (index == -1) {
            System.err.println("no account found with this id");
            return;
        }
        System.out.println("enter amount to deposite");
        double amount = input.nextDouble();
        
        if(AllBankAccounts.get(index).Deposite(amount)){
            System.out.println("successful deposite");
        }
        
    }
     private static void Withdraw(int id) {
              int index = Search(id);
        if (index == -1) {
            System.err.println("no account found with this id");
            return;
        }
        System.out.println("enter amount to Withdraw");
        double amount = input.nextDouble();
        
        if(AllBankAccounts.get(index).WithDraw(amount)){
            System.out.println("successful Withdraw");
        }
        
    }
    public static void main(String[] args) {

        AddTestData();

        while (true) {
            System.out.println("1-show Account");
            System.out.println("2-Show All Accounts in system");
            System.out.println("3-add Account");
            System.out.println("4- remove account");
            System.out.println("5- Withdraw from account");
            System.out.println("6- deposite to account");
            System.out.println("7- exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("please enter account id");
                    int id = input.nextInt();
                    ViewAccount(id);
                    break;
                }
                case 2:{
                    ShowAllAccounts();
                    break;
                }
                case 3:{
                    AddBankAccount();
                   break;
                }
                case 4: {
                    System.out.println("please enter account id");
                    int id = input.nextInt();
                    RemoveAccount(id);
                    break;
                }
                case 5: {
                    System.out.println("please enter account id");
                    int id = input.nextInt();
                    Withdraw(id);
                    break;
                }

                  case 6: {
                    System.out.println("please enter account id");
                    int id = input.nextInt();
                    Deposite(id);
                    break;
                }
                case 7:{
                    return ;
                } 
            }
        }
    }

    public static void AddTestData() {

        for (int i = 0; i < 20; i++) {
            BankAccount b = new BankAccount(20000);
            Client c = new Client("client " + i, "address " + i, "phone " + i);
            c.setBankAccount(b);
            b.setOwner(c);
            AllBankAccounts.add(b);
            AllClients.add(c);
        }

    }

    private static void AddBankAccount() {
          input.nextLine();
                 
        System.out.println("Enter Client Name");
        String name = input.nextLine();
         System.out.println("Enter Client address");
        String address = input.nextLine();
         System.out.println("Enter Client phone");
        String phone = input.nextLine();
        
        Client c = new Client(name, address, phone);
        BankAccount ba = null ;
        
        while (true){
        System.out.println("Enter 1 for basic bank account");
        System.out.println("Enter 2 for savings Bank account");
        int choice = input.nextInt();
        if (choice!=1&&choice!=2)continue;
        System.out.println("please enter Account balance");
        double balance = input.nextDouble();
        if(choice==1){
            ba = new BankAccount(balance);
            break;
        }else if (choice ==2){
            ba = new SavingsBankAccount(balance);
            break;
        }
        
        }
        //to make bank account points to it's owner
        ba.setOwner(c);
        c.setBankAccount(ba);
        
        AllBankAccounts.add(ba);
        AllClients.add(c);
        
        
    }


   

    
}
