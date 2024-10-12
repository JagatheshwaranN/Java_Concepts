package java.features.jvm_arch;

public class _07_Various_Memory_Areas_JVM_Part1 {

    public static void main(String[] args) {

        /*
            Various Memory Areas present inside JVM
            =======================================
            Whenever JVM loads and run a Java program, it needs memory to store several
            things like bytecode, variables, etc. Total JVM memory organized into the
            following 5 categories,

            1.	Method Area
            2.	Heap Area
            3.	Stack Area
            4.	PC Registers
            5.	Native Method Stacks

            Method Area
            ===========
            1.	For every JVM, one method area is available.
            2.	Method Area will be created at the time of JVM startup.
            3.	Inside the method area, class level binary data including static variables
                will be stored.
            4.	Constant pools of a class will be stored inside the method area.
            5.	Method Area can be accessed by multiple threads simultaneously.
            6.	Method Area need not be continuous memory.

            Heap Area
            =========
            1.	For every JVM, one heap area is available.
            2.	Heap Area will be created at the time of JVM startup.
            3.	Objects and corresponding instance variables will be stored in the heap area.
            4.	Every array in Java is object only. Hence, arrays also will be stored in the
                heap area.
            5.	Heap Area can be accessed by multiple threads, and hence the data stored in
                the heap memory is not thread safe.
            6.	Heap Area need not be continuous memory.

            Heap Area Memory Details
            ========================
            A Java application can communicate with JVM by using a runtime object. Runtime
            class present in java.lang package, and it is a singleton class. We can create
            a runtime object as follows.

            Runtime r = Runtime.getRuntime();

            Once we got the runtime object, we can call the following methods on that object.

            maxMemory()
            ===========
            It returns the number of bytes of max memory allocated to the heap.

            totalMemory()
            =============
            It returns the number of bytes of total memory allocated to the heap.
            (Initial memory)

            freeMemory()
            ============
            It returns the number of bytes of free memory available in the heap.
        */
        HeapMemoryDetails.demo();

        /*
            How to set maximum and minimum heap sizes
            =========================================
            Heap memory is finite (fixed) memory but based on our requirement we can set
            the maximum and minimum heap sizes i.e., we can increase / decrease the heap
            size based on our requirement. We can use the following flags with java command.

            To set the maximum heap size (maxMemory)
            ========================================
            Java -xmx512m HeapMemoryDetails
            The above command will set the maximum heap size as 512 MB.

            To set the minimum heap size (totalMemory)
            ==========================================
            Java -xms64m HeapMemoryDetails
            The above command will set the minimum heap size as 64 MB.

            Java -xmx512m -xms64m HeapMemoryDetails
            The above command will set the maximum and minimum heap size.
        */

    }

}

class HeapMemoryDetails {

    public static void demo() {

        Runtime runtime = Runtime.getRuntime();

        long mb = 1024 * 1024;
        System.out.println(runtime.maxMemory() / mb);
        System.out.println(runtime.totalMemory() / mb);
        System.out.println(runtime.freeMemory() / mb);
    }
}
