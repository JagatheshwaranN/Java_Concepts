package beforeJava8.features.development;

public class _01_Java_Commands {

    public static void main(String[] args) {

        /*
            Javac
            =====
            We can use javac command to compile a single or group of source files.

            Javac [options] Test.java
            Javac [options] A.java B.java C.java
            Javac [options] *.java

            Options
            ========
            -version
            -d
            -source
            -verbose
            -cp | -classpath

            Java
            ====
            We can use Java command to run a single class file.

            Java [options] Test A B C

            Options
            =======
            -version
            -D
            -cp | -classpath
            -ea |-esa|-dsa|-da

            Note: We can compile any number of source files at a time, but we can run
                  only one .class file at a time.

            Classpath
            =========
            Classpath describes the location where required .class files are available.
            Java Compiler and JVM will use classpath to locate required .class file.

            By default, JVM will always search in the current working directory for the
            required .class file. If we set the classpath explicitly, then JVM will
            search in our specified classpath location and JVM won't search in CWD.

            We can set the classpath in the following 3 ways:
            =================================================
            1.	By using environment variable classpath
            ===========================================
            This way of setting classpath is permanent and will be preserved when the
            system restarts. Whenever we are installing permanent software in a system,
            then this approach is recommended.

            2.	At command prompt level
            ===========================
            Using set command, Set classpath=c:\exercises

            This way of setting classpath will be preserved only for the particular CMD
            session. Once, CMD window closes automatically, the classpath goes off.

            3.	At command level
            ====================
            By using -cp option. Java -cp c:\exercises Test

            This way of setting classpath will be preserved only for the particular command.
            Once command execution completes, automatically classpath will be lost.

            Note:
            =====
            Among 3 ways of setting classpath, setting classpath at command level is
            recommended. Because, the dependent classes are varied from command to
            command. Once we set the classpath, we can run our program from any location.

            Example
            =======
            class Test {
                public static void main(String[] args) {
                    SOP (Classpath demo);
                }
            }
            c:\exercises > javac Test.java
            c:\exercises > java Test
            O/P: Classpath demo

            c:\> java Test
            RE: NoClassDefFoundError: Test

            c:\> java -cp c:\exercises Test
            O/P: Classpath demo

            d:\> java -cp c:\exercises Test
            O/P: Classpath demo

            c:\exercises > java -cp d: Test
            RE: NoClassDefFoundError: Test

            c:\exercises > java -cp . ; d: Test
            O/P: Classpath demo

            Example
            =======
            In C: drive
            ===========
            public class AStudent {
                public void m1() {
                SOP ("I want Job details");
                }
            }

            In D: drive
            ===========
            public class ITIndustry {
                public static void main (String[] args) {
                    AStudent a1 = new AStudent();
                    a1.m1();
                    SOP ("You will get soon");
                }
            }

            C:\> javac AStudent.java
            D:\> javac ITIndustry.java
            CTE: Cannot find symbol, symbol: class AStudent, location: class ITIndustry

            D:\>javac -cp C: ITIndustry.java
            D:\>java ITIndustry
            RE: NoClassDefFoundError: AStudent

            D:\>java -cp C: ITIndustry
            RE: NoClassDefFoundError: ITIndustry

            D:\>java -cp . ; C: ITIndustry
            E:\>java -cp D: ; C: ITIndustry

            Example
            =======
            package pack1.pack2;
            public Class Karena {
                public void m1() {
                SOP ("Hi Saif, I need to set the ringtone");
                }
            }

            import package pack1.pack2;
            package pack3.pack4;
            public Class Saif {
                public void m2() {
                    Kareena k = new Kareena();
                    k.m1();
                    SOP ("Not possible now, I'm little busy");
                }
            }

            import package pack3.pack4;
            public Class Alex {
                public void m3() {
                    Saif k = new Saif();
                    k.m2();
                    SOP ("Hey Kareena, Can I help you");
                }
            }

            C:\> javac -d . Kareena.java
            D:\> javac -d . Saif.java
            CE: Cannot find symbol Symbol: Class Kareena Location: class pack3.pack4.saif

            D:\> javac -d . -cp C: Saif.java
            E:\> javac Alex.java
            CE: Cannot find symbol Symbol: Class Saif Location: class Alex

            D:\> javac -d . -cp D: Saif.java
            E:\> java Alex
            RE: NoClassDefFoundError: pack3.pack4.Saif

            E:\> java -cp . ; D: Alex
            RE: NoClassDefFoundError: pack1.pack2.Kareena

            E:\> java -cp . ; D: ; C: Alex
            F:\> java -cp E: ; D: ; C: Alex

            Example
            =======
            public Class Blake {
                public void m1() {
                    SOP ("C: Blake");
                }
            }

            public Class Blake {
                public void m1() {
                    SOP ("D: Blake");
                }
            }

            C:\> java -cp D: ; C: Blake
            O/P D: Blake

            C:\> java -cp C: ; D: Blake
            O/P C: Blake

            Note:
            =====
            1.	If any location is created because of a package statement, that location
                should be resolved by using the import statement and base package location
                we have to update in the classpath.

            2.	Compiler will check only one level dependency, whereas JVM will check all
                levels of dependency.

            3.	In classpath, the order of location is important and JVM will always consider
                from left to right until the required match is available.
        */
    }
}
