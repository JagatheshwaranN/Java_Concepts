package java7andbelow.features.enumeration;

public class _07_Enum_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1
            ======
            Every Enum constant represents an object of the type Enum. Hence, whatever
            methods we can apply on normal java objects can be applicable on Enum
            constants as well.

            Case 2
            ======
            If we want to use any class / interface directly outside package, then the
            required import is normal import. If we want to access static members without
            a class name, then the required import is static import.

            import static java.lang.math.sqrt;
            import java.util.ArrayList;
            class Test {
                public static void main (String[] args) {
                    ArrayList al = new ArrayList();
                    SOP (sqrt(4));
                }
            }

            Example
            =======
            package pack1;
            enum Fish {
                GUPPY, GOLD;
            }

            package pack2;
            public class Test {
                public static void main (String[] args) {
                    Fish f = Fish.GUPPY;
                    SOP (f);
                }
            }

            To compile the above class, the required import is,
            import pack1.Fish; or import pack1.*;

            package pack3;
            public class Test {
                public static void main (String[] args) {
                    SOP (GOLD);
                }
            }
            To compile the above class, the required import is,
            import static pack1.Fish.GOLD; or import static pack1.Fish.*;

            package pack4;
            public class Test {
                public static void main (String[] args) {
                    Fish f = Fish.GUPPY;
                    SOP (GOLD);
                }
            }
            To compile the above class, the required imports are,
            import pack1.Fish or import pack1.*;
            import static pack1.Fish.GOLD; or import static pack1.Fish.*;

            Case 3
            ======
            enum Color {
                RED, GREEN, BLUE;
                public void info () {
                    SOP (Universal Color);
                }
            }
            class Test {
                public static void main (String[] args) {
                    Color[] c = Color.values();
                    for (Color c1 : c) {
                        c1.info();
                    }
                }
            }
        */
        EnumCaseScenariosDemo.case1Demo();
        EnumCaseScenariosDemo.case3Demo();

        /*
            enum Vs Enum Vs Enumeration
            ===========================
            enum is a keyword in Java which can be used to define a group of named
            constants.

            Enum is a class in Java present in java.lang package, and every enum in
            Java should be a direct child class of Enum class. Hence, this class acts
            as base class for all java enum.

            Enumeration is an interface present in java.util package, and we can use
            an enumeration object to get the object one by one from the collection.
        */

    }

}

class EnumCaseScenariosDemo {

    public static void case1Demo() {
        System.out.println(Juice.MANGO.equals(Juice.ORANGE));
        System.out.println(Juice.MANGO.hashCode() > Juice.ORANGE.hashCode());
        System.out.println(Juice.MANGO.ordinal() > Juice.ORANGE.ordinal());
    }

    public static void case3Demo() {
        Color[] colors = Color.values();
        for (Color color : colors) {
            color.info();
        }
    }

    enum Juice {
        MANGO, ORANGE;
    }

    enum Color {

        RED {
            public void info() {
                System.out.println("Red Color");
            }
        }, GREEN, BLUE;

        public void info() {
            System.out.println("Universal Colors");
        }
    }

}