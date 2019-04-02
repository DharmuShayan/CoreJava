package info.inetsolv.array;

public class SmallestAndLargest {

	public static void main(String[] args) {

		//int[] a = { 100, 20, 30, 40, 50, 60, 70, 70 };
		int[] a = {-9,100,-1,12, 45, 78, 45, -90 ,90};
		int smallest = 0;
		int largest =0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest)
				largest = a[i];
			else if (a[i] < smallest)
				smallest = a[i];

		}

		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);

	}

}
