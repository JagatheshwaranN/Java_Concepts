package java7andbelow.features.lang_package;

public class _13_Wrapper_Utility_Methods {

    public static void main(String[] args) {

        /*
            Utility Methods
            ===============
            valueOf()
            =========
            We can use the valueOf() methods to create the wrapper object for the given
            primitive or string.

            Form1
            =====
            Every wrapper class except the character class contains the static valueOf()
            method to create the wrapper object for the given string.

            public static wrapper valueOf(String s);

            Form2
            =====
            Every integral type wrapper class (Byte, Short, Integer and Long) contains the
            following valueOf() methods to create wrapper object for the given specified
            radix string.

            public static wrapper valueOf(String s, int radix);

            The allowed range of radix is 2 to 36.

            Form3
            =====
            Every wrapper class, including the character class contains a static valueOf()
            method to create the wrapper object for the given primitive.

        */
        Integer i1 = Integer.valueOf("10");
        Double d1 = Double.valueOf("10.5");
        Boolean b1 = Boolean.valueOf("true");
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(b1);

        Integer i2 = Integer.valueOf("100", 2);
        Integer i3 = Integer.valueOf("101", 4);
        System.out.println(i2);
        System.out.println(i3);

        Integer i4 = Integer.valueOf(10);
        Double d2 = Double.valueOf(10.5);
        Boolean b2 = Boolean.valueOf(true);
        Character c1 = Character.valueOf('a');
        System.out.println(i4);
        System.out.println(d2);
        System.out.println(b2);
        System.out.println(c1);

        /*
            xxxValue()
            ==========
            We can use xxxValue() method to get primitive for the given wrapper object.

            Every number type wrapper class (Byte, Short, Integer, Long, Float and Double)
            contains the following 6 methods to get the primitive for the given wrapper object.

            public byte byteValue();
            public short shortValue();
            public int intValue();
            public long longValue();
            public float floatValue();
            public double doubleValue();

            charValue()
            ===========
            Character class contains charValue() method to get the char primitive for the given
            character object.

            public char charValue();

            booleanValue()
            ==============
            Boolean class contains booleanValue() method to get the boolean primitive for the
            given boolean object.

            public boolean booleanValue();

            ** Note **
            In total, 38 (6 * 6 + 1 + 1) xxxValue() methods are available.
        */
        Integer i5 = Integer.valueOf(130);
        System.out.println(i5.byteValue());
        System.out.println(i5.shortValue());
        System.out.println(i5.intValue());
        System.out.println(i5.longValue());
        System.out.println(i5.floatValue());
        System.out.println(i5.doubleValue());

        Character c2 = Character.valueOf('b');
        char ch = c2.charValue();
        System.out.println(ch);

        Boolean b3 = Boolean.valueOf("false");
        boolean b4 = b3.booleanValue();
        System.out.println(b4);

        /*
            parseXXX()
            ==========
            We can use parseXXX() method to convert the string to primitive.

            Form1
            =====
            Every wrapper class except character class contains the following parseXXX() method
            to find the primitive for the given string object.

            public static primitive parseXXX(String s);

            Form2
            =====
            Every integral type wrapper class (Byte, Short, Int, Long) contains the following
            parseXXX() method to convert the specified radix string to primitive.

            public static primitive parseXXX(String s, int radix);

            The allowed range of radix is 2 to 36.
        */
        int i6 = Integer.parseInt("10");
        double d3 = Double.parseDouble("10.5");
        boolean b5 = Boolean.parseBoolean("true");
        System.out.println(i6);
        System.out.println(d3);
        System.out.println(b5);

        int i7 = Integer.parseInt("100", 2);
        System.out.println(i7);

        /*
            toString()
            ==========
            We can use the toString() method to convert the wrapper object or primitive to string.

            Form1
            =====
            Every wrapper class contains the following toString() method to convert the wrapper
            object to string type.

            public String toString();

            It is the overriding version of object class toString() method. Whenever we are trying
            to print the wrapper object reference, internally this toString() method will be called.

            Form2
            =====
            Every wrapper class including the character class contains the following static
            toString() method to convert the primitive to string.

            public static String toString (primitive p);

            Form3
            =====
            Integer and Long classes contain the following toString() method to convert the
            primitive to the specified radix string.

            public static String toString (primitive p, int radix);

            The allowed range of radix is 2 to 36.

            Form4: toXXXString()
            ====================
            Integer and Long classes contain the following toXXXString() methods.
            public static String toBinaryString(primitive p);
            public static String toOctalString(primitive p);
            public static String toHexString(primitive p);
        */
        // Form 1
        Integer i8 = Integer.valueOf(10);
        String s1 = i8.toString();
        System.out.println(s1);
        // Form 2
        String s2 =Integer.toString(10);
        System.out.println(s2);
        String s3 = Character.toString('a');
        System.out.println(s3);
        // Form 3
        String s4 = Integer.toString(15, 2);
        System.out.println(s4);
        // Form 4
        String s5 = Integer.toBinaryString(10);
        System.out.println(s5);
        String s6 = Integer.toOctalString(10);
        System.out.println(s6);
        String s7 = Integer.toHexString(10);
        System.out.println(s7);
    }
}
