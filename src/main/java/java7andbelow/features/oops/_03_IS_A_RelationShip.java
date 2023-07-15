package java7andbelow.features.oops;

public class _03_IS_A_RelationShip {

    public static void main(String[] args) {

        /*
            Is - A Relationship AKA (Inheritance)
            =====================================
            1.	It is also known as Inheritance.
            2.	The main advantage of Is A relationship is Code re-usability.
            3.	By using the extends keyword, we can implement Is A relationship.
        */

        Parent parent1 = new Parent();
        parent1.m1();
        // parent1.m2(); - cannot find symbol symbol:   method m2()

        Child child1 = new Child();
        child1.m1();
        child1.m2();

        Parent parent2 = new Child();
        parent2.m1();
        // parent2.m2(); - cannot find symbol symbol:   method m2()

        // Child child2 = new Parent(); - incompatible types: java7andbelow.features.oops.Parent
        // cannot be converted to java7andbelow.features.oops.Child

        /*
            Conclusion
            ==========
            1.	Whatever methods Child has by default not available to the Parent. Hence, on the Parent
                reference we can’t call the Child methods.

            2.	Whatever methods Parent has by default available to the Child. Hence, on the Child
                reference, we can call both Parent and Child class methods.

            3.	Parent reference can be used to hold the Child object but by using that reference we can’t
                call the Child methods. But we can call the Parent methods.

            4.	Parent reference can be used to hold the Child object. But Child reference can’t be used to
                hold the Parent object.
        */

        /*
            Note: Points about Inheritance
            ==============================
            The most common methods which are applicable for any type of child, we have to define in the Parent
            class. The specific methods which are applicable for a particular child, we have to define in the
            Child class.

            Total Java APIs is implemented based on the inheritance concept. The most common methods which are
            applicable for any Java object are defined in the Object class and hence every class in Java is child
            class of Object either directly or indirectly. So, that the Object class methods are available to
            every Java class. Due to this, Object class acts as the root for all Java classes.

            Throwable class defines the most common methods which are required for every exception and error
            classes. Hence, this class acts as root for the Java exception hierarchy.
        */
    }
}

class Parent{

    public void m1(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    public void m2(){
        System.out.println("Child Method");
    }
}

/*
    The below set of code is for without Inheritance scenario
*/

class VLoan {
    // 30 methods
}

class HLoan {
    // 30 methods
}

class PLoan{
    // 30 methods
}

/*
    The below set of code is for with Inheritance scenario
*/

class Loan {
    // 20 methods
}
class VLoan1 extends Loan {
    // 30 methods
}

class HLoan1 extends Loan {
    // 30 methods
}

class PLoan1 extends Loan {
    // 30 methods
}
