package java7andbelow.features.garbage_collection;

public class _04_Finalization {

    public static void main(String[] args) {

        /*
            Finalization
            ============
            Just before destroying an object, GC calls finalize() method to perform
            cleanup activities. Once, finalize() method completes, automatically GC
            destroys that object. finalize() method present in the object class with
            the following declaration:

            protected void finalize() throws throwable;

            We can override the finalize() method in our class to define our own cleanup
            activities.

            Case Scenarios
            ==============
            Case 1
            ======
            Just before destroying an object, GC calls finalize() method which is eligible
            for GC. Then the corresponding class finalize() method will be executed.
            For example, if a String object is eligible for GC, then String class finalize()
            method will be executed but not Test class finalize() method.
        */
    }
}

/*
    In the below example, a String object is eligible for GC and hence String class
    finalize () method is executed which has empty implementation.

    The output, in this case, will be
    End of Main

    If we replace a String object with a Test object, then the Test class finalize()
    method will be executed. In this case, the output is.

    End of Main
    Finalize method called
    Or
    Finalize method called
    End of Main
*/
class Case1Demo {

    public static void demo() {
        String s = new String("Java");
        s = null;
        System.gc();
        System.out.println("End of Main");
    }
//    public void finalize() {
//        System.out.println("Finalize Method Called");
//    }

}