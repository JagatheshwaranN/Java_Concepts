package beforeJava8.features.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class _03_NumberFormat {

    public static void main(String[] args) throws ParseException {

        /*
            NumberFormat
            ============
            Various locations follow varies styles to represent a Java number.
            Example,
            double d = 123456.789
            IN = 1,23,456.789
            US = 123,456.789

            We can use NumberFormat class to format a Java number according to a
            particular Locale.
            NumberFormat class present in java.text package, and it is an abstract class.
            To get the NumberFormat object for the default Locale, NumberFormat class
            defines the following methods.

            NumberFormat Methods
            ====================
            public static NumberFormat getInstance();
            public static NumberFormat getCurrencyInstance();
            public static NumberFormat getPercentInstance();
            public static NumberFormat getNumberInstance();

            To get the NumberFormat object for the specific Locale, NumberFormat class
            defines the following methods.

            public static NumberFormat getInstance(Locale l);
            public static NumberFormat getCurrencyInstance(Locale l);
            public static NumberFormat getPercentInstance(Locale l);
            public static NumberFormat getNumberInstance(Locale l);

            Once we got the NumberFormat object, we can call format and parse methods on
            that object.

            public String format(long l);
            public String format(double d);
            To convert the java numbers to a locale specific String form.

            public Number parse (String s) throws ParseException
            To convert a locale specific String form to a java number form.

        */

        NumberFormatDemo.demo1();

        /*
            Setting Maximum and Minimum Integer and Fraction Digits
            =======================================================
            NumberFormat class defines the following methods to set the max and min limit
            for Integer and fraction digits.

            public void setMaximumFractionDigits(int n)
            public void setMinimumFractionDigits(int n)
            public void setMaximumIntegerDigits(int n)
            public void setMinimumIntegerDigits(int n)

        */

        NumberFormatDemo.demo2();
    }

}

class NumberFormatDemo {

    public static void demo1() throws ParseException {

        double val = 123456.789;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Italy format : " + numberFormat.format(val));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("USA format : " + numberFormat.format(val));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China format : " + numberFormat.format(val));

        Locale locale = Locale.of("ta", "IN");
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(locale);
        System.out.println("India format : " + numberFormat1.format(val));

        numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.format(val));

        numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.format(val));

        numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(val));

        numberFormat = NumberFormat.getPercentInstance();
        System.out.println(numberFormat.format(val));

        numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.parse("123,456.789"));
    }

    public static void demo2() {

        NumberFormat numberFormat = NumberFormat.getInstance();

        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(123.4567));
        System.out.println(numberFormat.format(123.4));

        numberFormat.setMinimumFractionDigits(2);
        System.out.println(numberFormat.format(123.4567));
        System.out.println(numberFormat.format(123.4));

        numberFormat.setMaximumIntegerDigits(3);
        System.out.println(numberFormat.format(123456.789));
        System.out.println(numberFormat.format(1.2345));

        numberFormat.setMinimumIntegerDigits(3);
        System.out.println(numberFormat.format(123456.789));
        System.out.println(numberFormat.format(1.2345));
    }

}
