package java7andbelow.features.oops;

public class _20_Static_Block {

    public static void main(String[] args) {

        /*
            Static Block
            ============
            Static blocks will be executed at the time of class loading. Hence, at the time of
            class loading if we want to perform any activity, we have to define that in static block.

            Example 1,
            At the time of Java class loading, the corresponding native libraries should be loaded.
            Hence, it should be defined inside the static block.
            class Test {
            static {
            System.loadLibrary(Native library path);
            }
            }

            Example 2,
            After loading every DB driver class, we have to register the driver class with driver
            manager but inside the DB driver class there is a static block to perform this activity,
            and we are not responsible to register the driver explicitly.
            class DBDriver {
            static {
            Register this driver with driver manager;
            }
            }

            Note: Within a class, we can declare any number of static blocks but all these static
                  blocks will be executed from top to bottom.
        */

        /*
            QQ: 1.	Without writing main method, is it possible to print some statements
                    to the console?
                Yes, by using the static block we can print until Java 1.6 version.
                class Test {
                static {
                SOP(Hello);
                System.exit(0);
                }
                }

            QQ: 2.	Without writing main method and static block, is it possible to print some
                    statements to the console?
                Yes, of course, there are multiple ways as below. (This feature is applicable till
                Java 1.6 version)

                class Test {
                static Test t = new Test ();
                Test () {
                SOP(Hello);
                System.exit(0);
                }
                }

                class Test {
                static Test t = new Test ()
                {
                SOP(Hello);
                System.exit(0);
                };
                }

                class Test {
                static int x = m1();
                public static int m1() {
                SOP(Hello);
                System.exit(0);
                }
                }

                Note: From 1.7 version onwards, the main method is mandatory to start the
                      execution of the program. So, from 1.7 version onwards it's impossible
                      to print the statements to console without main method.
        */
    }
}
