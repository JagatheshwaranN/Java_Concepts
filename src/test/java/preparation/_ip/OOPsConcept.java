package preparation._ip;

public class OOPsConcept {

    public static void main(String[] args) {

        EncapsulationDemo demo = new EncapsulationDemo();
        demo.deposit(100.0);
        System.out.println(demo.getBalance());

        Car car = new Car();
        car.start();
        car.move();

        Circle circle = new Circle();
        circle.draw();

        PolymorphismDemo demo1 = new PolymorphismDemo();
        demo1.draw();
        demo1.draw("Object");

        AbstractionDemo demo2 = new Dog();
        demo2.sound();
    }

    static class EncapsulationDemo {

        private double balance;

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    static class Vehicle {
        void start() {
            System.out.println("Vehicle start");
        }
    }

    static class Car extends Vehicle {
        void move() {
            System.out.println("Vehicle move");
        }
    }

    static class PolymorphismDemo {
        void draw() {
            System.out.println("Draw a shape");
        }

        void draw(String title) {
            System.out.println(STR."Draw a \{title}");
        }
    }

    static class Circle extends PolymorphismDemo {
        @Override
        void draw() {
            System.out.println("Draw a circle");
        }
    }

    static abstract class AbstractionDemo {
        abstract void sound();
    }

    static class Dog extends AbstractionDemo{

        @Override
        void sound() {
            System.out.println("Barks..");
        }
    }
}
