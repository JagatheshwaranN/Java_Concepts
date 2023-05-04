package java17.feature.instanceOf.switch_exp;

public class _01_Switch_Exp_InstanceOf_Demo1 {

    public static void main(String[] args) {
        System.out.println(formatString("Java 17"));
        System.out.println(formatString(17));
    }

    private static String formatString(Object obj){
        return switch(obj){
            case Integer i -> String.format("Int %d", i);
            case String s -> String.format("String %s", s);
            default -> obj.toString();
        };
    }
}
