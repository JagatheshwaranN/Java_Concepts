package beforeJava8.features.assertions;

public class _03_UseOfAssertions {

    public static void main(String[] args) {

        /*
            Appropriate and Inappropriate Use of Assertions
            ===============================================
            1.	It is always inappropriate to mix programming logic with assert statements
                because there is no guarantee for the execution of assert statement always
                at runtime.

            Appropriate Way
            ===============
            public void withdraws (double amount) {
                if (amount < 100)
                    throw new IllegalRequestException();
                else
                process request;
            }

            Inappropriate Way
            =================
            public void withdraws (double amount) {
                assert (amount >= 100);
                process request;
            }

            2.	While performing debugging in our program if there is any place where the
                control is not allowed to reach, i.e., the best place to use assertions.

            switch(x) {
                case1:
                    SOP ("JAN");
                    break;
                case2:
                    SOP ("FEB");
                    break;
                case12:
                    SOP ("DEC");
                    break;
                default:
                    assert(false);
            }

            3.	It is always inappropriate to validate the public method arguments using the
                assertions. Because the outside person isn't aware of whether assertions are
                enabled or disabled.

            4.	It is always appropriate for validating private method arguments because the
                local person can be aware whether assertions are enabled or disabled.

            5.	It is always inappropriate to validate the command line arguments by using
                the assertions because these are arguments to public methods.
        */
        new AssertionUsageDemo().m1(11);
        new AssertionUsageDemo().m2(9);
        new AssertionUsageDemo().m3();
    }

}

class AssertionUsageDemo {

    int z = 5;

    public void m1(int x) {
        assert (x > 10); // Inappropriate
        switch (x) {
            case 11 -> System.out.println(11);
            default -> {
                assert (false); // Appropriate
            }
        }
    }

    void m2(int x) {
        assert (x < 10); // Appropriate
    }

    void m3() {
        assert (m4()); // Inappropriate
    }

    private boolean m4() {
        z = 6;
        return true;
    }

}

