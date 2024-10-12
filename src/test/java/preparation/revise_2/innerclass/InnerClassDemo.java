package preparation.revise_2.innerclass;

@SuppressWarnings("All")
public class InnerClassDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.details();
        Car.Engine engine = car.new Engine();
        engine.show();
    }
}


class Car {

    private static String model;

    private final int wheels;

    public Car() {
        model = "XUV";
        this.wheels = 6;
    }

    public void details() {
        Engine engine = new Engine();
        engine.show();
    }

    public class Engine {

        void show() {
            System.out.println(model);
            System.out.println(wheels);
        }

    }

}
