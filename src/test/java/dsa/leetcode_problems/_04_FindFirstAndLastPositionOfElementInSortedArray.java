package dsa.leetcode_problems;

import java.util.Arrays;
/**
 * @Facebook
*/
public class _04_FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {

        int[] numbers = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(numbers, target)));
    }

    private static int[] searchRange(int[] arr, int target){

        int[] result = {-1, -1};
        result[0] = search(arr, target, true);
        if(result[0] != -1) {
            result[1] = search(arr, target, false);
        }
        return result;
    }

    private static int search(int[] arr, int target, boolean searchFirstOccurance){

        int result = -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                result = mid;
                if(searchFirstOccurance){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
