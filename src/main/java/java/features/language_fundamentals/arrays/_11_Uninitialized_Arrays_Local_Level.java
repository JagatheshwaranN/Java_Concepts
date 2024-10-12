package java.features.language_fundamentals.arrays;

public class _11_Uninitialized_Arrays_Local_Level {

    public static void main(String[] args) {

        int[] i1;
        int[] i2 = new int[1];

        // System.out.println(i1); - variable i1 might not have been initialized
        // System.out.println(i1[0]); - variable i1 might not have been initialized

        System.out.println(i2); // [I@4dd8dc3
        System.out.println(i2[0]); // 0
    }
}
