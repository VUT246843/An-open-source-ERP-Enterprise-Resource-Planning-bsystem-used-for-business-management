    }
        try {

            }
 * You may obtain a copy of the License at
    private static final Log log = Log.getLog(SecurityProviderUtils.class);

import java.security.Provider;
        return false;
            log.warn("Registration of BC Security Provider unexpectedly failed", e);
 *

}
        } catch (Exception e) {
import org.bouncycastle.jce.provider.BouncyCastleProvider;
                        log.debug("BouncyCastle not registered, using the default JCE provider");
    private static String securityProvider = null;
 * DBeaver - Universal Database Manager
                }
            if (Security.getProvider(provider.getName()) == null) {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (securityProvider == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (!registrationDone) {
                registrationDone = true;
            }

    }

            if (securityProvider == null) {
 */
    private static boolean registrationDone;
                if (securityProvider == null) {

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.runtime;
 *
                log.debug("BounceCastle bundle found. Use JCE provider " + provider.getName());
public class SecurityProviderUtils {
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
                    registerBouncyCastleSecurityProvider();

        }

 * Bouncy Castle linker
 */
                securityProvider = provider.getName();
            try {

 *     http://www.apache.org/licenses/LICENSE-2.0
    private static boolean registerBouncyCastleSecurityProvider() {
import java.security.Security;
            Provider provider = new BouncyCastleProvider();
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static void registerSecurityProvider() {
                return true;
                    }
        }
/**
 * limitations under the License.
                Security.addProvider(provider);
            } finally {

/*
