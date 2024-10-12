package preparation.revise_1.cast;

public class InstanceOfDemo {

    public static void main(String[] args) {
        Animal animal = new Dog(); // Creating a Dog object and assigning it to an Animal reference

        if(animal instanceof Animal){
            animal.eat();
        }

        if(animal instanceof Dog){
            System.out.println("animal instanceof Dog Class");
            ((Dog) animal).bark();
        }

        if(animal instanceof Object){
            System.out.println("animal instanceof Object class");
        }

    }

    public static class Animal {

        public void eat() {
            System.out.println("Animal eats");
        }
    }

    public static class Dog extends Animal {
        public void bark() {
            System.out.println("Dog barks");
        }
    }
}

