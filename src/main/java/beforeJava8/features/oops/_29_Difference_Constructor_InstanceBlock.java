package beforeJava8.features.oops;

public class _29_Difference_Constructor_InstanceBlock {
    static int count = 0;

    {
        count++;
    }
    _29_Difference_Constructor_InstanceBlock(){

    }
    _29_Difference_Constructor_InstanceBlock(int i){

    }
    _29_Difference_Constructor_InstanceBlock(double d){

    }
    public static void main(String[] args) {

        /*
            Difference between Constructor and Instance Block
            =================================================
            1.	The main purpose of Constructor is to perform the initialization of the object
                but other than initialization if we want to perform any activity for every object
                creation, then we should go for Instance block. Example, updating one entry in DB
                for every object creation or incrementing the count value for every object creation,
                etc.

            2.	Both Constructor and Instance Block have their own purposes and replacing one concept
                with another concept may not work always.

            3.	Both Constructor and Instance Block will be executed for every object creation but
                Instance Block executes first followed by Constructor next.
        */

        _29_Difference_Constructor_InstanceBlock object1 = new _29_Difference_Constructor_InstanceBlock();

        _29_Difference_Constructor_InstanceBlock object2 = new _29_Difference_Constructor_InstanceBlock(1);

        _29_Difference_Constructor_InstanceBlock object3 = new _29_Difference_Constructor_InstanceBlock(1.5);

        System.out.println(count);
    }
}
