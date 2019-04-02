package TryWithResourcesDemo;

public class TryCatchFinallyBeforeJDK7 {

	public static void beforeJDK7() throws Exception {
		MyResources r = null;
		try {
			r = new MyResources();
			r.doProcess();
			
		} catch (Exception e) {
			System.out.println("Handling:" + e);
		} 
		finally {
			if (r != null) {
				r.close();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		System.out.println("Before JDK7");
		beforeJDK7();
	}
}