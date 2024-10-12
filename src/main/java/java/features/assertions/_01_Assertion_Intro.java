package java.features.assertions;

public class _01_Assertion_Intro {

    public static void main(String[] args) {

        /*
            Intro
            =====
            Very common way of debugging is usage of SOP statements. But the problem
            with the SOPs is after fixing the bug compulsory we have to delete the SOP
            statements Otherwise these SOPs executed at runtime for every request, which
            creates a performance problem and disturbs server logs.

            To overcome this problem, SUN people introduced Assertions concept in Java 1.4
            version. The main advantage of Assertions when compared with SOPs is after
            fixing the bug, we are not required to remove the Assert statements because
            they won't be executed by default at runtime. Based on our requirement,
            we can enable and disable assertions. By default, assertions are disabled.

            Hence, the main objective of Assertions is to perform the debugging. Usually,
            we can perform the debugging in the Dev and Test environments but not in Prod
            environment. Hence, Assertions concept applicable for Dev and Test environments
            but not for Prod environment.

            Assert as Keyword & Identifier
            ==============================
            Assert keyword introduced in the 1.4 version. Hence, from Java 1.4 version onwards,
            we can't use Assert as identifiers. Otherwise, we will get the compile time error.

            Example,
            class Test {
                public static void main(Striing[] args){
                    int assert = 10;
                    SOP (assert);
                }
            }

            Javac Test.java

            CE: As of release 1.4, ‘assert’ is a keyword and may not be used as an identifier.
            Use -source 1.3 or lower to use ‘assert’ as an identifier

            Javac -source 1.3 Test.java
            O/P 10

            Note
            ====
            1.	If we use assert as identifier and if we are trying to compile, according
                to an old version (Java 1.3 or lower), then the code compiles fine with
                warning.
            2.	We can compile a java program according to a particular version by using
                a -source option.

            Types of Assert statements
            ==========================
            There are 2 types of assert statements as below,
            1.	Simple version
            2.	Augmented version

            Simple
            ======
            assert(b);
            b should be a boolean type. If b is true, then our assumption is satisfied and
            hence the rest of the program will be executed normally. If b is false, then our
            assumption fails, i.e., somewhere something goes wrong, and hence the program will
            be terminated abnormally by raising assertion error. Once we get the AssertionError
            we will analyze the code and fix the problem.

            Augment
            =======
            We can augment some description with assertion error by using the augmented version.
            assert(b): e;
            b should be boolean type. e can be any type but mostly string type.
        */
        AssertionDemo1.simpleDemo();
        AssertionDemo2.augmentDemo();

        /*
            Conclusion
            ==========
            1.	assert(b): e; e will be executed if and only if first argument is false,
            i.e., if first argument is true, then second argument won’t be evaluated.

            Example,
            class Test {
                public static void main (String[] args) {
                    int x = 10;
                    assert(x==10): ++x;
                    SOP (x);
                }
            }

            Javac Test.java
            Java Test
            O/P 10
            Java -ea Test
            O/P 10

            2.	assert(b): e; For e we can take method call, but void return type method
            call is not allowed. Otherwise, we will get the compile time error.

            Example,
            class Test {
                public static void main (String[] args) {
                    int x = 10;
                    assert(x>10): m1();
                    SOP (x);
                }
            }
            public static int m1 () {
            return 777;
            }

            Javac Test.java
            Java Test
            O/P 10
            Java -ea Test
            RE: AssertionError: 777

            If m1 () method return type is void, then we will get the compile time error
            saying a void type not allowed here.

            Note:
            =====
            Among 2 versions of assertions, it is recommended to use an augmented version
            because it provides more information for debugging.
        */

    }

}

/*
    javac AssertionDemo1.java
    java AssertionDemo1
    O/P 10

    java -ea AssertionDemo1
    RE: AssertionError

    Note:
    =====
    By default, assert statements won't be executed because the assertions are disabled
    by default. But we can enable the assertions by using an -ea option.
*/
class AssertionDemo1 {

    public static void simpleDemo() {
        int x = 10;
        assert (x > 10);
        System.out.println(x);
    }
}

/*
    javac AssertionDemo2.java
    java AssertionDemo2
    O/P 10

    java -ea AssertionDemo2
    RE: AssertionError:Here X should be greater than 10, but it's not
*/
class AssertionDemo2 {

    public static void augmentDemo() {
        int x = 10;
        assert (x > 10):"Here X should be greater than 10, but it's not";
        System.out.println(x);
    }
}