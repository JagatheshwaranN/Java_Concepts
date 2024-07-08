package beforeJava8.features.lang_package;

public class _12_WrapperClasses {

    public static void main(String[] args) {

        /*
            Wrapper Class
            =============
            The main objectives of the Wrapper classes are,
            1.	To wrapper primitive into object form, so that we can handle primitives
                just like objects.
            2.	To define several utility methods which are required for the primitives.
        */

        /*
            Constructors
            ============
            Almost all wrapper classes contain 2 constructors, one can take corresponding
            primitive as argument and other can take string as argument.
        */
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        System.out.println(i1);
        System.out.println(i2);

        // If the string argument is not representing the number, then we will get the runtime
        // exception saying NumberFormatException
        // Integer i3 = Integer.valueOf("ten"); - NumberFormatException: For input string: "ten"

        Float f1 = Float.valueOf(10.5f);
        Float f2 = Float.valueOf("10.5");
        System.out.println(f1);
        System.out.println(f2);

        Double d1 = Double.valueOf(20.10);
        Double d2 = Double.valueOf("20.10");
        System.out.println(d1);
        System.out.println(d2);

        // Character class contains only one constructor which can take char argument.
        Character c1 = Character.valueOf('a');
        // Character c2 = Character.valueOf("a"); - incompatible types: String cannot be converted
        // to char
        System.out.println(c1);

        /*
            Boolean class contains two constructors, one can take primitive as argument and
            the other can take string as argument. If we pass boolean primitive as argument
            then only allowed values are true / false where case and content are important.
        */
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);
        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        // Boolean b5 = Boolean.valueOf(True); - cannot find symbol

        // If we are passing the string type as argument, then case and content both are not
        // important. If the content is case-insensitive string of true then it’s treated as
        // true otherwise its treated as false.
        Boolean b6 = Boolean.valueOf("true");
        Boolean b7 = Boolean.valueOf("TRUE");
        Boolean b8 = Boolean.valueOf("True");
        Boolean b9 = Boolean.valueOf("Java");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);

        /*
            Wrapper Class	Corresponding Constructors
            =============   ==========================
            Byte	        Byte or String
            Short 	        Short or String
            Integer	        Integer or String
            Long	        Long or String
            Float	        Float or String
            Double	        Double or String
            Character	    Character
            Boolean	        Boolean or String
        */

        // In wrapper classes, toString() method is overridden to return the content directly.
        // In wrapper classes, equals() method is overridden for content comparison.
    }
}
