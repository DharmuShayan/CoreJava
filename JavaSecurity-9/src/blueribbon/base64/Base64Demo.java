package blueribbon.base64;

import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String msg="Password";
		Base64.Encoder enc = Base64.getEncoder();
		byte[] encbytes = enc.encode(msg.getBytes());
		
		for (int i = 0; i < encbytes.length; i++){
	         System.out.printf("%c", (char) encbytes[i]);
	         if (i != 0 && i % 4 == 0)
	            System.out.print(' ');
	      }
		System.out.println();
	      Base64.Decoder dec = Base64.getDecoder();
	      byte[] decbytes = dec.decode(encbytes);
	      System.out.println(new String(decbytes));
	}

}
