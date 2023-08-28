package java7andbelow.features.multi_threading;

public class _25_GreenThread {

    public static void main(String[] args) {

        /*
            Green Thread
            ============
            Java multi thread concept is implemented by using the following 2 models,
                1.	Green Thread model
                2.	Native OS model

            Green Thread Model
            ==================
            The Thread which is managed completely by JVM without taking underlying OS
            support is called as Green Thread. Very few Operating System like SUN Solaris
            provide support for Green Thread model. Anyway, Green Thread model is deprecated
            and not recommended to use.

            Native OS Model
            ===============
            The Thread which is managed by the JVM with the help of underlying OS is called
            as Native OS model. All Windows based OS, provide support for Native OS model.

            How to stop a Thread
            ====================
            We can stop a thread execution by using the stop() method of Thread class. If we
            call stop() method then immediately the thread will enter into dead state. Anyway
            stop() is deprecated and not recommended to use.

            public void stop ()

            How to suspend and resume a Thread
            ==================================
            We can suspend a thread by using suspend() method of Thread class, then immediately
            thread will enter into the suspended state. We can resume a suspended thread by using
            the resume() method of Thread class, then suspended thread can continue its execution.
            Anyway, these methods are deprecated and not recommended to use.

            public void suspend()
            public void resume()
        */
    }
}
