package java7andbelow.features.language_fundamentals.variables;

public class _06_Local_Variable {

    public static void main(String[] args) {

        /*
            Local Variable
            ==============
            1.	Sometimes to meet the temporary requirements of the Programmer, we may declare a variable inside
                a method / block / constructor, such type of variables is called as Local / Temporary / Stack variables.

            2.	Local variables are stored inside the Stack memory.

            3.	Local variables will be created while executing the block in which we declared it. Once, the block
                execution completes automatically local variables will be destroyed. Hence, the scope of the local
                variable is exactly same as the scope of the block in which the local variable is declared.

            4.	For Local variables, the JVM won’t provide the default values and, we should perform the initialization
                explicitly before using the variable. If we are not using the local variable then it’s not required to
                perform the initialization.

            5.	It is not recommended to initialize the local variables inside the logical blocks because there is no
                guarantee that these blocks will execute at runtime.

            6.	It is highly recommended to perform the initialization for Local variables at the time of declaration
                at least with the default values.

            7.	The only applicable modifier for the local variable is final. By mistake if we are trying to apply any
                other modifier, then we will get compile time error.

            8.	If you are not declaring the variable with any modifier, by default the value is default but this rule
                only applicable for Instance and Static variables and not for Local variables.
        */
    }
}
