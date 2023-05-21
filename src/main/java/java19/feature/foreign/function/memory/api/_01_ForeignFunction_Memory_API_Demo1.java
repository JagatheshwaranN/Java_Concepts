package java19.feature.foreign.function.memory.api;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

/**
 * This JEP promotes the Foreign Function & Memory API (FFM API) from the incubator stage to the preview stage.
 * The Foreign Function & Memory API (FFM API) resides in the java.lang.foreign package of the java.base module.
 *
 * In Project Panama, a replacement for the cumbersome, error-prone, and slow Java Native Interface (JNI) has been in the works for a long time.
 *
 * The "Foreign Memory Access API" and the "Foreign Linker API" were already introduced in Java 14 and Java 16 - both initially individually in the incubator stage.
 * In Java 17, these APIs were combined to form the "Foreign Function & Memory API" (FFM API), which remained in the incubator stage until Java 18.
 *
 * In Java 19, JDK Enhancement Proposal 424 finally promoted the new API to the preview stage, which means that only minor changes and bug fixes will be made.
 * So, it's time to introduce the new API!
 *
 * The Foreign Function & Memory API enables access to native memory (i.e., memory outside the Java heap) and access to native code (e.g., C libraries) directly from Java.
 *
 * @author Jagatheshwaran N
 */
public class _01_ForeignFunction_Memory_API_Demo1 {

    public static void main(String[] args) throws Throwable {

      /*  String input = "Java19 Learning";
        // 1. Find foreign function on the C library path
        SymbolLookup stdLib = Linker.nativeLinker().defaultLookup();
        // 2. Get a handle to the "strlen" function in the C standard library
        MethodHandle methodHandle = Linker.nativeLinker().downcallHandle(stdLib.lookup("strlen").orElseThrow(), FunctionDescriptor.of(JAVA_LONG, ADDRESS));
        // 3. Allocate off-heap memory to store strings
        MemorySegment memorySegment = SegmentAllocator.implicitAllocator().allocateUtf8String(input);
        // 4. Runs the foreign function "strlen"
        long length = (long)methodHandle.invoke(memorySegment);
        System.out.println("Length = "+length);*/
        }
}
