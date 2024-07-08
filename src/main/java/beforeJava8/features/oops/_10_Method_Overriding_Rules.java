package beforeJava8.features.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _10_Method_Overriding_Rules {

    public static void main(String[] args) {

        /*
            Rules for Overriding
            ====================
            1.	In overriding, method names and argument types must be matched i.e., method
                signature must be same.

            2.	In overriding, the return type must be same.  But this rule is applicable until
                Java 1.4 version, were the return type should be same. From 1.5 version onwards,
                the covariant return type also allowed. According to this, Child class method return
                type need not be same as Parent class method return type, its Child type also allowed.

                Parent Class Method Return Type	 Object	         Number	            String	            Double (Primitive)
                Child Class Method Return Type	 Object / String Number / Integer	Object	            Int
                                                 / StringBuffer
                Validation	                    Possible and     Possible and       Not Possible. 	    Not Possible  (Covariant Return Type applicable for Object Type)
                                                allowed.	     allowed.	        And not allowed.    and not allowed

                * Note: Covariant return type concept is only applicable for Object type and not allowed
                        for Primitive type.

            3.  Parent class private methods not available to the Child and hence overriding concept
                is not applicable for Private methods. Based on our requirement, we can declare the
                same private method in Child class. It's valid but not overriding.

            4. We can’t override the Parent class final methods in Child class. If we are trying to
               override, we will get the compile time error.

            5. Parent class abstract methods we should override in Child class to provide the
               implementation.

            6. We can override the non-abstract method as abstract. The main advantage of this approach
               is we can stop the availability of Parent method implementation to the next level Child
               classes.

            7. In overriding, the following modifiers won’t keep any restriction.
               Synchronized, Strictfp, Native and Abstract

               Parent Method	Final	        Non-Final	Abstract	    Synchronized	    Native	    Strictfp
               Child Method	Non-Final / Final	Final	    Non-Abstract	Non-Synchronized	Non-Native	Non-Strictfp
               Validation	Not applicable	    Applicable	Vice versa      Vice versa          Vice versa  Vice versa
                                                            Applicable      Applicable          Applicable  Applicable

            8. While overriding, we can’t reduce the scope of the access modifier, but we can increase
               the scope of the access modifier.

               Parent Class Method	Public	    Protected	        Default	                        Private
               Child Class Method	Public	    Protected / Public	Default / Protected / Public
               Validation	        Applicable	Applicable	        Applicable	                    Not allowed

            9. If Child class method throws any checked exception compulsory the Parent class method
               should throw same checked exception or parent exception. Otherwise, we will get the
               compile time error. There is no restriction for Unchecked exceptions.
        */
    }
}

class Rule2Demo {
    public Object method1(){
        System.out.println("Object Method");
        return null;
    }
}

class Rule2ChildDemo extends Rule2Demo {
    public String method1(){
        System.out.println("String Method");
        return null;
    }
}

class Rule3Demo {
    private void method1(){
    }
}

class Rule3ChildDemo extends Rule3Demo{
    private void method1(){
    }
}

class Rule4Demo {
    public final void method1(){
    }
}

class Rule4ChildDemo extends Rule4Demo {
    // method1() in java7andbelow.features.oops.Rule4ChildDemo cannot override method1() in java7andbelow.features.oops.Rule4Demo
    // overridden method is final.
    // public void method1(){
    // }
}

abstract class Rule5Demo {
    public abstract void method1();
}

class Rule5ChildDemo extends Rule5Demo {
    @Override
    public void method1() {
    }
}

class Rule6Demo {
    public void method1(){
    }
}

abstract class Rule6ChildDemo extends Rule6Demo {
    public abstract void method1();
}

class Rule6SubChildDemo extends Rule6ChildDemo {
    @Override
    public void method1() {
    }
}

class Rule8Demo {
    public void method1(){
    }
    void method2(){
    }
}

class Rule8ChildDemo extends Rule8Demo {
    // java: method1() in java7andbelow.features.oops.Rule8ChildDemo cannot override method1()
    // in java7andbelow.features.oops.Rule8Demo
    // attempting to assign weaker access privileges; was public
    // void method1(){
    // }

    public void method2(){
    }
}

class Rule9Demo {
    public void method1() throws FileNotFoundException {
    }
}

class Rule9ChildDemo extends Rule9Demo {
    public void method1() throws FileNotFoundException {
        File f = new File("");
        FileInputStream ips = new FileInputStream(f);
    }
}