/*
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.



 *
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * Class used for skipping host verification for SSL

    private NullHostnameVerifier() {
    public boolean verify(String hostname, SSLSession session) {
 * limitations under the License.
public class NullHostnameVerifier implements HostnameVerifier {
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
import javax.net.ssl.HostnameVerifier;
 * DBeaver - Universal Database Manager

    }
        log.debug("Skipping host verification for domain " + hostname);
    private static final Log log = Log.getLog(NullHostnameVerifier.class);

/**

package org.jkiss.dbeaver.model.impl.app;
import javax.net.ssl.SSLSession;
import org.jkiss.dbeaver.Log;
 */
        return true;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

 *
 */
 *
    }
    public static final NullHostnameVerifier INSTANCE = new NullHostnameVerifier();
