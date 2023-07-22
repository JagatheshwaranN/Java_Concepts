package java7andbelow.features.oops;

public class _15_Polymorphism {

    public static void main(String[] args) {

        /*
            Polymorphism
            ============
            One name but multiple forms is the concept of polymorphism.

            Example 1,
            Method name is same, but we can apply for different types of arguments.
            It’s known as overloading.

            Example 2,
            Method signature is same but in parent class it has one type of implementation
            and in child class, it has another type of implementation. It’s known as overriding.
        */
    }
}
class Example1Demo{
    public void add(int a, int b){
    }
    public void add(double c, double d) {
    }
}

class Example2Demo {
    public void method(){
        System.out.println("Parent Method");
    }
}

class Example2ChildDemo extends Example2Demo {
    @Override
    public void method() {
        System.out.println("Child Method");
    }
}