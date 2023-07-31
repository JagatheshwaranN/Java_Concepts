package java7andbelow.features.oops;

public class _32_Overloaded_Constructors {

    public static void main(String[] args) {

        /*
            Overloaded Constructors
            =======================
            Within a class, we can declare the multiple constructors and all these constructors
            having same name but different type of arguments. Hence, all these constructors are
            considered as Overloaded Constructors.
        */

        OLConstructorDemo object1 = new OLConstructorDemo();
        OLConstructorDemo object2 = new OLConstructorDemo(10);
        OLConstructorDemo object3 = new OLConstructorDemo(10.5);
        OLConstructorDemo object4 = new OLConstructorDemo(10L);

        /*
            Note:
            =====
            1.	For constructors, inheritance and overriding concepts are not applicable
                but overloading concept is applicable. (The constructor of parent class is
                not available to Child class. Hence, inheritance is not applicable. Since,
                the parent class constructor is not available to child, there is no possibility
                of overriding.)

            2.	Every class in java including abstract class can contain constructor but interface
                cannot contain constructor.
        */


    }
}

class OLConstructorDemo {

    OLConstructorDemo(){
        this(10);
        System.out.println("No Arg Constructor");
    }

    OLConstructorDemo(int i){
        this(10.5);
        System.out.println("Int Arg Constructor");
    }

    OLConstructorDemo(double d){
        System.out.println("Double Arg Constructor");
    }
}

class NormalClassDemo {
    NormalClassDemo(){
    }
}

abstract  class AbstractClassDemo {
    AbstractClassDemo(){
    }
}

interface InterfaceDemo {
//    InterfaceDemo(){ -  <identifier> expected
//    }
}