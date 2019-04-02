package TryWithResourcesDemo;

public class MyResources implements AutoCloseable {
	
	public  MyResources() {
		System.out.println("MyResources created");
	}
	
	public  void doProcess() {
		System.out.println("MyResources Processing...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("MyResources closed");
	}

}
