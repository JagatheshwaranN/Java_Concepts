package preparation.revise_2;

@SuppressWarnings("All")
public abstract class AbstractClassDemo {

    int data;

    AbstractClassDemo() {
        data = 10;
        System.out.println("Abstract Class Constructor");
    }
    abstract void test1();

    void test2() {

        System.out.println(STR."Abstract - Test2 \{data}");
    }

}

class Demo1 extends AbstractClassDemo {

    @Override
    void test1() {
        System.out.println("Demo1 - Test1");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.test1();
        demo1.test2();
    }
}