package preparation.revise_1.absract;

public class AbstractClassDemo3 {

    public static void main(String[] args) {
        Car car = new Car();
        car.carCategory();
        car.type();
        car.make();
    }

    public static abstract class Vehicle {

        public String category = "4 wheeler vehicle";

        public void type(){
            System.out.println("SUV");
        }

        public abstract void make();

        // public static abstract void year(); - Illegal combination of modifiers: 'abstract' and 'static'
    }

    public static class Car extends Vehicle {

        public void carCategory(){
            System.out.println(category);
        }
        @Override
        public void type() {
            System.out.println("XUV");
        }

        @Override
        public void make() {
            System.out.println("German");
        }
    }
}
