package threadGroup;

public class ThreadGroupDemo2 {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("First Group");
        System.out.println(tg.getParent().getName());

		ThreadGroup tg1 = new ThreadGroup(tg, "Second Group");
		System.out.println(tg1.getParent().getName());
	}
}
