package dsa.concepts;

public class FindMin_Max_Value_LinearSearch_2DArray {

    public static void main(String[] args) {

        int[][] numbers = {
                {25, 14, 12},
                {18, 15, 3, 7},
                {76, 68, 35, 47},
                {19, 23}
        };

        System.out.println(findMaxValueUsingLinearSearchIn2DArrayType1(numbers));
        System.out.println(findMaxValueUsingLinearSearchIn2DArrayType2(numbers));
        System.out.println(findMinValueUsingLinearSearchIn2DArrayType1(numbers));
        System.out.println(findMinValueUsingLinearSearchIn2DArrayType2(numbers));
    }

    private static int findMaxValueUsingLinearSearchIn2DArrayType1(int[][] arr){

        int maxValue = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] > maxValue){
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }

    private static int findMaxValueUsingLinearSearchIn2DArrayType2(int[][] arr){

        int maxValue = Integer.MIN_VALUE;
        for (int[] _oneDArr : arr) {

            for (int integer : _oneDArr) {

                if (integer > maxValue) {
                    maxValue = integer;
                }
            }
        }
        return maxValue;
    }

    private static int findMinValueUsingLinearSearchIn2DArrayType1(int[][] arr){

        int minValue = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] < minValue){
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }

    private static int findMinValueUsingLinearSearchIn2DArrayType2(int[][] arr){

        int minValue = Integer.MAX_VALUE;
        for(int[] oneDArr : arr) {

            for(int integer : oneDArr) {

                if(integer < minValue) {
                    minValue = integer;
                }
            }
        }
        return minValue;
    }
}
