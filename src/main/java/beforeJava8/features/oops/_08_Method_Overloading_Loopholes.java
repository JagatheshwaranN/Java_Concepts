package beforeJava8.features.oops;

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
            While resolving the overloaded methods, compiler will give precedence to the Child type argument
            when compared to the Parent type argument.

            Case 3: Child Priority

            Case 4: Argument Type Conversion

            Case 5: Var Arg Method
            ======================
            In general, Var Arg method will get the least priority i.e., if no other methods matched
            then only Var Arg method will get the chance. It’s exactly same as default case inside switch.

            Case 6: Reference Type Precedence
            =================================
            In overloading, the method resolution is always takes care by compiler based on the reference
            type. In Overloading, runtime object won’t play any role.
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

        MOCase3Demo moCase3Demo = new MOCase3Demo();
        moCase3Demo.mocdMethod("Java");
        moCase3Demo.mocdMethod(new StringBuffer("Java"));
        // moCase3Demo.mocdMethod(null); - reference to mocdMethod is ambiguous

        MOCase4Demo moCase4Demo = new MOCase4Demo();
        moCase4Demo.mocdMethod(10,10.5f);
        moCase4Demo.mocdMethod(10.5f,10);
        // moCase4Demo.mocdMethod(10.5f,10.5f); - no suitable method found for mocdMethod(float,float)
        // moCase4Demo.mocdMethod(10,10); - reference to mocdMethod is ambiguous

        MOCase5Demo moCase5Demo = new MOCase5Demo();
        moCase5Demo.mocdMethod();
        moCase5Demo.mocdMethod(10, 20);
        moCase5Demo.mocdMethod(10);

        MOCase6Demo moCase6Demo = new MOCase6Demo();
        Automobile automobile = new Automobile();
        Car car = new Car();
        Automobile car1 = new Car();
        moCase6Demo.mocdMethod(automobile);
        moCase6Demo.mocdMethod(car);
        moCase6Demo.mocdMethod(car1);
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

class MOCase3Demo {
    public void mocdMethod(String s){
        System.out.println("String Argument");
    }
    public void mocdMethod(StringBuffer s){
        System.out.println("StringBuffer Argument");
    }
}

class MOCase4Demo {
    public void mocdMethod(int i, float f){
        System.out.println("Int Float Argument Method");
    }
    public void mocdMethod(float f, int i){
        System.out.println("Float Int Argument Method");
    }
}

class MOCase5Demo {
    public void mocdMethod(int i){
        System.out.println("Int Argument Method");
    }
    public void mocdMethod(int... i){
        System.out.println("Var Arg Method");
    }
}

class Automobile {

}
class Car extends Automobile {

}
class MOCase6Demo {
    public void mocdMethod(Automobile am){
        System.out.println("Automobile Method");
    }
    public void mocdMethod(Car c){
        System.out.println("Car Method");
    }
}