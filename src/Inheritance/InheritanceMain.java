package Inheritance;
import java.util.Scanner;

public class InheritanceMain {


    public static void main(String[] args) {
        System.out.println("Date: 7/20/2023");
        System.out.println("Introduction to Inheritance"); 
        
        // Instance
        Scanner input = new Scanner(System.in);
        
        System.out.println("Check specifications: \n");
        System.out.print("Computer Type: " );
            String type = input.nextLine();
        System.out.print("Computer Unit: " );
            String unit = input.nextLine();
        System.out.print("Computer Price: " );
            int price = input.nextInt();
        System.out.print("Computer Color: " );
            String color = input.next();
        System.out.print("Screen  Type: ");
            String screenType = input.next();
        
        Computer com = new Computer(type, unit, price, color);
        Cellphone cp = new Cellphone(type, unit, price, color, screenType);
        SmartWatch sw = new SmartWatch(type,unit,price,color,screenType);
        
        System.out.println("Computer: ");
        com.Brand();
        
        System.out.println("CellPhone: ");
        cp.Brand();
        
        System.out.println("SmartWatch:");
        sw.Brand();
        
    }
    
}
