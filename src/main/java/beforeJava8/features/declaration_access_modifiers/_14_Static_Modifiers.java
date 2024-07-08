package beforeJava8.features.declaration_access_modifiers;

public class _14_Static_Modifiers {

    static int x1 = 10;
    int y1 = 20;
    public static void main(String[] args) {

        /*
            Static Modifier
            ===============
            1.	Static is a modifier applicable for methods and variables but not for classes. We can’t
                declare top level class with static modifier, but we can declare the inner class as static
                (Such type of inner class is called as Static Nested Class)

            2.	In case of static variable, a single copy of the value will be created at class level and
                shared by every object of that class.

            3.	We can’t access the instance members directly from the static area / method, but we can
                access from instance area directly. We can access the static members from both instance
                and static areas directly.
        */
        // Recommended to use Class reference on Static members. For demo purpose, the static members were
        // used with objects.

        _14_Static_Modifiers object1 = new _14_Static_Modifiers();
        object1.x1 = 888;
        object1.y1 = 30;
        _14_Static_Modifiers object2 = new _14_Static_Modifiers();
        System.out.println(object2.x1);
        System.out.println(object2.y1);
        object1.method1();
        method2();
    }

    public void method1(){
        System.out.println(x1);
        System.out.println(y1);
    }

    public static void method2(){
        System.out.println(x1);
        // System.out.println(y1); - non-static variable y1 cannot be referenced from a static context
    }

}
