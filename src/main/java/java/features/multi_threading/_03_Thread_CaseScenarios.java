package java.features.multi_threading;

public class _03_Thread_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: Thread Scheduler
            ========================
            It is the part of the JVM. It is responsible to schedule the Threads. i.e.,
            If multiple threads are waiting to get the chance for execution, then in
            which order the threads will be executed is decided by Thread scheduler.
            We can't expect the exact algorithm followed by Thread scheduler, and it's
            varied from JVM to JVM and hence we can't expect the threads execution order
            and exact order too. Hence, whenever situation comes to Multi Threading there
            is no guarantee for exact output. But we can provide several possible outputs.

            The following are the various possible outputs of the below program.

            Main Thread From _03_Thread_CaseScenarios Class
            Child Thread From MyThread1 Class

            Child Thread From MyThread1 Class
            Main Thread From _03_Thread_CaseScenarios Class

            Case 2: Difference between t.start() and t.run()
            ================================================
            In case of t.start(), a new thread will be created which is responsible for the
            execution of run() method. But, in case of t.run() a new thread won't be created
            and run() will be executed just like a normal method call by main thread. Hence,
            in the below program if we replace t.start() with t.run() then the output is as
            below and the total output is produced by Main thread.

            Child Thread From MyThread1 Class
            Main Thread From _03_Thread_CaseScenarios Class

            Case 3: Importance of Thread Class start()
            ==========================================
            Thread class start() method is responsible to register the thread with Thread
            scheduler and all other mandatory activities. Hence, without executing the Thread
            class start(), there is no chance of starting a new Thread in Java. Due to this
            Thread class start() method is considered as heart of multi-threading.

            start () {
            1.	Register the Thread with Thread Scheduler
            2.	Perform all other mandatory activities
            3.	Invoke run()
            }

            Case 4: Overloading of run()
            ============================
            Overloading of run() is possible, but Thread class start() can invoke No Arg run
            method only. The other overloaded method we have to call explicitly like a normal
            method call.

            Case 5: Not override of run()
            =============================
            If we are not overriding run() method, then Thread class run() method will be
            executed which has empty implementation. Hence, we won't get any output.

            Case 6: Overriding of start()
            =============================
            If we override the start() method, then our start() method will be executed just
            like a normal method call and new thread won't be created.

            Note: It is not recommended to override the start() method, otherwise won't go
                  for multi-threading concept.

            Case 7: super.start()
            =====================

            Case 8: Thread Life Cycle
            =========================
            ------------    ------------------    -----------    --------
            |New / Born| -> |Ready / Runnable| -> | Running | -> | Dead |
            ------------    ------------------    -----------    --------
            MyThread t = new MyThread() => New Thread
            t.start();                  => Thread will get Ready / Runnable
            After Thread Scheduler allocates process. Thread will be moved to Running.
            After run() method completes.
            Thread will be moved to Dead state.

            Case 9: IllegalThreadStateException
            ===================================
            After starting a Thread, if we are trying to restart the same Thread then
            we will get the runtime exception saying IllegalThreadStateException.
        */

        MyThreadCase123Demo myThread1 = new MyThreadCase123Demo();
        myThread1.start();
        for( int i = 0; i < 5; i++){
            System.out.println("Main Thread From _03_Thread_CaseScenarios Class");
        }

        MyThreadCase4Demo myThread2 = new MyThreadCase4Demo();
        myThread2.start();
        // myThread.run();

        MyThreadCase5Demo myThread3 = new MyThreadCase5Demo();
        myThread3.start();

        MyThreadCase6Demo myThread4 = new MyThreadCase6Demo();
        myThread4.start();

        MyThreadCase7Demo myThread5 = new MyThreadCase7Demo();
        myThread5.start();

        MyThreadCase9Demo myThread6 = new MyThreadCase9Demo();
        myThread6.start();
        // myThread6.start(); - Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
class MyThreadCase123Demo extends Thread {
    public void run(){
        for( int i = 0; i < 5; i++){
            System.out.println("Child Thread From MyThreadCase123Demo Class");
        }
    }
}
class MyThreadCase4Demo extends Thread {
    public void run(){
        for( int i = 0; i < 5; i++){
            System.out.println("Child Thread From MyThreadCase4Demo Class");
        }
    }
    public void run(int i){
        System.out.println("Parameterized run method From MyThreadCase4Demo Class");
    }
}
class MyThreadCase5Demo extends Thread {
}

class MyThreadCase6Demo extends Thread {
    public void start(){
        for( int i = 0; i < 5; i++){
            System.out.println("Start Method Override From MyThreadCase6Demo Class");
        }
    }
    public void run(){
        for( int i = 0; i < 5; i++){
            System.out.println("Child Thread From MyThreadCase6Demo Class");
        }
    }
}

class MyThreadCase7Demo extends Thread {
    public void start(){
        super.start();
        System.out.println("Start Method Override From MyThreadCase7Demo Class");
    }
    public void run(){
        System.out.println("Child Thread From MyThreadCase7Demo Class");
    }
}
class MyThreadCase9Demo extends Thread {
    public void run(){
        System.out.println("Child Thread From MyThreadCase9Demo Class");
    }
}