package toStringDemo;

import beans.Student;

public class ToStringDemo {

	public static void main(String[] args) {
		
	
		
		Student st = new Student(2,3,"dharmu");
		System.out.println(st.toString());
		System.out.println(st.hashCode());
		
		
		String  s1 = new String ("DHarmu");
		String  s2 = new String ("DHarmu");
		
		String  s3 = "DHarmu";
		String  s4 = "DHarmu";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
