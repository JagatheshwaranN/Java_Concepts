package beforeJava8.features.jvm_arch;

import java.lang.reflect.Method;

public class _02_ClassLoader_Loading {

    public static void main(String[] args) {

        /*
            JVM
            ===
            JVM is a part of JRE, and it is responsible to load and run the java class
            files.

            Class Loader Sub System
            =======================
            Class loader sub system is responsible for the following 3 activities.
            1.	Loading
            2.	Linking
            3.	Initialization

            Loading
            =======
            Loading means reading class files and store the corresponding binary data in
            the Method Area. For each class file, JVM will store corresponding information
            in the Method Area as below.

            1.	Full qualified name of class
            2.	Full qualified name of Parent class
            3.	Method information
            4.	Variable information
            5.	Constructor information
            6.	Modifier information
            7.	Constant pool information
            8.	Etc.

            After loading .class file, immediately JVM creates an object for the loaded class
            on the heap memory of type java.lang.class.

            Programmer can use the class Class object to get the class level information
            like method info, variable info, constructor info, etc.
        */
        StudentDemo.demo();
        /*
            Note
            ====
            For every loaded type, only one class Class object will be created, even though we
            are using the class multiple times in the program.
        */
        StudentDemo.demo2();
        /*
            In the above class, even though we have used student class multiple times, only one
            class Class object got created.
        */
    }

}

class Student {

    public int getStudentMark() {
        return 100;
    }

    public String getStudentName() {
        return "John";
    }
}

class StudentDemo {

    public static void demo() {
        int count = 0;
        Class clazz = null;
        try {
            clazz = Class.forName("beforeJava8.features.jvm_arch.Student");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            count++;
            System.out.println(method.getName());
        }
        System.out.println(count);
    }

    public static void demo2() {
        Student student1  = new Student();
        Student student2  = new Student();
        Class clazz1 = student1.getClass();
        Class clazz2 = student2.getClass();
        System.out.println(clazz1.hashCode());
        System.out.println(clazz2.hashCode());
        System.out.println(clazz1 == clazz2);
    }

}
