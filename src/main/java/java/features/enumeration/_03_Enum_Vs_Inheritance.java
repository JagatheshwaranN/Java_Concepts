package java.features.enumeration;

public class _03_Enum_Vs_Inheritance {

    public static void main(String[] args) {

        /*
            Enum Vs Inheritance
            ===================
            1.	Every Enum is always direct child class of java.lang.Enum and
                hence our Enum can't extend any other Enum (Because Java won't
                provide support for multiple inheritance).

            2.	Every Enum is always final implicitly, and hence for our Enum we
                can't create child Enum.

            Because of the above reasons, we can conclude Inheritance concept not
            applicable for Enum explicitly, and we can't use extends keyword for Enum.

            enum X {
            }

            enum Y extends X { //CTE
            }

            enum X extends Java.lang.Enum { //CTE
            }

            class X {
            }

            enum Y extends X { //CTE
            }

            enum X {
            }

            class Y extends X {
            }

            CE: Cannot inherit from final X
            CE: enum types are not extensible

            Anyway, an Enum can implement any number of interfaces.

            interface X {
            }

            enum Y implements X {
            }

            java.lang.Enum
            ==============
            Every Enum in Java is direct child class of java.lang.Enum and hence this class
            acts as base class for all Java Enums. It is an abstract class, and it is a
            direct child class of Object. Implements Serializable and Comparable interfaces.

        */
        EnumInterfaceDemo.demo1();
        EnumInterfaceDemo.demo2();
    }

}

interface Vehicle {

    void start();

    void stop();
}

enum Car implements Vehicle {
    SEDAN,
    SUV,
    CONVERTIBLE;

    @Override
    public void start() {
        System.out.println("Starting " + this.name());
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + this.name());
    }
}

interface Color {

    String getColor();
}

enum BasicColors implements Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    private final String colorName;

    BasicColors(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String getColor() {
        return colorName;
    }
}

class EnumInterfaceDemo {

    public static void demo1() {
        Car.SEDAN.start();
        Car.SEDAN.stop();
    }

    public static void demo2() {
        Color color = BasicColors.GREEN;
        System.out.println(color.getColor());
    }

}

