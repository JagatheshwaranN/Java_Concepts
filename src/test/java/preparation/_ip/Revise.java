package preparation._ip;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Revise {

    public static void main(String[] args) {
        nonRepeatChars("apple");
        countChars("apple");
        checkPalindrome("Madam");
        largestSmallestNumberInArray(new int[]{5, 3, 2, 1});
        arraySort(new int[]{5, 3, 2, 1});
        findDuplicates(new int[]{5, 3, 2, 3, 5, 1});
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(5));
        System.out.println(isArmstrong(407));
    }

    private static void nonRepeatChars(String str) {
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c))
                System.out.println(c);
        }
    }

    private static void countChars(String str) {
        long count = str.chars().filter(ch -> ch == 'p').count();
        System.out.println(count);
    }

    private static void checkPalindrome(String str) {
        if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static void largestSmallestNumberInArray(int[] arr) {
        int largest = Arrays.stream(arr).max().getAsInt();
        int smallest = Arrays.stream(arr).min().getAsInt();
        System.out.println(largest);
        System.out.println(smallest);
    }

    private static void arraySort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num))
                System.out.println(num);
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    private static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        return sum == n;
    }

}
