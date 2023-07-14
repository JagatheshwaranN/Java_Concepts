package java7andbelow.features.interfaces;

public class _10_Interface_AbstractClass_Notes {

    public static void main(String[] args) {

        /*
            Notes
            =====
            1.	Either directly or indirectly we can’t create object for Abstract class.

            2.	Anyway, we can’t create objects for Abstract class and Interface. Abstract class can contain
                constructor but Interface does not contain constructor. The main purpose of the constructor is
                to perform the initialization of the instance variables. Abstract class can contain Instance
                variables which are required for Child object. To perform the initialization of those instance
                variables constructor is required for abstract class. But every variable present inside Interface
                is always public static final whether we are declaring or not and there is no chance of existing
                of instance variables inside Interface. Hence, constructor is not required for Interface.

            3.	Whenever we are creating the child class object. Parent object won’t be created just the parent
                class constructor will be executed for the child class object only.
        */

        Child object = new Child();
        System.out.println(object.hashCode());

        /*
            Points to Know
            ==============
            QQ: Inside Interface every method is always abstract, and we can take only abstract methods in
                abstract class also, then what is the difference between Interface and Abstract class, and
                is it possible to replace Interface with Abstract class?

            We can replace the Interface with Abstract class, but it’s not a good programming practice.
            This is something like recruiting an IAS office for sweeping job.

            If everything is abstract then it's highly recommended to go for Interface but not for
            Abstract class.
        */

        // While extending the Abstract class, it’s not possible to extend any other class and hence
        // we are missing the inheritance benefits. In this case, the object creation is costly.
        // (It will take 1 minute to create object).
        Product product = new Product();

        // While implementing the Interface we can extend some other class and hence we won’t miss any
        // inheritance benefits. In this case, the object creation is not costly.
        Item item = new Item();
    }
}

class Parent{
    Parent(){
        System.out.println(this.hashCode());
    }
}

class Child extends Parent {
    Child() {
        System.out.println(this.hashCode());
    }
}

abstract class Sample {

}

class Product extends Sample {

}

interface Demo {

}

class Item implements Demo {

}