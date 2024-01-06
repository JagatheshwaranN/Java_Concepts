package java7andbelow.features.assertions;

public class _05_AssertionError {

    public static void main(String[] args) {

        /*
            AssertionError
            ==============
            1. It is the child class of Error and hence it is unchecked. If an assert
               statement fails (i.e., argument is false) then we will get the assertion
               error.

            2. Even though it is legal to catch assertion error, but it is not a good
               programming practice.

            class Test {
                public static void main (String[] args) {
                    int x = 10;
                    try {
                        assert (x> 10)
                    }
                    catch(AssertionError ex) {
                        SOP (I'm foolish bcoz I'm catching assertion error);
                    }
                    SOP (x);
                }
            }

            Note:
            =====
            In case of web application, if we run java program in debug mode automatically
            assert statements will be executed.
        */
    }

}
