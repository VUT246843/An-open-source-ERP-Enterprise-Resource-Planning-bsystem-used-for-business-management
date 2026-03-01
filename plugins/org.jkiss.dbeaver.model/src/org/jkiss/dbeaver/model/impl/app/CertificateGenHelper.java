 * DBeaver - Universal Database Manager
        throws GeneralSecurityException, OperatorCreationException
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
    }
        X500Name owner = new X500Name(dn);
        }
        throws GeneralSecurityException, OperatorCreationException
package org.jkiss.dbeaver.model.impl.app;
    };
import org.bouncycastle.operator.ContentSigner;
                return new X509Certificate[0];
     * @param algorithm the signing algorithm, eg "SHA1withRSA"
 */
    /**
        ContentSigner signer = new JcaContentSignerBuilder(algorithm).build(pair.getPrivate());
import java.util.Date;
public class CertificateGenHelper {
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        JcaX509v3CertificateBuilder builder = new JcaX509v3CertificateBuilder(owner, sn, Date.from(from), Date.from(until), owner, pair.getPublic());
     * @param days how many days from now the Certificate is valid for
 * See the License for the specific language governing permissions and
                java.security.cert.X509Certificate[] certs, String authType) {
    // FIXME: Not secure at all!!!
    }
import java.security.cert.X509Certificate;
 * Originally taken from https://stackoverflow.com/questions/1615871/creating-an-x509-certificate-in-java-without-bouncycastle
        X509CertificateHolder holder = builder.build(signer);
        Certificate certificate = generateCertificate("CN=Test, L=New York, S=New York, C=US");
        return cert;
    public static Certificate generateCertificate(String dn)
        cert.verify(pair.getPublic());
    public static void main (String[] argv) throws Exception {
    {
import org.bouncycastle.asn1.x500.X500Name;

 * You may obtain a copy of the License at
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
    {

import org.bouncycastle.cert.X509CertificateHolder;
                java.security.cert.X509Certificate[] certs, String authType) {

        BigInteger sn = new BigInteger(64, new SecureRandom());
/**
 * Unless required by applicable law or agreed to in writing, software
        Instant until = from.plus(days, ChronoUnit.DAYS);

import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
            public void checkClientTrusted(
 *
import java.security.SecureRandom;
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        X509Certificate cert = new JcaX509CertificateConverter().getCertificate(holder);
            }
     * @param pair the KeyPair
 *

 * Here are some cert gen helpers.
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
        System.out.println("Certificate:" + certificate);
    public static final X509TrustManager[] NON_VALIDATING_TRUST_MANAGERS = new X509TrustManager[] {

    public static Certificate generateCertificate(String dn, KeyPair pair, int days, String algorithm)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
/*
            }

            }
import java.math.BigInteger;
 * you may not use this file except in compliance with the License.

        new X509TrustManager() {
            public void checkServerTrusted(
    // Crap.
import java.security.cert.Certificate;

import java.time.Instant;
     * @param dn the X.509 Distinguished Name
 *
     * Create a self-signed X.509 Certificate
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import javax.net.ssl.X509TrustManager;
import java.security.GeneralSecurityException;
        return generateCertificate(dn, keyPair, 365, "SHA256withRSA");
import java.security.KeyPair;
import java.time.temporal.ChronoUnit;
import org.bouncycastle.operator.OperatorCreationException;
        Instant from = Instant.now();
}
import java.security.KeyPairGenerator;

    // However some people need to use self-signed and untrusted server.
