package beforeJava8.features.oops;

public class _22_InstanceControlFlow {

    int x = 10;
    {
        m1();
        System.out.println("First Instance Block");
    }

    _22_InstanceControlFlow(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {

        /*
            Instance Control Flow
            =====================
            Whenever we are executing a Java class, first static control flow will be executed.
            If we are creating an object, then the following sequence of the events will be
            executed as part of the Instance Control Flow.
            1.	Identification of Instance members from top to bottom.
            2.	Execution of Instance variables assignments and instance blocks from top to bottom.
            3.	Execution of Constructor.
        */

        _22_InstanceControlFlow object = new _22_InstanceControlFlow();
        System.out.println("Main Method");

        /*
            Note:
            =====
            Static control flow is one time activity and which will be performed at the time
            of class loading. But the Instance control flow is not one time activity and, it
            will be performed for every object creation. Object creation is the costliest
            operation, if there is no specific requirement then it’s not recommended to create
            an object.
        */
    }

    public void m1() {
        System.out.println(y);
    }

    {
        System.out.println("Second Instance Block");
    }
    int y = 200;
}
