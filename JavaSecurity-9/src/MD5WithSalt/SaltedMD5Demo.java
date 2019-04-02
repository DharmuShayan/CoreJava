package MD5WithSalt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class SaltedMD5Demo {

	public static byte[] getSalt() throws NoSuchAlgorithmException, NoSuchProviderException {

		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		byte[] salt = new byte[16];
		sr.nextBytes(salt);
		String name=sr.getAlgorithm();
		System.out.println(name);
		return salt;
	}

	public static String getSecurePassword(String passwordToHash, byte[] salt) {
		String generatedPassword = null;

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");

			md.update(salt);
			byte[] bytes = md.digest(passwordToHash.getBytes());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
			}
			generatedPassword = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return generatedPassword;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {

		String passwordToHash = "password";
		byte[] salt = getSalt();

		String securePassword = getSecurePassword(passwordToHash, salt);
		System.out.println(securePassword); // Prints 1a7844ff7653a945cbe1bdcb78629dc6

		String regeneratedPassowrdToVerify = getSecurePassword(passwordToHash, salt);
		System.out.println(regeneratedPassowrdToVerify); // Prints 1a7844ff7653a945cbe1bdcb78629dc6
	}

}
