package Fundamentals;
import java.util.Scanner;

public class Constructor {
     // For Constructor practices
    
    public static void main(String[] args) {
        System.out.println("Date: 7/17/2023");
        System.out.println("Introduction to constructors");
        System.out.println("Constructor, package and scanner");
        System.out.println("Package: Person");
        
        // Instantiate
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your details:\n ");
            
        System.out.print("Enter your firstname: ");
            String firstName = input.nextLine();
        System.out.print("Enter your lastname: ");
            String lastName = input.nextLine(); 
        System.out.print("Enter your middlename: ");
            String middleName = input.nextLine();
        System.out.print("Enter your age: ");
            int age = input.nextInt();
        System.out.print("Enter your sex: ");
            char sex = input.next().charAt(0);
               
        Person p = new Person(firstName, lastName, middleName, age, sex);
        
        System.out.println(p.firstName + " " + p.lastName + " " + p.middleName);
        System.out.println(p.age + " " + p.sex);
    }
    
}
