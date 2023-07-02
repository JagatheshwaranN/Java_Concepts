package java7andbelow.features.declaration_access_modifiers;

public class _04_Packages {

    public static void main(String[] args) {

        /*
            Packages
            ========
            It is an encapsulation mechanism to group the related classes and interfaces into a single unit,
            which is called as package.

            1.	All classes and interfaces which are required for DB operations are grouped into a single
                package called as java.sql package.

            2.	All classes and interfaces which are useful for File IO operations are grouped into a single
                package called as java.io package.

            Advantages
            ==========
            1.	To resolve the naming conflicts (i.e., unique identification of the components)
            2.	It improves the modularity of the application
            3.	It improves the maintainability of the application
            4.	It provides the security for our components ( The items of the package can’t be accessed outside
                the package)

            There is one universally accepted naming convention for packages i.e., to use the internet domain
            name in reverse.

            Naming Convention
            =================
            com.abcbank.loan.housing.account
            Client internet domain name in reverse – com.abcbank
            Module name – loan
            Sub module name – housing
            Class name – account
        */

        /*
            Package Class Compilation
            =========================
            package com.qatest.demo;
            public class Test {
            public static void main(String[] args) {
            SOP("Hello");
            }
            }

            javac Test.java
            Generated .class file will be placed in the current working directory.

            javac -d . Test.java
            -d -> Destination to place the generated .class file / Directory to place the files
            . -> CWD

            Generated .class file will be placed in the corresponding package structure.
            If the corresponding package is not available, then the above command itself will create the
            corresponding package structure.

            As destination, instead of . (CWD), we can take any valid directory name as below,
            javac -d F: Test.java

            The .class file will be created under the F: directory.

            If the specified directory not available, then we will get the compile time error.
            javac -d Z: Test.java -> CE: Directory Not Found: Z:
        */

        /*
            Package class Run
            =================
            At the time of execution of the package class, we have to use the fully qualified name.
            java com.qatest.demo.Test
        */

        /*
            Conclusion
            ==========
            1.	In any java source file, there can be utmost one package statement. i.e., more than one package
                statement is not allowed otherwise we will get the compile time error.
            Example,
            package com.qatest.demo;
            package com.qatest.sample;
            public class Test {
            }
            CE: class, interface or enum expected.

            2.	In any java program, the first non-comment statement should be package statement (If its available)
                otherwise we will get the compile time error.
            Example,
            import java.util.*;
            package com.qatest.sample;
            public class Test {
            }
            CE: class, interface or enum expected.
        */

        /*
            Summary of Java Source File Structure
            =====================================
            The following is valid java source file structure.
            Package statements -> At most one
            Import statements -> Any number
            Class/Interface/Enum declarations -> Any number
            The above order is important. An empty source file is valid java program.
        */
    }
}
