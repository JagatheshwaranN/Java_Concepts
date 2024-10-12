package java.features.interfaces;

public class _06_MarkerInterface_AdapterClass {

    public static void main(String[] args) {

        /*
            Marker Interface
            ================
            If an Interface does not contain any methods and by implementing that Interface if our objects will
            get some ability. Such type of Interfaces is as called as Marker Interface. The below Interfaces are
            marked with some ability.

            Example,

            Serializable(I)
            ===============
            By implementing Serializable Interface, our object can be saved to the file and can travel across
            the network.

            Cloneable(I)
            ============
            By implementing Cloneable Interface, our objects in a position to produce exactly the duplicate
            cloned objects.

            RandomAccess(I)

            SingleThreadModel(I)

            QQ: Without having any methods, how the objects will get ability in Marker Interfaces?

            Internally JVM is responsible to provide the required ability.

            QQ: Why JVM is providing the required ability in Marker Interfaces?

            To reduce the complexity of the programming and to make the Java language as simple.

            QQ: Is it possible to create own Marker Interface?

            Yes. We can create but customization of JVM is required.
        */

        /*
            Adapter Classes
            ===============
            Adapter class is a simple java class that implements an interface with empty implementation only.

            If we implement an interface then for each and every method of that interface, compulsory we should
            provide the implementation whether it’s required or not required.

            The problem in this approach is, it increases the length of the code and reduces the readability.
            We can solve this problem by using the Adapter classes. Instead of implementing the interface if
            we extend adapter class, we have to provide implementation for required methods, and we are not
            responsible to provide the implementation for every method of the interface. So, that the length
            of the code is reduced.

            Examples of Adapter class
            =========================
            We can develop a servlet in the following three ways,
            1.	By implementing the Servlet interface
            2.	By extending the Generic Servlet
            3.	By extending the HTTP Servlet

            If we implement the servlet interface, for each and every method of that interface, we should provide
            the implementation. It increases the length of the code and reduces the readability. Instead of
            implementing the servlet interface directly. If we extend the Generic Servlet, we have to provide the
            implementation only for service method and for all remaining methods we are not required to provide
            the implementation. Hence, more or less the Generic Servlet acts as Adapter Class for Servlet Interface.

            Note: Marker interfaces and Adapter classes simplifies the complexity of the programming and these
                  are the best utilities to the programmer and using this, the Programmer’s life will become
                  simple.
        */
    }
}

interface IDemo7 {

    void m1();
    void m2();
    void m3();
}

abstract class Adapter implements IDemo7 {
    @Override
    public void m1() {

    }
    @Override
    public void m2() {

    }
    @Override
    public void m3() {

    }
}

class Implementer extends Adapter {
    @Override
    public void m1() {
        //super.m1();
        System.out.println("Benefit of Adapter Class");
    }
}