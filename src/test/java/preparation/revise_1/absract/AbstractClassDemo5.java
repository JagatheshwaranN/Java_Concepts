package preparation.revise_1.absract;

public class AbstractClassDemo5 {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.dailyUse();
        smartPhone.compact();
        smartPhone.gadget();
    }

    public interface Electronics {

        default void gadget(){
            System.out.println("Electronic Gadgets");
        }

        void compact();

        void dailyUse();

    }

    public static abstract class Mobile implements Electronics {

        @Override
        public void compact() {
            System.out.println("Mobile device is compact");
        }
    }

    public static class SmartPhone extends Mobile {

        @Override
        public void dailyUse() {
            System.out.println("Smartphone is now daily use product");
        }
    }
}
