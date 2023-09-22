package java7andbelow.features.lang_package;

public class _02_ObjectClass_Part2 {

    public static void main(String[] args) {

        /*
            toString()
            ==========
            We can use toString() method to get the string representation of an object.
            String s = obj.toString();
            Whenever we are trying to print the object reference internally toString() method
            will be called.
            Student s = new Student();
            SOP(s) => SOP(s.toString());
            If our class doesn't contain toString() method, then object class toString() method
            will be executed.
        */

        /*
            In the below example, object class toString() method got executed which is implemented
            as follows,

            public String toString() {
                return getClass().getName()+"@"+Integer.toHexString(hashCode());
            }
            classname@hascode_in_hexadecimalform
        */
        Student1 student1 = new Student1(101, "Alex");
        System.out.println(student1);

        /*
            Based on our requirement, we can override toString() method to provide our own string
            representation. For example, whenever we are trying to print student2 reference, to print
            the student2 details we have to override the toString() as follows,

            public String toString(){
                return "Student [rollno "+rollno+" and "+"name "+name+"]";
            }
        */
        Student2 student2 = new Student2(102, "John");
        System.out.println(student2);

        /*
            Note:
            =====
            In all wrapper classes, collection classes, String classes, StringBuffer classes and
            StringBuilder classes toString() method is overridden for meaningful string
            representation.
        */

    }
}

class Student1 {

    int rollno;
    String name;

    Student1(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}

class Student2 {

    int rollno;
    String name;

    Student2(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){
        return "Student [rollno "+rollno+" and "+"name "+name+"]";
    }
}