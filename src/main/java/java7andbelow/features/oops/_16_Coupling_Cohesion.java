package java7andbelow.features.oops;

public class _16_Coupling_Cohesion {
    public static void main(String[] args) {

        /*
            Coupling
            ========
            The degree of the dependency between the components is called as Coupling.
            If dependency is more then, it’s considered as Tightly coupling and if dependency
            is less then, it’s considered as Loosely coupling.

            Types of coupling
            =================
            1.	Tightly coupling (Dependency is more)
            2.	Loosely coupling (Dependency is less)

            Note:
            =====
            1. The below components are said to be tightly coupled with each other because the
            dependency between the components is more.
            2. "Tightly coupling is not a good programming practice" because it has several serious
                disadvantages as below,
                1.	Without affecting the remaining components, we can’t modify any component and
                    hence enhancement will become difficult.
                2.	It suppresses the re-usability.
                3.	It reduces the maintainability of the application.

            Hence, we have to maintain dependency between the components as less as possible i.e.,
            "Loosely coupling is a good programming practice".
        */

        /*
            Cohesion
            ========
            For every component, a clear well-defined functionality is defined then that component
            is said to follow High cohesion.

            Types of cohesion
            =================
            1.	High cohesion
            2.	Low cohesion

            "High cohesion is always a good programming practice" because it has several advantages.
                1.	Without affecting the remaining components, we can modify any component. Hence,
                    enhancement will become easy.

                2.	It promotes the re-usability of the code (For example, Where ever validation required,
                    we can use the same servlet without rewriting the servlet).

                3.	It improves the maintainability of the application.

            Note: Loosely coupling and High cohesion are good programming practices.

            Low Cohesion
            ============
            ======================
            70 lacks lines of code
            ----------------------
            Login Page
            ----------------------
            Validation
            ----------------------
            Inbox
            ----------------------
            Reply
            ----------------------
            Compose
            ----------------------
            Error
            ----------------------
            Total servlet
            ======================

            High Cohesion
            =============
            ==========
            Login Page
            ==========

            ==========
            Inbox
            ==========

            ==========
            Validation
            ==========
        */
    }
}

class Four {
    static int z = Three.y;
}

class Three {
    static int y = Two.x;
}

class Two {
    static int x = One.method1();
}

class One {
    public static int method1(){
        return 10;
    }
}
