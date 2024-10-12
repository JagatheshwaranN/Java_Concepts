package preparation.revise_1.mor;

public class Demo10 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.getBaby());
        Dog dog = new Dog();
        System.out.println(dog.getBaby());
        Animal animal1 = new Dog();
        Animal babyAnimal = animal1.getBaby();
        Puppy puppy = (Puppy) babyAnimal;
        puppy.play();
    }

    static class Animal {

        public Animal getBaby(){
            return new Animal();
        }
    }

    static class Puppy extends Animal {

        public void play(){
            System.out.println("Puppy play");
        }
    }

    static class Dog extends Animal {

        @Override
        public Puppy getBaby(){
            return new Puppy();
        }
    }

}
