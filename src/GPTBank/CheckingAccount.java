package GPTBank;

public class CheckingAccount extends BankAccount{
    
    double overDraftLimit;
    
    CheckingAccount(int accountNumber, String accountHolderName, double balance, double overDraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    // Setters
    void setOverDraftLimit(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
    }
    
    // Getters
    double getOverDraftLimit(){
        return overDraftLimit;
    }

}
