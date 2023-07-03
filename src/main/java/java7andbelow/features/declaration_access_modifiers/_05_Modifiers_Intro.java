package java7andbelow.features.declaration_access_modifiers;

public class _05_Modifiers_Intro {

    public static void main(String[] args) {

        /*
            Class Level Modifiers
            =====================
            Whenever we are writing our own class, we have to provide some information about our class to JVM.
            1.	Whether this class can be accessible from anywhere or not
            2.	Child class creation is possible or not
            3.	Object creation is possible or not

            We can specify the above details with appropriate modifiers.

            The only applicable modifiers for top level classes are public, default, final, abstract and strictfp.
            But for inner classes the applicable modifiers are public, default, final, abstract, strictfp, private,
            protected and static.

            Example,
            private class Test {
            public static void main(String[] args){
            SOP(Hello);
            }
            }
            CE: Modifier Private are not allowed here.

            Access specifiers vs Access modifiers
            =====================================
            1.	Public, Private, Protected and Defaults are considered as specifiers except this remaining are
                considered as modifiers. But this rule is applicable only for old language (c++) and not in Java.

            2.	In Java, all are considered as modifiers only and there is no word like specifiers.
        */
    }
}
