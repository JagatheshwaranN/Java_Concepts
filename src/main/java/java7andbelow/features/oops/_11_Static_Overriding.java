package java7andbelow.features.oops;

public class _11_Static_Overriding {

    public static void main(String[] args) {

        /*
            Static Overriding
            =================
            1.	We can’t override a static method as non-static method. Otherwise, we will get
                the compile time error.

            2.	We can’t override a non-static method as static method. Otherwise, we will get
                the compile time error.

            3.	If both Parent and Child class methods are static. Then, we won’t get any compile
                time error. It seems the overriding method is applicable for Static methods.
                But it's not overriding, its actually method hiding.
        */
    }
}

class SORule1Demo {
    public static void method1(){
    }
}

class SORule1ChildDemo extends SORule1Demo {
    // java: method1() in java7andbelow.features.oops.SORule1ChildDemo cannot override method1()
    // in java7andbelow.features.oops.SORule1Demo
    // overridden method is static
    // public void method1(){
    // }
}

class SORule2Demo {
    public void method1(){
    }
}

class SORule2ChildDemo extends SORule2Demo {
    // java: method1() in java7andbelow.features.oops.SORule2ChildDemo cannot override method1()
    // in java7andbelow.features.oops.SORule2Demo
    // overriding method is static
    // public static void method1(){
    // }
}

class SORule3Demo {
    public static void method1(){
    }
}

class SORule3ChildDemo extends SORule3Demo {
    public static void method1(){
    }
}
