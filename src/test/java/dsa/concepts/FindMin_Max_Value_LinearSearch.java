package dsa.concepts;

public class FindMin_Max_Value_LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {15, 5, 11, 2, -3, 7, 70, 45, 56};
        int result = findMinValueUsingLinearSearch(numbers);
        System.out.println(result);
        result = findMaxValueUsingLinearSearch(numbers);
        System.out.println(result);
    }

    private static int findMinValueUsingLinearSearch(int[] arr){

        if(arr.length == 0){
            return  Integer.MAX_VALUE;
        }
        int minValue = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] < minValue){
                minValue = arr[index];
            }
        }
        return minValue;
    }

    private static int findMaxValueUsingLinearSearch(int[] arr){

        if(arr.length == 0){
            return  Integer.MIN_VALUE;
        }
        int maxValue = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(arr[index] > maxValue){
                maxValue = arr[index];
            }
        }
        return maxValue;
    }
}
