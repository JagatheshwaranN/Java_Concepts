package java7andbelow.features.declaration_access_modifiers;


import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

public class _02_Import_Statement {

    public static void main(String[] args) {

        // ArrayList al = new ArrayList(); - cannot find symbol - class ArrayList

        // We can solve this problem with the fully qualified name as below.

        java.util.ArrayList al = new java.util.ArrayList();

        /*
            Note:
            =====
            The problem with usage of fully qualified name every time is, it increases the length of the
            code and reduces the readability of the code. We can solve this problem by using the important
            statement. Whenever we are writing the import statement it’s not required to use the fully
            qualified name every time, instead we can use the short name directly.
        */

        // Here, import statement acts as typing shortcut.
        ArrayList al2 = new ArrayList();

        /*
            Types of Import Statements
            ==========================
            There are 2 types of import statements are as below,
            1.	Explicit class import (recommended)
            2.	Implicit class import
        */

        // Explicit class import
        // =====================
        // Import java.util.ArrayList - It is highly recommended to use explicit class import
        // because it improves the readability of the code.

        // Implicit class import.
        // ======================
        // Import java.util.* - It is not recommended to use this import, because it reduces the
        // readability of the code.

        /*
            Note: Whenever we are using the fully qualified name then it's not required to write import
            statement and vice versa is applicable.
        */

        /*
            While resolving the class names, the compiler will always give the precedence in the
            following order,
            1.	Explicit class import
            2.	Classes present in current working directory (Default package)
            3.	Implicit class import
        */
        Date d1 = new Date();
        System.out.println(d1.getClass().getName());

        /*
            Whenever we are importing a java package, all classes and interfaces present in the package
            by default available but not the sub package classes. If we want to use sub package class
            then compulsory, we should write import statement until sub package level.

            To use pattern class in our program which of the following import statement is required?
            import java.*;
            import java.util.*;
            import java.util.regex.*; => valid
            No import is required
        */

        /*
            All classes and interfaces present in the following packages are by default available to
            every java program. Hence, we are not required to use import statement.
            1.	java.lang package
            2.	default package (Current Working Directory)
        */

        /*
            Import statements is totally compile time related concept. If we have many number of imports,
            then the compile time will be more. But there is no effect on execution time (Run time).
        */

        /*
            Difference b/w C & Java
            =======================
            Difference between the C language #include<stdio.h> and Java language import statement,
            in the case of the c language #include, all the input and output header files will be
            loaded at the beginning only (At translation time) Hence it is Static include.

            But in the case of Java import statement, no .class file will be loaded at the beginning,
            whenever we are using a particular class, then only corresponding .class file will be
            loaded. This is known as Dynamic include or Load on demand or Load on fly.
        */
    }
}
