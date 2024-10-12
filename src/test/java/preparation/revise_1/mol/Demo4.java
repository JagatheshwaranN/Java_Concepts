package preparation.revise_1.mol;

public class Demo4 {

    public static void main(String[] ar){
        add((byte)1, (byte) 2);
        add((short)2, (short)3);
        add((short)3, 4);
        /*
            Here, the Byte value is converted into Short. (Widening)
            If we have match method, then the conversion will not happen.
        */
        add((byte)4, 5);
        /*
            Here, the Byte values and Short value are converted into Int. (Widening)
            If we have match method, then the conversion will not happen.
        */
        add((byte)5, (byte)6, (short)7);
    }

    public static void add(byte a, byte b){
        System.out.println("BYTE+BYTE ==> "+(a+b));
    }

    public static void add(short a, short b){
        System.out.println("SHORT+SHORT ==> "+(a+b));
    }

    public static void add(short a, int b){
        System.out.println("SHORT+INT ==> "+(a+b));
    }

   /*
        Temporarily commented
        =====================
        public static void add(byte a, int b){
        System.out.println("BYTE+INT ==> "+(a+b));
    }
    */

    public static void add(int a, int b, int c){
        System.out.println("INT+INT+INT ==> "+(a+b+c));
    }

}
