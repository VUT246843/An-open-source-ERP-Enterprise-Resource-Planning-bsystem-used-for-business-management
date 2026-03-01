    public static final String PROP_SSL_CLIENT_KEY = "ssl.client.key";
        KeyStore trustStore = securityManager.getKeyStore(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE);

import java.nio.charset.StandardCharsets;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
 *
    /**
                    securityManager.deleteCertificate(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE);
     */
    public static final String PROP_SSL_KEYSTORE_VALUE = PROP_SSL_KEYSTORE + CERT_VALUE_SUFFIX;
            }
        }
    /**
            return false;

     * Reads trust store file contents.
    public static final String PROP_SSL_CA_CERT = "ssl.ca.cert";
        setSystemProperty("javax.net.ssl.keyStorePassword", String.valueOf(keyStorePass), oldProps);
                monitor.subTask("Load keystore");

    }

        if (sslConfig.getBooleanProperty(PROP_SSL_SELF_SIGNED_CERT)) {
    public static byte[] readCertificate(DBWHandlerConfiguration configuration, String basePropName) throws IOException {
        final byte[] key = SSLHandlerTrustStoreImpl.readCertificate(handler, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY);
            trustManagers = trustManagerFactory.getTrustManagers();
    }
                if (keyStore != null) {


            if (method == SSLConfigurationMethod.KEYSTORE) {

     * Creates certificates and adds them into trust store

        return null;
            sslConfig.getStringProperty(SSLHandlerTrustStoreImpl.PROP_SSL_METHOD),
    /**

    public static void initializeTrustStore(DBRProgressMonitor monitor, DBPDataSource dataSource, DBWHandlerConfiguration sslConfig) throws DBException, IOException {
        }

/**
    }
            return Files.readAllBytes(Path.of(filePath));
        final DBACertificateStorage securityManager = DBWorkbench.getPlatform().getCertificateStorage();
        return true;
        {
import org.jkiss.dbeaver.model.impl.app.DefaultCertificateStorage;

    public static final String TLS_PROTOCOL_VAR_NAME = "jdk.tls.client.protocols";
        final SSLContext context = SSLContext.getInstance("SSL");
                }
        }
import java.nio.file.Path;
    }

        final String keyStore = sslConfig.getStringProperty(PROP_SSL_KEYSTORE);
        String keyStorePath = securityManager.getKeyStorePath(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE).toAbsolutePath().toString();
                    sslConfig.getPassword();
                } else if (keyStoreData != null) {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");

        }

        } else {
        }
        setSystemProperty("javax.net.ssl.trustStorePassword", String.valueOf(keyStorePass), oldProps);
        sslContext.init(keyManagers, trustManagers, new SecureRandom());
     */
        if (CommonUtils.isEmpty(filePath) && altPropName != null) {
import java.io.Reader;
     */
        Files.write(tempDerFile, DefaultCertificateStorage.loadDerFromPem(reader));
            handler.setSecureProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY, derCertPath);
        }
        keyManagerFactory.init(trustStore, keyStorePass);
        var propertyValue = configuration.getSecureProperty(property);
    }
    }
        final @NotNull DBWHandlerConfiguration handler,
                    securityManager.addCertificate(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE, keyStore, keyStorePasswordData);
            if (pe.getValue() == null) {
        String derCertPath = tempDerFile.toAbsolutePath().toString();
    ) throws IOException {
    @NotNull
 *
                    securityManager.addCertificate(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE, caCertData, clientCertData, keyData);
package org.jkiss.dbeaver.model.impl.net;

        // The chain is built asynchronously by the driver, and we don't know at which moment in time it will happen.
            }
        String keyStoreType = securityManager.getKeyStoreType(dataSource.getContainer());
/*
        return sslContext;
        }
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return Base64.getDecoder().decode(valueProperty);
        setSystemProperty("javax.net.ssl.keyStore", keyStorePath, oldProps);
    public static void resetGlobalTrustStore(Map<String, String> oldProps) {

        } else {

                return Files.readAllBytes(Path.of(propertyValue));
import org.jkiss.dbeaver.model.DBPDataSource;
        final String selfSignedCert = sslConfig.getStringProperty(PROP_SSL_SELF_SIGNED_CERT);
 *
}
        }
        if (!CommonUtils.isEmpty(propertyValue)) {
 * limitations under the License.
        return createTrustStoreSslContext(dataSource, sslConfig).getSocketFactory();
                securityManager.addSelfSignedCertificate(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE, "CN=" + dataSource.getContainer().getActualConnectionConfiguration().getHostName());
import java.security.KeyStore;
    public static final String PROP_SSL_METHOD = "ssl.method";

        String certValue = configuration.getSecureProperty(basePropName + SSLHandlerTrustStoreImpl.CERT_VALUE_SUFFIX);
        Map<String, String> oldProps = new LinkedHashMap<>();
                byte[] keyData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY);
        oldProps.put(propName, oldValue);
 * See the License for the specific language governing permissions and
            trustManagers = CertificateGenHelper.NON_VALIDATING_TRUST_MANAGERS;
        SSLContext sslContext = forceTLS12 ? SSLContext.getInstance(SSLConstants.TLS_1_2_VERSION) : SSLContext.getInstance("SSL");
                monitor.subTask("Generate self-signed certificate");

    public static final String PROP_SSL_CLIENT_CERT = "ssl.client.cert";
                    securityManager.addCertificate(
            }
import java.nio.file.Files;
import java.security.SecureRandom;

    public static SSLContext createTrustStoreSslContext(DBPDataSource dataSource, DBWHandlerConfiguration sslConfig) throws Exception {
        if (!CommonUtils.isEmpty(certValue)) {
    public static byte[] readTrustStoreData(@NotNull DBWHandlerConfiguration configuration, @NotNull String property) throws DBException {
 * You may obtain a copy of the License at
        }
     * Creates a non-validating SSL socket factory.

            filePath = configuration.getStringProperty(altPropName);
        if (key == null) {
                    sslConfig.getSecureProperty(PROP_SSL_KEYSTORE_PASSWORD) :
    public static byte[] readCertificate(DBWHandlerConfiguration configuration, String basePropName, String altPropName) throws IOException {
        String filePath = configuration.getStringProperty(basePropName);
import java.util.LinkedHashMap;
import java.util.Base64;
            } catch (IOException e) {
import java.util.Map;
        char[] keyStorePass = securityManager.getKeyStorePassword(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE);
    }
            } else if (CommonUtils.toBoolean(selfSignedCert)) {

        TrustManager[] trustManagers;
public class SSLHandlerTrustStoreImpl extends SSLHandlerImpl {

            return certValue.getBytes(StandardCharsets.UTF_8);
    }
        // It will still be deleted during shutdown.
 */
        if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
 * DBeaver - Universal Database Manager
                final String password = sslConfig.getPassword() == null ?
                if (caCertData != null || clientCertData != null) {
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * you may not use this file except in compliance with the License.
    public static final String CERT_VALUE_SUFFIX = ".value";
                        keyStorePasswordData
                        dataSource.getContainer(),
                System.clearProperty(pe.getKey());
    }
import org.jkiss.dbeaver.model.app.DBACertificateStorage;
        final Reader reader = new StringReader(new String(key, StandardCharsets.UTF_8));

        setSystemProperty("javax.net.ssl.keyStoreType", keyStoreType, oldProps);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static final String PROP_SSL_KEYSTORE = "ssl.keystore";
        final DBACertificateStorage securityManager = DBWorkbench.getPlatform().getCertificateStorage();
    private static void setSystemProperty(String propName, String propValue, Map<String, String> oldProps) {
                }
    public static SSLSocketFactory createTrustStoreSslSocketFactory(DBPDataSource dataSource, DBWHandlerConfiguration sslConfig) throws Exception {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        SSLConstants.SSL_CERT_TYPE,
            trustManagerFactory.init(trustStore);
    public static SSLSocketFactory createNonValidatingSslSocketFactory() throws Exception {
    public static final String PROP_SSL_SELF_SIGNED_CERT = "ssl.self-signed-cert";
 */
import org.jkiss.dbeaver.runtime.DBWorkbench;
        final boolean forceTLS12 = sslConfig.getBooleanProperty(PROP_SSL_FORCE_TLS12);
        return oldProps;
                throw new DBException("Error reading file '" + property + "' data", e);
 * Default Java SSL Handler. Saves certificate in local trust store
        var valueProperty = configuration.getSecureProperty(property + SSLHandlerTrustStoreImpl.CERT_VALUE_SUFFIX);
        setSystemProperty("javax.net.ssl.trustStore", keyStorePath, oldProps);
        return null;
        return readCertificate(configuration, basePropName, null);
        String oldValue = System.setProperty(propName, propValue);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String PROP_SSL_KEYSTORE_PASSWORD = "ssl.keystore.password";
import org.jkiss.code.NotNull;
import javax.net.ssl.*;
            } else {
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        return context.getSocketFactory();
        setSystemProperty("javax.net.ssl.trustStoreType", keyStoreType, oldProps);
        final SSLConfigurationMethod method = CommonUtils.valueOf(
                byte[] caCertData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CA_CERT);
        context.init(null, CertificateGenHelper.NON_VALIDATING_TRUST_MANAGERS, new SecureRandom());
 * Copyright (C) 2010-2024 DBeaver Corp and others

                    monitor.subTask("Load certificates");
    public static final String PROP_SSL_CLIENT_KEY_VALUE = PROP_SSL_CLIENT_KEY + CERT_VALUE_SUFFIX;
import org.jkiss.dbeaver.model.impl.app.CertificateGenHelper;
                        Base64.getDecoder().decode(keyStoreData),

import java.io.StringReader;
        if (!CommonUtils.isEmpty(valueProperty)) {
    public static final String PROP_SSL_FORCE_TLS12 = "ssl.forceTls12";
            SSLConfigurationMethod.CERTIFICATES);

                char[] keyStorePasswordData = CommonUtils.isEmpty(password) ? new char[0] : password.toCharArray();
        final @NotNull Path tempDerFile
            } else {
    }
                    );
                System.setProperty(pe.getKey(), pe.getValue());
    public static Map<String, String> setGlobalTrustStore(DBPDataSource dataSource) {
        }
        final String keyStoreData = sslConfig.getSecureProperty(PROP_SSL_KEYSTORE_VALUE);

            SSLConfigurationMethod.class,
                } else {
    public static boolean loadDerFromPem(
    public static final String PROP_SSL_CA_CERT_VALUE = PROP_SSL_CA_CERT + CERT_VALUE_SUFFIX;
                byte[] clientCertData = SSLHandlerTrustStoreImpl.readCertificate(sslConfig, SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_CERT);
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
        // Unfortunately, we can't delete the temp file here.
import org.jkiss.utils.CommonUtils;
        for (Map.Entry<String, String> pe : oldProps.entrySet()) {
        final DBACertificateStorage securityManager = DBWorkbench.getPlatform().getCertificateStorage();
        if (!CommonUtils.isEmpty(filePath)) {
            try {

import java.io.IOException;

    public static final String PROP_SSL_CLIENT_CERT_VALUE = PROP_SSL_CLIENT_CERT + CERT_VALUE_SUFFIX;

        char[] keyStorePass = securityManager.getKeyStorePassword(dataSource.getContainer(), SSLConstants.SSL_CERT_TYPE);
            handler.setProperty(SSLHandlerTrustStoreImpl.PROP_SSL_CLIENT_KEY, derCertPath);
