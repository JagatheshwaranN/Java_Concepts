package preparation.revise_2.main;

public class MainMethodDemo {

    public static void main(String[] args) {
        System.out.println("Standard Main Method");
        main(new int[]{1});
    }

//    static public void main(String[] args) {
//        System.out.println("Standard Main Method");
//    }

//    public static void main(String... args) {
//        System.out.println("Standard Main Method");
//    }

//    public final static void main(String[] args) {
//        System.out.println("Standard Main Method");
//    }

//    public synchronized static void main(String[] args) {
//        System.out.println("Standard Main Method");
//        main(new int[]{1});
//    }

//    static final synchronized strictfp public void main(String... we) {
//        System.out.println("Standard Main Method");
//        main(new int[]{1});
//    }

    static public void main(int[] args) {
        System.out.println("Overloaded Main Method");
    }

}
