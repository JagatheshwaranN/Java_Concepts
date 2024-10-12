package java.features.operators_assignments.concate_operator;

public class _01_String_Concatenation_Operator {

    public static void main(String[] args) {

        /*
            String Concatenation Operator (+)
            =================================
            The only overloaded operator in Java is + operator. Sometimes, its acts as arithmetic addition
            operator and sometimes as String concatenation operator.

            int i1 = 10 + 20;
            String s1 = "qw" + "erty";

            If at least one argument is String type, then + operator act as concatenation operator and
            if both arguments are number type, then + operator act as arithmetic addition operator.
        */

        String s2 = "Java";
        int i2 = 10, i3 = 20, i4 = 30;
        System.out.println(s2+i2+i3+i4); // Java102030
        System.out.println(i2+i3+i4+s2); // 60Java
        System.out.println(i2+i3+s2+i4); // 30Java30
        System.out.println(i2+s2+i3+i4); // 10Java2030

        // s2 = i2+i3+i4; // incompatible types: int cannot be converted to java.lang.String
        s2 = s2+i2+i3;
        System.out.println(s2);
        // i2 = s2+i3+i4; // incompatible types: java.lang.String cannot be converted to int
        i2 = i2+i3+i4;
        System.out.println(i2);
    }
}
