package java.features.language_fundamentals.main_method;

public class _02_Main_Functional_Things_To_Remember {

    public static void main(String... param) {

        /*
            Points to Remember
            ==================
            1.	Overloading of the main method is possible. But the JVM is always call String[] args main method only.
                The other overloaded method can be called explicitly like normal method call.
                class Test {
                public static void main(String[] args){
                SOP("String array");
                }
                public static void main(int[] args){
                SOP("Int array");
                }
                }

            2.	Inheritance concept is applicable for main method. Hence, while executing the child class, if child
                class does not have the main method, then parent class main method will be executed.
                class Parent {
                public static void main(String[] args){
                SOP("Parent Main");
                }
                }
                class Child extends Parent {
                }

            3.	It seems overriding concept applicable for main method. But it is not overriding its method hiding.
                class Parent {
                public static void main(String[] args){
                SOP("Parent Main");
                }
                }
                class Child extends Parent {
                public static void main(String[] args){
                SOP("Child Main");
                }
                }

            4.	For main method, overloading and inheritance concepts are applicable. But method overriding is not
                applicable instead method hiding is applicable.
        */
    }
}
