package preparation.revise_1.inherit;

public class FragilityDemo {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
    }

    public static class Animal {

        public void move(){
            System.out.println("Animal moves");
        }

        public void stops(){
            System.out.println("Animal stops");
        }
    }

    public static class Bird extends Animal {

        @Override
        public void move() {
            super.move();
            System.out.println("Bird flies");
        }

        /*

            Here, if we modify the stop method name to stops in Animal class,
            it will impact the Bird class as well.
            ==================================================================
            @Override
            public void stop() {
                super.stop();
            }
        */
    }

}
