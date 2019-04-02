package threadLocal;





public class ThreadLocalDemo3 {
	
	

	public static void main(String[] args) {
		
		

		CustomerThread c1 = new CustomerThread("CustomerThread-1");
		CustomerThread c2 = new CustomerThread("CustomerThread-2");
		CustomerThread c3 = new CustomerThread("CustomerThread-3");
		CustomerThread c4 = new CustomerThread("CustomerThread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}


}


class CustomerThread extends Thread{
	
	static Integer cusId=0;
	@SuppressWarnings("rawtypes")
	private static ThreadLocal tl=new ThreadLocal() {
		
		protected Integer initialValue() {
			return ++cusId;
		}
	};
	CustomerThread(String name){
		super(name);
		}
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName() +":executing with cusId:"+tl.get());
	}
}