package java.features.oops;

public class _21_StaticControlFlow_Parent_Demo {

    static int i = 10;

    static{
        m1();
        System.out.println("Parent Static Block");
    }

    public static void main(String[] args) {

        /*
            Static Control Flow in Parent to Child Relation
            ===============================================
            Whenever we are executing the child class, the following sequence of events will
            be executed as part of the static control flow.
            1.	Identification of static members from parent to child.
            2.	Execution of static variables assignments and static blocks from parent to child.
            3.	Execution of child main method only.
        */

        /*
            Note:
            =====
            Whenever we are loading the child class, automatically parent class will be loaded.
            But whenever we are loading the parent class, the child class will not be loaded.
            Because the parent class members by default available to the child class whereas the
            child class members will not be available to the parent class.
        */

        m1();
        System.out.println("Parent Main Method");
    }

    public static void m1(){
        System.out.println(j);
    }

    static int j = 20;
}
