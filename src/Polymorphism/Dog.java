package Polymorphism;

public class Dog extends Animal{
    
    Dog(String animalType, String sound, String ability){
        this.animalType = animalType;
        this.sound = sound;
        this.ability = ability;
    }
    
    @Override
    void ICanDo(){
        System.out.println("\n");
        super.ICanDo(); // Overriding methods and add another functionalities
        System.out.println("I am " + animalType);
        System.out.println("I can do this: " + ability);
        System.out.println("I can say " + sound);
    }
}
