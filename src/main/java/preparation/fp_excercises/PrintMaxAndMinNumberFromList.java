package preparation.fp_excercises;

import java.util.List;

public class PrintMaxAndMinNumberFromList {

    public static void main(String[] args) {
        List<Integer> input = List.of(5, 2, 14, 17, 16, 12, 11, 7);
        System.out.println(printMaxNumberFromListType1(input));
        System.out.println(printMaxNumberFromListType2(input));
        System.out.println(printMinNumberFromListType1(input));
        System.out.println(printMinNumberFromListType2(input));
    }

    private static int printMaxNumberFromListType1(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE, PrintMaxAndMinNumberFromList::findMax);
    }

    private static int findMax(int aggregate, int nextNumber){
        // return aggregate > nextNumber ? aggregate : nextNumber;
        return Math.max(aggregate, nextNumber);
    }

    private static int printMaxNumberFromListType2(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x: y);
    }

    private static int printMinNumberFromListType1(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE, PrintMaxAndMinNumberFromList::findMin);
    }

    private static int findMin(int aggregate, int nextNumber){
        // return aggregate > nextNumber ? aggregate : nextNumber;
        return Math.min(aggregate, nextNumber);
    }

    private static int printMinNumberFromListType2(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x > y ? y: x);
    }

}
