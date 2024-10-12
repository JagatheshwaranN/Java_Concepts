package preparation.revise_1.iface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MarkerAnnotationDemo {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.document();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface MyMarkerAnnotation{

    }

    @MyMarkerAnnotation
    public static class MyClass {
        void document(){
            System.out.println("MarkerAnnotation Demo");
        }
    }
}
