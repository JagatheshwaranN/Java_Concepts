package preparation.revise_1.mol;

public class Demo8 {

    public static void main(String[] ar){
        NonBase.add(1, 2);
        NonBase.add((Integer) 1, 2);
        NonBase.add(1, 2, 3);
    }

    static class Base {
        public static void add(int a, int b){
            System.out.println("Base - INT+INT ==> "+(a+b));
        }
    }

    static class NonBase extends Base {

        public static void add(Integer a, int b){
            System.out.println("NonBase - INTEGER+INT ==> "+(a+b));
        }

        public static void add(int a, int b, int c){
            System.out.println("NonBase - INT+INT+INT ==> "+(a+b+c));
        }
    }

}
