package beforeJava8.features.language_fundamentals.arrays;

public class _12_Uninitialized_Arrays_Static_Level {

    static int[] i1;
    static int[] i2 = new int[1];

    public static void main(String[] args) {

        System.out.println(_12_Uninitialized_Arrays_Static_Level.i1); // null
        // System.out.println(_12_Uninitialized_Arrays_Static_Level.i1[0]); // Exception in thread "main" java.lang.NullPointerException

        System.out.println(_12_Uninitialized_Arrays_Static_Level.i2); // [I@4dd8dc3
        System.out.println(_12_Uninitialized_Arrays_Static_Level.i2[0]); // 0
    }
}
