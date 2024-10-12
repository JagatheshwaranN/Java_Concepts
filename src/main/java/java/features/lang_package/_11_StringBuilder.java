package java.features.lang_package;

public class _11_StringBuilder {

    public static void main(String[] args) {

        /*
            StringBuilder
            =============
            Every method present in the StringBuffer is synchronized and hence only one
            thread is allowed to operate on StringBuffer object at a time which may creates
            performance problem. To handle this requirement, SUN people introduced StringBuilder
            concept in 1.5 version of Java.

            StringBuilder is exactly same as StringBuffer except the following differences.

            StringBuffer                               StringBuilder
            ===========                                =============
            Every method present in StringBuffer       Every method present in StringBuilder
            is synchronized.                           is non-synchronized.

            At a time only one thread is allowed to    At a time multiple threads is allowed to
            operate on StringBuffer object and hence   operate on StringBuilder object and hence
            StringBuffer object is thread safe.        StringBuilder object is not thread safe.

            Threads are required to wait to operate on Threads are not required to wait to operate
            StringBuffer object and hence performance  on StringBuilder object and hence performance
            is low.                                    is high.

            Introduced in Java 1.0 version             Introduced in Java 1.5 version

            Except the above differences, everything else is same in StringBuffer and StringBuilder
            (Including methods and constructors).
        */

        /*
            String vs StringBuffer vs StringBuilder
            =======================================
            1.	If the content is fixed and won't change frequently, then we should go for String.
                If the content is not fixed and keep on changing but thread safety required then
                we should go for StringBuffer. If the content is not fixed and keep on changing but
                thread safety is not required then we should go for StringBuilder.

            2.	Method Chaining -> For most of the methods in String, StringBuffer and StringBuilder,
                the return types are same type. Hence, after applying a method on the result, we can
                call another method which forms the method chaining.

                sb.m1().m2().m3(); In method chaining, the method call will execute from left to
                right.

                StringBuffer sb = new StringBuffer();
                sb.append("java").reverse();
        */
        String s = "Java";
        s = s.concat(" Programming").toUpperCase();
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming").reverse();
        System.out.println(sb);
    }
}
