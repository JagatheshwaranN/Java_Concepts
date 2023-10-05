package java7andbelow.features.lang_package;

public class _16_Autoboxing_Widening_VarArgMethod {

    public static void main(String[] args) {

        /*
            Overloading WRT Autoboxing, Widening, and Var Arg Methods
            =========================================================
            Case1: Autoboxing vs Widening
            =============================
            In this case, the Widening concept gets priority than the Autoboxing.
            Fun fact: Widening has 23 years of Java industry experience compared to Autoboxing.

            Case2: Widening vs Var Arg method
            =================================
            In this case, the Widening concept gets priority than the VarArg method.
            Fun fact: Widening has 23 years of Java industry experience compared to VarArg method.

            Case3: Autoboxing vs Var Arg method
            ===================================
            In this case, Autoboxing dominates the VarArg method. In general, VarArg method will get
            the least priority i.e., if no other method is matched then only the VarArg method will
            get the chance and its exactly same as default case inside switch.

            Note:
            =====
            While resolving overloaded methods, compiler will always give the precedence in the
            following order,
            1.	Widening
            2.	Autoboxing
            3.	VarArg methods

            Case4: Widening -> Autoboxing Not allowed
            =========================================
            Widening -> Autoboxing => Not allowed in Java

            Case5: Autoboxing -> Widening allowed
            =====================================
            Int -> Integer  -> Object
            Autoboxing -> Widening => Allowed in Java.
            Object o = 10;
            Number n = 10;
        */

        AutoboxingWideningDemo.method1(10);
        VarArgWideningDemo.method1(10);
        AutoboxingVarArgDemo.method1(10);
        // WideningAutoboxingDemo.method1(10); - incompatible types: int cannot be converted to java.lang.Long
        AutoboxingWideningAllowedDemo.method1(10);
    }
}

class AutoboxingWideningDemo {

    public static void method1(Integer i1){
        System.out.println("Autoboxing");
    }

    public static void method1(long l1){
        System.out.println("Widening");
    }
}

class VarArgWideningDemo {

    public static void method1(int... i1){
        System.out.println("VarArg Method");
    }

    public static void method1(long l1){
        System.out.println("Widening");
    }
}

class AutoboxingVarArgDemo {

    public static void method1(Integer i1){
        System.out.println("Autoboxing");
    }

    public static void method1(int... i1){
        System.out.println("VarArg Method");
    }
}

class WideningAutoboxingNotAllowedDemo {

    public static void method1(Long l1){
        System.out.println("Widening");
    }
}

class AutoboxingWideningAllowedDemo {

    public static void method1(Object o1){
        System.out.println("Object " + o1);
    }
}