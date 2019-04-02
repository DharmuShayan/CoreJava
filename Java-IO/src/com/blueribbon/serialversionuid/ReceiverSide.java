package com.blueribbon.serialversionuid;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReceiverSide {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e2 =(Emp)ois.readObject();
		
		System.out.println(e2.i+":"+e2.j+":"+e2.k);
	}

}