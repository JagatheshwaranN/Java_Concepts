package com.reflect;

import com.v8.PredicateDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
