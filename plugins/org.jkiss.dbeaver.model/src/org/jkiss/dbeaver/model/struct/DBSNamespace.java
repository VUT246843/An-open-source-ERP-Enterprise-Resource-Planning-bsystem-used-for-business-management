
 * Namespace contains different types of objects which must have unique names.
import org.jkiss.dbeaver.DBException;
        @NotNull DBRProgressMonitor monitor,

import java.util.List;
/**
    List<? extends DBSObject> getObjectsByType(
 */
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
    DBSObjectType[] getNamespaceObjectTypes();
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software


package org.jkiss.dbeaver.model.struct;

        @NotNull DBRProgressMonitor monitor,

 * DBeaver - Universal Database Manager
    @NotNull
    @Nullable
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
        @NotNull String name) throws DBException;
 *
        @NotNull DBSObjectType objectType) throws DBException;
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 *
    DBSObject getObjectByName(
/*
 * For example tables and data types in PostgreSQL.
    @NotNull
public interface DBSNamespace {

 * limitations under the License.
