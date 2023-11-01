package java7andbelow.features.collections.list;

import java.util.Stack;

public class _07_Stack {

    public static void main(String[] args) {

        /*
            Stack
            =====
            It is child class of Vector.It is a specially designed class for Last In First
            Out order.

            Stack Constructor
            =================
            Stack s = new Stack();
            Creates an empty stack object.

            Stack Specific Methods
            ======================
            Object push(Object o)
            To insert an object into the stack.

            Object pop()
            To remove and return top of the stack.

            Object peek()
            To return top of the stack without removal of object.

            boolean empty()
            Returns true if the stack is empty.

            int search(Object o)
            Returns offset if the element is available otherwise returns -1.
        */
        StackDemo.demo();
    }

}

class StackDemo {

    public static void demo() {
        Stack<Object> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack.peek());
        System.out.println(stack.search("B"));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}