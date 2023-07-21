package java7andbelow.features.oops;

public class _13_Overriding_WRT_VarArg_Variables {
    public static void main(String[] args) {

        /*
            Overriding WRT Var Arg Method
            =============================
            We can override the Var Arg method with another Var Arg method only. If we are trying
            to override with normal method then it will become the overloading but not overriding.
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