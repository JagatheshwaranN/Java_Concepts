package beforeJava8.features.lang_package;

public class _10_StringBuffer {

    public static void main(String[] args) {

        /*
            StringBuffer
            ============
            If the content is fixed and won't change frequently then it's recommended to go
            for String. If the content is not fixed and keep on changing then it's not
            recommended to use String. Because for every change a new object will be created
            which affects the performance of the system. To handle this requirement, we should
            go for StringBuffer. The main advantage of StringBuffer over String is, all required
            changes will be performed on the existing object only.
        */

        /*
            Constructor
            ===========
            StringBuffer sb = new StringBuffer();
            =====================================
            Create an empty StringBuffer object with default initial capacity 16. Once
            StringBuffer reaches its max capacity, a new StringBuffer object is created
            with new capacity as below,

            New capacity = (Current capacity + 1) * 2

            StringBuffer sb = new StringBuffer(int initialCapacity);
            ========================================================
            Create an empty StringBuffer object with specified initial capacity.

            StringBuffer sb = new StringBuffer(String s);
            =============================================
            Creates an equivalent StringBuffer for the given string with
            capacity = s.length() + 16.
        */

        StringBuffer sb1 = new StringBuffer();
        sb1.append("abcdefghijklmnop");
        System.out.println(sb1.capacity());
        sb1.append("q");
        System.out.println(sb1.capacity());
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb2.capacity());

        /*
            Important Methods of StringBuffer
            =================================
            public int length();
            public int capacity();
            public char charAt(int index);

            public void setCharAt(int index, char ch);
            To replace the character located at specific index with the provided character.

            public StringBuffer append(String s);
            public StringBuffer append(int s);
            public StringBuffer append(float s);
            public StringBuffer append(double s);
            public StringBuffer append(boolean s);
            public StringBuffer append(char s);

            public StringBuffer insert (int index, String s);
            public StringBuffer insert (int index, int s);
            public StringBuffer insert (int index, float s);
            public StringBuffer insert (int index, double s);
            public StringBuffer insert (int index, boolean s);
            public StringBuffer insert (int index, char s);

            public StringBuffer delete (int begin, int end);
            To delete the chars located from begin index to end-1 index.

            public StringBuffer deleteCharAt (int index);
            To delete the chars located at the specific index.

            public StringBuffer reverse();

            public void setLength(int length);

            public void ensureCapacity (int capacity);
            To increase the capacity on fly based on our requirement.

            public void trimToSize ();
            To deallocate extra allocated free memory.
        */

        // length
        StringBuffer sb3 = new StringBuffer("java");
        System.out.println(sb3.length());

        // capacity
        System.out.println(sb3.capacity());

        // charAt
        System.out.println(sb3.charAt(2));

        // setCharAt
        sb3.setCharAt(2, 'n');
        System.out.println(sb3);

        // append
        StringBuffer sb4 = new StringBuffer("Oracle");
        System.out.println(sb4.append(" Software"));
        System.out.println(sb4.append('s'));
        StringBuffer sb5 = new StringBuffer("Number ");
        System.out.println(sb5.append(1));
        System.out.println(sb5.append(2.1f));
        System.out.println(sb5.append(11.0));
        StringBuffer sb6 = new StringBuffer("Value ");
        System.out.println(sb6.append(true));

        // insert
        StringBuffer sb7 = new StringBuffer("Apple  good");
        System.out.println(sb7.insert(6, "is"));

        // delete
        StringBuffer sb8 = new StringBuffer("Apple  good");
        System.out.println(sb8.delete(3, 6));

        // deleteCharAt
        StringBuffer sb9 = new StringBuffer("Apple");
        System.out.println(sb9.deleteCharAt(3));

        // reverse
        StringBuffer sb10 = new StringBuffer("Apple");
        System.out.println(sb10.reverse());

        // setLength
        StringBuffer sb11 = new StringBuffer("Apple");
        sb11.setLength(3);
        System.out.println(sb11);

        // capacity
        StringBuffer sb12 = new StringBuffer();
        System.out.println(sb12.capacity());
        sb12.ensureCapacity(500);
        System.out.println(sb12.capacity());

        // trimToSize
        StringBuffer sb13 = new StringBuffer(1000);
        System.out.println(sb13.capacity());
        sb13.append("Apple");
        sb13.trimToSize();
        System.out.println(sb13.capacity());
    }
}
