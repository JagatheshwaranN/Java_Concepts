package java9.feature.trywithresource;

class MyResource implements AutoCloseable {

	MyResource() {

		System.out.println("Resource Creation");
	}

	public void doProcess() {

		System.out.println("Resource Procces");
	}

	@Override
	public void close() throws Exception {

		System.out.println("Resource Close");
	}
}

public class _03_TryWithResourceWithCustomResourceDemo3 {

	public static void main(String[] args) {

		MyResource resource = new MyResource();
		try (resource) {
			resource.doProcess();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
