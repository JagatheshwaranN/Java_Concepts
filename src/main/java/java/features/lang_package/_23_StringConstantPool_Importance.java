package java.features.lang_package;

public class _23_StringConstantPool_Importance {

    public static void main(String[] args) {

            /*
                String Constant Pool
                ====================
                In our program, if a string object is repeatably required then it's not recommended
                to create separate object for every requirement because it creates performance and
                memory problems.

                Instead of creating a separate object for every requirement, we have to create only
                one object, and we can reuse same object for every requirement so that performance
                and memory utilization will be improved. This thing is possible because of SCP.
                Hence, main advantages of SCP are memory utilization and performance improvement.

                But the main problem with SCP is as several references pointing to the same object,
                by using anyone reference if we are trying to change the content then remaining
                references will be affected.

                To overcome this problem, SUN people implemented the String objects as immutable
                i.e., once we create a string object we can't perform any changes in the existing
                object, if we are trying to do any changes then with those changes a new object will
                be created. Hence, SCP is the only reason for immutability of String objects.
        */

        String s1 = "Java";
        String s2 = s1.concat("Program");
        System.out.println(s1); // Java - Immutable
        System.out.println(s2);

        /*
            Questions
            =========
            1.	What is difference between String and StringBuffer?
            String is immutable and StringBuffer is mutable.

            2.	Explain about immutability and mutability with example?

            3.	What is the difference between?
            String s = new String("Java");
            String s = "Java";

            4.	Other than immutability and mutability is any other difference b/w String and
                StringBuffer?
            Equals method, in String equals method meant for content comparison whereas in
            StringBuffer it's meant for reference comparison

            5.	What is SCP?
            It is a specially designed memory area for String Objects.

            6.	What is the advantage of SCP?
            Memory utilization and performance improvement.

            7.	What is the disadvantage of SCP?
            Immutability.

            8.	Why SCP is available only for String and not for StringBuffer?
            String is most commonly used object and hence SUN people provided special memory management
            for String objects. But StringBuffer is not commonly used objects and hence special memory
            management is not required for StringBuffer.

            9.	Why String objects are immutable and StringBuffer objects are mutable?
            In case of String SCP, a single object can be referenced by multiple references. By using
            one reference if we are allowed to change the content in the existing object then remaining
            references will be affected to overcome this problem SUN people implemented String objects
            as immutable. According to this, once we create a String object, we can't perform any changes
            on the object. If we are trying to perform any changes, then with those changes a new object
            will be created. But in StringBuffer there is no concept like SCP hence for every requirement
            a separate object will be created. By, using one reference if we are trying to change the
            content then there is no effect on the remaining references. Hence, immutability concept is
            not required for StringBuffer.

            10.	In addition to String objects any other objects are immutable in Java?
            In addition to String objects, all Wrapper class objects also immutable in Java.

            11.	Is it possible to create our own immutable class?

            12.	How to create our own immutable class. Explain with example?

            13.	Immutable means non-changeable whereas final means also non-changeable. Then what
            is the difference between final and immutable?
        */
    }

}
