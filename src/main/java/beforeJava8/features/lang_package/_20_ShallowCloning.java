package beforeJava8.features.lang_package;

public class _20_ShallowCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            Shallow Cloning
            ===============
            The process of creating the bitwise copy of an object is called as Shallow cloning.
            If the main object contains primitive variables, then exactly duplicate copies will
            be created in the cloned object. If the main object contains any reference variable,
            then corresponding object won't be created instead just the duplicate reference
            variable will be created and pointing to the contained object.

            Object class clone() method meant for shallow cloning.
        */

        Car car = new Car(4);
        AutoMobile autoMobile1 = new AutoMobile(car, 20);
        System.out.println(autoMobile1.j);
        System.out.println(autoMobile1.c.i);

        /*
            In shallow cloning, by using cloned object reference, if we perform any change to the
            contained object then those changes will be reflected to the main object. To overcome
            this problem, we should go for Deep cloning.
        */
        AutoMobile autoMobile2 = (AutoMobile)autoMobile1.clone();
        autoMobile2.j = 30;
        autoMobile2.c.i = 10;

        System.out.println(autoMobile1.j);
        System.out.println(autoMobile1.c.i);
    }
}

class Car {

    int i;

    Car(int i){
        this.i = i;
    }
}

class AutoMobile implements Cloneable {

    Car c;
    int j;

    AutoMobile(Car c, int j){
        this.c = c;
        this.j = j;

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}