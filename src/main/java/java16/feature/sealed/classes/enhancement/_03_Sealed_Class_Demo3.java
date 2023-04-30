package java16.feature.sealed.classes.enhancement;

/**
 * In Java16, In the second preview of Sealed Classes is that local classes
 * (that is, classes defined within methods) are not allowed to extend sealed
 * classes.
 * 
 * @author Jagatheshwaran N
 */
public class _03_Sealed_Class_Demo3 {

	public static void main(String[] args) {

		FastProcess fp = new FastProcess();
		SlowProcess sp = new SlowProcess();
		fp.getFastProcess();
		sp.getSlowProcess();
	}
}

sealed class Process permits SlowProcess, FastProcess {
}

final class SlowProcess extends Process {

	public void getSlowProcess() {
		System.out.println("Slow Process");
	}
}

non-sealed class FastProcess extends Process {

	public void getFastProcess() {
		System.out.println("Fast Process");
	}
}

/*
 * The instanceof expression in the below code tests a reference of type Process
 * to see if the object referred to by that reference implements the Loggable
 * interface. Now, in the typical situation, all types that can ever be
 * assignment-compatible with a sealed class will be known to the compiler, and
 * if none implements the interface in question, the compiler could reject the
 * code outright.
 * 
 * However, in this case, the FastProcess class is marked non-sealed, and
 * because of this, it’s possible for this class to have subclasses that are not
 * known to the compiler at this time, and those subclasses might possibly
 * implement the Loggable interface. Because of this possibility, the compiler
 * accepts the code and compiles the test as written.
 */
interface Loggable {
	static boolean isLoggable(Process p) {
		return p instanceof Loggable;
	}
}