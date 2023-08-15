package Polymorphism;


public class Main {

    public static void main(String[] args) {
        // Attributes for bird
        String birdType = "Rooster";
        String birdSound = "Tiktilaok!!!";
        String birdAbility = "Fly";
        
        // Attributes for cat
        String catType = "Puspin";
        String catSound = "Meow!!!";
        String catAbility = "Walk";
        
        // Attributes for dog
        String dogType = "Aspin";
        String dogSound = "Arf arf!!!";
        String dogAbility = "Walk";
        
        Animal a = new Animal();
        Bird b = new Bird(birdType, birdSound, birdAbility);
        Cat c = new Cat(catType, catSound, catAbility);
        Dog d = new Dog(dogType, dogSound, dogAbility);
        
        b.ICanDo();
        c.ICanDo();
        d.ICanDo();
    }
    
}
