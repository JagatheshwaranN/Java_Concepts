package beforeJava8.features.declaration_access_modifiers;

public class _10_Method_Modifiers {

    public static void main(String[] args) {

        /*
            Public Member
            =============
            If a member declared as public, then we can access that member from anywhere. But corresponding class
            should be visible i.e., before checking the member visibility we have to check the class visibility.

            package pack1;
            class A {
            public void m1() {
            SOP ("A class method");
            }
            }
            package Pack2;
            import pack1.A;
            class B {
            public static void main(String[] args) {
            A a = new A();
            a.m1();
            }
            }
            CE: pack1.A is not public in pack1; Cannot be accessed from outside package.

            Note:
            ====
            In the above example, even though the m1() is public we can’t access from outside package
            because the corresponding class A is not public i.e., if both class and method are public
            then only we can access the method from outside package.
        */

        /*
            Default Members
            ===============
            If a member declared as default, then we can access that member only within the current package.
            i.e., from outside the package we can’t access. Hence, default access is also known as package
            level access.
        */

        /*
            Private Members
            ===============
            If a member is private then we can access that member only within the class i.e., from outside
            the class can’t be accessed.

            Abstract methods should be available to the child classes for implementation whereas Private
            methods are not available to the child classes. Hence, Private Abstract combination is illegal
            for methods.
        */

        /*
            Protected Members (Most misunderstood modifier in Java)
            =======================================================
            If a member is declared as protected, then we can access that member anywhere in the current
            package but only in child classes of outside package.

            Protected = Default + Child

            We can access the protected members within the current package anywhere by using parent
            reference or child reference. But we can access the protected members in outside package
            only in child classes, and we should use child reference only i.e., parent reference can’t
            be used to access the protected member from outside the package.

            package pack1;
            public class A {
            protected void m1() {
            SOP ("A class method");
            }
            }
            package Pack2;
            import pack1.A;
            class C extends A {
            public static void main(String[] args) {
            A a = new A();
            a.m1(); -> CE: m1() has protected access in pack1.A
            C c = new C();
            c.m1();
            A a1 = new C();
            a1.m1(); -> CE: m1() has protected access in pack1.A
            }
            }

            We can access the protected members from outside package only in child classes,
            and we must use that child class reference only. For example, from D class, if
            we want to access, then we should use D class reference only.

            package Pack2;
            import pack1.A;
            class C extends A {
            }
            class D extends C {
            public static void main(String[] args) {
            A a = new A();
            a.m1(); -> CE: m1() has protected access in pack1.A
            C c = new C();
            c.m1(); -> CE: m1() has protected access in pack1.A
            D d = new D();
            d.m1(); -> Valid
            A a1 = new C();
            a1.m1(); -> CE: m1() has protected access in pack1.A
            A a2 = new D();
            a1.m1(); -> CE: m1() has protected access in pack1.A
            C a3 = new D();
            a3.m1(); -> CE: m1() has protected access in pack1.A
            }
            }
        */

        /*
            Summary of Private, Default, Protected and Public Modifiers
            ===========================================================
            Visibility	                            Private	    Default     Protected     Public
            ====================================================================================
            Within same class	                        Yes	        Yes	          Yes	     Yes
            From child class of same package	         No	        Yes	          Yes	     Yes
            From non-child class of same package	     No	        Yes	          Yes	     Yes
            From child class of outside package	         No	         No	          Yes	     Yes
            From non-child class of outside package	     No	         No	           No	     Yes

            1. The most restricted access modifier is Private.
            2. The most accessible modifier is Public.
            3. Recommended modifier for member/variable is Private.
            4. Recommended modifier for method is Public.
        */
    }
}
