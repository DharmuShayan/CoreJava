package threadLocal;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ThreadLocal<String> tl = new ThreadLocal<>();
		System.out.println(tl.get());//null
		tl.set("DHARMU");
		System.out.println(tl.get());//DHARMU
		tl.remove();
		System.out.println(tl.get());//null
	}

}
