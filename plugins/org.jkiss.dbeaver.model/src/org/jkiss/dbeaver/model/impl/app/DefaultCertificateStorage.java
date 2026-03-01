    public void addCertificate(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType, @NotNull byte[] keyStoreData, @NotNull char[] keyStorePassword) throws DBException {
    @Override
    }
            privateKeyPem = privateKeyPem.replaceAll("\\s", "");

        } catch (Throwable e) {
     * Different SSL providers use different pk format. Google cloud uses PKCS1. See #740
                    new ArrayList<>(cf.generateCertificates(new ByteArrayInputStream(caCertData)));
        return this.localPath;
import java.security.cert.Certificate;
 * limitations under the License.
            KeyFactory factory = KeyFactory.getInstance("RSA");
        return KeyStore.getDefaultType();



        try (Reader reader = new InputStreamReader(stream)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

                PrivateKey privateKey = loadPrivateKeyFromPEM(keyData);
        }
    }
        }

        final KeyStore keyStore = getKeyStore(dataSource, certType);
            PrivateKey privateKey = keyPair.getPrivate();
     * That's tricky.
                try (InputStream is = Files.newInputStream(ksFile)) {

        StringBuilder result = new StringBuilder(4000);

    public void addCertificate(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType, @NotNull String keyStorePath, @NotNull char[] keyStorePassword) throws DBException {
        } else if (privateKeyPem.contains(PEM_RSA_PRIVATE_START)) {  // PKCS#1 format
import org.jkiss.code.Nullable;
        final String PEM_PRIVATE_START = "-----BEGIN PRIVATE KEY-----";


import java.io.*;

            }
        }
            if (Files.exists(ksFile)) {
    @Override
public class DefaultCertificateStorage implements DBACertificateStorage {
} *
        return new PemReader(reader).readPemObject().getContent();
            byte[] pkcs8EncodedKey = Base64.decode(privateKeyPem);
                    certChain.add(certificates.get(i));
        if (privateKeyPem.contains(PEM_PRIVATE_START)) { // PKCS#8 format

        );
        final Path ksFile = getKeyStorePath(container, certType);

            // Because they may be used by another instances of the application (pro/#2998)
    @NotNull
            // We don't want to erase anything from user-defined keystore
            // We do not cleanup key stores in non-primary instances

import java.util.ArrayList;
        }
        }
    public Path getStorageFolder() {
        }
            } catch (Throwable e) {
        checkConfigFolderExists();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            return factory.generatePrivate(new PKCS8EncodedKeySpec(pkcs8EncodedKey));
    private String getKeyStoreName(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType) {
import org.jkiss.dbeaver.model.app.DBPPlatform;
    }

            return PKCS1Util.loadPrivateKeyFromPKCS1(privateKeyPem);
import org.jkiss.dbeaver.model.app.DBACertificateStorage;
import java.nio.file.Path;
            if (platform.getApplication().isPrimaryInstance()) {
 */
            }
            new UserDefinedKeystore(new File(keyStorePath), keyStorePassword)
    }
    @Override
            throw new DBException("Adding new certificates would override user-specified keystore");
                    ks.load(is, getKeyStorePassword(container, certType));
                }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.bouncycastle.util.io.pem.PemReader;
import java.security.*;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public void deleteCertificate(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType) throws DBException {

            keyStore.deleteEntry(CA_CERT_ALIAS);

     */
    public void addSelfSignedCertificate(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType, @NotNull String certDN) throws DBException {

                    keyStore.setCertificateEntry(i == 0 ? CLIENT_CERT_ALIAS : CLIENT_CERT_ALIAS + i,
    @NotNull
                    for (File ksFile : ksFiles) {

        if (userDefinedKeystores.remove(getKeyStoreName(dataSource, certType)) != null) {
                        certificates.get(i));
                keyStore.setKeyEntry(KEY_CERT_ALIAS, privateKey, DEFAULT_PASSWORD, certChain.toArray(new Certificate[certChain.size()]));
 */
            throw new DBException("Error adding certificate to keystore", e);
    @Override
    }
    public static PrivateKey loadPrivateKeyFromPEM(byte[] keyData) throws GeneralSecurityException, IOException {
            keyStore.deleteEntry(CLIENT_CERT_ALIAS);

    @Nullable
        final KeyStore keyStore = getKeyStore(dataSource, certType);

            privateKeyPem = privateKeyPem.replace(PEM_PRIVATE_START, "").replace(PEM_PRIVATE_END, "");
        } catch (Exception e) {
import java.security.spec.PKCS8EncodedKeySpec;
           } catch (IOException e) {
        checkConfigFolderExists();
    public static final String CLIENT_CERT_ALIAS = "client-cert";
        if (Files.exists(localPath)) {
 * Unless required by applicable law or agreed to in writing, software
                    keyStore.setCertificateEntry(i == 0 ? CA_CERT_ALIAS : CA_CERT_ALIAS + i, certificates.get(i));

                            log.warn("Can't delete old keystore '" + ksFile.getAbsolutePath() + "'");
import java.util.HashMap;
    }
                ks.load(null, DEFAULT_PASSWORD);
                List<? extends Certificate> certificates =
    public void addCertificate(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType, byte[] caCertData, byte[] clientCertData, byte[] keyData) throws DBException {
 * you may not use this file except in compliance with the License.
        } else {
            List<Certificate> certChain = new ArrayList<>();

                for (int i = 0; i < certificates.size(); i++) {
    private static final char[] DEFAULT_PASSWORD = "".toCharArray();
                result.append(line);
import java.nio.file.Files;
 * DBeaver - Universal Database Manager
                final File[] ksFiles = localPath.toFile().listFiles();


        if (userDefinedKeystores.containsKey(getKeyStoreName(dataSource, certType))) {
    private final Path localPath;

import org.jkiss.dbeaver.DBException;
        final Path keyStorePath = getKeyStorePath(dataSource, certType);
        }
        try (OutputStream os = Files.newOutputStream(ksFile)) {
        try {
               Files.createDirectories(localPath);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Throwable e) {
            return ks;
            return localPath.resolve(getKeyStoreName(dataSource, certType) + JKS_EXTENSION);
        }
        final UserDefinedKeystore userDefinedKeystore = getUserDefinedKeystore(dataSource, certType);
        } else {

            }
            throw new GeneralSecurityException("Not supported format of a private key");
        try {
    @Override
            if (keyData != null) {
            }
            this.password = password;
        }
    public static final String CA_CERT_ALIAS = "ca-cert";
 * DefaultCertificateStorage
    }
            privateKeyPem = privateKeyPem.replaceAll("\\s", "");
        if (!Files.exists(keyStorePath)) {
                final String line = br.readLine();
            privateKeyPem = privateKeyPem.replace(PEM_RSA_PRIVATE_START, "").replace(PEM_RSA_PRIVATE_END, "");
    public static byte[] readEncryptedString(Reader reader) throws IOException {
/**
        userDefinedKeystores.put(
    private final Map<String, UserDefinedKeystore> userDefinedKeystores;
    @Override
    private UserDefinedKeystore getUserDefinedKeystore(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType) {

            throw new DBException("Error adding self-signed certificate to keystore", e);
    }


 *

    }
    private static class UserDefinedKeystore {
        // PKCS#1 format
    }
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
    }
        this.userDefinedKeystores = new HashMap<>();
    }
        if (userDefinedKeystores.containsKey(getKeyStoreName(dataSource, certType))) {
    @Override
    @NotNull
        } else {
                Files.write(keyStorePath, keyStoreData);
            throw new DBException("Error opening keystore", e);
    }
            keyStore.setKeyEntry(KEY_CERT_ALIAS, privateKey, DEFAULT_PASSWORD, certChain.toArray(new Certificate[certChain.size()]));
            keyStore.store(os, DEFAULT_PASSWORD);
        private final char[] password;
            }
            if (clientCertData != null) {
                if (ksFiles != null) {
    }
            certChain.add(clientCert);
        final KeyStore keyStore = getKeyStore(dataSource, certType);

        return userDefinedKeystores.get(getKeyStoreName(dataSource, certType));
    @NotNull
               log.error("Can't create directory for security manager: " + localPath, e);
            return userDefinedKeystore.file.toPath();
        }

        }
    @Override
        if (!Files.exists(localPath)) {
                throw new DBException("Error adding certificate to keystore", e);
        public UserDefinedKeystore(@NotNull File file, @NotNull char[] password) {
    public KeyStore getKeyStore(@NotNull DBPDataSourceContainer container, @NotNull String certType) throws DBException {
                        }
                        if (!ksFile.delete()) {
                    = new ArrayList<>(cf.generateCertificates(new ByteArrayInputStream(clientCertData)));
    private void checkConfigFolderExists() {
            keyStore.setCertificateEntry(CLIENT_CERT_ALIAS, clientCert);
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
            return DEFAULT_PASSWORD;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            throw new DBException("Error deleting certificate from keystore", e);
        } catch (Exception e) {
        }
            try {
        if (userDefinedKeystore != null) {
            return userDefinedKeystore.password;
            saveKeyStore(dataSource, certType, keyStore);
    }
       }
        try (BufferedReader br = new BufferedReader(reader)) {
    private static final Log log = Log.getLog(DefaultCertificateStorage.class);
 * You may obtain a copy of the License at
                saveKeyStore(container, certType, ks);
                List<? extends Certificate> certificates
package org.jkiss.dbeaver.model.impl.app;
import org.jkiss.code.NotNull;
/*
        private final File file;
            keyStore.deleteEntry(KEY_CERT_ALIAS);
    }

            KeyPair keyPair = keyPairGenerator.generateKeyPair();
    }

        if (userDefinedKeystore != null) {
    @Override
            return;
           }
            Certificate clientCert = CertificateGenHelper.generateCertificate(certDN, keyPair, 365, "SHA256withRSA");
    }
    }
    @NotNull
import java.util.List;
            List<Certificate> certChain = new ArrayList<>();
            return readEncryptedString(reader);
        checkConfigFolderExists();
import java.util.Map;
    public static byte[] loadDerFromPem(@NotNull Reader reader) throws IOException {
    public static byte[] readEncryptedString(InputStream stream) throws IOException {
        // PKCS#8 format
                if (line.startsWith("-") || line.startsWith("#")) continue;

            }
    public static final String JKS_EXTENSION = ".jks";
        String privateKeyPem = new String(keyData);
    @Override
            } else {
                }
    private void saveKeyStore(DBPDataSourceContainer container, String certType, KeyStore keyStore) throws Exception {
    /**
 * See the License for the specific language governing permissions and
                for (int i = 0; i < certificates.size(); i++) {
        final UserDefinedKeystore userDefinedKeystore = getUserDefinedKeystore(dataSource, certType);
import java.security.cert.CertificateFactory;
            // Cleanup old keystores
                //certChain.add(caCert);
                }
        }
        return dataSource.getId() + '-' + certType;
    public String getKeyStoreType(@NotNull DBPDataSourceContainer dataSource) {
        }
     * Algorithm got from http://stackoverflow.com/questions/7216969/getting-rsa-private-key-from-pem-base64-encoded-private-key-file
                if (line == null || line.isEmpty()) break;
        try {

    public char[] getKeyStorePassword(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType) {

                }
                    }
    public DefaultCertificateStorage(@NotNull DBPPlatform platform, @NotNull Path localPath) {
        final String PEM_PRIVATE_END = "-----END PRIVATE KEY-----";

            getKeyStoreName(dataSource, certType),
            saveKeyStore(dataSource, certType, keyStore);
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            for (; ; ) {
        userDefinedKeystores.put(getKeyStoreName(dataSource, certType), new UserDefinedKeystore(keyStorePath.toFile(), keyStorePassword));

            this.file = file;
        final String PEM_RSA_PRIVATE_END = "-----END RSA PRIVATE KEY-----";
            Path ksFile = getKeyStorePath(container, certType);
            saveKeyStore(dataSource, certType, keyStore);
        try {
    @NotNull

        final String PEM_RSA_PRIVATE_START = "-----BEGIN RSA PRIVATE KEY-----";
            throw new DBException("Adding new certificates would override user-specified keystore");
import org.jkiss.utils.Base64;

    public static final String KEY_CERT_ALIAS = "key-cert";
            }
           try {
    public Path getKeyStorePath(@NotNull DBPDataSourceContainer dataSource, @NotNull String certType) {
        this.localPath = localPath;
            if (caCertData != null) {
        return Base64.decode(result.toString());
import org.jkiss.dbeaver.Log;
