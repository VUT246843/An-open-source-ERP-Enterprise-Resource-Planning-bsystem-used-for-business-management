
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * See the License for the specific language governing permissions and
    @Property(name = "Token", description = "Token")
import org.jkiss.dbeaver.model.meta.Property;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *
        return null;
 * DBeaver - Universal Database Manager
    @Property(hidden = true)
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getUserName() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    }
    public String getUserPassword() {
    }
 *
 * Unless required by applicable law or agreed to in writing, software
public class LibSQLAuthModelTokenCredentials extends AuthModelDatabaseNativeCredentials {
 */


 * You may obtain a copy of the License at
    @Override
        return super.getUserPassword();
/*
package org.jkiss.dbeaver.ext.sqlite.auth;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
}
