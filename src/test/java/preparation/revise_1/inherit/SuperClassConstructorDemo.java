package preparation.revise_1.inherit;

public class SuperClassConstructorDemo {

    public static void main(String[] args) {
        SubClass subClass1 = new SubClass("Hello");
        SubClass subClass2 = new SubClass();
    }

    public static class SuperClass {

        private int number;
        public SuperClass(int number){
            this.number = number;
            System.out.println("SuperClass Parameterized Constructor");
        }

        public int getNumber() {
            return number;
        }
    }

    public static class SubClass extends SuperClass {
        private String text;

        public SubClass(String text){
            super(1);
            this.text = text;
            System.out.println("SubClass Parameterized Constructor");
        }

        public SubClass(){
            super(0);
            System.out.println("SubClass NoArg Constructor");
        }

        public String getText() {
            return text;
        }
    }

}
