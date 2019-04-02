package com.blueribbon.non_access.modifier;

import java.util.Date;
@SuppressWarnings("unused")
public class TransientDemo {

    // Making password transient for security
    
	private transient String password;
    
 /**
  *  Making age transient as age is auto-computable from DOB and current date.
  */
    
    transient int age;
    
 // serialize other fields
    private String username, email;
    Date dob;
}
