package java7andbelow.features.inner_classes;

public class _01_InnerClass_Intro {

    public static void main(String[] args) {

        /*
            Inner Classes
            =============
            Sometimes we can declare a class inside the other class, such type of classes is called
            as Inner Classes. Inner classes concept introduced in Java 1.1 version to fix the GUI
            bugs as part of the Event Handling. But because of the powerful features of the Inner
            Classes, slowly programmers started using it in regular coding as well.

            Without existence of one type of object, if there is no chance of existence of another
            type of object, then we should go for Inner Classes.

            Examples,

            University consists of several departments, without existence of university there is
            no chance of existence of departments. Hence, we have to declare department class
            inside the university class.
            class University {
                class Department {
                }
            }

            Without the existence of the Car object there is no chance of existence of Engine
            object. Hence, we have to declare the Engine class inside the Car class.
            class Car {
                class Engine {
                }
            }

            Map is a group of key value pairs and each Key Value pair is called as an Entry.
            Without the existence of Map object there is no chance of existence of an Entry
            object. Hence, Interface Entry is defined inside the Map Interface.
            interface Map {
                interface Entry {
                }
            }

            Note:
            =====
            1.	Without the existence of outer class object, there is no chance of existence of
            inner class object.
            2.	The relationship between the outer class and inner class is not IS-A relation and
                its HAS-A relationship (Composition / Aggregation).
        */
    }
}
