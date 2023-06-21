package dsa.leetcode_problems;

public class _01_EvenDigits {

    public static void main(String[] args) {

        int[] arr = {12, 345, 2, 6, -7896};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] numbers){
        int count = 0;

        for(int num : numbers){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        while(num > 0){
        num = num / 10;
        count++;
        }
        return count;
    }
}
