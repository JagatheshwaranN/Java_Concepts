package java7andbelow.features.oops;

public class _04_Multiple_Inheritance {

    public static void main(String[] args) {

        /*
            Multiple Inheritance
            ====================
            A java class can’t extend more than one class at a time. Hence, Java won’t provide the
            support for multiple inheritance in terms of class.
            Example,
            class A extends B, C {
            }

            Note: If our class does not extend any other class, then only our class is direct child
            class of the Object.
            class A {
            }

            If our class extends any other class, then our class is indirect child class of the Object.
            class A extends B {
            }
            A -> B -> Object => Multilevel Inheritance
        */

        /*
            QQ: Why Java won’t provide support for Multiple Inheritance?

            There may be a chance of the ambiguity problem. Hence, Java won’t provide the support
            for Multiple Inheritance.
            P1(m1()) 	P2(m1())

                   C.m1();

            Multiple Inheritance in Interface
            ==================================
            An Interface can extend any number of Interfaces simultaneously. Hence, Java provides the
            support for Multiple Inheritance with respect to the Interfaces.
        */
    }
}
