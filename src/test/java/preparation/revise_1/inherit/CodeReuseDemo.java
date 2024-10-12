package preparation.revise_1.inherit;

public class CodeReuseDemo {

    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2020);
        car.displayCarDetails();
    }

    public static class Vehicle {

        protected String model;

        public Vehicle(String model) {
            this.model = model;
        }

        public void displayModel() {
            System.out.println("Model: " + model);
        }
    }

    public static class Car extends Vehicle{

        private final int year;
        public Car(String model, int year) {
            super(model);
            this.year = year;
        }

        public void displayCarDetails(){
            displayModel();
            System.out.println("Year: "+year);
        }
    }
}
