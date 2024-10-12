package java.features.assertions;

public class _02_Runtime_Flags {

    public static void main(String[] args) {

        /*
            Various Possible Runtime Flags
            ==============================
            -ea | -enableassertions
            =======================
            To enable assertions in every non-system class (Our own classes).

            -da | -disableassertions
            ========================
            To disable assertions in every non-system class.

            -esa | -enablesystemassertions
            ==============================
            To enable assertions in every system class.

            -dsa | -disablesystemassertions
            ===============================
            To disable assertions in every system class.

            Note
            ====
            We can use the above flags simultaneously then JVM will consider these flags
            from left to right.
            Example, java -ea -esa -ea -dsa -da -esa -ea -dsa Test

            Case Study
            ==========
            Pack1
                A.class
                B.class
            Pack2
                C.class
                D.class

            To enable assertions only in B class
            ====================================
            Java -ea:Pack1.B

            To enable assertions in both B and D classes
            ============================================
            Java -ea:Pack1.B -ea:Pack1.Pack2.D

            To enable assertions in every class of Pack1
            ============================================
            Java -ea:Pack1…

            To enable assertions in every class of Pack1 except B class
            ===========================================================
            Java -ea:Pack1… -da:Pack1.B

            To enable assertions in every class of Pack1 except Pack2 classes
            =================================================================
            Java -ea:Pack1… -da:Pack1.Pack2…

            Note: We can enable and disable assertions either class wise or package
            wise as well.
        */
    }
}
