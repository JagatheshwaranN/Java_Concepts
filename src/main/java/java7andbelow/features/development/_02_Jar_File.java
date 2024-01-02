package java7andbelow.features.development;

import java.util.Properties;

public class _02_Jar_File {

    public static void main(String[] args) {

        /*
            Jar File
            ========
            A group of .class files are collectively saved as a zip file is called as
            jar file. We can't set the classpath for more numbers of Java files. To
            overcome this issue, we are going for jar file concept.

            All 3rd party software plugins are by default available in the form of jar
            file only.

            For Example, to develop a servlet, all dependent classes are available in
            servlet-api.jar. We have to place this jar file in classpath to compile
            servlet program.

            To run a jdbc program, all dependent classes are available in ojdbc.jar.
            To run jdbc program, we have to place this jar file in the classpath.

            To use log4j in our application, dependent classes are available in log4j.jar.
            We have to place this jar file in the classpath then only the log4j based
            application can run.

            Various commands related to Jar file
            ====================================
            To create a jar file (Zip file)
            ===============================
            jar -cvf calc.jar Test.class
            jar -cvf calc.jar A.class B.class
            jar -cvf calc.jar *.class
            jar -cvf calc.jar *.*

            To extract a jar file
            =====================
            jar -xvf calc.jar

            To display the table of contents
            ================================
            jar -tvf calc.jar

            Example
            =======
            Service Provider's Role
            =======================
            public class Calc {
                public static void add (int x, int y) {
                    SOP (x+y);
                }
            }

            javac Calc.java
            jar -cvf Calc.jar Calc.class

            Client's Role
            =============
            class Sum {
                public static void main (String[] args) {
                    Calc.add(10, 20);
                }
            }
            C:\exercises> javac -cp D:\Calc.jar Sum.java
            C:\exercises> java -cp . ; D:\Calc.jar Sum

            Note:
            =====
            To place .class file in classpath, just location is enough. But to make jar
            file available in classpath location is not enough. We have to include the
            name of the jar as well.
        */

        /*
            Shortcut way to place Jar file in Classpath
            ===========================================
            If we place jar file in the following location then all the classes and
            interfaces present in the jar file by default available to Java compiler
            and JVM. We are not required to set the classpath explicitly.

            JDK -> JRE -> LIB -> EXT -> *.jar
        */

        /*
            System Properties
            =================
            For every system, some persistent information will be maintained in the form
            of System properties. These include the name of OS, java version, JVM vendor,
            user country, etc.

            Example
            =======
            import java.util.*;
            class Test {
                public static void main(String[] args) {
                    Properties p = System.getProperties();
                    p.list(System.out);
                }
            }
            We can set the system property explicitly from the command prompt by using
            the -D option.

            Java -DPropertyName=Value Class_Name

            The main advantage of setting the System Property is we can customize the
            behavior of Java program.

            class Test {
                public static void main(String[] args) {
                    String course = System.getProperty("course");
                        if(course.equals("java")) {
                            SOP (Java information);
                        }
                        else {
                            SOP (Other information);
                        }
                }
            }
            Java -Dcourse=java Test
            O/P: Java information
            Java -Dcourse=oracle Test
            O/P: Other information
        */
        SystemPropDemo.demo();
    }

}

class SystemPropDemo {
    public static void demo() {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}