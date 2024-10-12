package preparation.revise_1.has_a;

public class CompositionDemo {

    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("BWM", engine);
        car.start();
    }
}

class Engine {

    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine of type " + type + " started");
    }

}

class Car {

    private final String model;
    private final Engine engine;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car model "+model +" starting...");
        engine.start();
        System.out.println("Car started");
    }
}
