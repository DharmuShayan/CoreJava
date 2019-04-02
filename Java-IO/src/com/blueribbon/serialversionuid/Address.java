package com.blueribbon.serialversionuid;

import java.io.Serializable;

public class Address implements Serializable{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 3576308910653499913L;
	
	private String name;
	private String address;
	
	
	
	public Address(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
