    @Override
    {

    public ExasolFunction(ExasolSchema schema)
    }

import org.jkiss.dbeaver.ext.exasol.ExasolConstants;

        return DBSProcedureType.FUNCTION;
    @Override
import org.jkiss.dbeaver.DBException;
        getContainer().functionCache.getAllObjects(monitor, exasolSchema);
    }
import java.sql.Timestamp;
import org.jkiss.dbeaver.model.meta.Property;
    }
    
    }
        return owner;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.exasolSchema = schema;
    

package org.jkiss.dbeaver.ext.exasol.model;
            throws DBException
        return getContainer().functionCache.getObject(monitor, exasolSchema, getName());
    // Properties
import org.jkiss.code.Nullable;
    public void setDescription(String description)
 * you may not use this file except in compliance with the License.
    
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
    @NotNull
    private ExasolSchema exasolSchema;
    @Override
    @Property(hidden = true, editable = true, updatable = true)

    @Override
import java.util.Collection;


        this.owner = JDBCUtils.safeGetString(dbResult, "FUNCTION_OWNER");
        @NotNull DBRProgressMonitor monitor) throws DBException

    {
        super(schema, false);
 */
    }
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
 * limitations under the License.
    }
    @Override
    public String getOwner() {


    }
import org.jkiss.dbeaver.ext.exasol.editors.ExasolSourceObject;
            throws DBException
    @Nullable
    public String getDescription() {
        return this.createTime;
 *
 *
        getContainer().functionCache.clearCache();
    private String owner;
}
    @Property(viewable = true, order = 1)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        this.name = JDBCUtils.safeGetString(dbResult, "FUNCTION_NAME");
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, "CREATED");
    // -----------------------
        sql = sourceText;
        exasolSchema = schema;
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 11)
    private Timestamp createTime;
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    
        
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        this.remarks = JDBCUtils.safeGetString(dbResult, "FUNCTION_COMMENT");
        this.remarks = description;
/*

    @NotNull
    @Property(hidden = true, editable = true, updatable = true, order = -1)
 *
    @Override
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String getName() {
    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    
    private String sql;
 * Unless required by applicable law or agreed to in writing, software
    {
    @NotNull
    public ExasolSchema getSchema() {
        return exasolSchema;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public void setObjectDefinitionText(String sourceText) throws DBException
    public Collection<? extends DBSProcedureParameter> getParameters(
        return this.name;
    @Property(viewable = true, order = 2)
    @Override
import org.jkiss.dbeaver.model.DBUtils;
        return DBUtils.getFullQualifiedName(getDataSource(), getContainer(),this);
        extends AbstractProcedure<ExasolDataSource, ExasolSchema> implements DBSProcedure, DBPRefreshableObject, ExasolSourceObject {
    public ExasolFunction(ExasolSchema schema, ResultSet dbResult)
    public Timestamp getCreationTime() {
    @Nullable

    @NotNull
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor)
 * You may obtain a copy of the License at
    }
    @Property(viewable = false, category = ExasolConstants.CAT_OWNER)
    @Override
    }
        return this.sql;
    {



import org.jkiss.dbeaver.model.meta.PropertyLength;
    public String getSql() {
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameter;
    // -----------------------
    {

        return sql;
    private String remarks;

        this.sql = JDBCUtils.safeGetString(dbResult, "FUNCTION_TEXT");
        return null;
        return this.remarks;
    @Override
        super(schema,true);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(viewable = true, order = 6)
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
public class ExasolFunction
        sql = "";
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

import java.util.Map;
import java.sql.ResultSet;

    }
    public DBSProcedureType getProcedureType()
    }
    {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options)

    {
