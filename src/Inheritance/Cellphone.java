package Inheritance;


public class Cellphone extends Computer {
    
    //Creating a new sublass attributes without from its superclass
    String screenType;
    
    // Since the superclass has constructor, the subclass should also have!
        Cellphone(String computerType, String unit, int price, String color, String screenType){
            
            super(computerType, unit, price, color); // super keyword to inherit the superclass' constructor
            this.screenType = screenType;
        }
        
        // Overriding methods
    @Override
        void Brand(){
            super.Brand();  // Super keyword to inherit super class' method
            System.out.println("My brand is " + computerType);
        }
    
}
