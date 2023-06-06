package java7andbelow.features.language_fundamentals.variables;

public class _04_Static_Variable {

    public static void main(String[] args) {

        /*
            Static Variable
            ===============
            1.	If the value of the variable is not varied from object to object, then it’s not recommended to
                declare the variable as Instance variable. We have to declare such type of variable at class
                level by using static modifier.

            2.	In case of instance variables, for every object a separate copy of the variables will be created.
                But in case of the static variable, single copy of the variable is created at class level and
                shared by every object of the class.

            3.	Static variables should be declared within the class directly but outside the method, constructor
                or block.

            4.	Static variables will be created at the time of class loading and destroyed at the time of class
                unloading. Hence, the scope of the static variable is exactly same as the .class file.

            5.	Static variables will be stored in the method area.

            6.	We can access the Static variables either by object reference or class name. But recommended to
                use class name approach. Within the same class, it’s not required to use the class name, and
                we can directly access the Static variable.

            7.	We can access the Static variables directly from both Instance and Static areas.

            8.	For Static variables, JVM will provide the default values, and we don’t need to perform the
                initialization explicitly.

            9.	Static variables also known as Class level variables or fields.
        */

        /*
            Class Loading and Unloading Flow
            ================================
            Java Test (Example)
            1.	Start JVM
            2.	Create and start main thread
            3.	Locate Test.class file
            4.	Load Test.class -> Static variables will be created.
            5.	Execute main() method
            6.	Unload Test.class -> Static variables will be destroyed.
            7.	Terminate main thread
            8.	Shutdown JVM
        */
    }
}
