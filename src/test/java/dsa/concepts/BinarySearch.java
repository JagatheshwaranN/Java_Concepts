package dsa.concepts;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15,  17,  18, 21, 47, 99};
        int target = 17;
        System.out.println(binarySearch(arr, target));
        target = -18;
        System.out.println(binarySearch(arr, target));
        target = 99;
        System.out.println(binarySearch(arr, target));
        target = 15;
        System.out.println(binarySearch(arr, target));
        target = 100;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end- start) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
