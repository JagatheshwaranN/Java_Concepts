package java.features.development;

public class _05_Path_CPath_JDK_JRE_JVM {

    public static void main(String[] args) {

        /*
            Difference b/w Path and ClassPath
            =================================
            ClassPath
            =========
            Classpath describes the location where required .class files are
            available. Java Compiler and JVM will use classpath to locate the
            required .class files. If we are not setting classpath, then our
            program may not compile and may not run.

            Path
            ====
            Path describes the location where binary executables are available.
            If we are not setting a path, then Javac and Java commands won't work.
            Example, set path=C:\Program Files\Java\jdk1.8.0_333\bin

            Difference b/w JDK, JRE and JVM
            ================================
            JDK provides environment to develop and run Java applications.
            JRE provides environment to run the java applications.
            JVM is responsible to run the java program line by line. Hence, it is
            an interpreter.

            JDK = JRE + Development tools
            JRE = JVM + Library classes

            JVM is a part of JRE, whereas JRE is a part of JDK.

            Note:
            =====
            On the developer machine, we have to install JDK whereas in the client
            machine we have to install JRE.

            Difference b/w Java, Javaw and Javaws
            =====================================
            Java
            ====
            We can use java command to run a java class file where SOP statements will
            be executed and the corresponding output will be displayed to the console.

            Javaw (Java without console output)
            ===================================
            We can use a javaw command to run a java class file where SOP statements will
            be executed but the corresponding output won't be displayed to the console. In
            general, we can use javaw command to run GUI-based applications.

            Javaws (Java Web Start Utility)
            ===============================
            We can use javaws command to download a java application from the web and to
            start its execution. We can use javaws command as follows.

            Javaws jnlp_url

            It downloads the application from the specified URL and starts execution. The
            main advantage of this approach is every end user will get the updated version
            and enhancement will become easy because of centralized control.
        */
    }

}
