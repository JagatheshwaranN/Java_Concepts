package preparation.revise_1.cast;

public class DownCastingDemo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog)animal; // Down-casting
        dog.bark();
    }

    public static class Animal {

        public void eat(){
            System.out.println("Animal eats");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void eat() {
            super.eat();
        }

        public void bark(){
            System.out.println("Dog barks");
        }
    }

}
