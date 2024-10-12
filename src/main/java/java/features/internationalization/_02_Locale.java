package java.features.internationalization;

import java.util.Locale;

public class _02_Locale {

    public static void main(String[] args) {

        /*
            Locale
            ======
            A Locale object represents a geographic location (country / language / both).
            We can create a locale object to represent India. We can create a locale object
            to represent the Indian languages.

            Locale class present in java.util package. It is a final class and its direct
            child class of Object. It implements Serializable and Cloneable interfaces.

            Locale Constructors
            ====================
            @Deprecated
            Locale l = new Locale(String lang);

            Locale l = Locale.of(String lang);

            @Deprecated
            Locale l = new Locale(String lang, String country);

            Locale l = Locale.of(String lang, String country);

            Example,
            Locale l = Locale.of("ta", "IN");

            Locale class already define some constants to represent some standard Locale.
            We can use these constants directly.

            Locale.US
            Locale.UK
            Locale.ENGLISH

            Locale Important Methods
            ========================
            public static Locale getDefault();
            public static void setDefault(Locale l);
            public String getCountry();
            public String getLanguage();
            public String getDisplayCountry();
            public String getDisplayLanguage();
            public static String[] getISOLanguages();
            public static String[] getISOCountries();
            public static String[] getAvailableLocales();

        */
        LocaleDemo.demo();
    }

}

class LocaleDemo {

    public static void demo() {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry() + " => " + locale.getLanguage());
        System.out.println(locale.getDisplayCountry() + " => " + locale.getDisplayLanguage());

        Locale locale1 = Locale.of("ta", "IN");
        System.out.println(locale1.getCountry() + " => " + locale1.getLanguage());
        System.out.println(locale1.getDisplayCountry() + " => " + locale1.getDisplayLanguage());

        Locale.setDefault(locale1);
        System.out.println(Locale.getDefault().getDisplayLanguage());

        String[] languages = Locale.getISOLanguages();
        for( String language : languages){
            System.out.println(language);
        }

        String[] countries = Locale.getISOCountries();
        for(String country : countries){
            System.out.println(country);
        }

        Locale[] availableLocales = Locale.getAvailableLocales();
        for(Locale locales : availableLocales){
            System.out.println(locales.getDisplayCountry()+" => "+locales.getDisplayLanguage());
        }

    }

}
