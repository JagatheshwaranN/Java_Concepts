package beforeJava8.features.declaration_access_modifiers;

public class _13_Final_Variable_Local {

    public static void main(String[] args) {

        /*
            Final Local Variable
            ====================
            1.	Sometimes, to meet the temporary requirements of the programmer we have to declare the
                variables inside a method / block / constructor such type of variables is called as Local
                variables / Temporary variables / Stack Variables.

            2.	For local variables, JVM won’t provide the default values compulsory we should perform
                the initialization explicitly before using that local variable i.e., if we are not using
                the local variable then it’s not required to perform the initialization for the local
                variable.

            3. Even though the local variable is final, before using only we have to perform the
               initialization. If we are not using then it’s not required to perform initialization even
               though its final.

            4. The only applicable modifier for local variable is final. By mistake if you are trying to
               apply any other modifier then we will get the compile time error.

            Note: If we are not declaring any modifier then by default, its Default but this rule is
                  only applicable for instance and static variables not for local variable.
        */

        final int x1;
        x1 = 10;
        System.out.println(x1);

        final int x2;

        // public int x3; - illegal start of expression
    }
}
