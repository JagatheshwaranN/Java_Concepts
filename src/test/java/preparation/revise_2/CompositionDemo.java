package preparation.revise_2;

@SuppressWarnings("All")
public class CompositionDemo {

    public static void main(String[] args) {
        Car tesla = new Car("Model 2", "Electric");
        tesla.start();
    }

}

@SuppressWarnings("All")
class Engine {

    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(STR."\{type} Engine is started");
    }

}

@SuppressWarnings("All")
class Car {

    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    public void start() {
        engine.start();
        System.out.println(STR."Tesla \{model} Car is started");
    }
}