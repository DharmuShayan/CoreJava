package info.inetsolv.array;

public class TestDemo {

	public static void main(String[] args) {

		Emp e1 = new Emp(11, "SAM");
		Emp e2 = new Emp(13, "SAMA");
		Emp e3 = new Emp(14, "SAMEE");
		Emp e4 = new Emp(12, "SAMI");

		Emp[] e = { e1, e2, e3, e4 };
		for (Object o : e) {

			if (o instanceof Emp) { 

				Emp ee = (Emp) o;
				System.out.println(ee.id + "::" + ee.name);
			}

			if (o == null) {
				System.out.println(o);
			}

		}
		System.out.println("---------------");
		int[] a = { 100, -2, 12, -99, 45, 78, 45, -90, 90 };
		System.out.println("-----Sum of Array values----------");
		int total = 0;

		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println("Total Values:" + total);

		System.out.println("------Find Smallest and Largest values---------");

		int smallest = 0;
		int largest = 0;

		for (int j = 0; j < a.length; j++) {

			if (a[j] > largest)
				largest = a[j];
			else if (a[j] < smallest)
				smallest = a[j];
		}
		System.out.println("Largest values:" + largest);
		System.out.println("Smallest values:" + smallest);

		System.out.println("------Find Even and ODD values---------");

		for (int k = 0; k < a.length; k++) {
			// if(a[k]%2==0)
			if ((a[k] / 2) * 2 == a[k])
				System.out.println(a[k] + "is Even Number");
			else
				System.out.println(a[k] + "is ODD Number");
			
		}

		System.out.println("------Duplicate values---------");

		int b[] = { 10, 50, 70, 80, 40, 50, 50, 06, 10, 20, 30, 10, 20, -10 };

		for (int i = 0; i <= b.length; i++) {

			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j] && i != j) {

					System.out.println(b[i]);
				}
			}

		}

	}

}
