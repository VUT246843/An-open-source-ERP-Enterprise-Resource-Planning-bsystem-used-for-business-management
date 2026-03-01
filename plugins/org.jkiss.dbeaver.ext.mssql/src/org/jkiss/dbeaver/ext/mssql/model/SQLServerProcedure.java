        }
    public SQLServerProcedure(
import org.jkiss.dbeaver.Log;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;

    public SQLServerObjectType getObjectType() {
        SQLServerSchema catalog,
        this.objectType = SQLServerObjectType.P;
        return objectId;
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.debug("Bad procedure type", e);
    public void setProcedureType(DBSProcedureType procedureType) {
    }
    private DBSProcedureType procedureType;
 * Unless required by applicable law or agreed to in writing, software
    private SQLServerObjectType objectType;
                        "AS " + GeneralUtils.getDefaultLineSeparator() +
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
package org.jkiss.dbeaver.ext.mssql.model;
    }
import java.util.Collection;
    private String body;
                this.body =
import java.sql.ResultSet;
                        "SELECT 1";
            objectType = SQLServerObjectType.valueOf(JDBCUtils.safeGetStringTrimmed(dbResult, "type"));
        return procedureType;
    public String toString() {
    private void loadInfo(ResultSet dbResult) {
        this.procedureType = DBSProcedureType.PROCEDURE;
import org.jkiss.code.Nullable;

    }
    }
    @Override
import org.jkiss.code.NotNull;

        return getContainer().getProcedureCache().refreshObject(monitor, getContainer(), this);
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getBody() {
    //@Property(viewable = false, order = 3)
/*
    }
        }
        this.objectId = JDBCUtils.safeGetLong(dbResult, "object_id");


    @NotNull
}
                break;

    @Override
    }
    @Property(order = 5)
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {

    }
    }
    public SQLServerProcedure(SQLServerSchema schema) {
    public void setObjectDefinitionText(String sourceText) {
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others

import java.util.Map;
 * You may obtain a copy of the License at
    public DBSProcedureType getProcedureType() {
        return objectType;
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

        this.body = sourceText;
        try {
        }
            case X:
    }
        return getContainer().getDatabase();

        return getContainer().getProcedureCache().getChildren(monitor, getContainer(), this);
                    "CREATE " + getProcedureType().name() + " " + getFullyQualifiedName(DBPEvaluationContext.DDL) + GeneralUtils.getDefaultLineSeparator() +
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    @Nullable
    public long getObjectId() {
        return DBUtils.getFullQualifiedName(getDataSource(),
    }
        } catch (IllegalArgumentException e) {
                        (procedureType == DBSProcedureType.FUNCTION ? "RETURNS INT" + GeneralUtils.getDefaultLineSeparator() : "") +

    private long objectId;
import org.jkiss.dbeaver.model.struct.DBSObject;

    }
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    public SQLServerDatabase getDatabase() {
    @Override
    @Override
                this.procedureType = DBSProcedureType.FUNCTION;
 */
public class SQLServerProcedure extends AbstractProcedure<SQLServerDataSource, SQLServerSchema> implements DBPRefreshableObject, DBSObjectWithScript, SQLServerObject {

        return body;
            default:
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 100)
            } else {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        switch (objectType) {
import org.jkiss.dbeaver.model.DBUtils;
    }
        if (body == null) {
 * SQLServerProcedure

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        loadInfo(dbResult);

                this.procedureType = DBSProcedureType.PROCEDURE;
    @Override
 * DBeaver - Universal Database Manager
        this.procedureType = procedureType;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
 *
 *

    @Property(viewable = false, order = 2)
    @Override
        this.name = JDBCUtils.safeGetString(dbResult, "name");
 * you may not use this file except in compliance with the License.
/**
    @Override
    public String getDescription() {
        return body;
        super(schema, false);
    @Nullable
    @Override
    }

        return procedureType.name() + " " + getName();
        super(catalog, true);
 * See the License for the specific language governing permissions and
    @Property(hidden = true, editable = true, updatable = true, order = -1)

        ResultSet dbResult) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return super.getDescription();
    }
    @NotNull
        this.description = JDBCUtils.safeGetString(dbResult, "description");
            if (!persisted) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
    private static final Log log = Log.getLog(SQLServerProcedure.class);
            }
            getContainer(),
                this.body = SQLServerUtils.extractSource(monitor, this);
            case PC:
        throws DBException {
    public Collection<SQLServerProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor)

import org.jkiss.dbeaver.model.meta.Property;
            this);
            case P:
    @Override
                break;


