package function;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		getStudent(() -> {
			return new Student(40, "Dharmu7", 22);
		});
	}

	private static void getStudent(Supplier<Student> supplier) {
		Student s = supplier.get();
		System.out.println("Student:" + s.getId() + "" + s.getName() + "" + s.getAge());

	}

}
