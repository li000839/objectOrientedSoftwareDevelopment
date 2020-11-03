public class SecureEncryptor extends Encryptor{
    @Override
    public SecretKey createKey() {
        return new LongSecretKey();
    }
}
