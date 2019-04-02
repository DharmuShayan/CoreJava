package TryWithResourcesEnhancement;

import TryWithResourcesDemo.MyResources;

public class TryWithResourcesJDK9 {

	public static void jdk9() {

		MyResources r = new MyResources();
		try (r) {
			r.doProcess();
		} catch (Exception e) {

			System.out.println("Handling" + e);
		}

	}

	public static void main(String[] args) {
		System.out.println("JDK9");
          jdk9();
	}

}
