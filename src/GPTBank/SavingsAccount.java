package GPTBank;


public class SavingsAccount extends BankAccount{
        
    private double interestRate; // The interest rate is 7%

    SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    
    // Setters
    void setInterestRate(double interestRate){
        this.interestRate = interestRate;  
    }
    
    // Getters
    double getInterestRate(){
        return interestRate;
    }

}
