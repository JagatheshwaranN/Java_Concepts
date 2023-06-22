package java7andbelow.features.operators_assignments.other_operators;

import java.lang.reflect.InvocationTargetException;

class _02_New_Vs_NewInstance {

    public static void main(String[] args) throws ClassNotFoundException {

        /*
            new () vs newInstance ()
            ========================
            1. We can use the new operator to create an object if we know the class name at the beginning.
               For example,
               Test t = new Test();

            2. newInstance() method is present in the class named Class. We can use the newInstance()
               method to create the object if we don’t know the class name at beginning and its available
               dynamically at runtime.
               For example,
               class Test {
               public static void main(String[] args){
               Object o = class.forName(args[0]).newInstance();
               SOP(“Object created for : “+o.getclass().getName());
               }
               }
            3. In case of new() operator, based on our requirement we can invoke any constructor.
               Test t1 = new Test();
               Test t2 = new Test(10);

            4. But, newInstance() method internally calls no-arg constructor. Hence, to use the newInstance(),
               compulsory the corresponding class should contain the no-arg constructor otherwise we will
               get the runtime exception saying Instantiation Exception.
               class Test {
               Test(int i){
               SOP(i);
               }
               public static void main(String[] args){
               Object o = class.forName(args[0]).newInstance();
               SOP(“Object created for : “+o.getclass().getName());
               }
               }
               RE: Exception in main thread: Instantiation Exception
        */

        _02_New_Vs_NewInstance object = new _02_New_Vs_NewInstance();
        func("Sample");
    }

    private static void func(String clazz) {
        try {
            Object object1 = Class.forName(clazz).newInstance();
            System.out.println("Object created : " + object1.getClass().getName());
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException  e) {
            throw new RuntimeException(e);
        }
    }

}
class Sample {
    Sample(){

    }
}