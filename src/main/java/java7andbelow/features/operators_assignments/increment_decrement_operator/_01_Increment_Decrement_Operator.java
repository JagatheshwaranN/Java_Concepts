package java7andbelow.features.operators_assignments.increment_decrement_operator;

public class _01_Increment_Decrement_Operator {

    public static void main(String[] args) {

        /*
            In Java, we have two types of increment and decrement operators as pre-increment & decrement and
            post-increment & decrement operators.
        */
        int x1 = 10;
        int y1 = ++x1;
        System.out.println(x1); // 11
        System.out.println(y1); // 11

        int x2 = 10;
        int y2 = x2++;
        System.out.println(x2); // 11
        System.out.println(y2); // 10

        int x3 = 10;
        int y3 = --x3;
        System.out.println(x3); // 10
        System.out.println(y3); // 9

        int x4 = 10;
        int y4 = x4--;
        System.out.println(x4); // 9
        System.out.println(y4); // 10
    }
}
