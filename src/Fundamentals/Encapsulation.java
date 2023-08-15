package Fundamentals;
import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("Date: 7/17/2023");
        System.out.println("Introduction to Encapsulation\n");
        Scanner input = new Scanner(System.in);
        
        Person2 p2 = new Person2("Violeta", "See", "Lee");
        System.out.println("This is your current detailes: " + p2.getFirstName() + " " + p2.getLastName() + " " +  p2.getMiddleName());
        System.out.println("Change your details: \n");
        
        System.out.print("Change your firstname: ");
            String firstName = input.nextLine();
        System.out.print("Change your lastname: ");
            String lastName = input.nextLine();
        System.out.print("Change your middlename: ");
            String middleName = input.nextLine();
        
        p2.setFirstName(firstName);
        p2.setLastName(lastName); 
        p2.setMiddleName(middleName); 
        
        System.out.println("This is your changed detailes: " + p2.getFirstName() + " " + p2.getLastName() + " " +  p2.getMiddleName());
        
    }
    
}
