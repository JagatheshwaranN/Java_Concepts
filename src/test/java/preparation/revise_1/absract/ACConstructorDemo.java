package preparation.revise_1.absract;

public class ACConstructorDemo {

    public static void main(String[] args) {
        Car car = new Car("SUV", "4 Wheeler");
        System.out.println(car.getType());
        System.out.println(car.getCategory());
        car.make();
        car.model();
    }

    public static abstract class Vehicle {

        private final String type;
        public Vehicle(String type){
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public abstract void make();

        public abstract void model();
    }

    public static class Car extends Vehicle {
        private final String category;

        public Car(String type, String category){
            super(type);
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public void model() {
            System.out.println("Chevrolet");
        }

        @Override
        public void make() {
            System.out.println("German");
        }
    }
}
