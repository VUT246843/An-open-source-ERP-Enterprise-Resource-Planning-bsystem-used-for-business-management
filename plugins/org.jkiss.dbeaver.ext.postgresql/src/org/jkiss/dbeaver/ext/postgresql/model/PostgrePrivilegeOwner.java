import org.jkiss.dbeaver.model.access.DBAPrivilegeOwner;

}
    String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;
/**
    /**
import org.jkiss.code.NotNull;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
 * limitations under the License.
     * Get object privileges.
     * @param includeNestedObjects - include permissions for all nested objects. For exmaple for table columns.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 */

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
    Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException;
    PostgreSchema getSchema();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Collection;

public interface PostgrePrivilegeOwner extends PostgreObject, DBAPrivilegeOwner {
 * PostgrePrivilegeOwner


    PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException;
    @Override
 * you may not use this file except in compliance with the License.
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ext.postgresql.model;
 *
import java.util.Map;
 *
 */

