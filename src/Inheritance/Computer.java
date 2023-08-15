package Inheritance;

public class Computer {
    
    //Set attributes
    String computerType;
    String unit;
    int price;
    String color;
    
    // Create constructor 
    Computer(String computerType, String unit, int price, String color){
        this.computerType = computerType;
        this.unit = unit;
        this.price = price;
        this.color = color;
    }
    
        void Brand(){

            System.out.println("\nCheck specifications:");
            System.out.println("Computer Type: " + computerType);
            System.out.println("Computer Unit: " + unit);
            System.out.println("Computer Price: " + price);
            System.out.println("Computer Color: " + color);
            
        }
}
