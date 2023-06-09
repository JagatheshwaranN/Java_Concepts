package java7andbelow.features.language_fundamentals.arrays;

public class _13_Uninitialized_Arrays_Instance_Level {

    int[] i1;
    int[] i2 = new int[1];

    public static void main(String[] args) {

        _13_Uninitialized_Arrays_Instance_Level demo = new _13_Uninitialized_Arrays_Instance_Level();

        System.out.println(demo.i1); // null
        // System.out.println(demo.i1[0]); // Exception in thread "main" java.lang.NullPointerException

        System.out.println(demo.i2); // [I@4dd8dc3
        System.out.println(demo.i2[0]); // 0
    }
}
