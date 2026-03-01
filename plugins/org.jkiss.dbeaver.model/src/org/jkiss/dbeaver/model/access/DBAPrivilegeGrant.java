
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 * Privilege grant.

 *

 * See the License for the specific language governing permissions and
     * Role which owns this privilege
     */
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.access;
    /**
    /**
    boolean isGranted();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
 *
 */
 * You may obtain a copy of the License at
}    Object getSubject(@NotNull DBRProgressMonitor monitor) throws DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * Privilege
 * you may not use this file except in compliance with the License.


     */

 */
    DBAPrivilege[] getPrivileges();
     * Object to which privilege was granted. Can be null in case of global privileges (e.g. CONNECT).
 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
    Object getObject(@NotNull DBRProgressMonitor monitor) throws DBException;
 * DBeaver - Universal Database Manager
 *
public interface DBAPrivilegeGrant {
/*
