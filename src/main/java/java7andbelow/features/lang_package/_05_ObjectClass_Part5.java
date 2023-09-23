package java7andbelow.features.lang_package;

import java.lang.reflect.Method;

public class _05_ObjectClass_Part5 {

    public static void main(String[] args) {

        /*
            String Class Equals Method
            ==========================
            String s1 = new String ("Alex");
            String s2 = new String ("Alex");
            SOP (s1 == s2); // false
            SOP (s1.equals (s2)); // true

            In String class, equals() method is overridden for content comparison. Hence,
            even though the objects are different and content is same, then equals() method
            returns true.

            StringBuffer Class Equals Method
            ================================
            StringBuffer s1 = new StringBuffer ("Alex");
            StringBuffer s2 = new StringBuffer ("Alex");
            SOP (s1 == s2); // false
            SOP (s1.equals (s2)); // false
            In StringBuffer class, equals() method is not overridden for content comparison.
            Hence, if objects are different, equals() method returns false even though the
            content is same.
        */

        String s1 = new String ("Alex");
        String s2 = new String ("Alex");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer ("Alex");
        StringBuffer sb2 = new StringBuffer ("Alex");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        /*
            getClass()
            ==========
            We can use getClass() method to get the runtime class definition of an object.

            public final Class getClass ();

            By using this Class cls object, we can access the class level properties like
            full qualified name of the class, methods information, constructor information, etc.

            Note
            ====
            1.	After loading every .class file, JVM will create an object of the type
                java.lang.class in the heap area. Programmer can use this class object
                to get the class level information.
            2.	We can use getClass() method frequently in the reflection API.
        */
        GetClassDemo getClassDemo = new GetClassDemo();
        getClassDemo.getClassDemo();

        /*
            finalize()
            ==========
            Just before destroying an object, Garbage Collector calls finalize() method to
            perform cleanup activities. Once the finalize() method complete, the GC destroys
            the object.

            wait(), notify(), and notifyAll()
            =================================
            We can use these methods for inter thread communication. The thread which is expecting
            the update, it's responsible to call the wait() method. Then, immediately the thread
            will enter into the waiting state. The thread which is responsible to perform the
            update, after performing the update, the thread can call notify() method. The waiting
            thread will get that notification and continue its execution with those updates.
        */
    }
}

class GetClassDemo{

    public void getClassDemo(){

        Object obj = new String("Java");
        Class<? extends Object> cls = obj.getClass();
        System.out.println(cls.getName());

        int count = 0;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            count++;
        }
        System.out.println("Number of methods present in String Class are "+ count);
    }
}
