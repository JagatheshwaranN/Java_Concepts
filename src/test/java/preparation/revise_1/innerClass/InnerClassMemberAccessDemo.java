package preparation.revise_1.innerClass;

public class InnerClassMemberAccessDemo {

    static int a = 10;
    public static void main(String[] args) {

        InnerClassMemberAccessDemo demo = new InnerClassMemberAccessDemo();
        Inner inner = demo.new Inner();
        inner.display();
    }

    class Inner {
      static int a = 100;

        public void display(){
            System.out.println(InnerClassMemberAccessDemo.a);
            System.out.println(a);
        }
    }


}
