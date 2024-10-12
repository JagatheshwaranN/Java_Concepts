package preparation.revise_1.cast;

public class DowncastWithIFaceDemo {

    public static void main(String[] args) {

        Drawable drawable = new Circle();
        if(drawable instanceof Circle){
            Circle circle = (Circle) drawable;
            circle.draw();
        } else if(drawable instanceof Square){
            Square square = (Square) drawable;
            square.draw();
        }else{
            System.out.println("Drawable is not an instance of Circle / Square");
        }
    }

    public interface  Drawable {
        void draw();
    }

    public static class Circle implements Drawable {

        @Override
        public void draw() {
            System.out.println("Draw a Circle");
        }
    }

    public static class Square implements Drawable {

        @Override
        public void draw() {
            System.out.println("Draw a Square");
        }
    }
}
