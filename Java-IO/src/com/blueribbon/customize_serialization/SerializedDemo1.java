package com.blueribbon.customize_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo1 {

	public static void main(String[] args) throws IOException, Exception {

		Account a = new Account();
		System.out.println(a.username + ":" + a.password + "\n");

		FileOutputStream fos = new FileOutputStream("account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);

		fos.close();
		oos.close();

		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a1 = (Account) ois.readObject();

		System.out.println(a1.username + ":" + a1.password);

		fis.close();
		ois.close();
	}

}
