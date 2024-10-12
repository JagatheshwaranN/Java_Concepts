package java.features.jvm_arch;

public class _05_ClassLoader_Workflow {

    public static void main(String[] args) {

        /*
            How class loader works
            ======================
            1. Class loader follows delegation hierarchy principle.

            2. Whenever JVM comes across a particular class, first it will check whether the
               corresponding .class file is already loaded or not. If it is loaded in the
               Method Area, then JVM will consider that loaded class.

            3. If it is not loaded, then JVM requests a class loader subsystem to load that
               particular class. Then, class loader subsystem handovers the request to
               Application Class Loader.

            4. Application Class Loader delegates the request to Extension Class Loader, which
               in turn delegates the request to Bootstrap Class Loader.

            5. Then Bootstrap Class Loader will search in Bootstrap classpath if it is available,
               then the corresponding .class file will be loaded by Bootstrap Class Loader. If it
               is not available, then Bootstrap Class Loader delegates the request to Extension
               Class Loader.

            6. Extension Class Loader will search in extension classpath if it is available then
               it will be loaded otherwise the Extension Class Loader delegates the request to
               Application Class Loader.

            7. Application Class Loader will search in application classpath. If it is available
               then it will be loaded otherwise, we will get the runtime exception saying
               NoClassDefFoundError or ClassNotFoundException.
        */
        ClassLoaderDemo.demo();

        /*
            Note:
            =====
            Bootstrap Class Loader is not a java object.Hence, we got the null.But
            Extension and Application Class Loaders are java objects. Hence, we are
            getting the corresponding outputs.

            Class loader subsystem gives the highest priority for BCL, and then ECL and
            followed by ACL.
        */
    }

}

class ClassLoaderDemo {

    public static void demo() {
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoaderDemo.class.getClassLoader());
    }

}
