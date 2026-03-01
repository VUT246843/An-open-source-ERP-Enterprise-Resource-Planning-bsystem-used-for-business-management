        }
        return name;

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
    //@Property(viewable = true, editable = true, updatable = true, multiline = true, order = 100)


        this.table = table;


    }

    {
package org.jkiss.dbeaver.ext.postgresql.model;
    }
    {
        return body;
    @Property(viewable = true, order = 21)
        this.instead = JDBCUtils.safeGetBoolean(dbResult, "is_instead");
            StringBuilder ddl = new StringBuilder();
import java.util.Map;
    protected String description;
    }
    private String type;
 * you may not use this file except in compliance with the License.
                    .append(getTable().getFullyQualifiedName(DBPEvaluationContext.DDL)).append(";\n\n");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    private PostgreTableBase table;
    @Override
 * See the License for the specific language governing permissions and
    private boolean persisted;

 */
        return DBUtils.getFullQualifiedName(getDataSource(),
        return table.getDataSource();
        PostgreTableReal table,
    public void setDescription(String description) {
        this.enabled = JDBCUtils.safeGetString(dbResult, "ev_enabled");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
            ddl.append("-- DROP RULE ").append(DBUtils.getQuotedIdentifier(this)).append(" ON ")
import org.jkiss.dbeaver.Log;
        DBRProgressMonitor monitor,
    private long objectId;

    }
    {
 *
    @Override
    @Property(viewable = true, order = 10)
 *     http://www.apache.org/licenses/LICENSE-2.0
public class PostgreRule implements PostgreObject, PostgreScriptObject, DBPQualifiedObject

    private static final Log log = Log.getLog(PostgreRule.class);
 * Unless required by applicable law or agreed to in writing, software
    protected String name;
        return table;

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public PostgreRule(
    public boolean isInstead() {
    @Override
 *
    public String getEnabled() {
    @Property(hidden = true, order = 80)
        this.definition = JDBCUtils.safeGetString(dbResult, "definition");
    {
    public String getType() {
        this.persisted = true;
        ResultSet dbResult) throws DBException
import org.jkiss.code.NotNull;
    {
 * limitations under the License.
    @Nullable
    public PostgreTableBase getParentObject()
    @NotNull

    private boolean instead;
/*
 *

        return instead;
    public long getObjectId() {
    }
    @Override
            getParentObject(),
    public boolean isPersisted() {
}

        return description;
    }

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override

    }
    @NotNull
    @NotNull
{
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return objectId;

        return persisted;
import org.jkiss.dbeaver.DBException;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException

    @Override
        this.name = JDBCUtils.safeGetString(dbResult, "rulename");
        return type;

    @Override
        this.type = JDBCUtils.safeGetString(dbResult, "ev_type");
    public String getName() {
        return enabled;
    public void setObjectDefinitionText(String sourceText) throws DBException
    @Property(viewable = true, order = 20)
/**

 * DBeaver - Universal Database Manager
    private String enabled;
    }

    }
        definition = sourceText;
    public String getDescription() {

    public PostgreDatabase getDatabase() {

    private String definition;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import org.jkiss.code.Nullable;
    @Property(viewable = true, order = 1)
 * You may obtain a copy of the License at
        return table;
    }
    }
        this.description = description;
    }
import java.sql.ResultSet;
    public PostgreTableBase getTable()
        this.objectId = JDBCUtils.safeGetLong(dbResult, "oid");
        if (body == null) {
        return table.getDatabase();
            this.body = ddl.toString();
    public PostgreDataSource getDataSource()
 */
    }
 * PostgreRule
    @NotNull
    @NotNull
    @Property(viewable = true, order = 22)
    public String body;
    @Override


import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.dbeaver.model.DBUtils;
            this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            ddl.append(definition);
import org.jkiss.dbeaver.model.DBPQualifiedObject;
    }
