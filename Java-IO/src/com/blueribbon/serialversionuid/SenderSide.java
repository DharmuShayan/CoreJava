package com.blueribbon.serialversionuid;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SenderSide {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		Emp e = new Emp();
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(e);
	}

}
