package advanceSecurity;

import java.security.NoSuchAlgorithmException;

public class BcryptHashingDemo {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String originalPassword = "password";
		String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
		System.out.println(generatedSecuredPasswordHash);

		boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
		System.out.println(matched);
	}

}
