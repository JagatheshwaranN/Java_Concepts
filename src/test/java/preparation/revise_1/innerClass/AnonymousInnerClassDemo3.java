package preparation.revise_1.innerClass;

public class AnonymousInnerClassDemo3 {

    public static void main(String[] args) {

        IFace iFaceAnonymousClass = new IFace(){

            @Override
            public void show() {
                System.out.println("Anonymous Inner Class Method");
            }
        };
        iFaceAnonymousClass.show();

    }

    interface IFace {
        void show();
    }
}
