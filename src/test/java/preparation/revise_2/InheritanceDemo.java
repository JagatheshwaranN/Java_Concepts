package preparation.revise_2;

@SuppressWarnings("All")
public class InheritanceDemo {

    public static void main(String []args) {
        Animals animal = new Animals();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }

}

class Animals {

    public void eat() {
        System.out.println("Animal Eats..");
    }

    private void makeSound() {
        System.out.println("Animal Sounds..");
    }

}

class Cat extends Animals {

    public void meow() {
        System.out.println("Cat sounds meow..");
    }

}
