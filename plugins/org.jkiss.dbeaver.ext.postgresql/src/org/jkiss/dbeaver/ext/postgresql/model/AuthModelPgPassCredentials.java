 * limitations under the License.
    }
    private transient Exception parseError;
    @Override
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    public String getUserPassword() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }


    public Exception getParseError() {
public class AuthModelPgPassCredentials extends AuthModelDatabaseNativeCredentials {
}
        this.parseError = parseError;

 *
 */
    public void setParseError(Exception parseError) {
/*
 * See the License for the specific language governing permissions and
    // Override to remove property mark
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.ext.postgresql.model;
 *
 * You may obtain a copy of the License at
        return parseError;
        return super.getUserPassword();
 * Unless required by applicable law or agreed to in writing, software

