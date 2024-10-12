package preparation.revise_1.constructor;

public class ConstructorChainingDemo {

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("John", 29);
        Person person3 = new Person("Alex", 25, "London");
        person1.display();
        person2.display();
        person3.display();
    }

    public static class Person {

        String name;
        int age;
        String address;

        public Person() {
            this("Unknown", 0, "Unknown Address");
        }

        public Person(String name, int age){
            this(name, age, "Unknown Address");
        }

        public Person(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void display(){
            System.out.println("Person Details - Name: " + name + ", Age: " + age + ", Address: " + address);
        }
    }
}
