package Polymorphism;


public class Bird extends Dog{
    
    Bird(String animalType, String ability, String sound){
        super(animalType, sound, ability);
        // We now already inherit the attributes from it's superclass
        
        // We can add another arguments to this method!
    }
    
    @Override
    void ICanDo(){
        System.out.println("Bird: ");
        super.ICanDo();
    }
}
