package java17.feature.instanceOf.switch_exp;

public class _03_Switch_Exp_InstanceOf_Demo3 {

    public static void main(String[] args) {

        Triangle t = new Triangle();
        testTriangle(t);
        Rectangle r = new Rectangle();
        testTriangle(r);
    }

    static class Shape {

    }

    static class Rectangle extends Shape {

    }

    static class Triangle extends Shape {

        int calculateArea(){
            return 150;
        }
    }
    @SuppressWarnings("preview")
	private static void testTriangle(Shape s){
         switch(s){
            // case Triangle t && (t.calculateArea() > 100) -> System.out.println("Large Triangle");
            case Triangle t -> System.out.println("Normal Triangle");
            default -> System.out.println("Unknown");
        }
    }

   
}
