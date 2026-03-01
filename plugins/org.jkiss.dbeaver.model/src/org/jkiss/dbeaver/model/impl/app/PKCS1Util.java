 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import java.math.BigInteger;

import org.bouncycastle.asn1.ASN1Integer;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                getInteger(seq.getObjectAt(7)),
        try (ASN1InputStream is = new ASN1InputStream(Base64.decode(privateKeyPem))) {
                getInteger(seq.getObjectAt(8))
                getInteger(seq.getObjectAt(5)),

 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // avoid instantiation of utility class
import java.io.IOException;
package org.jkiss.dbeaver.model.impl.app;
import java.security.GeneralSecurityException;
                throw new GeneralSecurityException("Could not parse a PKCS1 private key.");
                getInteger(seq.getObjectAt(4)),
    private PKCS1Util() {
import org.bouncycastle.asn1.ASN1Sequence;
 *
                getInteger(seq.getObjectAt(3)),
                getInteger(seq.getObjectAt(1)),
 * DBeaver - Universal Database Manager
            ));
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
}        return ((ASN1Integer) encodable).getValue();
            if (seq.size() < 9) {

    public static PrivateKey loadPrivateKeyFromPKCS1(@NotNull String privateKeyPem) throws GeneralSecurityException, IOException {

/*
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.security.spec.RSAPrivateCrtKeySpec;
    }
import org.bouncycastle.asn1.ASN1Encodable;
            return KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.utils.Base64;
                getInteger(seq.getObjectAt(6)),
 *

            }
class PKCS1Util {
import org.bouncycastle.asn1.ASN1InputStream;
                getInteger(seq.getObjectAt(2)),
    private static BigInteger getInteger(@NotNull ASN1Encodable encodable) {
 */
    }
import org.jkiss.code.NotNull;
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
import java.security.KeyFactory;
import java.security.PrivateKey;
 *
                // skip version at seq.getObjectAt(0);
            final ASN1Sequence seq = (ASN1Sequence) is.readObject();
