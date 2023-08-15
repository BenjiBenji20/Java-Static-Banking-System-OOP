package GPTBank;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;


public class GPTBanking {


    public static void main(String[] args) throws InterruptedException {
       
        System.out.println("Date: 7/21/2023");
        System.out.println("GPT Training for OOP: Constructors, Methods, Encapsulation and Inheritance\n\n");
        
        // Instance
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Random random = new Random();
        boolean done = false;
        
        // Create Bank Account
        System.out.print("Create your account username: ");
            String username = input.nextLine();
        double accountBalance = 0; // Account balance will starts at zero : )
        System.out.print("Enter to generate pincode");
            String enter = input.nextLine();
        System.out.println("Generating account number \nPlease wait...");
            Thread.sleep(3000);
            
        // Generate 6 digits for Account Number
         int accountNumber = random.nextInt(999999);
        System.out.printf("This is your account number: %s", accountNumber);
        BankAccount bank = new BankAccount(accountNumber, username,accountBalance);
        
        while(!done){
            
        // START
        System.out.println("\n\nPROG BANK");
        System.out.println("Bank Account \nWithdraw Cash \nDeposit Cash \nAccount Details \nSavings Account \nChecking Account\n");
        System.out.print("Choose your action: ");
            String action = input.nextLine();
        
        // Conditional Statements
        if(action.equalsIgnoreCase("Deposit Cash")){
            System.out.print("Enter your account number: ");
                int enterAccountNumber = input.nextInt();
            if(enterAccountNumber == accountNumber){
                    System.out.println("\nHello " + bank.getAccountHolderName() + "!");
                    System.out.print("Enter deposit amount: P");
                        double deposit = input.nextDouble();
                    bank.deposit(deposit); // Pass the depositted amount to deposit method on the bank obj
                    System.out.printf("Your new balance: P%s", df.format(bank.getBalance()) + "\n");

                    System.out.print("\n(Yes/No)\nDo you want another transaction? ");
                    for(;;){
                        String nextTransaction = input.nextLine();
                        if(nextTransaction.equalsIgnoreCase("Yes")){
                            break;
                        }
                        else if(nextTransaction.equalsIgnoreCase("No")){
                            System.out.println("Thank you for banking with us!");
                            Thread.sleep(2000);
                            done = true;
                            System.exit(0);
                    }}}
            else{
                    System.out.println("Account number not found...");
                    Thread.sleep(2000);
                    System.exit(0);
                    input.close();
                }
        }
        
        else if(action.equalsIgnoreCase("Withdraw Cash")){
            System.out.print("Enter your account number: ");
                int enterAccountNumber = input.nextInt();
            
                if(enterAccountNumber == accountNumber){
                    System.out.println("\nHello " + bank.getAccountHolderName() + "!");
                    System.out.print("Enter withdrawal amount: P");
                        double withdrawCash = input.nextDouble();
                    bank.withdraw(withdrawCash);
                    
                    System.out.print("\n(Yes/No)\nDo you want another transaction? ");
                    for(;;){
                        String nextTransaction = input.nextLine();
                        if(nextTransaction.equalsIgnoreCase("Yes")){
                            break;
                        }
                        else if(nextTransaction.equalsIgnoreCase("No")){
                            System.out.println("Thank you for banking with us!");
                            Thread.sleep(2000);
                            done = true;
                            System.exit(0);
                        }}}
            else{
                    System.out.println("Account number not found...");
                    Thread.sleep(2000);
                    System.exit(0);
                    input.close();
                }
        }
        
         else if(action.equalsIgnoreCase("Account Details")){
            System.out.print("Enter your account number: ");
                int enterAccountNumber = input.nextInt();
            
                if(enterAccountNumber == accountNumber){
                    System.out.println("\nHello " + bank.getAccountHolderName() + "!");
                    System.out.println("Account Number: " + bank.getAccountNumber());
                    System.out.printf("Your account balance: P%s", df.format(bank.getBalance()) + "\n");
                    
                    System.out.print("\n(Yes/No)\nDo you want another transaction? ");
                    for(;;){
                        String nextTransaction = input.nextLine();
                        if(nextTransaction.equalsIgnoreCase("Yes")){
                            break;
                        }
                        else if(nextTransaction.equalsIgnoreCase("No")){
                            System.out.println("Thank you for banking with us!");
                            Thread.sleep(2000);
                            done = true;
                            System.exit(0);
                        }}}
            else{
                    System.out.println("Account number not found...");
                    Thread.sleep(2000);
                    System.exit(0);
                    input.close();
                }
        }
        
        else if(action.equalsIgnoreCase("Savings Account")){
            System.out.print("Enter your account number: ");
            int enterAccountNumber = input.nextInt();
            
            if(enterAccountNumber == accountNumber){
                double interestRate = 0.07;
                
                SavingsAccount savings = new SavingsAccount(accountNumber, username,accountBalance, interestRate);
                savings.setInterestRate(interestRate);
                System.out.println("\nHello " + bank.getAccountHolderName() + "!");
                System.out.printf("Account number: %s", bank.getAccountNumber() + "\n");
                System.out.printf("Your balance cash: P%s", df.format(bank.getBalance())+ "\n");
                double balance = savings.getInterestRate() * bank.getBalance();
                bank.setBalance(bank.getBalance() + balance);
                System.out.printf("Your new balance due to annual interest rate: P%s", df.format(bank.getBalance()));
                
                System.out.print("\n(Yes/No)\nDo you want another transaction? ");
                    for(;;){
                        String nextTransaction = input.nextLine();
                        if(nextTransaction.equalsIgnoreCase("Yes")){
                            break;
                        }
                        else if(nextTransaction.equalsIgnoreCase("No")){
                            System.out.println("Thank you for banking with us!");
                            Thread.sleep(2000);
                            done = true;
                            System.exit(0);
                        }}}
            else{
                    System.out.println("Account number not found...");
                    Thread.sleep(2000);
                    System.exit(0);
                    input.close();
                }
        }
        
        else if(action.equalsIgnoreCase("Checking Account")){
            System.out.print("Enter your account number: ");
                int enterAccountNumber = input.nextInt();
            
            if(enterAccountNumber == accountNumber){
                System.out.print("Cash loan: P");
                    double loan = input.nextDouble();
                    double overDraftLimit = 5000.00 - loan;

                    if(loan < overDraftLimit){
                        CheckingAccount check = new CheckingAccount(accountNumber, username,accountBalance, overDraftLimit);
                        check.setOverDraftLimit(overDraftLimit);
                        System.out.printf("Your loan limit: P%s", df.format(check.getOverDraftLimit())+ "\n");
                        System.out.printf("Your new loan: P%s", df.format(loan) + "\n");
                    }
                    else if(loan >= overDraftLimit){
                        System.out.println("Loan exceeds the limit!");
                        Thread.sleep(2000);
                            done = true;
                        System.exit(0);
                    }
                    System.out.print("\n(Yes/No)\nDo you want another transaction? ");
                    for(;;){
                        String nextTransaction = input.nextLine();
                        if(nextTransaction.equalsIgnoreCase("Yes")){
                            break;
                        }
                        else if(nextTransaction.equalsIgnoreCase("No")){
                            System.out.println("Thank you for banking with us!");
                            Thread.sleep(2000);
                            done = true;
                            System.exit(0);
                    }}}
            else{
                    System.out.println("Account number not found...");
                    Thread.sleep(2000);
                    System.exit(0);
                    input.close();
                }
        }
        else if(!action.equalsIgnoreCase("Deposit Cash") && !action.equalsIgnoreCase("Withdraw Cash") 
               && !action.equalsIgnoreCase("Savings Accounts") && !action.equalsIgnoreCase("Checking Account")){
            System.out.println("Action cannot found... \nPlease try again...");
            System.out.println("System exit 3...");
                Thread.sleep(1000);
            System.out.println("System exit 2...");
                Thread.sleep(1000);
            System.out.println("System exit 1...");
                Thread.sleep(1000);
            System.out.println("\nThank you for using our service!");
        }
    }
        System.out.println("FINISHED: 7/27/2023");
        
        System.exit(0);
        input.close();
    }
    
}
