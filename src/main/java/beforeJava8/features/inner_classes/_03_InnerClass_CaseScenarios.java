package beforeJava8.features.inner_classes;

@SuppressWarnings("ALL")
public class _03_InnerClass_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: Accessing Inner Class code from static area of Outer Class
            ==================================================================
        */
        // Type 1
        _03_InnerClass_CaseScenarios outer1 = new _03_InnerClass_CaseScenarios();
        _03_InnerClass_CaseScenarios.Case1Inner1 inner1 = outer1.new Case1Inner1();
        inner1.method1();
        // Type 2
        _03_InnerClass_CaseScenarios.Case1Inner1 inner2 = new _03_InnerClass_CaseScenarios().new Case1Inner1();
        inner2.method1();
        // Type 3
        new _03_InnerClass_CaseScenarios().new Case1Inner1().method1();

        /*
            Case 2: Accessing Inner Class code from instance area of Outer Class
            ====================================================================
        */
        _03_InnerClass_CaseScenarios outer2 = new _03_InnerClass_CaseScenarios();
        outer2.new Case2Inner2().method2();

        /*
            Case 3: Accessing Inner Class code from outside of Outer Class
            ==============================================================
        */
        Case3Outer3 outer3 = new Case3Outer3();
        Case3Outer3.Case3Inner3 inner3 = outer3.new Case3Inner3();
        inner3.method1();

        /*
            Case 4: Accessing members of Outer from Inner Class
            ===================================================
            From Normal / Regular Inner Class, we can access both static and non-static members
            of Outer Class directly.
        */
        Case4Outer4 outer4 = new Case4Outer4();
        Case4Outer4.Case4Inner4 inner4 = outer4.new Case4Inner4();
        inner4.method1();

        /*
            Case 5: Access Members from Outer / Inner Classes
            =================================================
            Within the Inner Class this always refers the current Inner Class object. If we want to
            refer current Outer Class object, we have to use OuterClassName.this keyword.
        */
        Case5Outer5 outer5 = new Case5Outer5();
        Case5Outer5.Case5Inner5 inner5 = outer5.new Case5Inner5();
        inner5.method1();
    }
        class Case1Inner1 {

            public void method1(){
                System.out.println("Case1Inner1 class method1");
            }
        }

        class Case2Inner2 {

            public void method1(){
                System.out.println("Case2Inner2 class method1");
            }

            public void method2(){
                _03_InnerClass_CaseScenarios.Case2Inner2 inner2 = new _03_InnerClass_CaseScenarios.Case2Inner2();
                inner2.method1();
            }
        }

}

class Case3Outer3 {

    class Case3Inner3 {

        public void method1(){
            System.out.println("Case3Inner3 class method1");
        }
    }
}

class Case4Outer4 {

    int x = 10;
    static int y = 20;

    class Case4Inner4 {

        public void method1(){
            System.out.println(x);
            System.out.println(y);
        }
    }
}

class Case5Outer5 {

    int x = 10;

    class Case5Inner5 {

        int x = 100;
        public void method1(){

            int x = 1000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Case5Inner5.this.x);
            System.out.println(Case5Outer5.this.x);
        }
    }
}