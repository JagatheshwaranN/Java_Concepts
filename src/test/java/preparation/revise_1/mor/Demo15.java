package preparation.revise_1.mor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo15 {

    public static  void main(String[] ar){
        SubBase subBase = new SubBase();

        Class<?> clazz = subBase.getClass();

        try{
            Method overriddenMethod = clazz.getMethod("overriddenMethod");
            overriddenMethod.invoke(subBase);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    static class Base {

        public void baseMethod(){
            System.out.println("Base Method");
        }

        public void overriddenMethod(){
            System.out.println("Base - Overridden Method");
        }
    }

    static class SubBase extends Base {
        @Override
        public void overriddenMethod() {
            System.out.println("SubBase - Overridden Method");
        }
    }
}
