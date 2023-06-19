package java7andbelow.features.operators_assignments.equality_operator;

public class _02_Difference_Equality_Operator_Equal_Method {

    public static void main(String[] args) {

        /*
            Difference between == operator & equals () method
            =================================================
            In general, we can use the == operator for reference comparison (address comparison) and
            equals () method for content comparison.

            Note: For any object reference R, R== null is always False. But, null==null is always True.
        */
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1 == null);
        String s3 = null;
        System.out.println(s3 == null);
    }
}
