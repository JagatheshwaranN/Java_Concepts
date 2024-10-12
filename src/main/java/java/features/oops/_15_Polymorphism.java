package java.features.oops;

public class _15_Polymorphism {

    public static void main(String[] args) {

        /*
            Polymorphism
            ============
            One name but multiple forms is the concept of polymorphism.

            Example 1,
            Method name is same, but we can apply for different types of arguments.
            It’s known as overloading.

            Example 2,
            Method signature is same but in parent class it has one type of implementation
            and in child class, it has another type of implementation. It’s known as overriding.

            Example 3,
            Usage of Parent reference to hold the Child object it’s the concept of Polymorphism.
            List l = new ArrayList ();
            List l = new LinkedList ();

            Example 4,
            Parent class reference can be used to hold the Child object. By using that reference
            we can call only the methods available in parent class. But we can’t call child class
            methods whereas using the child class reference we can call both methods.
        */

        Example4Demo parent = new Example4Demo();
        parent.method1();
        // parent.method2();

        Example4ChildDemo child = new Example4ChildDemo();
        child.method1();
        child.method2();

        /*
            Reason for Parent reference to hold Child Object
            ================================================
            If we don’t know exact runtime typeof object then we should go for parent reference.
            Example 1,
            The first element present in the array list can be any type such as student object,
            string object, integer object. Hence, the return type of the get method is Object
            which can hold any type of objects.
            Object obj = arrayList.get(0);

            Child c = New Child ();
            1. We can use this approach, if we know the exact runtime typeof object
            2. By using Child reference, we can call both parent and child class methods
               (Advantage of this approach)
            3. We can use child reference to hold only particular child object
            4. ArrayList al = new ArrayList ();

            Parent p = new Child ();
            1. We can use this approach, if we don’t know the exact runtime typeof object.
            2. By using Parent reference, we can call only methods available in Parent class,
               and we can’t call Child specific methods (Disadvantage of this approach)
            3. We can use the parent class reference to hold any child class objects
            4. List l = new ArrayList ();
        */

        /*
            3 Pillars of OOPS
            =================
            The 3 pillars of the OOPs concept are Encapsulation, Inheritance and Polymorphism.
            1. Encapsulation always talks about Security.
            2. Inheritance always talks about Re-usability.
            3. Polymorphism always talks about flexibility.
        */
    }
}
class Example1Demo{
    public void add(int a, int b){
    }
    public void add(double c, double d) {
    }
}

class Example2Demo {
    public void method(){
        System.out.println("Parent Method");
    }
}

class Example2ChildDemo extends Example2Demo {
    @Override
    public void method() {
        System.out.println("Child Method");
    }
}

class Example4Demo {
    public void method1(){
        System.out.println("Parent Method");
    }
}

class Example4ChildDemo extends Example4Demo {
    public void method2() {
        System.out.println("Child Method");
    }
}