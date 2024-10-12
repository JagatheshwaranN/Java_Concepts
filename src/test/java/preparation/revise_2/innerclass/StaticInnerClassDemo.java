package preparation.revise_2.innerclass;

@SuppressWarnings("All")
public class StaticInnerClassDemo {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.details();
        Bike.Engine engine = new Bike.Engine();
        engine.show();
    }
}


class Bike {

    private static String model;

    private final int wheels;

    public Bike() {
        model = "XUV";
        this.wheels = 6;
    }

    public void details() {
        System.out.println(wheels);
        Engine engine = new Engine();
        engine.show();
    }

    static class Engine {

        void show() {
            System.out.println(model);
            // System.out.println(wheels); - Not accessible
        }

        public static void main(String[] args) {
            Engine engine = new Engine();
            engine.show();
        }
    }

}
