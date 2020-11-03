public class InsecureEncryptor extends Encryptor{
    @Override
    public SecretKey createKey() {
        return new ShortSecretKey();
    }
}

