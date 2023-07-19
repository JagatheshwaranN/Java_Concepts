package java7andbelow.features.oops;

public class _10_Method_Overriding_Rules {

    public static void main(String[] args) {

        /*
            Rules for Overriding
            ====================
            1.	In overriding, method names and argument types must be matched i.e., method
                signature must be same.

            2.	In overriding, the return type must be same.  But this rule is applicable until
                Java 1.4 version, were the return type should be same. From 1.5 version onwards,
                the covariant return type also allowed. According to this Child class method return
                type need not be same as Parent method return type, its Child type also allowed.

                Parent Class Method Return Type	 Object	         Number	            String	            Double (Primitive)
                Child Class Method Return Type	 Object / String Number / Integer	Object	            Int
                                                 / StringBuffer
                Validation	                    Possible and     Possible and       Not Possible. 	    Not Possible  (Covariant Return Type applicable for Object Type)
                                                allowed.	     allowed.	        And not allowed.    and not allowed
                * Note: Covariant return type concept is only applicable for Object type and not allowed for Primitive type.

            3.  Parent class private methods not available to the Child and hence overriding concept
                is not applicable for Private methods. Based on our requirement, we can declare the
                same private method in Child class. It's valid but not overriding.


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