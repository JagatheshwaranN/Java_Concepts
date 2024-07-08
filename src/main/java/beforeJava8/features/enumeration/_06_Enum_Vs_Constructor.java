package beforeJava8.features.enumeration;

public class _06_Enum_Vs_Constructor {

    public static void main(String[] args) {

        /*
            Enum Vs Constructor
            ===================
            An Enum can contain Constructor, Enum constructor will be executed
            separately for every Enum constant at the time of Enum class loading
            automatically.

            Juice juice = new Juice();
            CE: Enum type may not be instantiated
        */

        /*
            Note:
            =====
            If we comment on the line Juice juice = Juice.MANGO, then the output is Hello.
            We can't create an Enum object directly, and hence we can't invoke Enum
            constructor directly.
        */
        EnumConstructorDemo.demo();

        /*
            Note:
            =====
            MANGO    => public static final Juice MANGO = new Juice();
            MANGO(50)=> public static final Juice MANGO = new Juice(50);
            Inside Enum we can declare methods but should be concrete methods only, and we
            can't declare abstract methods.
        */
        EnumConstructorDemo.demo2();
    }

}

class EnumConstructorDemo {

    public static void demo() {
        Juice juice = Juice.MANGO;
        System.out.println(juice);
        System.out.println("Class Method");
    }

    public static void demo2() {
        FreshJuice[] juices = FreshJuice.values();
        for (FreshJuice juice : juices) {
            System.out.println(juice + " => " + juice.getPrice());
        }
    }

    enum Juice {
        MANGO, ORANGE;

        Juice() {
            System.out.println("Enum Constructor");
        }
    }

    enum FreshJuice {
        MANGO(50), ORANGE;

        final int price;

        FreshJuice(int price) {
            this.price = price;
        }

        FreshJuice() {
            this.price = 40;
        }

        public int getPrice() {
            return price;
        }
    }

}

