import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectWithParentCache;
public class TableTriggerCache extends JDBCObjectWithParentCache<GenericStructContainer, GenericTableBase, GenericTrigger<?>> {
    TableTriggerCache(TableCache tableCache) {
 *

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;

    }
    protected GenericTrigger<?> fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @NotNull GenericTableBase genericTableBase, String triggerName, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    @Override
        return genericStructContainer.getDataSource().getMetaModel().createTableTriggerImpl(session, genericStructContainer, genericTableBase, triggerName, resultSet);
/*
import org.jkiss.code.NotNull;
 *
    }
    }
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import java.sql.SQLException;

        super(tableCache, GenericTableBase.class, "OWNER", "TRIGGER_NAME");
    @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
package org.jkiss.dbeaver.ext.generic.model;
 * Licensed under the Apache License, Version 2.0 (the "License");

}
 * DBeaver - Universal Database Manager
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.Nullable;
 */
        return genericStructContainer.getDataSource().getMetaModel().prepareTableTriggersLoadStatement(session, genericStructContainer, tableBase);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer genericStructContainer, @Nullable GenericTableBase tableBase) throws SQLException {
