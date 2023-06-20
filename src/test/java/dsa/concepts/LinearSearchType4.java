package dsa.concepts;

public class LinearSearchType4 {

    public static void main(String[] args) {

        char[] characters = {'b', 'c', 'z', 'f', 'd', 'j', 'k'};
        boolean result = linearSearch(characters, 'd');
        System.out.println(result);
        result = linearSearch(characters, 'd');
        System.out.println(result);
        result = linearSearch(characters, 'b');
        System.out.println(result);
        result = linearSearch(characters, 'k');
        System.out.println(result);
        result = linearSearch(characters, 'A');
        System.out.println(result);
    }

    private static boolean linearSearch(char[] arr, char target){

        if(arr.length == 0){
            return false;
        }

        for(char element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
