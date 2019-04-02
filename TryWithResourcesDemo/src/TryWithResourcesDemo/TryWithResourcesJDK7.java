package TryWithResourcesDemo;



public class TryWithResourcesJDK7 {
	
	public static void onwardJDK7() throws Exception {
		
		try(MyResources r =new MyResources()) {
			r.doProcess();
			
		} catch (Exception e) {
			System.out.println("Handling:" + e);
		} 
		
	
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(" JDK7");
		onwardJDK7();
		
		
	}

}
