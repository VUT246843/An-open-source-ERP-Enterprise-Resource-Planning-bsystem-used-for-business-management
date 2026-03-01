                            body = JDBCUtils.safeGetString(dbResult, "SQL Original Statement");
                body = "-- " + e.getMessage();
    {
    public String getSqlMode()
        ResultSet dbResult)
    @Property(order = 6)
    {
        return table;
    }
        MySQLCatalog catalog,
    @Override
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
    @Property(viewable = true, order = 4)
    private String body;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        this.table = table;
 */
    {
import org.jkiss.dbeaver.model.impl.struct.AbstractTrigger;
    }
{
    @NotNull
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Property(viewable = true, order = 3, listProvider = TriggerTypeListProvider.class)
        this.table = table;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public MySQLTable getParentObject()
        MySQLTable table,
        if (body == null) {

        return table;
    private MySQLTable table;
    @Property(viewable = true, order = 2, listProvider = TriggerTimingListProvider.class)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        this.sqlMode = source.sqlMode;
    {

        setManipulationType(DBSManipulationType.getByName(JDBCUtils.safeGetString(dbResult, "EVENT_MANIPULATION")));
        this.table = table;
 * Unless required by applicable law or agreed to in writing, software
        this.sqlMode = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TRIGGER_SQL_MODE);
    }
                        }



import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return DBUtils.getFullQualifiedName(getDataSource(),

        return body;

        String name)
import org.jkiss.dbeaver.model.DBPRefreshableObject;
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SHOW CREATE TRIGGER " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
 * See the License for the specific language governing permissions and
        super(source.name, source.getDescription(), false);

        return getCatalog().triggerCache.refreshObject(monitor, getCatalog(), this);
    {
 * MySQLTrigger
        return catalog;
            catalog,
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
        this.charsetClient = JDBCUtils.safeGetString(dbResult, "CHARACTER_SET_CLIENT");
import org.jkiss.dbeaver.DBException;
    public MySQLTrigger(
}
 *
import java.sql.SQLException;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/**
    @Override
        return catalog.getDataSource();
    {

    private String sqlMode;
        return charsetClient;
    }
                        if (dbResult.next()) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.charsetClient = source.charsetClient;
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.catalog = catalog;
    }

    {
    public MySQLDataSource getDataSource()
    {
    public MySQLTrigger(MySQLCatalog catalog, MySQLTable table, MySQLTrigger source) {
    }
            this);
    @Override
    {
    public MySQLTable getTable()
    public MySQLCatalog getCatalog() {
        this.catalog = catalog;
        this.body = "";
        super(name, null, false);
    {
    }


 * Copyright (C) 2010-2025 DBeaver Corp and others

import java.sql.ResultSet;
    @Property(order = 5)
        this.catalog = catalog;
    }
    public DBSManipulationType getManipulationType()
    {
 * You may obtain a copy of the License at
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                }
        return super.getActionTiming();
 *
        return super.getManipulationType();
    private String charsetClient;
    @Override
        super(JDBCUtils.safeGetString(dbResult, "TRIGGER_NAME"), null, true);
    public MySQLTrigger(
        return body;
    }

        this.body = source.body;
                            body = "-- Trigger definition not found in catalog";
 */
import java.util.Map;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
import org.jkiss.dbeaver.model.DBUtils;
    public void setObjectDefinitionText(String sourceText)
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
    @Override
        setManipulationType(DBSManipulationType.INSERT);
            } catch (SQLException e) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Property(hidden = true, editable = true, updatable = true, order = -1)
    public String getBody()
import org.jkiss.dbeaver.model.meta.Property;
/*
    }
    }
 *
import org.jkiss.dbeaver.DBDatabaseException;
 * DBeaver - Universal Database Manager
        MySQLCatalog catalog,
import org.jkiss.dbeaver.model.struct.DBSActionTiming;

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
                        } else {
    @Override

        MySQLTable table,
    public DBSActionTiming getActionTiming()
        setActionTiming(DBSActionTiming.AFTER);

    }
public class MySQLTrigger extends AbstractTrigger implements MySQLSourceObject, DBPRefreshableObject
    private MySQLCatalog catalog;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                throw new DBDatabaseException(e, getDataSource());

package org.jkiss.dbeaver.ext.mysql.model;
    @NotNull
        body = sourceText;

    }
                    }
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read trigger declaration")) {
    {
        setActionTiming(DBSActionTiming.getByName(JDBCUtils.safeGetString(dbResult, "ACTION_TIMING")));
import org.jkiss.code.NotNull;
        return sqlMode;
    public String getCharsetClient()
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
        }
