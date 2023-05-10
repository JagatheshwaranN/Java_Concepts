package java17.feature.context.specific.deserialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * JEP 290, first introduced in JDK 9, enabled us to validate incoming
 * serialized data from untrusted sources, a common source of many security
 * issues. That validation happens at the JVM level, giving more security and
 * robustness.
 * 
 * With JEP 415, applications can configure context-specific and dynamically
 * selected deserialization filters defined at the JVM level. Each
 * deserialization operation will invoke such filters.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_Context_Specific_Deserialization_Demo1 {

	public static void main(String[] args) throws IOException {
		byte[] bytes = convertObjectToStream(new DeserializeExample());
		InputStream inputStream = new ByteArrayInputStream(bytes);
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

		ObjectInputFilter filter = ObjectInputFilter.Config
				.createFilter("maxbytes=1024;java17.feature.context.specific.deserialization.*;java.base/*;!*");
		// .createFilter("maxbytes=1024;!java17.feature.context.specific.deserialization.*;java.base/*;!*"); - REJECT Scenario
		objectInputStream.setObjectInputFilter(filter);

		try {
			Object object = objectInputStream.readObject();
			System.out.println("Read Object ==> " + object);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static byte[] convertObjectToStream(Object object) {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
			objectOutputStream.writeObject(object);
			return byteArrayOutputStream.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new RuntimeException();
	}
}

class DeserializeExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Deserialization Demo";
	}

}