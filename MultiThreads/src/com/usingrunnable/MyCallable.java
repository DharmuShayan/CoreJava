package com.usingrunnable;



public class MyCallable  {
	int num;
	public MyCallable(int num) {
		this.num=num;
	}

	
	public Object call() throws Exception {

		int sum=0;
		for (int i = 0; i <=num; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		
		MyCallable ca = new MyCallable(10);
		Object call = ca.call();
		System.out.println(call);
	}
}

