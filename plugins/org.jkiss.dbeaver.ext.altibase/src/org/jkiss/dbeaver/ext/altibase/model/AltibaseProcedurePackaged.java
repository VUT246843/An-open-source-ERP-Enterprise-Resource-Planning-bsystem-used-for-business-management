            try {
                            break;
public class AltibaseProcedurePackaged extends AltibaseProcedureBase {
 * limitations under the License.
                    final int scale           = JDBCUtils.safeGetInt(dbResult, "SCALE");
                    }
                    DBSProcedureParameterKind parameterType;
        this.pkgName = pkgName;
                            position,
        this.pkgSchema = pkgSchema;
            throw new DBDatabaseException(e, getDataSource());
 * See the License for the specific language governing permissions and
    public AltibaseProcedurePackaged(
                            columnSize,
                            this,
                    final boolean isFunction  = (JDBCUtils.safeGetInt(dbResult, "SUB_TYPE") == 1);

            boolean valid,
    }
                    }
 * you may not use this file except in compliance with the License.

                    // procedure with no argument case
                            parameterType);
                    .prepareProcedurePackagedColumnLoadStatement(session, pkgSchema, pkgName, this.getName());
                while (dbResult.next()) {
                        default:
                            break;

                }
                    }
            }
import java.sql.SQLException;
                            columnName,
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
                    AltibaseProcedureParameter column = new AltibaseProcedureParameter(
            String procedureName, 

                        return; 
                    int position              = JDBCUtils.safeGetInt(dbResult, "PARA_ORDER");
    }

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
     * Add procedure columns
import java.util.Map;
            JDBCResultSet dbResult = dbStat.getResultSet();
 * Licensed under the Apache License, Version 2.0 (the "License");
            DBSProcedureType procedureType, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            dbStat.executeStatement();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    private String pkgSchema;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
import org.jkiss.dbeaver.ext.generic.model.GenericFunctionResultType;

        }
                    final int valueType       = JDBCUtils.safeGetInt(dbResult, "DATA_TYPE");;
import org.jkiss.dbeaver.DBException;
     */
            JDBCPreparedStatement dbStat = ((AltibaseMetaModel) getDataSource().getMetaModel())
                            parameterType = DBSProcedureParameterKind.INOUT;
                        --position;
package org.jkiss.dbeaver.ext.altibase.model;
                    }

            GenericFunctionResultType functionResultType) {

}
 *     http://www.apache.org/licenses/LICENSE-2.0
                    final int columnTypeNum   = JDBCUtils.safeGetInt(dbResult, "INOUT_TYPE"); // 0: IN, 1: OUT, 2: IN OUT
                    if (!isFunction && columnName == null && position == 0) {

 *
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
    }
            } finally {
                            parameterType = DBSProcedureParameterKind.IN;
                    if (isFunction) {
                            parameterType = DBSProcedureParameterKind.OUT;
 *
    private String pkgName;
                            break;
 * DBeaver - Universal Database Manager
 *

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.DBUtils;
        super(container, procedureName, true, procedureType, functionResultType);
                            remarks,
import org.jkiss.code.NotNull;
        return "-- Unable to get package dependent object source";
                dbResult.close();
                    if (isFunction && columnName == null && position == 1) {
                    final int precision       = JDBCUtils.safeGetInt(dbResult, "PRECISION");

    
                            parameterType = DBSProcedureParameterKind.UNKNOWN;

import org.jkiss.dbeaver.DBDatabaseException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load procedure columns")) {
                        case AltibaseProcedureParameter.PARAM_OUT:
 */
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                            break;
                    final boolean notNull     = (defaultValue == null);
                    final String defaultValue = JDBCUtils.safeGetString(dbResult, "DEFAULT_VAL");
                            valueType,
            dbStat.setFetchSize(DBConstants.METADATA_FETCH_SIZE);
            GenericStructContainer container,
    public void loadProcedureColumns(DBRProgressMonitor monitor) throws DBException {
                    final String remarks      = "";
                    final String typeName     = JDBCUtils.safeGetString(dbResult, "TYPE_NAME");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        } catch (SQLException e) {
            String pkgSchema,
                    final int columnSize      = precision;

    /**
                    // function return type
                    this.addColumn(column);
                        continue; 
                        case AltibaseProcedureParameter.PARAM_IN:
                    switch (columnTypeNum) {
            String pkgName,
                            typeName,
import org.jkiss.dbeaver.model.DBConstants;
    @Override
                            scale, precision, notNull,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
                    final String columnName   = JDBCUtils.safeGetString(dbResult, "PARA_NAME");
 * distributed under the License is distributed on an "AS IS" BASIS,
                        case AltibaseProcedureParameter.PARAM_INOUT:
