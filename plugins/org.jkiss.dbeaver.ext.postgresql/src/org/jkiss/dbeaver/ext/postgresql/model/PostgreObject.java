 * DBeaver - Universal Database Manager
 */
}

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
/*
package org.jkiss.dbeaver.ext.postgresql.model;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 */
 * PostgreObject

    PostgreDatabase getDatabase();
    @Override
    @NotNull
import org.jkiss.dbeaver.model.DBPObjectWithLongId;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.code.NotNull;
    PostgreDataSource getDataSource();
    @NotNull

 *

import org.jkiss.dbeaver.model.struct.DBSObject;
 *
 * See the License for the specific language governing permissions and
public interface PostgreObject extends DBSObject, DBPObjectWithLongId {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
