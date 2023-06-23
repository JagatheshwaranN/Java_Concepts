package dsa.leetcode_problems;

public class _07_FindInMountainArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(numbers, target));
        target = 6;
        System.out.println(search(numbers, target));
    }

    private static int search(int[] arr, int target){

        int peak = peakIndexInMountainArray(arr);
        int leftHalf = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(leftHalf != -1){
            return leftHalf;
        }
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }
    private static int peakIndexInMountainArray(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
