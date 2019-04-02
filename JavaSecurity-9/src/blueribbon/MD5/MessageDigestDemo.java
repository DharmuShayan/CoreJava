package blueribbon.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * It will generate 32 digits
 */
public class MessageDigestDemo {
	public static void main(String[] args) {
		String passwordToHash = "password";
		String generatedPassword = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(passwordToHash.getBytes());
			byte[] bytes = md.digest();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toHexString((bytes[i] &0xff)));
			}
			 generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		System.out.println(generatedPassword);
	}
}