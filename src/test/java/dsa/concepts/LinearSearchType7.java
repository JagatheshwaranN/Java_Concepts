package dsa.concepts;

import java.util.Arrays;

public class LinearSearchType7 {

    public static void main(String[] args) {

        int[][] numbers = {
                {25, 14, 12},
                {18, 15, 3, 7},
                {76, 68, 35, 47},
                {19, 23}
        };

        System.out.println(Arrays.toString(linearSearch(numbers, 25)));
        System.out.println(Arrays.toString(linearSearch(numbers, 15)));
        System.out.println(Arrays.toString(linearSearch(numbers, 35)));
        System.out.println(Arrays.toString(linearSearch(numbers, 23)));
        System.out.println(Arrays.toString(linearSearch(numbers, 50)));
    }

    private static int[] linearSearch(int[][] arr, int target){

        if(arr.length == 0){
            return new int[]{-1, -1};
        }

        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++ ){

                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


}
