package java7andbelow.features.lang_package;

public class _04_ObjectClass_Part4 {

    public static void main(String[] args) {

        /*
            equals()
            ========
            We can use equals() method to check the equality of the two objects.

            Example, obj1.equals(obj2);

            If our class don't have equals() method, then object class equals() method will be
            executed.

            In the below example, object class equals() method got executed which is meant for
            reference comparison (address comparison) i.e., if two references pointing to the
            same object then only equals() method returns true.
        */

        Student s1 = new Student ("Alex", 101);
        Student s2 = new Student ("John", 102);
        Student s3 = new Student ("Alex", 101);
        Student s4 = s1;
        System.out.println(s1.equals (s2));
        System.out.println(s1.equals (s3));
        System.out.println(s1.equals (s4));

        /*
            Based on our requirement, we can override the equals() method for content comparison.

            While overriding the equals() method for content comparison we have to take care about
            the following,

            1.	What is the meaning of equality i.e., whether we have to check only names, only rollnos
                or both.
            2.	If we are passing different type of object, our equals() method should not raise
                ClassCastException i.e., we have to handle CCE to return false.
            3.	If we are passing null argument, then our equals() method should not raise
                NullPointerException i.e., we have to handle NPE to return false.

           The following is the proper way of overriding the equals() method for the student class
           content comparison.

           public boolean equals(Object object){
                try {
                    String name1 = this.name;
                    int rollno1 = this.rollno;
                    Student student2 = (Student)object;
                    String name2 = student2.name;
                    int rollno2 = student2.rollno;
                    return name1.equals(name2) && rollno1 == rollno2;
                }catch (ClassCastException | NullPointerException ex){
                    return false;
                }
            }
        */
        System.out.println("***** Own Equals *****");
        StudentWithOwnEqualsType1 se1 = new StudentWithOwnEqualsType1 ("Alex", 101);
        StudentWithOwnEqualsType1 se2 = new StudentWithOwnEqualsType1 ("John", 102);
        StudentWithOwnEqualsType1 se3 = new StudentWithOwnEqualsType1 ("Alex", 101);
        StudentWithOwnEqualsType1 se4 = se1;
        System.out.println(se1.equals(se2));
        System.out.println(se1.equals(se3));
        System.out.println(se1.equals(se4));
        System.out.println(se1.equals("Alex"));
        System.out.println(se1.equals(null));
        System.out.println("***** Simplified Equals *****");
        StudentWithOwnEqualsType2 se11 = new StudentWithOwnEqualsType2 ("Alex", 101);
        StudentWithOwnEqualsType2 se12 = new StudentWithOwnEqualsType2 ("John", 102);
        StudentWithOwnEqualsType2 se13 = new StudentWithOwnEqualsType2 ("Alex", 101);
        StudentWithOwnEqualsType2 se14 = se11;
        System.out.println(se11.equals(se12));
        System.out.println(se11.equals(se13));
        System.out.println(se11.equals(se14));
        System.out.println("***** More Simplified Equals *****");
        StudentWithOwnEqualsType3 se21 = new StudentWithOwnEqualsType3 ("Alex", 101);
        StudentWithOwnEqualsType3 se22 = new StudentWithOwnEqualsType3 ("John", 102);
        StudentWithOwnEqualsType3 se23 = new StudentWithOwnEqualsType3 ("Alex", 101);
        StudentWithOwnEqualsType3 se24 = se21;
        System.out.println(se21.equals(se22));
        System.out.println(se21.equals(se23));
        System.out.println(se21.equals(se24));
        System.out.println("***** Most Simplified Equals *****");
        StudentWithOwnEqualsType4 se31 = new StudentWithOwnEqualsType4 ("Alex", 101);
        StudentWithOwnEqualsType4 se32 = new StudentWithOwnEqualsType4 ("John", 102);
        StudentWithOwnEqualsType4 se33 = new StudentWithOwnEqualsType4 ("Alex", 101);
        StudentWithOwnEqualsType4 se34 = se31;
        System.out.println(se31.equals(se32));
        System.out.println(se31.equals(se33));
        System.out.println(se31.equals(se34));
    }
}

class Student {

    String name;
    int rollno;

    Student (String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}

class StudentWithOwnEqualsType1 {

    String name;
    int rollno;

    StudentWithOwnEqualsType1 (String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object object){
        try {
            String name1 = this.name;
            int rollno1 = this.rollno;
            StudentWithOwnEqualsType1 student2 = (StudentWithOwnEqualsType1)object;
            String name2 = student2.name;
            int rollno2 = student2.rollno;
            return name1.equals(name2) && rollno1 == rollno2;
        }catch (ClassCastException | NullPointerException ex){
            return false;
        }
    }
}

/*
    Simplified version of equals() method
*/
class StudentWithOwnEqualsType2 {

    String name;
    int rollno;

    StudentWithOwnEqualsType2 (String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object object){
        try {
            StudentWithOwnEqualsType2 student2 = (StudentWithOwnEqualsType2)object;
            return name.equals(student2.name) && rollno == student2.rollno;
        }catch (ClassCastException | NullPointerException ex){
            return false;
        }
    }
}

/*
    More simplified version of equals() method
*/
class StudentWithOwnEqualsType3 {

    String name;
    int rollno;

    StudentWithOwnEqualsType3 (String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object object){
        try {
            if(object instanceof StudentWithOwnEqualsType3 student2){
                return name.equals(student2.name) && rollno == student2.rollno;
            } else{
                return false;
            }
        }catch (ClassCastException | NullPointerException ex){
            return false;
        }
    }
}

/*
    Most simplified version of equals() method
*/
class StudentWithOwnEqualsType4 {

    String name;
    int rollno;

    StudentWithOwnEqualsType4 (String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public boolean equals(Object object){
        try {
            if(object == this)
                return true;
            if(object instanceof StudentWithOwnEqualsType4 student2){
                return name.equals(student2.name) && rollno == student2.rollno;
            } else{
                return false;
            }
        }catch (ClassCastException | NullPointerException ex){
            return false;
        }
    }
}