package application.pkgfor.secure.communications;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author NikosDls
 */
public class RSAalgorithm {

    /**
     * String to hold name of the encryption algorithm.
     */
    public static final String ALGORITHM = "RSA";

    /**
     * Generate key which contains a pair of private and public key using n
     * bytes. Store the set of keys private.key and public.key in the file.
     * @param privateKeyPath
     * @param publicKeyPath
     * @param bytes
     */
    public void generateKey(String privateKeyPath, String publicKeyPath, int bytes) {
        try {
            final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
            keyGen.initialize(bytes);
            final KeyPair key = keyGen.generateKeyPair();

            File privateKeyFile = new File(privateKeyPath);
            File publicKeyFile = new File(publicKeyPath);

            // Create files to store public and private key
            if (privateKeyFile.getParentFile() != null) {
                privateKeyFile.getParentFile().mkdirs();
            }
            privateKeyFile.createNewFile();

            if (publicKeyFile.getParentFile() != null) {
                publicKeyFile.getParentFile().mkdirs();
            }
            publicKeyFile.createNewFile();

            // Saving the Public key in a file
            ObjectOutputStream publicKeyOS = new ObjectOutputStream(
                    new FileOutputStream(publicKeyFile));
            publicKeyOS.writeObject(key.getPublic());
            publicKeyOS.close();

            // Saving the Private key in a file
            ObjectOutputStream privateKeyOS = new ObjectOutputStream(
                    new FileOutputStream(privateKeyFile));
            privateKeyOS.writeObject(key.getPrivate());
            privateKeyOS.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * The method checks if the pair of public and private key has been
     * generated.
     *
     * @param privateKeyPath
     * @param publicKeyPath
     * @return flag indicating if the pair of keys were generated.
     */
    public boolean areKeysPresent(String privateKeyPath, String publicKeyPath) {
        if (privateKeyPath != null) {
            File privateKey = new File(privateKeyPath);

            if (privateKey.exists()) {
                return true;
            }
        }

        if (publicKeyPath != null) {
            File publicKey = new File(publicKeyPath);

            if (publicKey.exists()) {
                return true;
            }
        }

        return false;
    }

    /**
     * Encrypt the plain text using public key.
     *
     * @param text: original plain text
     * @param key: public key
     * @return encrypted text
     */
    public String encrypt(String text, PublicKey key) {
        try {
            // get an RSA cipher object and print the provider
            final Cipher cipher = Cipher.getInstance(ALGORITHM);
            // encrypt the plain text using the public key
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipherText = cipher.doFinal(text.getBytes());

            return Base64.encodeBase64String(cipherText);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    /**
     * Decrypt cipher text using private key.
     *
     * @param text: encrypted text
     * @param key: private key
     * @return plain text
     */
    public String decrypt(String text, PrivateKey key) {
        try {
            // get an RSA cipher object and print the provider
            final Cipher cipher = Cipher.getInstance(ALGORITHM);

            // decrypt the text using the private key
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] dectyptedText = cipher.doFinal(Base64.decodeBase64(text));

            return new String(dectyptedText);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
