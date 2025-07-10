    package com.reflect;

    import com.v8.PredicateDemo;
    import com.v8.TestDemo;

    import java.lang.annotation.Annotation;
    import java.lang.reflect.Constructor;
    import java.lang.reflect.Field;
    import java.lang.reflect.InvocationTargetException;
    import java.lang.reflect.Method;
    import java.util.Arrays;

    public class ReflectDemo {

        public static void main(String[] args) {

            try {
                Class<?> myclass = Class.forName(PredicateDemo.class.getName());
                System.out.println(myclass.getName());
                System.out.println(Arrays.toString(myclass.getDeclaredMethods()));
                System.out.println(Arrays.toString(myclass.getConstructors()));

                Constructor<?> constructor = myclass.getConstructor(null);
                System.out.println(constructor.newInstance(null));

                Constructor<?> constructor2 = myclass.getConstructor(int.class);

                Object obj = constructor2.newInstance(10);

                Method method = myclass.getMethod("getVal", null);
                System.out.println(method.invoke(obj, null));

                Method method1 = myclass.getMethod("setVal", int.class);
                method1.invoke(obj, 20);

                System.out.println(method.invoke(obj, null));

                Field field = myclass.getDeclaredField("val");
                field.setAccessible(true);
                field.set(obj, 30);

                System.out.println(method.invoke(obj, null));

                System.out.println(Arrays.toString(myclass.getAnnotations()));

                Annotation[] annotations = myclass.getAnnotations();
                TestDemo annotation = (TestDemo) annotations[0];
                System.out.println(annotation.value());


            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
                     InstantiationException | IllegalAccessException | NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
    }
