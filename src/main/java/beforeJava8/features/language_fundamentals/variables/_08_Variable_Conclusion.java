package beforeJava8.features.language_fundamentals.variables;

public class _08_Variable_Conclusion {

    int i1 = 10; // Instance Primitive Variable

    static String s1 = "variable demo"; // Static Reference Variable

    public static void main(String[] args) {

        int[] i2 = new int[2]; // Local Reference Variable

        /*
            Conclusion of Variables
            =======================
            1.	For Instance and Static variables, JVM will provide the default values and not need to perform
                initialization explicitly. But for the Local variables the JVM won’t provide the default values
                and the initialization should be done explicitly before using the local variable.

            2.	Instance and Static variables can be accessed by the multiple threads simultaneously and hence these
                are not thread safe. But in case of the local variables, for every thread a separate copy will be
                created and hence local variables are thread safe.

            3.	Every variable in Java should be either instance or static or local. Also, every variable in Java
                should be either primitive or reference.

            4.	The various possible variation of variables in Java are as below,
                primitive - local, instance and static
                reference - local, instance and static.
        */
    }
}
