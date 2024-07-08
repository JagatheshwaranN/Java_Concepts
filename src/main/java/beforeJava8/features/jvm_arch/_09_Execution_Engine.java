package beforeJava8.features.jvm_arch;

public class _09_Execution_Engine {

    public static void main(String[] args) {

        /*
            Execution Engine
            ================
            Execution Engine, this is the central component of JVM, and it is responsible to
            execute Java class files. It mainly contains 2 components as below,
            1.	Interpreter
            2.	JIT compiler

            Interpreter
            ===========
            It is responsible to read byte code and interpret into machine code (native code)
            and execute that machine code line by line. The problem with interpreter is, it
            interprets every time even the same method invoked multiple times which reduces the
            performance of the system. To overcome this problem, SUN people introduced JIT
            compiler in Java 1.1 version.

            JIT Compiler
            ===========
            The main purpose of JIT compiler is to improve the performance. Internally, JIT
            compiler maintains a separate count for every method; whenever JVM comes across any
            method call first, that method will be interpreted normally by Interpreter and JIT
            compiler increments the corresponding count variable. This process will be continued
            for every method. Once if any method count reaches threshold value, then JIT compiler
            identifies that, that method is repeatedly used methods (Hotspot). Immediately JIT
            compiler compiles that method and generates the corresponding native code, when JVM
            comes across that method next time, then JVM uses the native code of the method directly
            and executes so that performance of the system can be improved. The Threshold count is
            varied from JVM to JVM.

            Some advanced JIT compilers will recompile generate native code if count reaches
            threshold value second time so that more optimized machine code will be generated.
            Internally, Profiler, which is the part of JIT compiler and which is responsible to
            identify hotspots.

            Note:
            =====
            1.	JVM interprets total program at least once.
            2.	JIT compilation is applicable only for repeatedly required methods and not for
                every method.

            Java Native Interface (JNI)
            ===========================
            JNI acts as mediator for java method calls and corresponding native libraries i.e.,
            JNI is responsible to provide information about native libraries to the JVM. Native
            method library holds native libraries information.
        */
    }

}
