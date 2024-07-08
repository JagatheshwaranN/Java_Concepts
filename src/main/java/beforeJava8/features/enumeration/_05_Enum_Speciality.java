package beforeJava8.features.enumeration;

public class _05_Enum_Speciality {

    public static void main(String[] args) {

        /*
            Specialty of Java Enum
            ======================
            In old languages Enum, we can take only constants but in Java Enum
            in addition to constants we can take methods, constructors and normal
            variables, etc. Hence, Java Enum is more powerful than the old languages
            Enum. Even inside java Enum, we can declare the main() method, and we can
            run enum directly from command prompt.

            Note:
            =====
            In addition to constants, if we are taking any extra member like a method,
            then a list of constants should be in the first line and should ends with
            semicolon (;). An empty Enum is valid in Java.
        */
        EnumSpecialityDemo.demo();
    }

}

enum Fish {
    GUPPY, GOLD, MOLLY, SHARK;

    public static void main(String[] args) {
        System.out.println("Enum main method");
    }
}

enum Fish2 {
    ;

    public static void main(String[] args) {
        System.out.println("Enum main method");
    }
}

enum Fish3 {
    GUPPY("Guppy"), GOLD("Gold");

    final String fishType;

    Fish3(String fishType) {
        this.fishType = fishType;
    }

    public void fishTypeDisplay() {
        System.out.println("Fish Type : " + fishType);
    }

}

class EnumSpecialityDemo {

    public static void demo() {
        Fish3.GOLD.fishTypeDisplay();
    }

}