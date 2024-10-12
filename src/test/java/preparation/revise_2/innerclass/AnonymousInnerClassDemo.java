package preparation.revise_2.innerclass;

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello From Anonymous Inner Class");
            }
        };
        greeting.sayHello();
    }
}

interface  Greeting {
    void sayHello();
}