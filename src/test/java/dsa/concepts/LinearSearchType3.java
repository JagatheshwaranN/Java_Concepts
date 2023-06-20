package dsa.concepts;

public class LinearSearchType3 {

    public static void main(String[] args) {

        int[] numbers = {15, 5, 11, 2, -3, 7, -1, 45, 56};
        boolean result = linearSearch(numbers, 2);
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

    private static boolean linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for(int element : arr){
            if(element == target){
                return  true;
            }
        }
        return false;
    }
}
