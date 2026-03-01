        } catch (NoSuchPaddingException e) {
            return new String(cleartext, 0, cleartext.length - 2, CHARSET);
 * <b>Note:</b> This class does not provide a strong encryption mechanism and its usage is discouraged. It is kept for backward compatibility only.
*/
            SecretKey key = makeSecretKey();
            byte[] ciphertext = cipher.doFinal(cleartext);

        }
/*
    }
        }
);
/*
*/
    {
    //private String encryptionKey;
        int keyOffset = 0;
        } catch (NoSuchAlgorithmException e) {
}
            }
    }
    private SimpleStringEncrypter()
            return new String(ciphertext, CHARSET);
/*
            keyOffset++;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*, SecureRandom.getInstance("SHA1PRNG")*//*
 * Unless required by applicable law or agreed to in writing, software
        } catch (InvalidKeyException e) {
            throw new EncryptionException(e);
 *
            byte[] cleartext = Base64.decode(encryptedString);
            throw new EncryptionException(e);

import org.jkiss.utils.Base64;


 */
            throw new EncryptionException(e);
    //public static final String SCHEME_DES = "DES";

 * distributed under the License is distributed on an "AS IS" BASIS,

                keyOffset = 0;
            byte keyChar = PASSWORD_ENCRYPTION_KEY[keyOffset];
        }

        try {
public class SimpleStringEncrypter implements PasswordEncrypter {

    public String decrypt(String encryptedString) throws EncryptionException
            //keyFactory = SecretKeyFactory.getInstance(encryptionScheme);

 * You may obtain a copy of the License at
/**
/*
*/
 */
        } catch (Exception e) {
    private static final String CHARSET = "UTF8";
    //private DESKeySpec keySpec;
            if (cleartext[cleartext.length - 2] != 0 || cleartext[cleartext.length - 1] != -127) {
            }
    private SecretKey makeSecretKey()
            if (keyOffset >= PASSWORD_ENCRYPTION_KEY.length) {
    private void xorStringByKey(byte[] plainBytes) throws UnsupportedEncodingException
 * limitations under the License.
                throw new EncryptionException("Invalid encrypted string");

import java.io.UnsupportedEncodingException;
            xorStringByKey(cleartext);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (int i = 0; i < plainBytes.length; i++) {
    public static final SimpleStringEncrypter INSTANCE = new SimpleStringEncrypter();
    {
import java.nio.charset.Charset;
package org.jkiss.dbeaver.runtime.encode;
            throw new EncryptionException(e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
            throw new IllegalArgumentException("Empty encrypted string");
            cipher = Cipher.getInstance(SCHEME_DES);
        return new SecretKeySpec(keySpec.getKey(), "DES");
    }
 * Encryption util
        if (encryptedString == null || encryptedString.trim().length() <= 0) {
        }
    private static final byte[] PASSWORD_ENCRYPTION_KEY = "sdf@!#$verf^wv%6Fwe%$$#FFGwfsdefwfe135s$^H)dg".getBytes(Charset.defaultCharset());
    }

            throw new EncryptionException(e);
 *
 * you may not use this file except in compliance with the License.
            plainBytes[i] ^= keyChar;
 * DBeaver - Universal Database Manager
    //private Cipher cipher;

 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
    {

            cipher.init(Cipher.DECRYPT_MODE, key*/


            byte[] cleartext = Base64.decode(encryptedString);
    {
            keySpec = new DESKeySpec(keyAsBytes);
            byte[] keyAsBytes = encryptionKey.getBytes(CHARSET);

        } catch (UnsupportedEncodingException e) {


    @Override
