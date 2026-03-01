
        return null;
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        }
/*
    public void setTablespace(PostgreTablespace tablespace) {
        super(catalog);

        return RelationalObjectType.TYPE_MATERIALIZED_VIEW;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.meta.Property;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, editable = true, updatable = true, order = 20, listProvider = PostgreTableBase.TablespaceListProvider.class)
    {
    public PostgreMaterializedView(
    }
    protected String readExtraDefinition(JDBCSession session, Map<String, Object> options) throws DBException {
        return withData;
import org.jkiss.utils.CommonUtils;
        return "MATERIALIZED VIEW";
            }
    @Override
                indexDefs.append(indexDefinition).append(";\n");
/**
        this.tablespaceId = JDBCUtils.safeGetLong(dbResult, "reltablespace");
}
    {
    private long tablespaceId;
    }
        return getSchema().getIndexes(monitor, this);
import java.util.Collection;

            for (PostgreIndex index : indexes) {


 * You may obtain a copy of the License at

{
 *
 * PostgreMaterializedView
        if (tablespaceId == 0) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ext.postgresql.model;
 * See the License for the specific language governing permissions and
import java.util.Map;
            return getDatabase().getDefaultTablespace(monitor);
        if (!CommonUtils.isEmpty(indexes)) {
        this.tablespaceId = tablespace.getObjectId();
    }
    @Override
 *
import org.jkiss.code.NotNull;
        this.withData = withData;
        }
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
 * you may not use this file except in compliance with the License.
        Collection<PostgreIndex> indexes = getIndexes(session.getProgressMonitor());
import java.sql.ResultSet;
        PostgreSchema catalog,
    }
    public PostgreTablespace getTablespace(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
 *
        this.withData = JDBCUtils.safeGetBoolean(dbResult, "relispopulated");
    }
import org.jkiss.dbeaver.DBException;

public class PostgreMaterializedView extends PostgreViewBase
    public void setWithData(boolean withData) {
 * DBeaver - Universal Database Manager
    }
    public boolean isWithData() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(catalog, dbResult);

        ResultSet dbResult)
    public Collection<PostgreIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *     http://www.apache.org/licenses/LICENSE-2.0


 */
 */
    public PostgreMaterializedView(PostgreSchema catalog) {
    @Override
import org.jkiss.dbeaver.model.struct.DBSObjectType;

 * Unless required by applicable law or agreed to in writing, software
    }
    private boolean withData;
 * limitations under the License.
    public DBSObjectType getObjectType() {
    }
        return PostgreUtils.getObjectById(monitor, getDatabase().tablespaceCache, getDatabase(), tablespaceId);
    @NotNull
            StringBuilder indexDefs = new StringBuilder("\n-- View indexes:\n");
 * Licensed under the Apache License, Version 2.0 (the "License");
                String indexDefinition = index.getObjectDefinitionText(session.getProgressMonitor(), options);
    public String getTableTypeName() {
            return indexDefs.toString();
    }
