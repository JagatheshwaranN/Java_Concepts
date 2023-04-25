package java15.feature.EdDSA.Algorithm;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Base64;

/**
 * EdDSA is a modern signature method that is faster than previous signature
 * methods, such as DSA and ECDSA while maintaining the same security strength.
 * EdDSA is supported by many crypto libraries such as OpenSSL and BoringSSL.
 * Many users already use EdDSA certificates. Edwards-Curve Digital Signature
 * Algorithm, EdDSA is an advanced elliptic curve scheme and is better than
 * existing signature schemes in the JDK. It has improved security and
 * performance as compared to other signature schemes. It is supported by
 * popular crypto libraries like OpenSSL, BoringSSL etc. EdDSA will only be
 * implemented in java 15 only in the SunEC provider.
 * 
 * @author Jagatheshwaran N
 */
public class _01_EdDSA_Algorithm_Demo1 {

	public static void main(String[] args) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {

		String message = "Happy Learning!";
		KeyPairGenerator kpgenerator = KeyPairGenerator.getInstance("Ed25519");
		KeyPair kpair = kpgenerator.generateKeyPair();
		Signature sign = Signature.getInstance("Ed25519");
		sign.initSign(kpair.getPrivate());
		sign.update(message.getBytes(StandardCharsets.UTF_8));
		byte[] signature = sign.sign();
		System.out.println("Signature => " + Base64.getEncoder().encodeToString(signature));
	}
}
