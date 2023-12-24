package java7andbelow.features.enumeration;

public class _01_Enum_Intro {

    public static void main(String[] args) {

        /*
            Enum Intro
            ==========
            If we want to represent a group of named constants then we should go for enum.

            enum Month {
            JAN, FEB …. DEC;
            }

            The main objective of enum is to define our own data types (enumerated data
            types). Enum concept introduced in Java 1.5 v when compared with old languages
            enum, Java enum is more powerful.

            Internal implementation of Enum
            ===============================
            1.	Every Enum is internally implemented by using class concept.
            2.	Every Enum constant is always public static final.
            3.	Every Enum constant represents an object of the type Enum.

            enum Juice {
                MANGO, GRAPE;
            }

            class Juice {
                public static final Juice MANGO = new Juice();
                public static final Juice GRAPE = new Juice();
            }

            Enum Declaration and Usage
            ==========================
            Every Enum constant is always public static final and hence we can access
            Enum constant by using Enum name.

            enum Juice {
                MANGO, GRAPE;
            }

            class Test {
                public static void main (String[] args) {
                    Juice j = Juice.MANGO;
                    SOP (j);
                }
            }

            Note: Inside Enum, toString() method is internally implemented to return the
                  name of the constant.

            We can declare enum either within the class or outside the class but not inside
            a method. If you are trying to declare inside a method, then you will get the
            compile time error saying Enum types must not be local.

            enum X {
            }

            class Y {
            }

            class X {
                enum Y {
                }
            }

            If we declare enum outside the class, then the applicable modifiers are,
            1. Public
            2. <Default>
            3. Strictfp

            If we declare enum inside a class, then the applicable modifiers are,
            1. Public
            2. <Default>
            3. Strictfp
            4. Private
            5. Protected
            6. Static
        */
        EnumDemo.demo();
    }

}

class EnumDemo {

    public static void demo() {
        Juice mango = Juice.MANGO;
        System.out.println(mango);
    }

    public enum Juice {
        ORANGE, MANGO;
    }

}