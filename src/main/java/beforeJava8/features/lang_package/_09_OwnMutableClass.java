package beforeJava8.features.lang_package;

public class _09_OwnMutableClass {

    public static void main(String[] args) {

        /*
            Immutability
            ============
            Once we create an object, we can't perform any changes in the object. If we are trying
            to perform any change and if there is a change in the content, then with those changes,
            a new object will be created. If there is no change in the content then existing object
            will be reused. This behavior is called as Immutability.
        */

        Test test1 = new Test(10);
        Test test2 = new Test(100);
        Test test3 = new Test(10);
        Test test4 = test1;
        System.out.println(test1 == test2);
        System.out.println(test1 == test3);
        System.out.println(test1 == test4);
        System.out.println(test1.equals(test2));
        System.out.println(test1.equals(test3));
        System.out.println(test1.equals(test4));

        /*
            Final vs Immutability
            =====================
            Final applicable for variables but not for objects whereas Immutability applicable
            for objects but not for variables. By declaring a reference variable as final we
            won't get any immutable nature even though reference variable is final, we can perform
            any change in the corresponding object, but we can't perform reassignment for the
            variable. Hence, both Final and Immutability are different concepts.
        */

        final StringBuffer sb = new StringBuffer("java");
        sb.append(" program");
        System.out.println(sb);
        // sb = new StringBuffer(" technology"); // java: cannot assign a value to final variable sb
    }
}

final class Test {

    private final int i;

    Test(int i){
        this.i = i;
    }

    public Test modify(int i){
        if(this.i == i){
            return this;
        } else{
            return new Test(i);
        }
    }

}