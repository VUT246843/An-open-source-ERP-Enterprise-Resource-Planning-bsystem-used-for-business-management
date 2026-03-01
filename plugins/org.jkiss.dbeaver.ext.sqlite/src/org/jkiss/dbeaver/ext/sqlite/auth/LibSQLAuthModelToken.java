 * You may obtain a copy of the License at
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

 * limitations under the License.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
    @Override
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
}
package org.jkiss.dbeaver.ext.sqlite.auth;
    public LibSQLAuthModelTokenCredentials createCredentials() {
    }
        return new LibSQLAuthModelTokenCredentials();
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNative;
 */
 * you may not use this file except in compliance with the License.
public class LibSQLAuthModelToken extends AuthModelDatabaseNative<LibSQLAuthModelTokenCredentials> {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

