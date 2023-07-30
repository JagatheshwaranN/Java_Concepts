package java7andbelow.features.oops;

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