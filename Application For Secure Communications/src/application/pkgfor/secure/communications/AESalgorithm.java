package application.pkgfor.secure.communications;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author NikosDls
 */
public class AESalgorithm {

    /**
     * Algorithm AES-128bit with 16 bytes key
     */
    /**
     * Encrypt the plain text using key and initialization vector.
     *
     * @param key
     * @param initVector
     * @param text
     * @return
     */
    public String encrypt(String key, String initVector, String text) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(text.getBytes());
            //System.out.println("encrypted string: " + Base64.encodeBase64String(encrypted));

            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * Decrypt cipher text using key and initialization vector.
     *
     * @param key
     * @param initVector
     * @param text
     * @return
     */
    public String decrypt(String key, String initVector, String text) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(text));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
    /*
    public void main(String[] args) {
        String key = "NikosDollasThesi"; // 128 bit key
        String initVector = "RandomInitVector"; // 16 bytes IV

        String test = encrypt(key, initVector, "Hello World");
        System.out.println("Encrypted: " + test + "\nDecrypted: " + decrypt(key, initVector, test));
    }
     */
}
