package preparation.revise_2;

@SuppressWarnings("All")
public class PolymorphismDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        // Runtime Polymorphism
        animal.makeSound(); // Animal Sound
        dog.makeSound(); // Dog Sound

        // CompileTime Polymorphism
        animal.eat(); // Animal Eat
        dog.eat(); // Animal Eat
    }

}

class Animal {

    public void makeSound() {
        System.out.println("Animal Sound");
    }

    public static void eat() {
        System.out.println("Animal Eat");
    }

}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog Sound");
    }

    public static void eat() {
        System.out.println("Dog Eat");
    }

}