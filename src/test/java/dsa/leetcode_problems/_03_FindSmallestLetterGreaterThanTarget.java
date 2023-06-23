package dsa.leetcode_problems;

public class _03_FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        char[] arr = {'c', 'f', 'j'};
        char target = 'g';
        System.out.println(nextGreatestLetter(arr, target));
        target = 'k';
        System.out.println(nextGreatestLetter(arr, target));
    }

    private static char nextGreatestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
