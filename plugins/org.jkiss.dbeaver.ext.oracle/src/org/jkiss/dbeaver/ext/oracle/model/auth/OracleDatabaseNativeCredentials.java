        return super.getUserName();
import org.jkiss.dbeaver.model.impl.auth.AuthModelDatabaseNativeCredentials;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.model.meta.Property;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 *
 *
            + "Format: <username> or <{username} AS {role}> (example: sys as SYSDBA)"
    )
}

public class OracleDatabaseNativeCredentials extends AuthModelDatabaseNativeCredentials {
    }
        description = "Oracle username (optionally with role). "
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.oracle.model.auth;
    public String getUserName() {
    @Property(order = 1,
