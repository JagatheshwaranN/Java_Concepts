package beforeJava8.features.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _07_RegularExpressionExampleSet1 {

    public static void main(String[] args) {

        MobileNumber.demo();
        Email.demo();

    }
}

class MobileNumber {

    static Pattern pattern;

    static Matcher matcher;

    public static void demo(){

        pattern = Pattern.compile("[7-9][0-9]{9}");
        matcher = pattern.matcher("9876543210");
        if(matcher.find() && matcher.group().equals("9876543210")){
            System.out.println("Valid 10 Digit Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        System.out.println("=====================================");
        pattern = Pattern.compile("0?[7-9][0-9]{9}");
        matcher = pattern.matcher("08976543210");
        if(matcher.find() && matcher.group().equals("08976543210")){
            System.out.println("Valid 11 Digit Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        System.out.println("=====================================");
        pattern = Pattern.compile("91?[7-9][0-9]{9}");
        matcher = pattern.matcher("917896543210");
        if(matcher.find() && matcher.group().equals("917896543210")){
            System.out.println("Valid 12 Digit Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        System.out.println("=====================================");
        pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        matcher = pattern.matcher("917896543210");
        if(matcher.find() && matcher.group().equals("917896543210")){
            System.out.println("Valid 12 Digit Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        matcher = pattern.matcher("07896543210");
        if(matcher.find() && matcher.group().equals("07896543210")){
            System.out.println("Valid 11 Digit Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        System.out.println("=====================================");
    }
}

class Email {

    static Pattern pattern;

    static Matcher matcher;

    public static void demo() {

        pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        matcher = pattern.matcher("test_auto.mate@gmail.com");
        if(matcher.find() && matcher.group().equals("test_auto.mate@gmail.com")){
            System.out.println("Valid Email Id");
        }else{
            System.out.println("Invalid Email Id");
        }
    }

}