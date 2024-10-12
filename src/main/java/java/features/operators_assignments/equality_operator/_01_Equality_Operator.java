package java.features.operators_assignments.equality_operator;

public class _01_Equality_Operator {

    public static void main(String[] args) {

        /*
            Equality Operators (==,!=)
            ==========================
            1. We can apply equality operators for every primitive data type including the boolean data type.

            2. We can apply the equality operators for object data types as well. For Object references
               R1, R2. R1, R2 return true if only both references are pointing to the same object.
               (Reference comparison are address comparison).

            3. If we apply equality operators for Object data types then compulsory there should be some
               relation between the argument types (Either Child -> Parent, Parent -> Child, or same type).
               Otherwise, we will get the compile time error saying Incomparable Type.
        */

        System.out.println(10 == 10);
        System.out.println(10 != 20);
        System.out.println('a' == 97.0);

        System.out.println(10.5 == 10.5);
        System.out.println(10.5 != 20.5);

        System.out.println('a' == 'a');
        System.out.println('A' != 'B');

        System.out.println(true == true);
        System.out.println(true != false);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);

        Object o1 = new Object();
        String s4 = new String("Java");
        Thread t4 = new Thread();

        System.out.println(t1 != o1);
        System.out.println(o1 != s1);
        // System.out.println(s1 == t1); // incomparable types: java.lang.String and java.lang.Thread
    }
}
