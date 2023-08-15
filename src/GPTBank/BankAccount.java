package GPTBank;

// Parent

import java.text.DecimalFormat;

public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    BankAccount(int accountNumber, String accountHolderName, double balance){
        
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;      
    }
    
    // Setters
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    
    // Getters
    int getAccountNumber(){
        return accountNumber;
    }
    
    String getAccountHolderName( ){
        return accountHolderName;
    }
    
    double getBalance(){
        return balance;
    }
    
    // Methods / Functions
     void deposit(double deposit){
        this.balance += deposit;
    }
    
    void withdraw(double withdraw) throws InterruptedException {
        DecimalFormat df = new DecimalFormat("0.00");
        
        // Checks if the withdraw amount is greater than balance
        if(withdraw < balance){
            this.balance -= withdraw;
            
            System.out.println("Please wait...");
            Thread.sleep(1500);
            System.out.printf("Cash release: P%s", df.format(withdraw) + "\n");
            System.out.printf("Your new balance: P%s", df.format(balance));
        }
        else{
            System.out.println("Insufficient balance!");
            Thread.sleep(1500);
            System.exit(0);
        }
    }

}
