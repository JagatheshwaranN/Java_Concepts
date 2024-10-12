package preparation.revise_1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Raja", 27);
        Person person2 = new Person("Satya", 26);
        Person person3 = new Person("Mani", 29);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Collections.sort(personList);

        for (Person person : personList){
            System.out.println(person);
        }

    }

    static class Person implements Comparable<Person>{

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
        public int compareTo(Person otherPerson) {
            return Integer.compare(this.age, otherPerson.getAge());
        }

        @Override
        public String toString() {
            return "Person[Name : "+name+" , Age : "+age+"]";
        }
    }
}
