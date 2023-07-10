package java7andbelow.features.interfaces;

public class _02_Interface_Declare_Implementation {

    public static void main(String[] args) {

        /*
            Declaration & Implementation
            ============================
            1.	Whenever we are implementing the interface, for each and every method of the interface,
                we have to provide the implementation otherwise we have to declare the class as Abstract.
                The next level child class is responsible to provide the implementation.

            2.	Every interface method is always public and abstract whether we are declaring or not.
                Hence, whenever we are implementing the interface method compulsory, we should declare
                it as public otherwise we will get the compile time error.
        */
    }
}

interface IDemo1 {
    void method1();
    void method2();
}

abstract class ServiceProvider1 implements IDemo1 {

    @Override
    public void method1() {

    }
}

class SubServiceProvider extends ServiceProvider1 {

    @Override
    public void method2() {

    }
}
