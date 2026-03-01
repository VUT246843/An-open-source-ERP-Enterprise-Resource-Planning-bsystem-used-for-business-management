            SecretKey key = keyFactory.generateSecret(keySpec);
public class SecuredPasswordEncrypter implements PasswordEncrypter {
            return new String(ciphertext, CHARSET);
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Override
        } catch (Exception e) {
    public static final String SCHEME_DESEDE = "DESede";
            keyFactory = SecretKeyFactory.getInstance(encryptionScheme);
}
        try {
    private static final String CHARSET = "UTF8";
                keySpec = new DESKeySpec(PASSWORD_ENCRYPTION_KEY);
import org.jkiss.utils.Base64;

    private SecretKeyFactory keyFactory;
    private Cipher cipher;
        } catch (NoSuchAlgorithmException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
    {
 */
            cipher = Cipher.getInstance(encryptionScheme);
import java.nio.charset.Charset;

/**
    }
 *
            throw new EncryptionException(e);

        if (encryptedString == null || encryptedString.trim().length() <= 0) {
 * You may obtain a copy of the License at
 * <b>Note:</b> This class does not provide a strong encryption mechanism and its usage is discouraged. It is kept for backward compatibility only.
            } else if (encryptionScheme.equals(SCHEME_DES)) {
    {
    }
            byte[] cleartext = Base64.decode(encryptedString);
import javax.crypto.NoSuchPaddingException;
        } catch (InvalidKeyException e) {
 * Unless required by applicable law or agreed to in writing, software
            throw new IllegalArgumentException("Empty encrypted string");
 * See the License for the specific language governing permissions and

    }
        try {

import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKeyFactory;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this(SCHEME_DES);
 *

 * Secured password encrypter
/*
 * DBeaver - Universal Database Manager
    public String decrypt(String encryptedString) throws EncryptionException

package org.jkiss.dbeaver.runtime.encode;
    private KeySpec keySpec;
            byte[] ciphertext = cipher.doFinal(cleartext);
    public static final String SCHEME_DES = "DES";
import java.security.spec.KeySpec;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private static final byte[] PASSWORD_ENCRYPTION_KEY = "sdf@!#$verf^wv%6Fwe%$$#FFGwfsdefwfe135s$^H)dg".getBytes(Charset.defaultCharset());

import javax.crypto.spec.DESedeKeySpec;
            throw new EncryptionException(e);
    public SecuredPasswordEncrypter() throws EncryptionException


                keySpec = new DESedeKeySpec(PASSWORD_ENCRYPTION_KEY);

import javax.crypto.Cipher;

import java.security.InvalidKeyException;
        }
        }
import javax.crypto.SecretKey;
            if (encryptionScheme.equals(SCHEME_DESEDE)) {
import javax.crypto.spec.DESKeySpec;
        } catch (NoSuchPaddingException e) {
            throw new EncryptionException(e);
 */
 * you may not use this file except in compliance with the License.
        }
                throw new IllegalArgumentException("Encryption scheme not supported: " + encryptionScheme);

            throw new EncryptionException(e);

    {
    public SecuredPasswordEncrypter(String encryptionScheme) throws EncryptionException
            }

            cipher.init(Cipher.DECRYPT_MODE, key);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 * <p>
