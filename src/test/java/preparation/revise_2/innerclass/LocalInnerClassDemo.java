package preparation.revise_2.innerclass;

@SuppressWarnings("All")
public class LocalInnerClassDemo {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }

}


class Outer {

    private static final String outerField = "Outer Data";

    public void outerMethod() {

        class LocalInner {
            void display() {
                System.out.println(outerField);
            }
        }

        LocalInner inner = new LocalInner();
        inner.display();
    }

}
