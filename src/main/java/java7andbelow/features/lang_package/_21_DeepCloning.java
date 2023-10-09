package java7andbelow.features.lang_package;

public class _21_DeepCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            Deep Cloning
            ============
            The process of creating exactly duplicate independent copy including contained
            object is called as Deep cloning. In deep cloning if main object contains any
            primitive variable, then in the cloned object duplicate values will be created.
            If the main object contains any reference variable, then corresponding contained
            objects will also be created in the cloned copy.

            By default, object class clone() method meant for shallow cloning, but we can
            implement deep cloning explicitly by overriding the clone method in the class.
        */

        CarDemo carDemo = new CarDemo(4);
        AutoMobileDemo autoMobileDemo1 = new AutoMobileDemo(carDemo, 20);
        System.out.println(autoMobileDemo1.j);
        System.out.println(autoMobileDemo1.c.i);

        /*
            By using cloned object reference if we perform any change to the contained object then
            those changes won't be reflected to the main object.
        */
        AutoMobileDemo autoMobileDemo2 = (AutoMobileDemo)autoMobileDemo1.clone();
        autoMobileDemo2.j = 30;
        autoMobileDemo2.c.i = 10;

        System.out.println(autoMobileDemo1.j);
        System.out.println(autoMobileDemo1.c.i);

        System.out.println(autoMobileDemo2.j);
        System.out.println(autoMobileDemo2.c.i);

        /*
            Which cloning is best?
            ======================
            If object contains only primitive variables, then shallow cloning is the best choice.
            If the object contains reference variables, then deep cloning is the best choice.
        */
    }

}

class CarDemo {

    int i;

    CarDemo(int i){
        this.i = i;
    }
}

class AutoMobileDemo implements Cloneable {

    CarDemo c;
    int j;

    AutoMobileDemo(CarDemo c, int j){
        this.c = c;
        this.j = j;

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Object clone = super.clone();
        // CarDemo carDemo = new CarDemo(c.i);
        // AutoMobileDemo autoMobileDemo = new AutoMobileDemo(carDemo, j);
        return new AutoMobileDemo(new CarDemo(c.i), j);
    }

}

