package dsa.concepts;

public class LinearSearchType1 {

    public static void main(String[] args) {

        int[] numbers = {15, 5, 11, 2, -3, 7, 70, 45, 56};
        int result = linearSearch(numbers, 2);
        System.out.println(result);
        result = linearSearch(numbers, -3);
        System.out.println(result);
        result = linearSearch(numbers, 70);
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
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
