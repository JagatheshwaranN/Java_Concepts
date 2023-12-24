package java7andbelow.features.enumeration;

public class _02_Enum_Vs_Switch {

    public static void main(String[] args) {

        /*
            Enum Vs Switch()
            ================
            Until Java 1.4 version, the allowed argument types for the switch statement
            are Byte, Short, Char and Int. But from Java 1.5 version onwards, corresponding
            wrapper classes and enum types are allowed. From 1.7 version onwards, a String
            type also allowed.

            Hence, from Java 1.5 version onwards, we can pass an enum type as argument to
            switch statement.
        */
        EnumSwitchDemo.demo();
    }

}

/*
    If we pass an enum type as argument to switch statement then every case label
     should be valid enum constant otherwise we will get compile time error.
*/
class EnumSwitchDemo {

    public static void demo() {
        Juice juice = Juice.MANGO;
        System.out.println(juice);

        switch (juice) {
            case MANGO -> System.out.println("It taste like Mango");
            case ORANGE -> System.out.println("It taste like Orange");
        }
    }

    public enum Juice {
        ORANGE, MANGO;
    }

}
