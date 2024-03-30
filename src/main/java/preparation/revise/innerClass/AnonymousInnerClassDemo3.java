package preparation.revise.innerClass;

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

    static interface IFace {
        void show();
    }
}
