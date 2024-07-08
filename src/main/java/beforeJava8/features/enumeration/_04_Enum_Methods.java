package beforeJava8.features.enumeration;

public class _04_Enum_Methods {

    public static void main(String[] args) {

        /*
            values()
            ========
            Every Enum implicitly contains values() method to list out all values
            present inside the Enum.

            Example,
            Juice[] j = Juice.values();

            Note: values() method not present in the java.lang.Enum and object classes.
                  Enum keyword implicitly provides this method.

            ordinal()
            =========
            Inside Enum, order of constants is important, and we can represent this
            order by using the ordinal value. We can find the ordinal value of enum
            constant by using the ordinal() method.

            public final int ordinal();

            Ordinal value is 0 based like Array index.
        */
        EnumMethodsDemo.demo();
    }

}

class EnumMethodsDemo {

    public static void demo() {
        Juice[] juices = Juice.values();
        for (Juice juice : juices) {
            System.out.println(juice + " => " + juice.ordinal());
        }
    }

    public enum Juice {
        MANGO, ORANGE
    }

}
