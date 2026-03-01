    Collection<? extends DBAPrivilege> getPrivileges(DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException;
 * limitations under the License.
 * Permission owner
 * You may obtain a copy of the License at
} *
/**
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
/*
 *

import org.jkiss.dbeaver.model.struct.DBSObject;

public interface DBAPrivilegeOwner extends DBSObject {
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others


 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0

 * See the License for the specific language governing permissions and
import java.util.Collection;
package org.jkiss.dbeaver.model.access;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 *
