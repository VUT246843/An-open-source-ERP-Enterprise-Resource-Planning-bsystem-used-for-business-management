        return this.scriptSQL;
            return DBSProcedureType.PROCEDURE;
}
    }

    @NotNull
    
import java.sql.Timestamp;
    public ExasolSchema getContainer() {
    // Properties
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
    public String getSql() {
    public String getType() {
    private String scriptSQL;
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;
    }
/*
    public Collection<? extends DBSProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Nullable
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    private String remarks;
        return owner;
        exasolSchema = schema;

 * You may obtain a copy of the License at
    @Override
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {
    @Property(order = 10)

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


 * you may not use this file except in compliance with the License.
    


        if (CommonUtils.equalObjects(scriptType, "SCRIPTING") || CommonUtils.equalObjects(scriptType, "ADAPTER"))
    public ExasolScriptResultType getResultType() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        this.scriptReturnType = CommonUtils.valueOf(ExasolScriptResultType.class, JDBCUtils.safeGetString(dbResult, "SCRIPT_RESULT_TYPE"));
    public void setDescription(String description)
    }
    @Nullable

 */
    private ExasolScriptLanguage scriptLanguage;
 * Unless required by applicable law or agreed to in writing, software
    {
        return scriptLanguage;
        return exasolSchema;
    @Property(viewable = true, order = 5)
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");

    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 11)
import java.util.Map;
    @Override
    // -----------------------
    }

    @Property(viewable = true, order = 1)
        return this.createTime;
 * limitations under the License.
    @Nullable
    @NotNull
    public ExasolScript refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        return scriptReturnType;
import java.util.Collection;
 *
        return this.name;

    public ExasolSchema getSchema() {
    public String getName() {
    public String getOwner() {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    @NotNull

        exasolSchema = schema;
import org.jkiss.dbeaver.ext.exasol.editors.ExasolSourceObject;
    @Override
        getContainer().scriptCache.getAllObjects(monitor, getSchema());
import org.jkiss.dbeaver.DBException;
import org.jkiss.utils.CommonUtils;

import org.jkiss.dbeaver.model.DBUtils;
    }
    @Override
    }

 *
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        this.owner = JDBCUtils.safeGetString(dbResult, "SCRIPT_OWNER");
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;

            return DBSProcedureType.FUNCTION;
        this.name = JDBCUtils.safeGetString(dbResult, "SCRIPT_NAME");
import java.sql.ResultSet;
    @Property(order = 12)

        return DBUtils.getFullQualifiedName(getDataSource(), getContainer(), this);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
        this.remarks = description;
    @NotNull


    private ExasolScriptResultType scriptReturnType;
    @Override
        else
    private String scriptType;

    private String owner;
        super(schema, false);
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @Override
        this.scriptSQL = JDBCUtils.safeGetString(dbResult, "SCRIPT_TEXT");

    @Property(category = ExasolConstants.CAT_OWNER)
package org.jkiss.dbeaver.ext.exasol.model;
    public DBSProcedureType getProcedureType() {

        this.scriptLanguage = CommonUtils.valueOf(ExasolScriptLanguage.class, JDBCUtils.safeGetString(dbResult, "SCRIPT_LANGUAGE"));
public class ExasolScript extends AbstractProcedure<ExasolDataSource, ExasolSchema> implements DBSProcedure, DBPRefreshableObject, ExasolSourceObject {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    {
        scriptSQL = "";

    public void setObjectDefinitionText(String sourceText) throws DBException
    @NotNull
    }
        getContainer().scriptCache.clearCache();
    public String getDescription() {
    @Property(viewable = true, order = 2)
    }



    private ExasolSchema exasolSchema;
    public Timestamp getCreationTime() {
    public ExasolScript(ExasolSchema schema, ResultSet dbResult) {
import org.jkiss.code.NotNull;
    }
    }
    }
        return null;
        return exasolSchema;
    @Override
        this.remarks = JDBCUtils.safeGetString(dbResult, "SCRIPT_COMMENT");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    }
    }
    public ExasolScriptLanguage getLanguage() {
        this.scriptSQL = sourceText;
        this.scriptType = JDBCUtils.safeGetString(dbResult, "SCRIPT_TYPE");
        return this.scriptType;
import org.jkiss.dbeaver.model.DBPEvaluationContext;


    }
 * DBeaver - Universal Database Manager
    }
        return this.remarks;
    @Property(viewable = true, order = 6)

    public ExasolScript(ExasolSchema schema)
import org.jkiss.dbeaver.ext.exasol.model.dict.ExasolScriptResultType;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    // -----------------------
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

import org.jkiss.dbeaver.ext.exasol.model.dict.ExasolScriptLanguage;
        return getContainer().scriptCache.getObject(monitor, exasolSchema, getName());
    private Timestamp createTime;
    @Override


    @Property(hidden = true, editable = true, updatable = true)
    }
        return this.scriptSQL;
    	super(schema, true);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.meta.Property;

