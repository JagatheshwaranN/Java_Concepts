package java.features.internationalization;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;

public class _04_DateFormat {

    public static void main(String[] args) {

        /*
            DateFormat
            ==========
            Various locations follow various styles to represent the date.
            IN: DD-MM-YYYY
            US: MM-DD-YYYY

            We can use DateFormat to format Java date, according to a particular
            Locale. DateFormat class is present in java.text package, and it is an
            abstract class.

            DateFormat df = new DateFormat(); // Invalid CTE

            To get the DateFormat object for default Locale, DateFormat class contains
            the following methods.

            public static DateFormat getInstance()
            public static DateFormat getDateInstance()
            public static DateFormat getDateInstance(int style)

            The allowed styles are 0 to 3.
            DateFormat.FULL  => 0 => Saturday 23rd December 2023
            DateFormat.LONG  => 1 => 23rd December 2023
            DateFormat.MEDIUM=> 2 => 23rd Dec 2023
            DateFormat.SHORT => 3 => 23|12|23

            Note: The default style is MEDIUM.

            To get the DateFormat Object for specific Locale, we have the
            following method.

            public static DateFormat getDateInstance(int style, Locale l)
            Once we got the DateFormat object, we can call the following
            methods on that object.

            public String format(Date d)
            To convert a Java Date form to Locale specific String form.

            public Date parse(String s) throws ParseException
            To convert a Locale specific String form to a Java Date form.
        */

        DateFormatDemo.demo1();

        /*
            To display both date and time, the DateFormat class defines the following methods.
            public static DateFormat getDateTimeInstance()
            public static DateFormat getDateTimeInstance(int dateStyle, int timeStyle)
            public static DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale l)
            The allowed styles for time are 0 to 3 only.
        */

        DateFormatDemo.demo2();
    }

}

class DateFormatDemo {

    public static void demo1() {

        System.out.println("Full Form   : " + DateFormat.getDateInstance(0, Locale.US).format(new Date()));
        System.out.println("Long Form   : " + DateFormat.getDateInstance(1, Locale.US).format(new Date()));
        System.out.println("Medium Form : " + DateFormat.getDateInstance(2, Locale.US).format(new Date()));
        System.out.println("Short Form  : " + DateFormat.getDateInstance(3, Locale.US).format(new Date()));

        String dateString = "Dec 23, 2023";
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.ENGLISH);
        ParsePosition parsePosition = new ParsePosition(0);
        Date parsedDate = dateFormat.parse(dateString, parsePosition);
        if (parsedDate != null && parsePosition.getIndex() == dateString.length()) {
            System.out.println("Parsed Date : " + parsedDate);
            System.out.println("End Parse Position : " + parsePosition.getIndex());
        } else {
            System.out.println("Parsing failed. Error index : " + parsePosition.getErrorIndex());
        }
    }

    public static void demo2() {

        System.out.println("Default Form: " + DateFormat.getDateTimeInstance().format(new Date()));

        System.out.println("Full Form   : " + DateFormat.getDateTimeInstance(0, 0).format(new Date()));

        System.out.println("Full Form   : " + DateFormat.getDateTimeInstance(0, 0, Locale.US).format(new Date()));
        System.out.println("Long Form   : " + DateFormat.getDateTimeInstance(1, 1, Locale.US).format(new Date()));
        System.out.println("Medium Form : " + DateFormat.getDateTimeInstance(2, 2, Locale.US).format(new Date()));
        System.out.println("Short Form  : " + DateFormat.getDateTimeInstance(3, 3, Locale.US).format(new Date()));
    }

}