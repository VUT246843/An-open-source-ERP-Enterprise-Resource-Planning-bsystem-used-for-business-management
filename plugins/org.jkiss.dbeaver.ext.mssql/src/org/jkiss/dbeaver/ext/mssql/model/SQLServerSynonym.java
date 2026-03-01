    @NotNull

    @Override
            return null;
    private boolean persisted;
        return name;
    }

        this.objectId = objectId;
import org.jkiss.dbeaver.model.struct.DBSAlias;
                objectName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(divPos + 2));
    }
            int divPos2 = targetObjectName.indexOf("].[", divPos + 1);
            schema,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else {
    @Nullable
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
import org.jkiss.dbeaver.model.DBPQualifiedObject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
}

import org.jkiss.code.Nullable;
        {
    public DBSObject getTargetObject(@NotNull DBRProgressMonitor monitor) throws DBException {
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
            !SQLServerUtils.supportsCrossDatabaseQueries(getDataSource()))
        if (targetSchema == null) {
    @NotNull
    }

    public SQLServerSchema getParentObject() {

import org.jkiss.dbeaver.Log;
    @NotNull

    private String targetObjectName;
        String schemaName;
 */
            databaseName = schema.getDatabase().getName();
        this.schema = schema;
        }
        String databaseName;
    }

        if (divPos == -1) {
            return DBUtils.getFullQualifiedName(getDataSource(), schema, this);

    }
 *
            }
            if (divPos2 == -1) {
    private long objectId;
    @NotNull

    @Property(viewable = false, order = 80)
        return schema;
        return persisted;
    }
import org.jkiss.dbeaver.model.DBUtils;
    public SQLServerDataSource getDataSource() {
        }
    @Override
    public SQLServerDatabase getDatabase() {
import org.jkiss.dbeaver.DBException;
                databaseName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(0, divPos + 1));
import org.jkiss.code.NotNull;
        SQLServerSchema targetSchema = database.getSchema(monitor, schemaName);
            log.debug("Schema '" + schemaName + "' not found for synonym '" + getName() + "'");
 * You may obtain a copy of the License at
        if (database == null) {
        }
    @Override
 * SQL Server synonym.
 * Unless required by applicable law or agreed to in writing, software
/*
    public String getName() {

    @Property(viewable = true, order = 1)
 * DBeaver - Universal Database Manager

                schemaName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(0, divPos + 1));
            this);
    @NotNull
    private String description;
        if (context == DBPEvaluationContext.DDL ||
 * Licensed under the Apache License, Version 2.0 (the "License");
    private SQLServerSchema schema;
 * you may not use this file except in compliance with the License.
        return schema.getDataSource();

public class SQLServerSynonym implements DBSAlias, DBSObject, DBPQualifiedObject, SQLServerObject
 * See the License for the specific language governing permissions and
            objectName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName);
        this.name = name;
            log.debug("Database '" + databaseName + "' not found for synonym '" + getName() + "'");
{
                schemaName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(divPos + 2, divPos2 + 1));
    }
        }
    }

        this.targetObjectName = targetObjectName;
    @Override
            schemaName = schema.getName();
    protected SQLServerSynonym(@NotNull SQLServerSchema schema, long objectId, @NotNull String name, @NotNull String targetObjectName, boolean persisted) {
 */
            schema.getDatabase(),
    }
    private String name;
    @Override
        this.persisted = persisted;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Nullable
        int divPos = targetObjectName.indexOf("].[");
    private static final Log log = Log.getLog(SQLServerSynonym.class);
    @NotNull
        return targetSchema.getChild(monitor, objectName);
    @Override
 * limitations under the License.
    @Property(viewable = true, order = 20)
package org.jkiss.dbeaver.ext.mssql.model;
                objectName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(divPos2 + 2));
            } else {
        SQLServerDatabase database = schema.getDataSource().getDatabase(databaseName);
        String objectName;
    public boolean isPersisted() {
    @NotNull
    @Override

    public long getObjectId() {
        return schema.getDatabase();
    @Override
            return null;
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
                databaseName = schema.getDatabase().getName();
/**
    public String getDescription() {
import org.jkiss.dbeaver.model.meta.Property;

 *
        return description;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    //@Property(viewable = true, multiline = true, order = 10)
        return DBUtils.getFullQualifiedName(getDataSource(),
        return objectId;
