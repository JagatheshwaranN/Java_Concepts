package java7andbelow.features.declaration_access_modifiers;

public class _09_Strictfp_Modifier {

    public static void main(String[] args) {

        /*
            Strictfp Modifier (Floating Point)
            ==================================
            1.	Introduced in Java 1.2 version.

            2.	We can use the strictfp for classes and methods but not for variables.

            3.	Usually, the results of the floating-point arithmetic are varied from platform
                to platform, if we want platform independent results for Floating Point arithmetic,
                then we should go for strictfp modifier.

            Here platform refers to the operating system (i.e., 16 bit / 32 bit / 64 bit).
        */

        /*
            Strictfp Method
            ===============
            If a method is declared as strictfp, then all floating-point calculations in the method
            has to follow IEEE754 standards so that we will get the platform independent results.
        */

        // strictfp public void m1() {  - class, interface, enum, or record expected
        //    System.out.println(10.0 / 3);
        // }

        /*
            Abstract modifier never talks about the implementation whereas strictfp method always talks
            about the implementation. Hence, the Abstract Strictfp combination is illegal at method level.
        */

        /*
            Strictfp Class
            ==============
            If a class is defined as strictfp, every floating-point calculation present in every concrete
            method has to follow IEEE754 standard so that we will get the platform independent results.

            We can declare the abstract strictfp combination for classes i.e., abstract strictfp combination
            is legal for classes but illegal for methods.
        */
    }
}

abstract strictfp class Demo3 {
    public void m1() {}
    public void m2() {}
    public abstract void m3();
    public abstract void m4();
}

abstract strictfp class Demo4 {
    // abstract strictfp public void m1(); - illegal combination of modifiers: abstract and strictfp

}

