 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public <T> T getProperty(String name) {
    public void setProperty(String name, Object value) {
    }
    private final Map<String, Object> properties = new LinkedHashMap<>();
        properties.put(name, value);

    }
    private javax.security.auth.callback.CallbackHandler callbackHandler;
}
 * distributed under the License is distributed on an "AS IS" BASIS,


/*

    public void setCallbackHandler(CallbackHandler callbackHandler) {
 * See the License for the specific language governing permissions and

 *
        return callbackHandler;

    }
 *
import javax.security.auth.callback.CallbackHandler;
import java.util.LinkedHashMap;
 * limitations under the License.
    public CallbackHandler getCallbackHandler() {
    }
 */

import java.util.Map;
        return (T) properties.get(name);

 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at

public class DBAAuthParameters {
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        return properties;
        this.callbackHandler = callbackHandler;
 * you may not use this file except in compliance with the License.
    }
    public Map<String, Object> getProperties() {
 *
package org.jkiss.dbeaver.model.access;
