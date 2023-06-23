package dsa.leetcode_problems;

public class _06_FindPeakElement {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 0};
        System.out.println(findPeakElement(arr1));
        int[] arr2 = {0, 2, 1, 0};
        System.out.println(findPeakElement(arr2));
        int[] arr3 = {0, 10, 15, 11};
        System.out.println(findPeakElement(arr3));
    }

    private static int findPeakElement(int[] arr){

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
}
