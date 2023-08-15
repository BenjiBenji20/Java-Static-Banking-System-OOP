package Polymorphism;


public class Cat extends Dog{
    
    Cat(String animalType, String sound, String ability){
        super(animalType, sound, ability);
        // We now already inherit the attributes from it's superclass
        
        // We can add another arguments to this method!
    }
    
    @Override
    void ICanDo(){
        System.out.println("Cat: ");
        super. ICanDo();
    }
}
