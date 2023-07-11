package java7andbelow.features.interfaces;

public class _05_Interface_Method_NamingConflicts {

    public static void main(String[] args) {

        /*
            Interface Naming Conflicts
            ==========================
            Case1: If two interfaces contain a method with the same signature and same return type,
                   then in implementation class we have to provide the implementation for only one
                   method.

            Case2: If two interfaces contain a method with the same name but different argument types,
                   then in the implementation class, we have to provide the implementation for both
                   methods and these methods acts as overloaded methods.

            Case3: If two interfaces contain a method with the same signature but different return
                   types then it’s impossible to implement both interfaces simultaneously (If return
                   types are not covariant).
        */
    }
}

interface Left {

    void case1();
    void case2();
    void case3();
}

interface Right {
    void case1();
    void case2(int i);

    // int case3();
}

class Test implements Left, Right {

    @Override
    public void case1() {

    }

    @Override
    public void case2(int i) {

    }

    @Override
    public void case2() {

    }

    @Override
    public void case3() {

    }

    // @Override
    // public void case3() { - Test is not abstract and does not override abstract method case3()
    // }
}