package java.features.declaration_access_modifiers;

public class _15_Static_Modifiers_UseCases {

    public static void main(String[] args) {

        /*
            Static Modifiers - Use-cases
            ===========================
            1. Overloading concept is applicable for static methods including the MAIN method but JVM
               will always call String [] main method only.

            2. Inheritance concept is applicable for static methods including main method hence while
               executing the child class if child does not contain main method, then parent class main
               method will be executed.
                Example,
                File 1
                class Parent {
                public static void main (String [] args) {
                SOP ("Parent Main");
                }
                }
                File 2
                class Child extends Parent {
                }

            3. It seems overriding method concept is applicable for static methods, but it’s not method
               overriding, actually its method hiding.
               Example,
               File 1
               class Parent {
               public static void main (String [] args) {
               SOP ("Parent Main");
               }
               }

               File 2
               class Child extends Parent {
               public static void main (String [] args) {
               SOP ("Child Main");
               }
               }
        */
        System.out.println("Original Main");

        /*
            Note
            ====
            For static methods, overloading and inheritance concepts are applicable but overriding concept
            is not applicable. Instead of overriding, method hiding concept is applicable.
        */

        /*
            When to go for Instance and Static methods
            ==========================================
            1. Inside method implementation, if we are using at least one instance variable then that
               method talks about the particular object. Hence, we should declare the method as instance
               method.

            2. Inside method implementation, if we are not using any instance variable then this method
               does not talk about the object. Hence, we should declare the method as static method
               irrespective of that method having static variable or not.

            Example,
            class Student {
            String name;
            int rollno;
            Static String cname;
            getStudentInfo() { -> Have to declare as Instance method
            SOP (name + rollno);
            }
            getCollegeInfo() { -> Have to declare as Static method
            SOP (cname);
            }
            getCompleteInfo() { -> Have to declare as Instance method
            SOP (name + rollno + cname);
            }
            }

            Note:
            =====
            For static methods, implementation should be available whereas for abstract methods
            implementation will be not available. Hence, Static Abstract combination is illegal
            for methods.
        */
    }

    public static void main(int[] args) {
        System.out.println("Overloaded Main Method");
    }

}