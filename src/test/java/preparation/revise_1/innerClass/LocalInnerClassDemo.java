package preparation.revise_1.innerClass;

public class LocalInnerClassDemo {

    public static void main(String[] args) {

        LocalInnerClassDemo localInnerClassDemo = new LocalInnerClassDemo();
        localInnerClassDemo.localInnerClassMethod();
    }


    public void localInnerClassMethod() {

        int x = 100;
        class LocalInnerClass {

            final int i = 10;

            public void display() {
                System.out.println(i);
                System.out.println(x);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();

    }
}
