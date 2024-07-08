package beforeJava8.features.language_fundamentals.reservewords;

/**
 * In Java, some words are reserved to represent some meaning or functionality, such words are known as Reserved words.
 *
 * @author Jagatheshwaran N
 */
public class _01_Reserve_Words_Demo1 {

    public static void main(String[] args) {
       /*
            Reserve words (53) -> Keywords (50) + Reserved literals (3)

            Reserved literals (3) -> true, false, null

            Keywords (50) -> Used Keywords (48) + Unused Keywords (2)

            Unused Keywords (2) -> goto, const

            Data Type Keywords (8) -> byte, short, int, long, float, double, boolean, char

            Flow Control Keywords (11) -> if, else, switch, case, default, while, do, for, break, continue, return

            Modifier Keywords (11) -> private, public, protected, static, final, abstract, synchronized, native,
            strictfp (1.2 intro), transient, volatile, (default)

            Error handling Keywords (6) -> try, catch, throw, throws, finally, assert (1.4 Intro)

            Class Keywords (6) -> class, interface, extends, implements, package, import

            Object Keywords (4) -> new, instanceof, super, this

            Return Type Keyword (1) -> void

            enum (1.5 Intro)
    */

        /*
         *  Points to note about Reserve Words
         *  ==================================
         *  1.	Usage of goto created several issues in old programming languages. Hence, SUN people banned this keyword in Java.
         *  2.	Use final instead of Const.
         *  3.	goto and const are unused keywords. If we are trying to use, then compile time error will be triggered.
         *  4.	true, false -> value for boolean data type.
         *  5.	null -> default value for object reference.
         *  6.	enum -> We can use enum to define a group of named const.
         *  7.	All 53 reserved words in java contains only lower-case symbols.
         *  8.	In Java, we have only new keyword and there is no delete keyword. Because, the destruction of useless object is the responsibility of Garbage Collector.
         */
    }
}
