package programs;

import java.util.HashMap;

public class DuplicateChars {

    public static String input = "Better butter";
    public static void main(String[] args) {
        findDuplicateCharsUsingHashMap();
    }

    static void findDuplicateCharsUsingHashMap() {

        char[] inputCharArr = input.replaceAll("\\s+", "").toCharArray();
        HashMap<Character, Integer> duplicateCharsStore = new HashMap<>();
        for(char ch : inputCharArr){

            if(duplicateCharsStore.containsKey(ch)){
                duplicateCharsStore.put(ch, duplicateCharsStore.get(ch)+1);
            } else {
                duplicateCharsStore.put(ch, 1);
            }
        }
        System.out.println(duplicateCharsStore);
        for( char ch : duplicateCharsStore.keySet()){
            if(duplicateCharsStore.get(ch) >= 1){
                System.out.println(ch+"="+duplicateCharsStore.get(ch));
            }
        }
    }

}
