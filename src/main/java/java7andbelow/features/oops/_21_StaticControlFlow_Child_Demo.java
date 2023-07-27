package java7andbelow.features.oops;

public class _21_StaticControlFlow_Child_Demo extends _21_StaticControlFlow_Parent_Demo {

    static int x = 100;

    static {
        m2();
        System.out.println("Child's First Static Block");
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

        m2();
        System.out.println("Child Main Method");
    }

    public static void m2(){
        System.out.println(y);
    }

    static {
        System.out.println("Child's Second Static Block");
    }

    static int y = 200;
}
