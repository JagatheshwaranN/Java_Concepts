package java.features.oops;

public class _09_Method_Overriding {

    public static void main(String[] args) {

        /*
            Method Overriding
            =================
            Whatever methods Parent has by default available to the Child through Inheritance. If Child
            class is not satisfied with the Parent class implementation, then Child is allowed to redefine
            that method based on its requirement. This process is called as Overriding. The Parent class
            method which is overridden is called as Overridden method and the Child class method which
            is overriding is called as Overriding method.
        */

        /*
            Note
            ====
            In Overriding, the method resolution is always takes care by JVM based on the runtime object
            and hence overriding is also considered as Runtime Polymorphism / Dynamic Polymorphism
            / Late binding.
        */

        Parents parents = new Parents();
        parents.property();
        parents.marry();
        Son son = new Son();
        son.property();
        son.marry();
        Parents parents1 = new Son();
        parents1.property();
        parents1.marry();
    }

}

class Parents {
    public void property(){
        System.out.println("Assets, Business and Jewels");
    }

    public void marry(){
        System.out.println("Parents, Son you should marry Kannama");
    }
}

class Son extends Parents {

    @Override
    public void marry() {
        System.out.println("Son, I will marry Maya and not Kannama");
    }
}
