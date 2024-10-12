package preparation.revise_1.poly;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    public static void eat() {
        System.out.println("Generic animal eat");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public static void eat() {
        System.out.println("Dog eat");
    }

}

public class Demo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); // Upcasting

        animal1.makeSound(); // Output: Generic animal sound
        animal2.makeSound(); // Output: Woof! (dynamic binding)
        animal1.eat();
        animal2.eat();
    }
}
