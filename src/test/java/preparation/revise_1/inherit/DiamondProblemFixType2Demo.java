package preparation.revise_1.inherit;

public class DiamondProblemFixType2Demo {

    public static void main(String[] args) {
        ColoredShape redCircle = new ColoredShape(new Circle());
        redCircle.draw();
        ColoredShape blueSquare = new ColoredShape(new Square());
        blueSquare.draw();
    }

    public interface Drawable {
        void draw();
    }

    public static class Shape {

    }

    public static class Circle extends Shape implements Drawable {

        @Override
        public void draw() {
            System.out.println("drawing a Circle");
        }
    }

    public static class Square extends Shape implements Drawable {

        @Override
        public void draw() {
            System.out.println("drawing a Square");
        }
    }

    public static class ColoredShape implements Drawable {

        private Drawable shape;

        public ColoredShape(Drawable shape){
            this.shape = shape;
        }


        @Override
        public void draw() {
            System.out.print("Adding color to ");
            shape.draw();
        }
    }
}
