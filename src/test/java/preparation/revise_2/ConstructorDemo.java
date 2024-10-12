package preparation.revise_2;

public class ConstructorDemo {

    public static void main(String[] args) {
        new Child();
        Child one = new Child("John");
        one.display();
        Child two = new Child(one);
        two.display();
    }
}

class Parent {

    Parent() {
        this(1);
        System.out.println("Parent Constructor");
    }

    Parent(int i) {
        this("C");
        System.out.println("Parent Constructor - Int");
    }

    Parent(String i) {

        System.out.println("Parent Constructor - String");
    }

}


class Child extends Parent {
    String name;

    Child() {
        super(); // Optional - If not called explicitly, Compiler invokes it implicitly.
        System.out.println("Child Constructor");
    }

    Child(String name) {
        this.name = name;
    }

    Child(Child c){
        this.name = c.name;
    }

    void display() {
        System.out.println(name);
    }

}