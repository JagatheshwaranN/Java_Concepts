package preparation.revise_1.inherit;

public class TightCoupleDemo {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for(Shape shape : shapes){
            shape.draw();
        }
    }

    public static class Shape {

        public void draw(){
            System.out.println("Draw any shape");
        }
    }

    public static class Circle extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw circle");
        }
    }

    public static class Square extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw square");
        }
    }
}
