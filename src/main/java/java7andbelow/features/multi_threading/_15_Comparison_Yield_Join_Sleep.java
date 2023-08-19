package java7andbelow.features.multi_threading;

public class _15_Comparison_Yield_Join_Sleep {

    public static void main(String[] args) {

        /*
            Comparison of Yield, Join and Sleep
            ===================================
            Activity	      Yield	                Join	               Sleep
            ========          =====                 ====                   =====
            Purpose	          If a thread wants to  If a thread wants to   If a thread does not want
                              pause its execution   wait until completion  to perform any operation
                              to give the chance    of some other thread,  for a particular amount of
                              for remaining threads then we should go for  time, then we should go for
                              of same priority,      Join.                 Sleep.
                              then we should go
                              for Yield.

            Is it overloaded? No	                Yes	                   Yes

            Is it final?	  No	                Yes	                   No

            Is it throws
            Interrupted
            Exception?	      No	                Yes	                   Yes

            Is it native?	  Yes	                No	                   Sleep(long ms)-native

            Is it static?	  Yes	                No	                   Yes
        */
    }
}
