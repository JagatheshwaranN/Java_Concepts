package java7andbelow.features.language_fundamentals.variables;

public class _07_Local_Variable_Demo {

    public static void main(String[] args) {

        // private int i5 = 10; - illegal start of expression
        // public int i6 = 20; - illegal start of expression
        final int i7 = 30;
        System.out.println(i7);

        _07_Local_Variable_Demo.insideLoopDemo();
        _07_Local_Variable_Demo.insideTryCatch();
        _07_Local_Variable_Demo.variableNotInitDemo();
        _07_Local_Variable_Demo.insideConditionalStatementDemo(args);
        _07_Local_Variable_Demo.insideConditionalStatementDemo1(args);
    }

    public static void insideLoopDemo(){
        int i1 = 0;
        for (int j1 = 0; j1 < 2; j1++){
            i1 = i1+j1;
        }
         // System.out.println(i1+" ---- "+j1); - cannot find symbol - variable j1
    }

    public static void insideTryCatch() {
        try{
            int i2 = Integer.parseInt("ten");
        }catch(NumberFormatException npe){
        //    i2 = 10; - cannot find symbol - variable i2
        }
       // System.out.println(i2); - cannot find symbol - variable i2
    }

    public static void variableNotInitDemo(){
        int i3;
        // System.out.println(i3); - variable i3 might not have been initialized
    }

    public static void insideConditionalStatementDemo(String[] args){
        int i4;
        if(args.length > 0){
            i4 = 10;
        }
        // System.out.println(i4); - variable i4 might not have been initialized
    }

    public static void insideConditionalStatementDemo1(String[] args){
        int i4;
        if(args.length > 0){
            i4 = 10;
        }
        else {
            i4 = 20;
        }
        System.out.println(i4);
    }
}
