package java7andbelow.features.oops;

public class _08_Method_Overloading_Loopholes {

    public static void main(String[] args) {

        /*
            Loopholes
            =========
            Case 1: Automatic promotion in overloading
            ==========================================
            While resolving the overloaded methods, if exact match method is not available then we won’t
            get any compile time error immediately. First, it will promote argument to the next level and
            check for match method is available or not. If match method is available, then it will be
            considered else if match method is not available, then the compiler promotes the argument once
            again to the next level. This process will be continued until all possible promotions still if
            the match method is not available then we will get the compile time error.

            Byte -> Short -> Int -> Long -> Float -> Double
                    Char

            Case 2: Child Priority when compete with Parent
            ===============================================
            While resolving the overloaded methods, compiler will give precedence to Child type argument
            when compared to Parent type argument.
        */
        MOCase1Demo moCase1Demo = new MOCase1Demo();
        moCase1Demo.modMethod1(10);
        moCase1Demo.modMethod1(10.5f);
        moCase1Demo.modMethod1('a');
        moCase1Demo.modMethod1(10L);
        // moCase1Demo.modMethod1(10.5); - no suitable method found for modMethod1(double)

        MOCase2Demo moCase2Demo = new MOCase2Demo();
        moCase2Demo.mocdMethod("Java");
        moCase2Demo.mocdMethod(new Object());
        moCase2Demo.mocdMethod(null);




    }
}

class MOCase1Demo{

    public void modMethod1(){
        System.out.println("No Arg Method");
    }

    public void modMethod1(int i){
        System.out.println("Int Arg Method");
    }

    public void modMethod1(float f){
        System.out.println("Float Arg Method");
    }
}

class MOCase2Demo {
    public void mocdMethod(String s){
        System.out.println("String Argument");
    }

    public void mocdMethod(Object o){
        System.out.println("String Argument");
    }
}