
 *

            getProcedureType() == DBSProcedureType.PROCEDURE ?
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        if (sourceDeclaration == null && monitor != null) {
import org.jkiss.dbeaver.DBException;
}
    }
        }
    public Integer getOverloadNumber()
            new OracleObjectPersistAction(
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    OracleObjectType.PROCEDURE : OracleObjectType.FUNCTION,
    @Override
            sourceDeclaration = OracleUtils.getSource(monitor, this, false, true);
    public DBSObjectState getObjectState()
    {

        this.valid = OracleUtils.getObjectStatus(monitor, this,
    @NotNull
import java.sql.ResultSet;
/**
    }
import java.util.Map;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean valid;
    {
    public boolean isValid()
        return getSchema().proceduresCache.refreshObject(monitor, getSchema(), this);
import org.jkiss.dbeaver.model.meta.Property;


    @NotNull
 */
 * GenericProcedure
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
            )};
 * you may not use this file except in compliance with the License.
    private String sourceDeclaration;
                getProcedureType() == DBSProcedureType.PROCEDURE ?
    @Property(viewable = true, order = 3)
    public OracleSourceType getSourceType()
        sourceDeclaration =
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor)
    }
    {
    {
            "END " + name + ";" + GeneralUtils.getDefaultLineSeparator();
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
    {
    }
        this.sourceDeclaration = sourceDeclaration;
        return getParentObject();
    {

    }
            OracleSourceType.PROCEDURE :
 * limitations under the License.
                "Compile procedure",
        return DBUtils.getFullQualifiedName(getDataSource(),
    public OracleSchema getSchema()
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;

package org.jkiss.dbeaver.ext.oracle.model;
    {
 *
    @Override
            procedureType.name() + " " + name + GeneralUtils.getDefaultLineSeparator() +
                    OracleObjectType.PROCEDURE : OracleObjectType.FUNCTION);
    }
 * See the License for the specific language governing permissions and
        return valid;
{

import org.jkiss.dbeaver.model.DBPRefreshableObject;
            getSchema(),
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

/*
        this.valid = OracleConstants.RESULT_STATUS_VALID.equals(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_STATUS));
import org.jkiss.dbeaver.model.struct.DBSObjectState;
            JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_NAME),
            DBSProcedureType.valueOf(JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_TYPE)));
    }
    public OracleProcedureStandalone(OracleSchema oracleSchema, String name, DBSProcedureType procedureType)
    {
 * DBeaver - Universal Database Manager
    @Property(hidden = true, editable = true, updatable = true, order = -1)
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
        OracleSchema schema,
    @Override
    {
    @Override
    public OracleProcedureStandalone(
    }
    }
 * You may obtain a copy of the License at
        return getProcedureType() == DBSProcedureType.PROCEDURE ?
    {
        super(oracleSchema, name, 0l, procedureType);
            "IS" + GeneralUtils.getDefaultLineSeparator() +
        return null;
    }
public class OracleProcedureStandalone extends OracleProcedureBase<OracleSchema> implements OracleSourceObject, DBPRefreshableObject
            schema,
import org.jkiss.code.NotNull;
            this);
        return sourceDeclaration;
import org.jkiss.dbeaver.model.DBUtils;
            OracleSourceType.FUNCTION;
import org.jkiss.dbeaver.model.struct.DBSObject;

            JDBCUtils.safeGetLong(dbResult, "OBJECT_ID"),
                "ALTER " + getSourceType().name() + " " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Unless required by applicable law or agreed to in writing, software
    public void setObjectDefinitionText(String sourceDeclaration)

    @Override
        ResultSet dbResult)
    {
 *     http://www.apache.org/licenses/LICENSE-2.0



    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException
    }
    @Override
    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
            "BEGIN" + GeneralUtils.getDefaultLineSeparator() +
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 */
    {
        super(
    @NotNull
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBCException
    @Override

    @Override
    }
        return new DBEPersistAction[] {

