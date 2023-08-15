package java7andbelow.features.multi_threading;

public class _06_Best_Thread_Define_Approach {

    public static void main(String[] args) {

        /*
            Best Thread Define Approach
            ===========================
            1. Among two ways of defining a thread, implements Runnable approach is recommended.

            2. In first approach, our class always extends Thread class, there is no chance of
               extending any other class. Hence, we are missing the inheritance benefit.

            3. In second approach, while implementing Runnable interface we can extend any other
               class. Hence, we won’t miss any inheritance benefit.

            4. Because of the above reason, implementing Runnable Interface approach is
               recommended than extending the Thread class.
        */
    }
}
class Approach1 extends Thread {
    public void run() {
        System.out.println("Child Thread From Approach1 class");
    }
}

class Approach2 extends Demo implements Runnable  {
    @Override
    public void run() {
        System.out.println("Child Thread From Approach2 class");
    }
}

class Demo {
    public void method() {
        System.out.println("Demo Method");
    }
}