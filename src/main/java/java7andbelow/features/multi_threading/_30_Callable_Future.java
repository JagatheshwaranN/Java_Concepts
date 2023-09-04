package java7andbelow.features.multi_threading;

import java.util.concurrent.*;

public class _30_Callable_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
            Callable and Future
            ===================
            In case of the Runnable Job, thread won't return anything after completing
            the Job. If a thread is required to return some result after the execution,
            then we should go for Callable. Callable Interface contains only one method
            call().

            public object call() throws Exception

            If we submit the callable object to the executor, then the thread after
            completing the job, will return the object of type Future i.e., Future
            object can be used to retrieve the result from the Callable Job.
        */

        MyCallable[] jobs = {new MyCallable(1), new MyCallable(2),
        new MyCallable(3), new MyCallable(4)};
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(MyCallable job : jobs){
           Future<Integer> future = executorService.submit(job);
            System.out.println(future.get());
        }
        executorService.shutdown();

        /*
            Difference Between Runnable and Callable
            ========================================
            Runnable
            ========
            1. If a thread is not required to return anything after completing the Job then
               we should go for Runnable.
            2. Runnable Interface contains only one method called run().
            3. Runnable Job not required to return anything and hence the return type is void.
            4. Within run() if any chance of raising the CheckedException, compulsory we have
               to handle it with Try catch because we can’t use Throw keyword.
            5. Runnable Interface present in java.lang package.
            6. Introduced in java 1.0 version.

            Callable
            ========
            1. If a thread required to return something after completing the Job then we should
               go for Callable.
            2. Callable Interface contains only one method call().
            3. Callable Job is required to return something and hence the return type is Object.
            4. Within call() if any chance of raising the CheckedException, we are not required
               to handle using Try Catch because the Call() already throws Exception.
            5. Callable Interface present in java.util.concurrent package.
            6. Introduced in Java 1.5 version.
        */
    }
}

class MyCallable implements Callable<Integer> {
    int number;
    MyCallable(int number) {
        this.number = number;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        System.out.println(Thread.currentThread().getName()+" is responsible to find the sum of first "+number+" numbers");
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}