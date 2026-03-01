 * You may obtain a copy of the License at
            throws DBException {
    }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(
        return super.getObjectDefinitionText(monitor, options);
    }
    @Nullable
                "SELECT status FROM system_.sys_users_ u, system_.sys_procedures_ p"
    }
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObjectState;
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return AltibaseConstants.OBJ_TYPE_TYPESET;
        
        }
            DBSProcedureType procedureType, GenericFunctionResultType functionResultType) {
    }
    @Override

        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 
        } else {
        }
    
import org.jkiss.dbeaver.Log;
    protected boolean valid = false;    
                if (dbResult != null && dbResult.next()) {
            dbStat.setString(2, getName());
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
        return this;
    protected DBSProcedureType procedureType;
 * DBeaver - Universal Database Manager
    
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        this.columns.add(new AltibaseProcedureParameter(column));
    public void addColumn(GenericProcedureParameter column) {
 * limitations under the License.
        schemaName = container.getName();
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    public String getProcedureTypeName() {
    
import java.util.Collection;
    public GenericFunctionResultType getFunctionResultType() {
                }
 */

import org.jkiss.dbeaver.model.DBPStatefulObject;
 * you may not use this file except in compliance with the License.
    @Property(viewable = false, hidden = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
    @Override
import org.jkiss.dbeaver.ext.generic.model.*;

    /**
    public void setProcedureType(DBSProcedureType procedureType) {
        if (procedureType == DBSProcedureType.UNKNOWN) {
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {
    protected String schemaName = null;
                "Refresh state of " + getProcedureTypeName() + " '" + this.getName() + "'")) {

    protected void refreshState(JDBCSession session) throws DBCException {
        return getContainer().getCatalog();
    @Property(viewable = false, hidden = true, order = 7)
import org.jkiss.code.NotNull;
    /**
 * Unless required by applicable law or agreed to in writing, software
                        + " WHERE u.user_id = p.user_id AND u.user_name = ? AND proc_name = ?")) {
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
    @Override
        this.valid = valid;
    protected List<GenericProcedureParameter> columns;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            dbStat.setString(1, schemaName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

    }
    protected static final Log log = Log.getLog(AltibaseProcedureBase.class);
import org.jkiss.dbeaver.model.DBPRefreshableObject;
    public String getSchemaName() {
        this.procedureType = procedureType;
            return procedureType.name();

    /**
            try (JDBCResultSet dbResult = dbStat.getResultSet()) {
    }
package org.jkiss.dbeaver.ext.altibase.model;
     */
    public Collection<GenericProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor)
                    valid = JDBCUtils.safeGetBoolean(dbResult, 1, "0"); // 0 is Valid, 1 is invalid
    @Nullable


import org.jkiss.dbeaver.model.DBUtils;
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
            dbStat.executeStatement();
    }
import org.jkiss.dbeaver.model.meta.Property;
        }
     */
    }
/*
            }
     * Get Procedure type, especially for TYPESET
        return schemaName;
    public DBSObjectState getObjectState() {
                "Refresh state of " + getProcedureTypeName() + " '" + this.getName() + "'")) {
    
        }
    public GenericCatalog getCatalog() {
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    
 *

    
    @Override
    }
    }
import org.jkiss.dbeaver.DBException;
public abstract class AltibaseProcedureBase extends GenericProcedure 
import java.sql.SQLException;
            refreshState(session);
    }
 *

    
    @Property(viewable = false, hidden = true, length = PropertyLength.MULTILINE, order = 100)
    }
            refreshState(session);
    
        } catch (SQLException e) {
    @Property(hidden = true, editable = true, updatable = true)
 * See the License for the specific language governing permissions and
    @Override
import java.util.ArrayList;
import org.jkiss.dbeaver.model.struct.DBSObject;
        super(container, procedureName, procedureName, "", procedureType, functionResultType);
    @NotNull
     * Constructor
            this.columns = new ArrayList<>();
     * Set procedure type, especially for Typeset
        this.procedureType = procedureType;
    public void setObjectDefinitionText(String source) {
implements DBSObjectWithScript, DBPStatefulObject, DBPRefreshableObject {
 *
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String getDescription() {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

    
        }
        return super.getFunctionResultType();
        return columns;
}
        super.setSource(source);
import org.jkiss.code.Nullable;

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            throw new DBCException(e, session.getExecutionContext());
        if (this.columns == null) {
        return valid ? DBSObjectState.NORMAL : DBSObjectState.INVALID;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, 
    }
        if (columns == null) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
import java.util.Map;
    }
    public AltibaseProcedureBase(GenericStructContainer container, String procedureName, boolean valid,
            loadProcedureColumns(monitor);
import java.util.List;
        return description;
