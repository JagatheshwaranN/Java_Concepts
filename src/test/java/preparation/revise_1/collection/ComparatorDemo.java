package preparation.revise_1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Raja", 27);
        Person person2 = new Person("Satya", 26);
        Person person3 = new Person("Mani", 29);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.sort(new MyComparator());

        for (Person person : personList){
            System.out.println(person);
        }

    }

    static class Person {

        int age;
        String name;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person[Name : "+name+" , Age : "+age+"]";
        }
    }

    static class MyComparator implements Comparator<Person>{

        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
