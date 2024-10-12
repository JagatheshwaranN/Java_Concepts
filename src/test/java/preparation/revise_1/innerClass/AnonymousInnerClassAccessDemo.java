package preparation.revise_1.innerClass;

public class AnonymousInnerClassAccessDemo {

    int a = 10;

    static int b = 20;

    public void display() {

        Runnable runnable = new Runnable() {
            int b = 100;
            @Override
            public void run() {
                System.out.println(AnonymousInnerClassAccessDemo.b);
                System.out.println(b);
                System.out.println(a);
            }
        };
        runnable.run();
    }
    public static void main(String[] args) {

        AnonymousInnerClassAccessDemo accessDemo = new AnonymousInnerClassAccessDemo();
        accessDemo.display();
    }



}
