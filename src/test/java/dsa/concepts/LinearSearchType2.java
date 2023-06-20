package dsa.concepts;

public class LinearSearchType2 {

    public static void main(String[] args) {

        int[] numbers = {15, 5, 11, 2, -3, 7, -1, 45, 56};
        int result = linearSearch(numbers, 2);
        System.out.println(result);
        result = linearSearch(numbers, -3);
        System.out.println(result);
        result = linearSearch(numbers, -1);
        System.out.println(result);
        result = linearSearch(numbers, 15);
        System.out.println(result);
        result = linearSearch(numbers, 56);
        System.out.println(result);
        result = linearSearch(numbers, 25);
        System.out.println(result);
    }

    private static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
