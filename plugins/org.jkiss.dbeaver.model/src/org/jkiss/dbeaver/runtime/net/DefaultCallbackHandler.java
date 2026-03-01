
                    if (authInfo != null) {
 * Unless required by applicable law or agreed to in writing, software
                        }
                throw new UnsupportedCallbackException(callback);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            } else if (callback instanceof NameCallback) {
 * you may not use this file except in compliance with the License.
import java.io.IOException;
        }
        for (Callback callback : callbacks) {
import javax.security.auth.callback.*;
    }
                        ((PasswordCallback) callback).setPassword(authInfo.getUserPassword().toCharArray());
    private char[] password = null;
                NameCallback nameCallback = (NameCallback) callback;

 * Licensed under the Apache License, Version 2.0 (the "License");
                    final DBPAuthInfo authInfo = DBWorkbench.getPlatformUI().promptUserCredentials(

package org.jkiss.dbeaver.runtime.net;
 */
                if (password == null) {
                            password = authInfo.getUserPassword().toCharArray();
                nameCallback.setName(propValue);
 * limitations under the License.
                    }
 * DBeaver - Universal Database Manager
                }
    @Override

/**
            } else {
 *
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DefaultCallbackHandler implements CallbackHandler {
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        "Enter password", null, null, null, true, true);
}
                } else {
                    ((PasswordCallback) callback).setPassword(password);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }

 * Copyright (C) 2010-2024 DBeaver Corp and others
                        if (authInfo.isSavePassword()) {
                String propValue = DBWorkbench.getPlatformUI().promptProperty(nameCallback.getPrompt(), nameCallback.getName());
 * Global DefaultCallbackHandler
 *
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
 * See the License for the specific language governing permissions and
/*
 */
            if (callback instanceof PasswordCallback) {
