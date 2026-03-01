import org.jkiss.dbeaver.model.DBPObjectWithDescription;
import org.jkiss.dbeaver.model.DBPPersistedObject;
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;

     * It can be null if object was detached from data source.
import org.jkiss.dbeaver.model.DBPDataSource;
 *
     * @return datasource reference or null
}
     *

    @Nullable
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * You may obtain a copy of the License at
    DBPDataSource getDataSource();

 * Copyright (C) 2010-2026 DBeaver Corp and others
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBSObject getParentObject();
     */
     * Datasource which this object belongs.
 * Meta object
     * @return parent object or null
 */
package org.jkiss.dbeaver.model.struct;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
public interface DBSObject extends DBPNamedObject, DBPObjectWithDescription, DBPPersistedObject {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPNamedObject;

 * Unless required by applicable law or agreed to in writing, software
     */
 *
    /**

     * Parent object
    /**
 * limitations under the License.
/**
