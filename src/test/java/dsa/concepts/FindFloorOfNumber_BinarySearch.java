package dsa.concepts;

public class FindFloorOfNumber_BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println(floorOfNumber(numbers, target));
        target = 6;
        System.out.println(floorOfNumber(numbers, target));
        target = 10;
        System.out.println(floorOfNumber(numbers, target));
        target = 1;
        System.out.println(floorOfNumber(numbers, target));

    }

    private static int floorOfNumber(int[] arr, int target){

        if(arr.length == 0)
            return -1;

        if(target < arr[0])
            return -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
