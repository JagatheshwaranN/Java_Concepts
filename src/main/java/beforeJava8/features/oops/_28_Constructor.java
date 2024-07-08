package beforeJava8.features.oops;

public class _28_Constructor {

    public static void main(String[] args) {

        /*
            Constructor
            ===========
            1.	Once we create the object compulsory we should perform the initialization, then
                only the object is in position to respond properly.

            2.	Whenever we are creating an object, some piece of the code is executed automatically
                to perform the initialization of the object. This piece of code is called as Constructor.
                Hence, the main purpose of Constructor is to perform the initialization of the object
                but not to create the object.
        */

        /*
            Rules for writing Constructor
            =============================
            1.	Name of the class and name of Constructor should be same.
            2.	Return type concept is not applicable for Constructor.
            3.	By mistake, if we are trying to declare the return type for Constructor,
                we won’t get any error because the compiler will treat it as method but not
                as constructor.
            4.	The only applicable modifiers for Constructors are Public, Private, Protected
                and Default. If we are trying to use any other modifier, we will get the compile
                time error.
            5.	Its legal (But stupid to have a method name same as Class name).
        */

        ConstructorDemo constructorDemo = new ConstructorDemo("John", 98765);

    }
}

class ConstructorDemo {
    String name;
    int mobile;

    public ConstructorDemo(String name, int mobile){
        this.name = name;
        this.mobile = mobile;
    }
}