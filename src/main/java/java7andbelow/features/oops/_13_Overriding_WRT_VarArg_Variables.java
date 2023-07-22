package java7andbelow.features.oops;

public class _13_Overriding_WRT_VarArg_Variables {
    public static void main(String[] args) {

        /*
            Overriding WRT Var Arg Method
            =============================
            We can override the Var Arg method with another Var Arg method only. If we are trying
            to override with normal method then it will become the overloading but not overriding.
        */

        /*
            Overriding WRT Variables
            ========================
            Variable resolution always takes care by compiler based on the reference type irrespective
            of whether the variable is static or non-static. Overriding concept applicable only for
            methods but not for variables.

            P-> Non-static, C-> Non-static
            10
            20
            10

            P-> Static, C-> Non-static
            10
            20
            10

            P-> Non-static, C-> Static
            10
            20
            10

            P-> Static, C-> Static
            10
            20
            10
        */

        // Method Overloading
        VarArgOR1Parent parent1 = new VarArgOR1Parent();
        parent1.method(10);
        VarArgORCase1Child child1 = new VarArgORCase1Child();
        child1.method(10);
        VarArgOR1Parent parent2 = new VarArgORCase1Child();
        parent2.method();
        // Method Overriding
        VarArgOR1Parent parent3 = new VarArgOR1Parent();
        parent3.method(10);
        VarArgORCase2Child child2 = new VarArgORCase2Child();
        child2.method(10);
        VarArgOR1Parent parent4 = new VarArgORCase2Child();
        parent4.method();

        VarORParent parent5 = new VarORParent();
        System.out.println(parent5.x);
        VarORChild child = new VarORChild();
        System.out.println(child.x);
        VarORParent parent6 = new VarORChild();
        System.out.println(parent6.x);

    }
}

class VarArgOR1Parent {
    public void method(int... i){
        System.out.println("Parent - Var Arg Method");
    }
}

class VarArgORCase1Child extends VarArgOR1Parent {
    public void method(int i){
        System.out.println("Child - Var Arg Method");
    }
}

class VarArgORCase2Child extends VarArgOR1Parent {
    public void method(int... i){
        System.out.println("Child - Var Arg Method");
    }
}

class VarORParent {
    int x = 10;
}

class VarORChild extends VarORParent {
    int x = 20;
}