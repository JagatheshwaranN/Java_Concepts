package preparation.revise_1.string;

public class StrStrBufStrBuildDemo {

    public static void main(String[] args) {
        stringDemo();
        stringBufferDemo();
        stringBuilderDemo();
    }

    public static void stringDemo() {
        String str = "Hello";
        System.out.println(str); // Output: Hello
        String originalStr = str; // Store the original value of str
        str = str + "world"; // Reassigning str to a new String object
        System.out.println(str); // Output: Helloworld
        System.out.println(originalStr); // Output: Hello
    }

    public static void stringBufferDemo() {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer);
        stringBuffer.append("world");
        System.out.println(stringBuffer);
    }

    public static void stringBuilderDemo() {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append("world");
        System.out.println(stringBuilder);
    }

}
