package TryWithResourcesEnhancement;

import TryWithResourcesDemo.MyResources;

public class TryWithResourcesJDK9MultipleResources {

	public static void jdk9() {

		MyResources r1 = new MyResources();
		MyResources r2 = new MyResources();
		MyResources r3 = new MyResources();
		MyResources r4 = new MyResources();
		try (r1;r2;r3;r4) {
			r1.doProcess();
			r2.doProcess();
			r3.doProcess();
			r4.doProcess();
		} catch (Exception e) {

			System.out.println("Handling" + e);
		}

	}

	public static void main(String[] args) {
		System.out.println("JDK9");
          jdk9();
	}

}
