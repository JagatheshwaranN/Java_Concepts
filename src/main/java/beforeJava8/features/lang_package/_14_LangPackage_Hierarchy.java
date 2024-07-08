package beforeJava8.features.lang_package;

import java.lang.reflect.Method;

public class _14_LangPackage_Hierarchy {

    public static void main(String[] args) {

        /*

            Partial hierarchy of java.lang package
            ======================================
            Object
            ======
            String
            StringBuffer
            StringBuilder
            Number
            Boolean
            Character
            Void

            Number
            ======
            Byte
            Short
            Integer
            Long
            Float
            Double
        */

        /*
            Conclusion
            ==========
            1.	The wrapper classes which are not child class of Number are Boolean and Character.
            2.	The wrapper classes which are not direct child class of object are Byte, Short,
                Integer, Long, Float and Double.
            3.	String, StringBuffer, StringBuilder and all wrapper classes are final classes.
            4.	In addition to string objects, all wrapper classes also immutable.
            5.	Sometimes, void class is also considered as wrapper class.
        */

        /*
            Void Class
            ==========
            It is a final class and its direct child class of object. It doesn't contain any
            methods, and it contains only one variable void.TYPE.
            In general, we can use void class in reflections to check whether the method return
            type is void or not.

            Void is a class representation of void keyword in Java.
        */
        Demo demo = new Demo();
        Method[] methods = demo.getClass().getDeclaredMethods();

        if (methods.length > 0 && methods[0].getReturnType() == void.class) {
            System.out.println("Method is void");
        }
    }

}

class Demo {

    public void method1(){
        System.out.println("Void method demo");
    }
}
