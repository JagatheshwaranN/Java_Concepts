package java12.feature.string.enhancements;

import java.lang.invoke.MethodHandles;
import java.util.Optional;

/**
 * String class also introduces two additional low-level methods
 * describeConstable() and resolveConstantDesc(MethodHandles.Lookup).
 * 
 * They are low-level APIs meant for libraries and tools providing bytecode
 * parsing and generation functionality. Just to note, a Constable type is one
 * whose values are constants that can be represented in the constant pool of a
 * Java class file as described in JVMS 4.4, and whose instances can describe
 * themselves nominally as a ConstantDesc.
 * 
 * resolveConstantDesc() is similar to describeConstable() with the difference
 * being that this method returns an instance of ConstantDesc instead.
 * 
 * @author Jagatheshwaran N
 */
public class _04_String_Constant_Demo1 {

	public static void main(String[] args) {

		var text = "Program";
		Optional<String> optionalText = text.describeConstable();
		System.out.println(optionalText);
		var constDesc = text.resolveConstantDesc(MethodHandles.lookup());
		System.out.println(constDesc);
	}
}
