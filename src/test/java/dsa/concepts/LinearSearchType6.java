package dsa.concepts;

public class LinearSearchType6 {

    public static void main(String[] args) {

        int[] numbers = {15, 5, 11, 2, -3, 7, 70, 45, 56};
        int result = linearSearchRange(numbers, 2, 1, 4 );
        System.out.println(result);
        result = linearSearchRange(numbers, -3, 2, 5);
        System.out.println(result);
        result = linearSearchRange(numbers, 70, 5, 8);
        System.out.println(result);
        result = linearSearchRange(numbers, 15, 0, 1);
        System.out.println(result);
        result = linearSearchRange(numbers, 56, 7, 8);
        System.out.println(result);
        result = linearSearchRange(numbers, 25, 0, 8);
        System.out.println(result);
    }

    private static int linearSearchRange(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }

        return -1;
    }
}
