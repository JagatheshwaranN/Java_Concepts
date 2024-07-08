package beforeJava8.features.operators_assignments.instanceof_operator;

public class _01_InstanceOf_Operator {

    public static void main(String[] args) throws ClassNotFoundException {

        /*
            InstanceOf Operator
            ===================
            We can use instanceof operator to check whether the given object is of particular type or not.

            Syntax
            ======
            R instanceof X
            R -> Object reference
            X -> Class / Interface name

            Object o = arr.get(0);
            if(o instanceof Student){
            Student s = (Student)o;
            }

            To use instanceof operator, compulsory there should be some relation between the argument types
            (Either Child -> Parent, Parent -> Child, or same type). Otherwise, we will get the compile time
            error saying Incompatible Type.

            Note: null instanceof X -> False
        */

        Thread t = new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);

        // System.out.println(t instanceof String); // incompatible types: java.lang.Thread cannot be converted to java.lang.String
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Object);

        /*
            InstanceOf vs IsInstance ()
            ============================
            InstanceOf is an operator in Java. We can use the instanceof to check whether the given object
            is of particular type or not when we know the type at the beginning.

            IsInstance () is a method present in the java.lang.class. We can use the IsInstance () method
            to check whether the given object is of particular type or not when we don’t know the type
            at the beginning and its available dynamically at the runtime.
        */

        Thread t2 = new Thread();
        System.out.println(t2 instanceof Thread);

        //args[0] = java.lang.Object
        Thread t3 = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t3));
    }
}
