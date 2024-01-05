package java7andbelow.features.assertions;

public class _04_Case_Study {

    public static void main(String[] args) {

        /*
            Case Study
            ==========
            class One {
                public static void main (String[] args) {
                    int assert = 10;
                    SOP (assert);
                }
            }

            class Two {
                public static void main (String[] args) {
                    int x = 10;
                    assert (x>10);
                }
            }
            Javac -source 1.3 One.Java Compiles with warning
            Javac -source 1.4 One.Java CTE
            Javac -source 1.3 Two.Java CTE
            Javac -source 1.4 Two.Java Compiles fine

            class Test {
                public static void main (String[] args) {
                boolean assertOn = false;
                assert (assertOn): assertOn=true;
                    if(assertOn) {
                        SOP (assertOn);
                    }
                }
            }
            If assertions are not enabled
            =============================
            NO output

            If assertions are enabled
            =========================
            RE: AssertionError: true

            class Test {
                public static void main (String[] args) {
                boolean assertOn = true;
                assert (assertOn): assertOn=false;
                    if(assertOn) {
                        SOP (assertOn);
                    }
                }
            }
            If assertions are not enabled
            O/P: assertOn
            If assertions are enabled
            O/P: assertOn
        */
    }

}
