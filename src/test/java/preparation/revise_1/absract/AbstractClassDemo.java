package preparation.revise_1.absract;

public class AbstractClassDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.type();
        car.make();
        car.model();
    }

    public static abstract class Vehicle {

        public void type(){
            System.out.println("4 wheeler vehicle");
        }

        public abstract void model();

        public abstract void make();
    }

    public static class Car extends Vehicle {

        @Override
        public void model() {
            System.out.println("BMW");
        }

        @Override
        public void make() {
            System.out.println("German");
        }
    }
}
