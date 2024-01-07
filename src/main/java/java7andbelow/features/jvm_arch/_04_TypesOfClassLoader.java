package java7andbelow.features.jvm_arch;

public class _04_TypesOfClassLoader {

    public static void main(String[] args) {

        /*
            Types of Class Loaders
            ======================
            Class loader Subsystem contains the following 3 types of class loaders,
            1.	Bootstrap class loader / Primordial class loader
            2.	Extension class loader
            3.	Application class loader / System class loader

            Bootstrap class loader / Primordial class loader
            ================================================
            Bootstrap class loader is responsible to load the core java API classes i.e.,
            classes present in rt.jar.

            JDK -> JRE -> LIB -> rt.jar

            This location is called as Bootstrap classpath i.e., Bootstrap class loader is
            responsible for load classes from bootstrap classpath. Bootstrap class loader is
            by default available with every JVM, and it is implemented in native languages
            like C / C++ and not implemented in Java.

            Extension class loader
            ======================
            Extension class loader is the child class of Bootstrap class loader. Extension
            class loader is responsible to load classes from the extension classpath.

            JDK -> JRE -> LIB -> EXT -> *.jar

            Extension class loader is implemented in Java, and the corresponding.class file
            is sun.misc.Launcher$ExtClassLoader.class

            Application class loader / System class loader
            ==============================================
            Application class loader is the child class of Extension class loader. This
            application class loader is responsible for loading the classes from application
            classpath. It internally uses environment variable classpath.

            Application class loader is implemented in Java and the corresponding.class file
            is sun.misc.Launcher$AppClassLoader.class
        */
    }

}
