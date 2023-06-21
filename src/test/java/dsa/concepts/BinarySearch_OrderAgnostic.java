package dsa.concepts;

public class BinarySearch_OrderAgnostic {

    public static void main(String[] args) {

        int[] arr = {-12, -4, 0, 2, 3, 4, 17, 21, 47, 99};
        int target = -12;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        target = 99;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        target = 17;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        target = 2;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        target = 100;
        System.out.println(orderAgnosticBinarySearch(arr, target));
        System.out.println("======================================");
        int[] arr1 = { 98, 86, 75, 67, 53, 41, 35, 3, -2, -15};
        int target1 = 98;
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
        target1 = -2;
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
        target1 = 41;
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
        target1 = 3;
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
        target1 = 100;
        System.out.println(orderAgnosticBinarySearch(arr1, target1));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;
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
