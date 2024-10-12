package java.features.oops;

public class _23_InstanceControlFlow_Parent {

    int i = 10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }

    _23_InstanceControlFlow_Parent(){
        System.out.println("Parent Constructor");
    }
    public static void main(String[] args) {

        /*
            Instance Control Flow in Parent to Child Relation
            =================================================
            Whenever we are creating the child class object, the following sequence of events will
            be performed automatically as part of the Instance control flow.
            1.	Identification of Instance members from Parent to Child
            2.	Execution of Instance variables assignments and Instance blocks only in Parent class
            3.	Execution of Parent constructor
            4.	Execution of Instance variables assignments and Instance blocks only in Child class
            5.	Execution of Child constructor
        */

        _23_InstanceControlFlow_Parent parent = new _23_InstanceControlFlow_Parent();

        System.out.println("Parent Main Method");
    }

    public void m1(){
        System.out.println(j);
    }

    int j = 20;
}
