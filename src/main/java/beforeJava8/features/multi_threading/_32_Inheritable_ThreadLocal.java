package beforeJava8.features.multi_threading;

public class _32_Inheritable_ThreadLocal {

    public static void main(String[] args) {

        /*
            Inheritable ThreadLocal
            =======================
            Parent Threads ThreadLocal variable by default not available to the ChildThread.
            If we want to make the ParentThread ThreadLocal value available to ChildThread,
            then we should go for InheritableThreadLocal class. By default, the ChildThread
            value is exactly same a ParentThread value. But we can provide the customized
            value for the ChildThread by overriding the ChildValue method.

            Constructor
            ===========
            InheritableThreadLocal tl = InheritableThreadLocal();

            Methods
            =======
            InheritableThreadLocal is a child class of ThreadLocal, hence all methods of
            ThreadLocal available to InheritableThreadLocal. In addition to those methods,
            it contains one method as below,

            public Object childValue(Object parentValue)
        */

        /*
            In the below program, if we replace InheritableThreadLocal with ThreadLocal and if
            we are not overriding the childValue() method. Then, the output is,
            Parent Thread Value – Parent Class
            Child Thread Value – null

            In the below program, if we are maintaining InheritableThreadLocal and not
            overriding the childValue() method. Then, the output is,
            Parent Thread Value – Parent Class
            Child Thread Value – Parent Class
        */
        ParentThread parentThread = new ParentThread();
        parentThread.start();
    }
}

class ParentThread extends Thread {

    public static InheritableThreadLocal threadLocal = new InheritableThreadLocal() {
        public Object childValue(Object p) {
            return "Child Class";
        }
    };

    public void run(){
        threadLocal.set("Parent Class");
        System.out.println("Parent Thread Value - "+threadLocal.get());
        ChildThread childThread = new ChildThread();
        childThread.start();
    }
}

class ChildThread extends Thread {
    public void run(){
        System.out.println("Child Thread Value - "+ParentThread.threadLocal.get());
    }
}