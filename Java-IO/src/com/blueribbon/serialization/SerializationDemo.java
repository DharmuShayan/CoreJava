package com.blueribbon.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d = new Dog();
		
		System.out.println("Serialization");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		
		System.out.println("DeSerialization");
		FileInputStream fio = new FileInputStream("abc.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fio);
		Dog d1=(Dog)ois.readObject();
		
		System.out.println(d1.i +":"+d1.j);
		System.out.println(d1.toString());
	}

}
