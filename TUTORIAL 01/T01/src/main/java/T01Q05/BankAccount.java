/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01Q05;

/**
 *
 * @author Wong Yan Wen
 */
public class BankAccount implements Account{

    
    int balance;
    public BankAccount (int balance){
        this.balance= balance;
    }
    
    @Override 
    public int deposit (int amount){
        this.balance+=amount;
        System.out.println("Deposit successful.");
        return this.balance ;
    }
    
    @Override
    public boolean withdraw (int amount){
    
        if (amount <=this.balance){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
