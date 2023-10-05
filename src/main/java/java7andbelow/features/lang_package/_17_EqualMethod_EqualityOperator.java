package java7andbelow.features.lang_package;

public class _17_EqualMethod_EqualityOperator {

    public static void main(String[] args) {

        /*
            Relation Between == Operator & Equals() Method
            ==============================================
            1.	If two objects are equal by == operator, then those objects are always equal
                by equals() method i.e., if reference1 == reference2 is true then
                reference1.equals(reference2) is always true.

            2.	If two objects are not equal by == operator then we can't conclude anything about
                equals() method. It may return true / false i.e., if reference1 == reference2 is
                false then reference1.equals(reference2) may return true / false.

            3.	If two objects are equal by equals() method then we can't conclude anything about
                == operator it my return true / false i.e., if reference1.equals(reference2) is
                true then we can't conclude anything about reference1 == reference2 it may return
                true/false.

            4.	If two objects are not equal by equals() method then these objects are not equal
                by == operator i.e., if reference1.equals(reference2) is false then
                reference1 == reference2 is always false.
        */

        /*
            Difference BetWeen == Operator & Equals() Method
            ================================================
            1. To use == operator compulsory there should be some relation between argument types
               such as either parent-child, child-parent or same type. Otherwise, we will get the
               CTE - Incomparable types.

            2. If there is no relation between the arguments, then the equals() method won't raise
               CTE or RTE. It simply returns the false.
        */
        String s1 = new String("Java");
        String s2 = new String("Java");
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        // System.out.println(s1 == sb1); - incomparable types: java.lang.String and java.lang.StringBuffer
        System.out.println(s1.equals(sb1));

        /*
            Comparison Between == Operator and Equals() method
            ==================================================
            == Operator	                                    Equals() Method
            ===========                                     ===============
            It is an operator in java applicable for both   It is a method in Java applicable only
            primitive and object types.                     for object types.

            In case of Object references, == operator meant By default, equals() method presents in
            for reference comparison (address comparison).	object class also meant for reference
                                                            comparison.

            We can't override == operator for content       We can override equals() method for
            comparison.                                     content comparison.

            To use == operator compulsory there should be   If there is no relation between argument
            some relation between argument types. Such as   types, then equals () method won’t raise
            either parent-child, child-parent or same type. any CTE / RTE and simply returns false.
            Otherwise, we will get the CTE-Incomparable
            types.
        */

        /*
            Point to Remember
            =================
            For any object reference r, r == null or r.equals(null) -> False.
        */
        Thread thread = new Thread();
        System.out.println(thread == null);
        System.out.println(thread.equals(null));
    }
}
