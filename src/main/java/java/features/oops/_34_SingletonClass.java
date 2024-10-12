package java.features.oops;

public class _34_SingletonClass {
    public static void main(String[] args) {

        /*
            Singleton Class
            ===============
            For any Java class, if we are allowed to create only one object such type
            of class is called as Singleton class.
            Example,
            Runtime
            BusinessDelegate
            ServiceLocator

            Advantages
            ==========
            If several people have same requirement, then it’s not recommended to create
            a separate object for every requirement. We have to create only one object and
            can reuse the same object for every similar requirement. So, the performance
            and memory utilization will be improved. This is the central idea of the
            Singleton class.

            How to create our own Singleton class
            =====================================
            We can create our own singleton classes, for this we have to use the private
            constructor and private static variable and public factory method.

            QQ: Class is not Final, but not allowed to create Child Class, how is it possible?
            By declaring every constructor as private, we can restrict the child class creation.
        */

        // Note: Runtime class is internally implemented by using the below approach.
        SingletonClass1Demo object1 = SingletonClass1Demo.getSingletonClass1Demo();
        SingletonClass1Demo object2 = SingletonClass1Demo.getSingletonClass1Demo();

        // Note: At any point of time, for Test class we can create only one object.
        // Hence, Test class is Singleton class.
        SingletonClass2Demo object3 = SingletonClass2Demo.getSingletonClass2Demo();
        SingletonClass2Demo object4 = SingletonClass2Demo.getSingletonClass2Demo();
    }
}

class SingletonClass1Demo {
    private static SingletonClass1Demo singletonClass1Demo = new SingletonClass1Demo();
    private SingletonClass1Demo(){
    }
    public static SingletonClass1Demo getSingletonClass1Demo(){
        return singletonClass1Demo;
    }
}

class SingletonClass2Demo {
    private static SingletonClass2Demo singletonClass2Demo = null;
    private SingletonClass2Demo(){
    }
    public static SingletonClass2Demo getSingletonClass2Demo(){
        if(singletonClass2Demo == null){
            singletonClass2Demo = new SingletonClass2Demo();
        }
        return singletonClass2Demo;
    }
}

class ParentDemo {
    private ParentDemo() {
    }
}

// class Child extends ParentDemo { - ParentDemo() has private access in java7andbelow.features.oops.ParentDemo
// }