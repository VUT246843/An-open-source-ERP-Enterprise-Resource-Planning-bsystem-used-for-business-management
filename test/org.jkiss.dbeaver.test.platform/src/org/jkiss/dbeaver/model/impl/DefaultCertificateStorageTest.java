        final byte[] key = new byte[1024];
        return sb.toString();
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
package org.jkiss.dbeaver.model.impl;
import java.io.StringReader;
import java.security.SecureRandom;
            sb.append(key, i, Math.min(key.length(), i + 64));
        final var pemKey = makePemKey(derKey);
    @NotNull
        final StringBuilder sb = new StringBuilder(key.length() + 100);

        return key;

    @NotNull

    public void loadDerFromPem() throws Exception {

        sb.append("-----BEGIN PRIVATE KEY-----\n");
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * limitations under the License.
public class DefaultCertificateStorageTest extends DBeaverUnitTest {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.junit.DBeaverUnitTest;
    @Test
    private static byte[] makeKey() {
 *

import org.jkiss.dbeaver.model.impl.app.DefaultCertificateStorage;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.junit.Assert;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.junit.Test;

 * See the License for the specific language governing permissions and

        final SecureRandom random = new SecureRandom();
            sb.append('\n');
/*
        for (int i = 0; i < key.length(); i += 64) {
}
 * you may not use this file except in compliance with the License.
    }
        final var derKey = makeKey();
 * Unless required by applicable law or agreed to in writing, software
 */
    private static String makePemKey(@NotNull byte[] content) {
        Assert.assertArrayEquals(derKey, DefaultCertificateStorage.loadDerFromPem(new StringReader(pemKey)));
        final String key = Base64.getEncoder().encodeToString(content);
        }
        sb.append("-----END PRIVATE KEY-----\n");
    }
        random.nextBytes(key);
import org.jkiss.code.NotNull;


import java.util.Base64;
 * You may obtain a copy of the License at
