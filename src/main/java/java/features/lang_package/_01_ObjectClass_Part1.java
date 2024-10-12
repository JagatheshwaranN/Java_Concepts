package java.features.lang_package;

public class _01_ObjectClass_Part1 {

    public static void main(String[] args) {

        /*
            Introduction
            ============
            For writing any java program whether it's simple or complex, the mostly commonly
            required classes and interfaces are grouped into a separate package is called as
            java.lang package.

            We are not required to import the java.lang package explicitly because all classes
            and interfaces present in lang package by default available to every java program.

            Object Class
            ============
            The most commonly required methods for every java class (whether it's predefined or
            customized class) are defined in a separate class is called as Object Class.

            Every class in java is a child class of object either directly or indirectly. So, that
            object class method by default available to every java class. Hence, object class is
            considered as root of all java classes.

            Note
            ====
            1.	If our class doesn't extend any other class then only our class is direct child
                class of object.
                class A {}

            2.	If our class extends any other class then our class is indirect child class of
                object.
                class A extends B {} - Here, B is parent of A and Object is parent of B.

            3.	Either directly / indirectly Java won't provide support for multiple inheritance
                with respect to classes.

            Object class defines the following 11 methods,
            ==============================================
            1.	public string toString()
            2.	public native int hashCode()
            3.	public boolean equals(Object o)
            4.	protected native object clone() throws CloneNotSupportedException
            5.	protected void finalize() throws Throwable
            6.	public final Class getClass()
            7.	public final void wait() throws InterruptedException
            8.	public final native void wait(long ms) throws InterruptedException
            9.	public final void wait(long ms, int ns) throws InterruptedException
            10.	public final native void notify()
            11.	public final native void notifyAll()

            Note:
            =====
            Strictly speaking object class contains 12 methods. The extra method is registerNatives().
            private static native void registerNatives()

            This method internally required for object class and not available to the child class.
            Hence, we are not required to consider this method.
        */
    }
}
