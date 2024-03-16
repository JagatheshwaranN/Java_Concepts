package java7andbelow.features.oops;

public class _35_Covariance_Contravariance {

    /*
        Covariance:
        ===========
        1. Covariance allows for a more specific type to be used in place of a less specific
        type in the hierarchy.
        2. In Java, covariance is achieved when a generic type parameter in a subclass is more
        specific than the generic type parameter in its superclass.
        3. This means that a subclass can return a more specific type than its superclass in
        methods that involve generic types.

        Contravariance:
        ===============
        1. Contravariance allows for a less specific type to be used in place of a more specific
        type in the hierarchy.
        2. In Java, contravariance is achieved when a generic type parameter in a superclass is
        more specific than the generic type parameter in its subclass.
        3. This means that a subclass can accept a more specific type than its superclass in
        methods that involve generic types.
    */

    /*
        Covariance
        ==========
    */
    static class Animal {
    }

    static class Dog extends Animal {
    }

    public interface AnimalShelter<T extends Animal> {
        T adopt();
    }

    static class DogShelter implements AnimalShelter<Dog> {
        @Override
        public Dog adopt() {
            return new Dog();
        }
    }

    /*
        Contravariance
        ==============
    */
    interface Trainer<T extends Animal> {
        void train(T animal);
    }

    static class DogTrainer implements Trainer<Dog> {
        @Override
        public void train(Dog dog) {
            System.out.println("Training a " + dog.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        // Covariance
        AnimalShelter<? extends Animal> shelter = new DogShelter();
        Animal animal = shelter.adopt(); // Covariance: Animal is more general than Dog
        System.out.println("Adopted a " + animal.getClass().getSimpleName());

        // Contravariance
        Trainer<? super Dog> trainer = new DogTrainer();
        trainer.train(new Dog()); // Contravariance: Dog is more specific than ? super Dog
    }

}
