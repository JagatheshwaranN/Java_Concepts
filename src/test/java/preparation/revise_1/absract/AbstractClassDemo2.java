package preparation.revise_1.absract;

public class AbstractClassDemo2 {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.dailyUse();
        smartPhone.compact();
        smartPhone.gadget();
        SmartPhone.variety();
    }

    public static abstract class Electronics {

        public void gadget(){
            System.out.println("Electronic Gadgets");
        }

        public abstract void compact();

        public abstract void dailyUse();

        public static void variety(){
            System.out.println("Android and Iphone");
        }

    }

    public static abstract class Mobile extends Electronics {

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
