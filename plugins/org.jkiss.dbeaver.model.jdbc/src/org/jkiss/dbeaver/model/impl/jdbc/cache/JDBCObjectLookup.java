    JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull OWNER owner, @Nullable OBJECT object, @Nullable String objectName)
    @NotNull
     */
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * limitations under the License.
     * Creates statement to read just one object.

 * Unless required by applicable law or agreed to in writing, software
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.impl.jdbc.cache;
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
{
    /**
 */
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
     * Parameter @object OR @objectName may be specified to find an object
import java.sql.SQLException;

/*
 * Extension of {@link JDBCObjectCache} - support object lookup by name

/**
        throws SQLException;
 */
public interface JDBCObjectLookup<OWNER extends DBSObject, OBJECT extends DBSObject>
import org.jkiss.dbeaver.model.struct.DBSObject;
