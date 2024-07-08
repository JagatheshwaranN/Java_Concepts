package beforeJava8.features.lang_package;

public class _06_String_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: Mutability
            ==================
            String s1 = new String("Java");
            s1.concat("Programming");
            SOP(s1); // Java

            Once we create a String object, we can't perform any changes in the existing object.
            If we are trying to perform any change with those changes any new object will be
            created. This non-changeable behavior is called as immutability of the String.

            StringBuffer s1 = new StringBuffer("Java");
            s1.append(" Programming");
            SOP(s1); // Java Programming

            Once we create a StringBuffer object, we can perform any change in the existing object.
            This changeable behavior is called as mutability of the StringBuffer.

        */
        String s1 = new String("Java");
        s1.concat("Programming");
        System.out.println(s1);

        String s2 = new String("Java");
        s2 = s2.concat(" Programming");
        System.out.println(s2);

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println(sb1);

        /*
            Case 2: String Equals
            =====================
            String Class Equals Method
            ==========================
            String s1 = new String ("Alex");
            String s2 = new String ("Alex");
            SOP (s1 == s2); // false
            SOP (s1.equals (s2)); // true

            In String class, equals() method is overridden for content comparison. Hence,
            even though the objects are different and content is same, therefore equals()
            method returns true.

            StringBuffer Class Equals Method
            ================================
            StringBuffer s1 = new StringBuffer ("Alex");
            StringBuffer s2 = new StringBuffer ("Alex");
            SOP (s1 == s2); // false
            SOP (s1.equals (s2)); // false
            In StringBuffer class, equals() method is not overridden for content comparison.
            Hence, if objects are different, equals() method returns false even though the
            content is same.
        */

        String ss1 = new String ("Alex");
        String ss2 = new String ("Alex");
        System.out.println(ss1 == ss2);
        System.out.println(ss1.equals(ss2));

        StringBuffer ssb1 = new StringBuffer ("Alex");
        StringBuffer ssb2 = new StringBuffer ("Alex");
        System.out.println(ssb1 == ssb2);
        System.out.println(ssb1.equals(ssb2));

        /*
            Case 3: Difference in String declaration
            ========================================
            String sObj = new String ("Java");
            In this case, two objects will be created. One is in Heap area and other is in SCP,
            sObj is always pointing to Heap area.

            String str = "Java";
            In this case, only one object will be created and str is always pointing to that object.

            Note
            ====
            1.	Object creation in SCP is optional. First, JVM will check is there any object
                present with required content. If Object already present then existing object
                will be reused. If object not already available then only a new object will be
                created. This rule is applicable only for SCP and not for Heap.

            2.	Garbage Collector is not allowed to access SCP area. Hence, even though the
                object doesn't contain any reference variable, it will not be eligible for
                Garbage Collection if its present in SCP area.

            3.	All SCP objects will be destroyed automatically at the time of JVM shutdown.
        */

        String sObj1 = new String ("Java");
        String sObj2 = new String ("Java");
        String str1 = "Java";
        String str2 = "Java";
        /*
            Here, in the above code snippet,  in Heap area it will have 2 objects and in SCP
            area it will have 1 object. So, totally 3 objects will be created.

            Note
            ====
            Whenever we are using the new operator compulsory a new object will be created
            in the heap area. Hence, there may be a chance of existence of two objects with
            the same content in heap area but not in SCP area. i.e., duplicate objects are
            possible in the heap area but not in the SCP area.
        */

        String sObj3 = new String ("Java");
        sObj3.concat (" Software");

        String sObj4 = sObj3.concat(" Solutions");
        sObj3 = sObj3.concat(" Soft");

        System.out.println(sObj3);
        System.out.println(sObj4);

        /*
            Note
            ====
            1.	For every String constant, one object will be placed in SCP area.
            2.	Because of some runtime operations if an object is required to create,
                then that object will be place only in Heap area but not in SCP area.
        */

    }
}
