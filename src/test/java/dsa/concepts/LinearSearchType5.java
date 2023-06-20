package dsa.concepts;

public class LinearSearchType5 {

    public static void main(String[] args) {

        String value = "Racing";
        char target = 'c';
        System.out.println(linearSearch1(value, target));
        target = 'R';
        System.out.println(linearSearch1(value, target));
        target = 'g';
        System.out.println(linearSearch1(value, target));
        target = 'A';
        System.out.println(linearSearch1(value, target));
        target = 'R';
        System.out.println(linearSearch2(value, target));
        target = 'g';
        System.out.println(linearSearch2(value, target));
        target = 'A';
        System.out.println(linearSearch2(value, target));
    }

    private static boolean linearSearch1(String data, char target){

        if(data.length() == 0){
            return false;
        }

        for(int index = 0; index < data.length(); index++){
            if(data.charAt(index) == target){
                return true;
            }
        }

        return false;
    }

    private static boolean linearSearch2(String data, char target){

        if(data.length() == 0){
            return false;
        }

        for(char ch : data.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
