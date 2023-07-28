package java7andbelow.features.oops;

public class _23_InstanceControlFlow_Child extends _23_InstanceControlFlow_Parent {

    int x = 100;
    {
        m2();
        System.out.println("Child First Instance Block");
    }

    _23_InstanceControlFlow_Child(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        _23_InstanceControlFlow_Child child = new _23_InstanceControlFlow_Child();

        System.out.println("Child Main Method");
    }

    public void m2(){
        System.out.println(y);
    }

    {
        System.out.println("Child Second Instance Block");
    }

    int y = 200;
}
