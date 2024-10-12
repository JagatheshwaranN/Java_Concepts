package java.features.oops;

public class _31_Constructor_CaseStudies {

    public static void main(String[] args) {

        /*
            Case 1
            ======
            We can take super () or this () only in first line of the constructor.
            If we are trying to take anywhere else, we will get the compile time error.

            Case 2
            ======
            Within the Constructor, we can take either super () or this () but not both
            of them simultaneously.

            Case 3
            ======
            We can use super () or this () only inside the Constructor. If we are trying
            to use outside the constructor, we will get the compile time error. i.e., we
            can call a constructor directly from another constructor only.
        */

        /*
            Super () / This () Conclusion
            =============================
            1.	We can use only in constructor
            2.	We can use only in first line
            3.	We can use only one and not both at a time

            Super ()/This () vs Super/This
            ==============================
            Super () / This ()
            ==================
            1. These are constructor calls to call super class and current class constructors
            2. We can use only in constructors as first line
            3. We can use only once in constructor

            Super / This
            ============
            1. These are keywords to refer to super class and current class instance members
            2. We can use anywhere except static area
            3. We can use any number of times

            Example,
            class Test {
            public static void main (String[] args) {
            SOP (super.hascode());
            }
            }
            CE: Non-Static variable super cannot be referenced from a static context
        */
    }
}

class Case1Demo {
    Case1Demo(){
        System.out.println("constructor");
        // super(); - call to super must be first statement in constructor
    }
}

class Case2Demo {
    Case2Demo() {
        super();
        // this(); - call to this must be first statement in constructor
    }
}

class Case3Demo {
    public void method1(){
        // super(); - call to super must be first statement in constructor
        System.out.println("Method");
    }
}