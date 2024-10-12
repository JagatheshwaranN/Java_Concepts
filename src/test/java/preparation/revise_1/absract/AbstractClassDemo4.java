package preparation.revise_1.absract;

public class AbstractClassDemo4 {

    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            public void type() {
                System.out.println("4 wheeler - SUV");
            }
        };
        car.type();
    }

    public static abstract class Vehicle {
        public abstract void type();

    }

}
