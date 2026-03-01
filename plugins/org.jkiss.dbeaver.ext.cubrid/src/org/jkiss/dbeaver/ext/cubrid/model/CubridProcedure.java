    }
    @Nullable

import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;

        this.proColumns.add(column);

        return DBUtils.getFullQualifiedName(getDataSource(), this);
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        return procedureType;
        return null;
        }
 *
    }
    public DBSProcedureType getProcedureType() {
    public CubridProcedure(@NotNull GenericStructContainer container, DBSProcedureType procedureType) {
        this.returnType = returnType;
/*
    @Override
            stmt = ((CubridDataSource) getDataSource()).wrapShardQuery(stmt);
 * Unless required by applicable law or agreed to in writing, software

        this.source = source;
    @Override
        if (this.proColumns == null) {
import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.model.DBUtils;
    }
    @Property(hidden = true, editable = true, updatable = true)
    public List<CubridProcedureParameter> getParams(@NotNull DBRProgressMonitor monitor) throws DBException {
    public void loadProcedureColumns(@NotNull DBRProgressMonitor monitor) throws DBException {
    }

    }
    }
        return source;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(stmt)) {
        }
    @Override
import java.util.ArrayList;
        return super.getSchema();
import org.jkiss.dbeaver.model.meta.Property;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            @NotNull GenericStructContainer container,

import java.sql.SQLException;
 * you may not use this file except in compliance with the License.
    }
                this.source = "-- Java procedure definition not available";

 * limitations under the License.
    public void setProcedureType(DBSProcedureType procedureType) {
                        String mode = JDBCUtils.safeGetString(dbResult, "mode");
            @NotNull String procedureName,
    @NotNull
import org.jkiss.dbeaver.ext.generic.model.*;
    }
import org.jkiss.code.NotNull;
    public GenericFunctionResultType getFunctionResultType() {
import org.jkiss.code.Nullable;
                        addColumn(new CubridProcedureParameter(this, argName, dataType, mode, comment));

    public GenericPackage getPackage() {
        return null;

    @Property(viewable = true, order = 20)
    @Nullable
    @Override

            }
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        setSource(source);
                }
    private String source;
    private DBSProcedureType procedureType;
    @Override
    }
import org.jkiss.dbeaver.DBException;
    }
    public CubridProcedure(
    @Nullable
    }
                this.source += (getProcedureType() == DBSProcedureType.FUNCTION) ? " RETURN int" : "";
            loadProcedureColumns(monitor);


import java.util.List;
                    }
 *

 * See the License for the specific language governing permissions and
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public GenericSchema getSchema() {
        }
    @Override
    public String getReturnType() {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        this.procedureType = procedureType;
        super(container, procedureName, description, procedureType, source, true);
            String stmt = "select * from db_stored_procedure_args where sp_name = ?";
 * DBeaver - Universal Database Manager
    public String getSource() {
    }
                proColumns = new ArrayList<>();
    @NotNull
package org.jkiss.dbeaver.ext.cubrid.model;
    @Property(viewable = true, order = 2, labelProvider = GenericSchema.SchemaNameTermProvider.class)
    @Property(order = 2)
        this.procedureType = procedureType;
    public void setSource(String source) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private List<CubridProcedureParameter> proColumns;
        return source;
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return null;

            }
public class CubridProcedure extends GenericProcedure implements DBSObjectWithScript, DBPRefreshableObject {
                        String dataType = JDBCUtils.safeGetString(dbResult, "data_type");
                dbStat.setString(1, getName());
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;

    private String returnType;
        super(container, null, null, procedureType, null, false);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                this.source = "CREATE OR REPLACE " + getProcedureType().name() + " ";
        this.source = source;
        this.procedureType = procedureType;
                        String comment = JDBCUtils.safeGetString(dbResult, CubridConstants.COMMENT);
        }

    }
 */
            @NotNull String returnType) {
        if (source == null) {
    @Override
 * You may obtain a copy of the License at
            @Nullable String description,
import org.jkiss.dbeaver.model.meta.PropertyLength;
    public GenericCatalog getCatalog() {
    @Override
}
    public void setObjectDefinitionText(String source) {

        if (proColumns == null) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, getDataSource(), "Read procedure parameter")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            @NotNull DBSProcedureType procedureType,
import org.jkiss.dbeaver.ext.cubrid.CubridConstants;

                this.source += getFullyQualifiedName(DBPEvaluationContext.DDL) + "()";
            throw new DBDatabaseException(e, getDataSource());
        return super.getDescription();
    @NotNull
    }
                    while (dbResult.next()) {
                this.source += "\nAS LANGUAGE JAVA NAME";
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
    @Override
            if (!persisted) {
    @Override
        return proColumns;
import java.util.Map;
            if (proColumns == null) {
    @Nullable
            this.proColumns = new ArrayList<>();

    }
    }
    public void addColumn(@NotNull CubridProcedureParameter column) {
        } catch (SQLException e) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            @Nullable String source,
                        String argName = JDBCUtils.safeGetString(dbResult, "arg_name");
            }

    public String getDescription() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 *
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
        return returnType;
