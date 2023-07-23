package java7andbelow.features.oops;

public class _14_Difference_Overloading_Overriding {

    public static void main(String[] args) {

        /*
            Difference b/w Overloading & Overriding
            =======================================
            Property            Overloading                 Overriding
            Method Names        Must be same                Must be same

            Argument Types      Must be different           Must be same
                                (At least order)
            Method Signature    Must be different           Must be same

            Return Type         No Restrictions             Must be same until 1.4 v,
                                                            From 1.5v, covariant return types allowed
            Private, Static     Can be overloaded           Can't be overridden
            and Final Methods

            Access Modifiers    No Restrictions             We can't reduce the scope of
                                                            Modifiers, but can increase
            Throws clause       No Restrictions             If child throws exception, then Parent must
                                                            throw same or its parent exception
            Method Resolution   Takes care by               Takes care by JVM
                                Compiler
            AKA                 Compile Time Polymorphism/  Runtime Polymorphism/ Dynamic Polymorphism/
                                Static Polymorphism/        Late Binding
                                Early Binding

            Note: In overloading, we have to check only the method names (must be same) and
            argument types (must be different). We are not required to check the remaining like
            return types, access modifiers, etc. But, in overriding, everything we have to check
            like return type, modifiers, and throws clause, etc.
        */
    }
}
