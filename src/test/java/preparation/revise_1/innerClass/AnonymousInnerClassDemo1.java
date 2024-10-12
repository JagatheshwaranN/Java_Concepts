package preparation.revise_1.innerClass;

public class AnonymousInnerClassDemo1 {

    public static void main(String[] args) {

        AnonymousInnerClassDemo1 anonymousInnerClassDemo = new AnonymousInnerClassDemo1();
        AnonymousInnerClassDemo1.IFace anonymousclass = new IFace(){

            @Override
            public void show() {
                System.out.println("Anonymous Inner Class Method");
            }
        };
        anonymousclass.show();
        anonymousInnerClassDemo.display();
    }

    public void display() {
        System.out.println("OuterClass Method");
    }

    interface IFace {
        void show();
    }
}
