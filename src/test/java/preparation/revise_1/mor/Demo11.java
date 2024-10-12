package preparation.revise_1.mor;

public class Demo11 {

    public static void main(String[] args) {
        DerivedClass<String> derivedClass = new DerivedClass<>();
        String value = derivedClass.getValue();
        System.out.println(value);
    }

    static class BaseClass<T> {
        T getValue(){
            System.out.println("BaseClass GetValue");
            return null;
        }
    }

    static class DerivedClass<T>  extends  BaseClass<T> {

        @Override
        T getValue(){
            System.out.println("DerivedClass GetValue");
            return null;
        }
    }
}
