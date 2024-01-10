package java7andbelow.features.jvm_arch;

public class _06_Customized_ClassLoader {

    public static void main(String[] args) {

        /*
            Need for customized class loader
            ================================
            Default class loaders will load .class file only once even though we are using
            multiple times that class in the program. After loading .class file, if it is
            modified outside then default class loader won't load the updated version of
            .class file (Because .class file is already available in the Method Area).

            We can resolve this problem by designing our own customized class loader.
            The main advantage of customized class loader is we can control class loading
            mechanism based on our requirement. For example, we can load .class file
            separately every time so that the updated class file will be available to the
            program.
        */

        /*
            How to define customized class loader
            =====================================
            We can define our own customized class loader by extending java.lang.ClassLoader class.

            public class CustClassLoader extends ClassLoader {
                public class loadClass(String cName) throws ClassNotFoundException {
                    Check for updates and load updated .class file and returns
                    corresponding Class
                }
            }

            class Client {
                public static void main(String[] args) {
                    Dog d1 = new Dog(); // Loaded by default class loader
                    CustClassLoader cl = new CustClassLoader();
                    cl.loadClass("Dog"); // Loaded by customized class loader
                    ;;;
                    cl.loadClass("Dog");
                }
            }

            Note:
            =====
            Developing web servers and application servers, usually we can go
            for customized class loaders to customize class loading mechanism.

            What is the use of ClassLoader class?
            =====================================
            We can use java.lang.ClassLoader class to define our own customized class loaders.
            Every class loader in Java should be child class of java.lang.ClassLoader class
            either directly or indirectly.Hence, this class acts as base class for all
            customized class loaders.
        */
    }

}
