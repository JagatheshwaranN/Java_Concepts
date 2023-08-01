package java7andbelow.features.oops;

import java.io.IOException;

public class _33_Constructor_CaseStudies {

    public static void main(String[] args) {

        /*
            Case Studies
            ============
            Case 1: Recursive Constructor Call
            ===================================
            Recursive method call is a runtime exception saying Stack Overflow error.
            But, in our program, if there is a chance of recursive constructor invocation,
            then the code won’t compile, and we will get the compile time error.

            Case 2: Importance of No Arg Constructor
            ========================================
            If parent class contains any argument constructor, then while writing the child
            class we have to take special care with respect to constructor. Whenever we are
            writing any argument constructor, then it's highly recommended to write the No Arg
            constructor.

            Case 3: Handle Exception
            ========================
            If Parent class constructor throws any checked exception compulsory the Child class
            exception should throw same checked exception or its parent. Otherwise, the code
            won’t compile.
        */
    }
}

class RCCDemo {

//    RCCDemo() { - recursive constructor invocation
//        this(10);
//    }

//    RCCDemo(int i) { - recursive constructor invocation
//        this();
//    }
}

class Parent1 {
}

class Child1 extends Parent1 {
}

class Parent2 {
    Parent2(){
    }
}

class Child2 extends Parent2 {
}

class Parent3 {
    Parent3(int i){
    }
}

// class Child3 extends Parent3 { - There is no default constructor available in 'java7andbelow.
// features.oops.Parent3' java: constructor Parent3 in class java7andbelow.features.oops.Parent3
// cannot be applied to given types;
//    required: int
//    found:    no arguments
//    reason: actual and formal argument lists differ in length
// }

class HEParentCaseDemo {
    HEParentCaseDemo () throws IOException {
    }
}

// class HEChildClassDemo extends HEParentCaseDemo {
    // unreported exception java.io.IOException in default constructor
// }