import java.nio.charset.StandardCharsets;
import java.util.Random;

public abstract class SecretKey {
    private final byte[] key;

    public SecretKey(int n){
        key = new byte[n];
        Random rand = new Random();
        rand.nextBytes(key);
    }

    public byte[] encrypt(byte[] message) {
        byte[] result = new byte[message.length];
        for(int i = 0; i < message.length ; i++) {
            result[i] = (byte) (message[i] ^ key[i % key.length]);
        }
        return result;
    }

    public String decrypt(byte[] message) {
        return new String(encrypt(message), StandardCharsets.UTF_8);
    }

}
