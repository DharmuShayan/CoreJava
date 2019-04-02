package com.blueribbon.customize_serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9092083817632609267L;
	String username1 = "dharm";
	transient String pwd ="Shayan";

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
	  
	}

	private void readObject(ObjectInputStream ois) throws Exception {

		String epwd = (String)ois.readObject();
		pwd = epwd.substring(0);
	}
}
