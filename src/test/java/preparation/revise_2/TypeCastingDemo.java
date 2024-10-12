package preparation.revise_2;

@SuppressWarnings("All")
public class TypeCastingDemo {

    public static void main(String[] args) {
        AnimalKingdom animalKingdom = new AnimalKingdom();
        animalKingdom.makeSound();
        Zebra zebra = new Zebra();
        zebra.makeSound();
        zebra.eat();
        System.out.println("********** UpCasting **********");
        // UpCasting
        AnimalKingdom animalKingdom1 = new Zebra();
        animalKingdom1.makeSound();
        System.out.println("********** DownCasting **********");
        // Down-casting
        AnimalKingdom animalKingdom2 = new Zebra();
        if(animalKingdom2 instanceof Zebra) {
            Zebra zebra1 = (Zebra) animalKingdom2;
            zebra1.makeSound();
            zebra1.eat();
        }

        // Normal Flow
        Circle circle = new Circle();
        circle.draw();

        // UpCasting
        Drawable drawable = new Circle();
        drawable.draw();

        // DownCasting
        Drawable drawable1 = new Circle();
        Circle circle1 = (Circle) drawable1;
        circle1.draw();
    }

}

class AnimalKingdom {
    public void makeSound() {
        System.out.println("HUhh....");
    }
}

class Zebra extends AnimalKingdom {
    public void eat() {
        System.out.println("Zebra Eats");
    }
}

interface Drawable {
    void draw();
}

class Circle implements  Drawable {
    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}
