package com.blueribbon.customize_serialization;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5299170130302257928L;
	String username="dharmu";
	transient String password="dharmu";
}
