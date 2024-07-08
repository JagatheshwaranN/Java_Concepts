package beforeJava8.features.inner_classes;

public class _05_AnonymousInnerClassTypes {

    public static void main(String[] args) {

        /*
            Types of Anonymous Inner Classes
            ================================
            1.	Anonymous Inner Class that extends a Class.
            2.	Anonymous Inner Class that implements an Interface.
            3.	Anonymous Inner Class that defined inside arguments.
        */

        /*
            1.	Anonymous Inner Class that extends a Class.
            ===============================================
            Analysis
            ========
            Case 1: Popcorn p = new Popcorn ();
            ===================================
            We are creating the object for the Popcorn class.

            Case 2: Popcorn p = new Popcorn () {};
            ======================================
            We are declaring a class that extends Popcorn class without name (Anonymous Inner
            Class). For that child class, we are creating an object with parent class reference.

            Case 3: Popcorn p = new Popcorn () {public void taste () {}};
            =============================================================
            We are declaring a class that extends Popcorn class without name (Anonymous Inner
            Class). In that child class, we are overriding the taste () method. For that child
            class, we are creating an object with parent class reference.
        */
        Popcorn popcorn1 = new Popcorn() {
            public void taste(){
                System.out.println("Spicy");
            }
        };
        popcorn1.taste();

        Popcorn popcorn2 = new Popcorn();
        popcorn2.taste();

        Popcorn popcorn3 = new Popcorn() {
            public void taste(){
                System.out.println("Sweet");
            }
        };
        popcorn3.taste();

        /*
            Anonymous Inner Class Approach for Thread Class
        */
        Thread thread = new Thread(){
            public void run() {
                for( int i = 0; i < 2; i++){
                    System.out.println("Child Thread");
                }
            }
        };
        thread.start();
        for(int i = 0; i < 2; i++){
            System.out.println("Main Thread");
        }

        /*
            2.	Anonymous Inner Class that implements an Interface.
            =======================================================
            Anonymous Inner Class Approach to implement Runnable
        */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for( int i = 0; i < 2; i++){
                    System.out.println("Runnable Child Thread");
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        for( int i = 0; i < 2; i++){
            System.out.println("Runnable Main Thread");
        }

        /*
            3.	Anonymous Inner Class that defined inside arguments.
            ========================================================
        */
        new Thread(new Runnable() {
            @Override
            public void run() {
                for( int i = 0; i < 2; i++){
                    System.out.println("Inside Arguments - Child Thread");
                }
            }
        }).start();
        for(int i = 0; i < 2; i++){
            System.out.println("Inside Arguments - Main Thread");
        }
    }
}

/*
    Anonymous Inner Class that extends a Class
*/
class Popcorn {

    public void taste() {
        System.out.println("Salty");
    }
}

