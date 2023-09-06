package java7andbelow.features.inner_classes;

public class _02_Types_of_InnerClasses {

    public static void main(String[] args) {

        /*
            Types of Inner Classes
            ======================
            Based on the position of the declaration and behavior, all Inner Classes are divided
            into 4 types,
            1.	Normal or Regular Inner Class
            2.	Method Level Inner Class
            3.	Anonymous Inner Class
            4.	Static Nested Class

            Normal or Regular Inner Class
            =============================
            If we are declaring any named class directly inside a class without static modifier
            such type of inner class is called as Normal or Regular Inner Class.

            Inside Inner Class, we can't declare any static members. Hence, we can't declare main()
            method, and we can't run inner class directly from the command prompt. Because the Inner
            Class always talks about the Instance terminology, and it can be accessed only with Outer
            Class object.
        */
    }
}

class OuterClass {

    class InnerClass {

    }
}
