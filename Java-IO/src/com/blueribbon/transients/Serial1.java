package com.blueribbon.transients;

import java.io.Serializable;


class Serial1 implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3109253867064218615L;

	
	Serial2 s2 = new Serial2(); 
}

//Class Serial2 contains reference to object 
//of class Serial3. 
class Serial2 implements Serializable {
   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5538745274273496277L;
	Serial3 s3 = new Serial3(); 
}

//A reference of this class is present in Serial2
class Serial3 implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -2722444670852520248L;
	int i = 10;
    int j = 20;
}