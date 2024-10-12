package preparation.revise_1.innerClass;

public class AnonymousInnerClassDemo2 {

    public static void main(String[] args) {

        AnonymousInnerClassDemo2 anonymousInnerClassDemo2 = new AnonymousInnerClassDemo2(){

            @Override
            void drive() {
                System.out.println("Anonymous InnerClass Method - Drive");
            }
        };

        anonymousInnerClassDemo2.drive();
    }

    void drive() {
        System.out.println("OuterClass Method - Drive");
    }
}
