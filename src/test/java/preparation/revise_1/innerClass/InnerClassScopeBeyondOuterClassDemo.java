package preparation.revise_1.innerClass;

public class InnerClassScopeBeyondOuterClassDemo {

    private int outerData = 10;


    public static void main(String[] args) {

        InnerClassScopeBeyondOuterClassDemo demo = new InnerClassScopeBeyondOuterClassDemo();
        demo.userInner();

    }

    class InnerClass {
        private int innerData = 20;

        public void display() {
            System.out.println("Outer Data : " + outerData);
            System.out.println("Inner Data : " + innerData);
        }
    }

    public void userInner() {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }

}
