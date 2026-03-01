 * You may obtain a copy of the License at
 *
 */
package org.jkiss.dbeaver.model.access;
 * Can be implemented by DBPDataSource implementation.
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface DBAUserCredentialsProvider {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    String getConnectionUserName(@NotNull DBPConnectionConfiguration connectionInfo);
/**

 * Unless required by applicable law or agreed to in writing, software

 * See the License for the specific language governing permissions and
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
/*
    String getConnectionUserPassword(@NotNull DBPConnectionConfiguration connectionInfo);
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Auth credentials provider.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 *
 */
}

 * DBeaver - Universal Database Manager

