package preparation.revise_1.cast;

public class UpCastingDemo {

    public static void main(String[] args) {

            Dog dog = new Dog(); // Create a Dog object
            Animal animal = dog; // Upcast the Dog object to an Animal reference
            animal.makeSound();
    }

    public static class Animal {

        public void makeSound() {
            System.out.println("Animal is making a sound");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Dog is barking");
        }

        public void wagTail(){
            System.out.println("Dog is wagging its tail");
        }
    }
}
