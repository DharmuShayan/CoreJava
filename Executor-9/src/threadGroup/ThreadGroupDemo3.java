package threadGroup;

public class ThreadGroupDemo3 {

	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("tg");
		
        Thread t1 = new Thread(tg,"Thread1");
        Thread t2 = new Thread(tg,"Thread2");
        tg.setMaxPriority(3);
        Thread t3 = new Thread(tg,"Thread3");
        
        System.out.println(t1);//5
        System.out.println(t2.getPriority());//5
        System.out.println(t3.getPriority());//3
	}
}
