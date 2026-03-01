import java.io.InputStream;
        }
import org.jkiss.code.NotNull;
    public static final String CIPHER_NAME = "AES/CBC/PKCS5Padding";
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.StandardCharsets;
    @NotNull
            }
import java.util.Arrays;
 * Unless required by applicable law or agreed to in writing, software

import javax.crypto.spec.SecretKeySpec;
 */
    }
            byte[] fileIv = new byte[16];
 *
import java.io.ByteArrayInputStream;
            ByteArrayOutputStream resultBuffer = new ByteArrayOutputStream();
            byte[] iv = cipher.getIV();
        byte[] bytes = password.getBytes(StandardCharsets.UTF_8);
        ByteBuffer bb = ByteBuffer.wrap(new byte[8]);
        return new SecretKeySpec(passBytes, KEY_ALGORITHM);
    }
        } catch (Exception e) {

 *     http://www.apache.org/licenses/LICENSE-2.0


*/
import org.jkiss.dbeaver.model.secret.DBSValueEncryptor;

                IOUtils.copyStream(cipherIn, resultBuffer);
            try (CipherInputStream cipherIn = new CipherInputStream(byteStream, cipher)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DefaultValueEncryptor implements DBSValueEncryptor {
            return SecretKeyFactory.getInstance("AES").generateSecret(spec);
        PBEParameterSpec pbeParamSpec = new PBEParameterSpec(salt, 20);
        try {
            return resultBuffer.toByteArray();
 * Default value encryptor.
            byteStream.read(fileIv);
                return resultBuffer.toByteArray();
        try {
 *
                resultBuffer.write(iv);
        byte[] passBytes = Arrays.copyOf(bytes, 16);

 * Copyright (C) 2010-2024 DBeaver Corp and others
}/**
    @NotNull
            throw new DBException("Error encrypting value", e);
    public DefaultValueEncryptor(SecretKey secretKey) {

                cipherOut.write(value);



            throw new DBException("Error decrypting value", e);
        }

import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        UUID projectID = getProjectID();

 * Uses Eclipse secure preferences to read/write secrets.
            cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(fileIv));
        } catch (Throwable e) {
                ByteArrayOutputStream resultBuffer = new ByteArrayOutputStream();
            throw new IllegalStateException("Internal error during encrypted init", e);
    @Override
            log.error("Error generating secret key for password", e);
/*
    public static SecretKey makeSecretKeyFromPassword(String password) {
/*
 * limitations under the License.
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
import javax.crypto.CipherOutputStream;
        try {
        try (InputStream byteStream = new ByteArrayInputStream(value)) {
            this.cipher = Cipher.getInstance(CIPHER_NAME);
        this.secretKey = secretKey;
 * You may obtain a copy of the License at
        bb.putLong(projectID.getMostSignificantBits());
package org.jkiss.dbeaver.model.impl.app;
            return null;
import javax.crypto.Cipher;

import javax.crypto.SecretKey;
 * you may not use this file except in compliance with the License.
    public static final String KEY_ALGORITHM = "AES";
    @Override
*/
        //PBEKeySpec spec = new PBEKeySpec(password.toCharArray());
/*
import java.io.ByteArrayOutputStream;

    public byte[] decryptValue(@NotNull byte[] value) throws DBException {
            }
 * See the License for the specific language governing permissions and
    private final SecretKey secretKey;
 */
    public byte[] encryptValue(@NotNull byte[] value) throws DBException {
        } catch (Exception e) {
        } catch (Exception e) {

    private final Cipher cipher;
    }
 *
        }
 * DBeaver - Universal Database Manager
    }
import org.jkiss.utils.IOUtils;
        }
            try (CipherOutputStream cipherOut = new CipherOutputStream(resultBuffer, cipher)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        byte[] salt = bb.array();
