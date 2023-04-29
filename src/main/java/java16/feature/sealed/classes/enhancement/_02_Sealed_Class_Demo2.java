package java16.feature.sealed.classes.enhancement;

/**
 * The permits keyword can be omitted if subclasses derived from a sealed class
 * are defined within the same class file ("compilation unit"). These are then
 * considered "implicitly declared permitted subclasses".
 * 
 * @author Jagatheshwaran N
 */
public class _02_Sealed_Class_Demo2 {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass("John", 101);
		System.out.println(obj.getName());
		System.out.println(obj.getId());
	}
}

sealed class SealedClassWithoutPermits {

	String name;

	public String getName() {
		return name;
	}
}

non-sealed class ChildClass extends SealedClassWithoutPermits {

	int id;

	ChildClass(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
