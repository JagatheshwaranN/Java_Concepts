package beforeJava8.features.lang_package;

public class _18_EqualMethod_HashCodeMethod {

    public static void main(String[] args) {

        /*
            Contract between Equals() method and hashCode() method
            ======================================================
            Hashing related Data Structures follows the following fundamental rules,

            "Two equivalent objects should be placed in same bucket but all objects present
            in the same bucket need not be equal."

            1.	If two objects are equal by equals() method then their hashCode must be equal
                i.e., two equivalent objects should have same hashCode i.e., if r1.equal(r2)
                is true, then r1.hashCode == r2.hashCode is always true.

            2.	Object class equals() method and hashCode() method follows above contract. Hence,
                whenever we are overriding equals() method compulsory we should override hashCode()
                method to satisfy the above contract i.e., two equivalent objects should have same
                hashCode.

            3.	If two objects are not equal by equals() method then there are no restrictions on
                hashCode, and it may / may not be equal.

            4.	If hashCode of two objects are equal then we can't conclude anything about equals()
                method it may return true / false.

            5.	If hashCode of two objects are not equal then those objects are always not equal
                by equals() method.

            Note:
            =====
            To satisfy the contract between equals() and hashCode() methods, whenever we are
            overriding the equals() method compulsory we should override the hashCode() method
            otherwise we won't get any CTE / RTE, but it's not a good programming practice.

            In String class, equals() method is overridden for content comparison and hence
            hashCode() method is also overridden to generate the hashCode based on the content.

            In StringBuffer class, equals() method is not overridden for content comparison and
            hence hashCode() method is also not overridden.
        */
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());

        /*
            Note
            ====
            1. Based on which parameter we override the equals() method, it's highly recommended
               to use the same parameters while overriding the hashCode() method.

            2. In all Collection classes, Wrapper classes and in String class, the equals() method
               is overridden for content comparison. Hence, it's highly recommended to override
               the equals() method in our class as well.
        */
        Person p1 = new Person("John", 29);
        Person p2 = new Person("John", 29);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person{

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
            public boolean equals(Object obj){
            if(obj instanceof Person) {
                Person p = (Person)obj;
                if(name.equals(p.name) && age == p.age){
                    return true;
                } else {
                    return false;
                }
            }
            return false;
            }
    */

    public boolean equals(Object obj){
        if(obj instanceof Person p) {
            return name.equals(p.name) && age == p.age;
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode()+age;
    }

}