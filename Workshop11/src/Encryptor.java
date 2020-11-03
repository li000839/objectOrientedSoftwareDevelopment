import java.util.List;

abstract class Encryptor {
    private final SecretKey key;

    public Encryptor() {
        key = createKey();
    }

    public byte[] encrypt(List<String> lines) {
        int length = 0;
        for (String str : lines) {
            length += str.length();
        }

        byte[] result = new byte[length];
        int i = 0;
        for (String str : lines) {
            byte[] ct = key.encrypt(str.getBytes());
            for (byte b : ct) {
                result[i++] = b;
            }
        }
        return result;
    }

    public abstract SecretKey createKey();
}
