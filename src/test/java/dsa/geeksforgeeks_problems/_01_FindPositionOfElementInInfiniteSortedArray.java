package dsa.geeksforgeeks_problems;

/**
 * @Amazon
 */
public class _01_FindPositionOfElementInInfiniteSortedArray {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findElementPosition(numbers, target));
    }

    private static int findElementPosition(int[] arr, int target){

        int start = 0;
        int end = 2;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if( target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
