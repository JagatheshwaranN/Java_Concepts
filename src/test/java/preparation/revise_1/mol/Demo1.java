package preparation.revise_1.mol;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Main - MOL Demo");
        main(1);
        new Demo1().main(1.0f);
    }

    public static void main(int args){
        System.out.println("OL - Int - MOL Demo" + args);
    }

    public void main(float args){
        System.out.println("OL - Float - MOL Demo" + args);
    }

}
