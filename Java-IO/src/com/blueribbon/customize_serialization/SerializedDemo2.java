package com.blueribbon.customize_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, Exception {

		Account2 a2 = new Account2();
		//System.out.println(a2.username1 + ":" + a2.pwd );

		FileOutputStream fos = new FileOutputStream("account2.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a2);

	

		FileInputStream fis = new FileInputStream("account2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account2 a3 = (Account2)ois.readObject();

		System.out.println(a3.username1 + ":" + a3.pwd);


	}

}
