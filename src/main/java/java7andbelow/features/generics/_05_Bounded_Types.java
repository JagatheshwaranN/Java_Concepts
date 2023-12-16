package java7andbelow.features.generics;

public class _05_Bounded_Types {

    public static void main(String[] args) {

        /*
            Bounded Types
            =============
            We can bound the type parameter for a particular range by using extends keyword.
            Such types are called as Bounded Types.

            Not Bounded
            ===========
            class Test<T> {
            }

            As a type parameter, we can pass any type and there are no restrictions and hence
            its unbounded type.
            Test<Integer> t1 = new Test<Integer>();
            Test<String> t2 = new Test<String>();

            Bounded
            =======
            class Test<T extends X>{
            }

            X can be either class or interface, if X is a class, then as a type parameter,
            we can pass either X type or its child classes. If X is an interface, then as a
            type parameter we can pass either X type or its implementation classes.

            class Test<T extends Integer>{
            }
            Test<Integer> t1 = new Test<Integer>();
            Test<String> t2 = new Test<String>(); // CTE Type parameter java.lang.String is not within its bound.

            class Test<T extends Runnable>{
            }
            Test<Runnable> t1 = new Test<Runnable>();
            Test<Thread> t2 = new Test<Thread>();
            Test<Integer> t3 = new Test<Integer>(); // CTE Type parameter java.lang.Integer is not within its bound.

            We can define bounded types even in combination as well.
            Example,
            class Test<T extends Number & Runnable>{
            }

            As a type parameter, we can take anything that should be child class of number
            and should implement-runnable interface.
            class Test<T extends Runnable & Comparable>
            class Test<T extends Number & Runnable & Comparable >
            class Test<T extends Runnable & Number > // Not valid, because we have to extend class first
            class Test<T extends Number & Thread > // Not valid, because we can't extend more than 1 class
        */

        /*
            Conclusion
            ==========
            1.	We can define bounded types only by using extends keyword, and we can't
                use implements and super keywords. But we can replace implements keyword
                purpose with extends keyword.
                class Test<T extends Number>{
                }
                class Test<T extends Runnable>{            {
                }
                class Test<T implements Runnable>{ // Invalid
                }
                class Test< T Super String>{ // Invalid
                }

            2.	As a type parameter, we can take any valid java identifier but its convention
                to use T.
                class Test<T>{
                }
                class Test<X>{
                }
                class Test<A>{
                }

            3.	Based on our requirement, we can declare any number of type parameters, and
                all these type parameters should be separated with ,(comma).
                class Test<A, B>{
                }
                class Test<X, Y, Z>{
                }
        */
    }

}
