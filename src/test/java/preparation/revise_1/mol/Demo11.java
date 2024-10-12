package preparation.revise_1.mol;

import java.util.Arrays;

public class Demo11 {

    public static void main(String[] args){
        String[] array1 = {"Hello", ", ", "World"};
        System.out.println(concatenate(array1));
        Character[] array2 = {'J', 'A', 'V', 'A'};
        System.out.println(concatenate(array2));
        printArray(array2);
        Integer[] array3 = {1, 2, 3, 4, 5};
        System.out.println(calculateSum(array3));
    }

    public static <T> void printArray(T[] array){
        System.out.println(Arrays.toString(array));
    }

    public static <T extends Number> double calculateSum(T[] array){
        double sum = 0.0;
        for(T element : array){
            sum += element.doubleValue();
        }
        return sum;
    }

    public static String concatenate(String[] array){
        StringBuilder result = new StringBuilder();
        for(String str : array){
            result.append(str);
        }
        return result.toString();
    }

    public static <T> String concatenate(T[] array){
        StringBuilder result = new StringBuilder();
        for(T str : array){
            result.append(str.toString());
        }
        return result.toString();
    }

}
