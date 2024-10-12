package java.features.exception_handling;

public class _09_Possible_Try_Catch_Finally_Combo {
    public static void main(String[] args) {

        /*
            Various possible combination of Try Catch Finally
            =================================================
            1.	In Try Catch Finally, the order is important.

            2.	Whenever we are writing the try compulsory, we should write either catch or finally
                otherwise we will get the compile time error. i.e., try without catch/finally is
                invalid.

            3.	Whenever we are writing the catch block compulsory try block must be required i.e.,
                catch without try is invalid.

            4.	Whenever we are writing the finally block compulsory try block must be required i.e.,
                finally without try is invalid.

            5.	Inside try catch and finally blocks we can declare the try catch and finally blocks.
                i.e., nesting of the try catch finally is allowed.

            6.	For try catch finally blocks, curly braces are mandatory.
        */

        /*
            Examples,
            try {
            }
            catch (X e) {
            }
            =====================================
            try {
            }
            catch (X e) {
            }
            catch (Y e) {
            }
            =====================================
            try {
            }
            catch (X e) {
            }
            catch (X e) {
            }
            CE: Exception X has already been caught.
            =====================================
            try {
            }
            catch (X e) {
            }
            finally {
            }
            =====================================
            try {
            }
            finally {
            }
            =====================================
            try {
            }
            CE: try without catch or finally
            =====================================
            catch (X e) {
            }
            CE: catch without try
            =====================================
            finally {
            }
            CE: finally without try
            =====================================
            try {
            }
            finally {
            }
            catch (X e) {
            }
            CE: catch without try
            =====================================
            try {
            }
            SOP (Hello);
            catch (X e) {
            }
            CE: try without catch or finally
            CE: catch without try
            =====================================
            try {
            }
            catch (X e) {
            }
            SOP(Hello);
            finally {
            }
            CE: finally without try
            =====================================
            try {
                try {
                }
                catch (X e) {
                }
            }
            catch (X e) {
            }
            =====================================
            try {
            }
            catch (X e) {
                try {
                }
                catch (X e) {
                }
            }
            =====================================
            try {
            }
            catch (X e) {
            }
            finally {
                try {
                }
                catch (X e) {
                }
            }
            =====================================
            try
            SOP(Hello);
            catch
            SOP(Hello);
            finally
            SOP(Hello);
            Not valid and compile time error
        */
    }
}
