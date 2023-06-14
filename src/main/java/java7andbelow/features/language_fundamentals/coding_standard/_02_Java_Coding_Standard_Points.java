package java7andbelow.features.language_fundamentals.coding_standard;

public class _02_Java_Coding_Standard_Points {

    public static void main(String[] args) {

        /*
            Coding Standard for Class
            =========================
            Usually, the class names are nouns and should start with the upper-case character and if it contains
            multiple words and every inner words should start with upper case characters.

            Coding Standard for Interface
            =============================
            Usually, the interface names are adjectives and should starts with the upper-case character and if it
            contains the multiple words and every inner words should start with upper case characters.

            Coding Standard for Methods
            ===========================
            Usually, the method names either verb or verb-noun combination and should starts with lower-case and if
            it contains multiple words and every inner words should start with upper-case (camelCase convention).

            Coding Standard for Variables
            =============================
            Usually, the variable names are nouns and should starts with lower-case and if it contains multiple words
            and every inner words should start with upper-case (camelCase convention).

            Coding Standard for Constants
            =============================
            Usually, the constant names are nouns and should contain only upper-case characters and if it contains
            multiple words and every inner words should be separated with the underscore symbol. Usually, we can
            declare constants with public, static and final modifiers.

            JavaBean Coding Standards
            =========================
            A JavaBean is a simple java class with private properties and public getter and setter methods. Class
            name ends with Bean is not an official convention from SUN microsystems.

            The setter method should be public method and the return type should be void. The method name prefixed
            with set. It should take some argument, i.e., it should not be no argument method.

            The getter method should be public method and the return type should not be void. The method name prefixed
            with get. It should not take any argument.

            For boolean properties, the getter method name can be prefixed with either get or is. But it’s recommended
            to use is.

            Coding Standard for Listeners
            =============================
            To register a listener, method name should be prefixed with the "add".

            For example,
            public void addMyActionListener(MyActionListener l) => valid
            public void registerMyActionListener(MyActionListener l) => invalid
            public void addActionListener(MyActionListener l) => invalid

            To remove the listener, method name should be prefixed with the "remove".

            For example,
            public void removeMyActionListener(MyActionListener l) => valid
            public void unregisterMyActionListener(MyActionListener l) => invalid
            public void removeActionListener(MyActionListener l) => invalid
            public void deleteMyActionListener(MyActionListener l) => invalid
       */
    }
}
