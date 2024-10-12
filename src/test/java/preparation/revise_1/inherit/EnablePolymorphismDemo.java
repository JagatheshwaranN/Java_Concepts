package preparation.revise_1.inherit;

public class EnablePolymorphismDemo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }

    public static class Animal {

        public void makeSound(){
            System.out.println("Animal makes sound");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Dog is barking");
        }
    }

}
