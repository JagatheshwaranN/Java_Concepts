package java7andbelow.features.declaration_access_modifiers;

public class _17_Native_Modifier {

    public static void main(String[] args) {

        /*
            Native Modifier
            ===============
            1.	Native is a modifier applicable only for methods, and we can not apply anywhere else.

            2.	The methods which are implemented in non-java code (Mostly C / C++) are called as native
                methods / Foreign methods.

            3. The main objectives of Native keyword are,
                1.	To improve the performance of the system.
                2.	To achieve the machine level / memory level communication.
                3.	To use already existing legacy non java code.

            4. Pseudocode to use Native keyword in Java
                1.	Load native libraries
                2.	Declare a native method
                3.	Invoke a native method

            Example,
            class Native {
            static {
            System.loadLibrary("native library path");
            }
            public native void m1();
            }

            class Client {
            public static void main (String[] args){
            Native native = new Native ();
            native.m1();
            }
            }

            For native methods, implementation is already available in old languages like C/C++ and
            we are not responsible to provide the implementation. Hence, native method declaration
            should ends with (;). If we are trying to implement the native method then we will get
            the compile time error.

            Example,
            public native void m1() {}

            CE: Native method cannot have a body
            ====================================
            For Native methods, the implementation is already available in old languages but for abstract
            methods implementation should not be available. Hence, we can’t declare the native method as
            abstract i.e., Native Abstract combination is illegal for methods.

            We can’t declare the native method as strictfp because there is no guarantee that old
            languages will follow IEEE754 standard. Hence, Native Strictfp combination is illegal for
            methods.

            The main advantage of native keyword is performance will be improved but the disadvantage of
            the native keyword is, it breaks the platform independent nature of Java.
        */

        /*
            Summary
            =======
            Modifier	Outer Class	Inner Class	Methods	Variables	Blocks	Outer Interfaces	Inner Interfaces	Outer Enum	Inner Enum	Constructor
            Public	    Yes	        Yes	        Yes	    Yes		    No      Yes	                Yes	                Yes	        Yes         Yes
            Private		No          Yes	        Yes	    Yes			No      No                  Yes		            No          Yes	        Yes
            Protected	No	        Yes	        Yes	    Yes			No      No                  Yes		            No          Yes	        Yes
            Default	    Yes	        Yes	        Yes	    Yes		    No      Yes	                Yes	                Yes	        Yes	        Yes
            Final	    Yes	        Yes	        Yes	    Yes         No      No                  No                  No          No          No
            Abstract	Yes	        Yes	        Yes		No	        No      Yes	                Yes                 No          No          No
            Static		No          Yes	        Yes	    Yes	        Yes		No                  Yes		            No          Yes         No
            SynchronizedNo			No          Yes		No          Yes     No                  No                  No          No          No
            Native		No	        No          Yes     No          No      No                  No                  No          No          No
            Strictfp	Yes	        Yes	        Yes		No	        No      Yes	                Yes                 Yes         Yes         No
            Transient	No			No          No      Yes         No      No                  No                  No          No          No
            Volatile	No			No          No      Yes         No      No                  No                  No          No          No

            1. The only applicable modifier for local variables is final.
            2. The only applicable modifiers for constructors are public, private, protected and default.
            3. The modifiers applicable only for methods are native.
            4. The modifiers which are applicable only for variables are volatile and transient.
            5. The modifiers which are applicable only class not for interface is final.
            6. The modifiers which are applicable only class not for enum is final, abstract.
        */
    }
}
