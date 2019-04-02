package threadLocal;

public class ThreadLocalDemo2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ThreadLocal tl = new ThreadLocal() {

			public Object initialValue() {
				
				return "abc";
			}
		};

		System.out.println(tl.get());// abc
		tl.set("DHARMU");
		System.out.println(tl.get());// DHARMU
		tl.remove();
		System.out.println(tl.get());//abc
	}

}
