package beforeJava8.features.jvm_arch;

public class _08_Various_Memory_Areas_JVM_Part2 {

    public static void main(String[] args) {

        /*
            Stack Memory
            ============
            For every thread, JVM will create a separate stack at the time of thread creation.
            Each and every method call performed by that thread will be stored in the stack
            including local variables as well. After completing a method, the corresponding
            entry from the stack will be removed. After completing all method calls, the stack
            will become empty and that empty stack will be destroyed by the JVM just before
            terminating the thread.

            Each entry in the stack is called as Stack Frame or Activation record.

            The data stored in the stack is available for the corresponding thread only and not
            available to the remaining threads. Hence, this data is thread safe.

            Stack Frame Structure
            =====================
            Each stack frame contains 3 parts as below,
            -----------------------
            |Local variable array |
            -----------------------
            |Operand stack        |
            -----------------------
            |Frame data           |
            -----------------------

            Local Variable Array
            ====================
            It contains all parameters and local variables of the method. Each slot in the array
            is of 4 bytes. Values of type int, float, and reference to occupy one entry in the array.
            Values of double and long occupy 2 consecutive entries in the array. Byte, short and
            char values will be converted to an Int type before storing and occupy one slot. But the
            way of storing boolean values is varied from JVM to JVM. But most of the JVM follows
            one slot for boolean values.

            public void m1 (int I, double D, Object O, float F) {
            long L;
            }
            ---------------------------------------------------------
            |   I   |	D   |	D   |	O   |	F   |	L   |	L   |
            ---------------------------------------------------------

            Operand Stack
            =============
            JVM uses operand stack as workspace. Some instructions can push the values to the
            operand stack, and some instructions can pop values from the operand stack, and some
            instructions can perform required operations.

            Frame Data
            ==========
            Frame data contains all symbolic references related to the method. It also contains
            a reference to exception table which provides corresponding catch block information
            in case of exception.
        */

        /*
            PC Registers (Program Counter Registers)
            ========================================
            For every thread, a separate PC registers will be created at the time of thread
            creation. PC registers contain the address of current executing instruction. Once
            instruction execution automatically completes PC registers incremented to hold the
            address of the next instruction.

            Native Method Stacks
            ====================
            For every thread, JVM will create a separate native method stack. All native method
            calls invoked by the thread will be stored in the corresponding native method stack.
        */

        /*
            Conclusions
            ===========
            Method Area, Heap Area and Stack Area are considered as important memory areas with
            respect to Programmers.Method Area and Heap Area are per JVM whereas Stack Area, PC
            Registers and Native Method Stacks are per thread.

            1. Static variables will be stored in the Method Area.
            2. Instance variables will be stored in the Heap Area.
            3. Local variables will be stored in the Stack Area.
        */
    }
}
