                        "   PP.RDB$PARAMETER_NUMBER";

                        "F.RDB$FIELD_LENGTH AS \"LENGTH\",\n" +
            if (!isProcedure && versionAtLeast3) {
                        if ((fieldDT == FireBirdFieldType.CHAR || fieldDT == FireBirdFieldType.VARCHAR) && isProcedure) {
                                defaultValue,
                        "   AND FUNA.RDB$PACKAGE_NAME IS NOT DISTINCT\n" +
    }
                                typeName,
 *

                                    break;
        setSource(source);
                        } else {
                            fieldName = JDBCUtils.safeGetStringTrimmed(dbResult, "FIELD_NAME");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            } else {
                            if (position == 0) { // Firebird functions don't have parameter type field in system table and they don't have parameter types. But they have RDB$RETURN_ARGUMENT, which sets the value 0 for position field
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        "   AND PP.RDB$PROCEDURE_NAME=?\n" +
                sql = "SELECT\n" +
                        String typeName = "";
    public void loadProcedureColumns(DBRProgressMonitor monitor) throws DBException {
                        "   FUN.RDB$FUNCTION_NAME=?";
                        "FROM\n" +
                            }
                        }
 *
                                position,
                                parameterName,
                        }
        } catch (SQLException e) {
                                    break;
                                dataType,
        return super.getPackage();
                        "F.RDB$FIELD_SUB_TYPE AS FIELD_SUB_TYPE,\n" +
                        int subType = JDBCUtils.safeGetInt(dbResult, "FIELD_SUB_TYPE");
                        "   WHEN FUN.RDB$RETURN_ARGUMENT = FUNA.RDB$ARGUMENT_POSITION THEN 0\n" +
    }
                }

            }
        return super.getObjectDefinitionText(monitor, options);
            try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
public class FireBirdProcedure extends GenericProcedure implements DBSObjectWithScript {
                                relationName);
    @Override
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                                parameterType,
                        int scale = Math.abs(JDBCUtils.safeGetInt(dbResult, JDBCConstants.SCALE)); // For some reason, FireBird returns the negative value in the scale field.
                        String fieldName = null;
                        "ORDER BY\n" +
/*
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    }
                        "   FUN.RDB$PACKAGE_NAME\n" +
                        "F.RDB$FIELD_PRECISION AS \"PRECISION\",\n" +
    public GenericSchema getSchema() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.meta.Property;
                                remarks,
    @Override
    public GenericPackage getPackage() {
                        "PP.RDB$PARAMETER_TYPE AS COLUMN_TYPE,\n" +
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
                        boolean notNull = JDBCUtils.safeGetBoolean(dbResult, "NOT_NULL");
                        "CASE\n" +
                        "LEFT JOIN RDB$FIELDS F ON\n" +

        }
                        "F.RDB$FIELD_SCALE AS \"SCALE\",\n" +
                        "PP.RDB$NULL_FLAG AS NOT_NULL,\n" +

                        FireBirdProcedureParameter parameter = new FireBirdProcedureParameter(
                            typeName = fieldDT.getName();
                                notNull,

                                parameterType = DBSProcedureParameterKind.RETURN;


                        } else {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(container, procedureName, specificName, description, procedureType, functionResultType);
                        "   RDB$FIELDS F\n" +
        return super.getSchema();
                        "FUNA.RDB$RELATION_NAME AS RELATION_NAME,\n" +
    }
import org.jkiss.dbeaver.model.DBUtils;

                    while (dbResult.next()) {

                        (versionAtLeast3 ? ",PP.RDB$FIELD_NAME AS FIELD_NAME,\nPP.RDB$RELATION_NAME AS RELATION_NAME\n" : "") +
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
import org.jkiss.dbeaver.DBDatabaseException;
                            }
                        int position = JDBCUtils.safeGetInt(dbResult, JDBCConstants.ORDINAL_POSITION);
                                default:
 */
                        "   ELSE FUNA.RDB$ARGUMENT_POSITION\n" +
 *     http://www.apache.org/licenses/LICENSE-2.0
                                parameterType = DBSProcedureParameterKind.IN;
                        "FROM\n" +
                dbStat.setString(1, getName());
import org.jkiss.dbeaver.DBException;
                        "   ELSE FALSE\n" +
                        int columnSize;
    public FireBirdProcedure(GenericStructContainer container, String procedureName, String specificName, String description, DBSProcedureType procedureType, GenericFunctionResultType functionResultType) {
                        "F.RDB$CHARACTER_SET_ID,\n" +
                        "COALESCE(FUNA.RDB$FIELD_LENGTH, F.RDB$FIELD_LENGTH) AS \"LENGTH\",\n" +
                        "COALESCE(FUNA.RDB$FIELD_TYPE, F.RDB$FIELD_TYPE) AS DATA_TYPE,\n" +
import java.sql.SQLException;
    @Override
                        "END AS NOT_NULL\n" +
                            columnSize = JDBCUtils.safeGetInt(dbResult, JDBCConstants.LENGTH);
                        if (fieldDT != null) {

                        String relationName = null;

                        "CASE\n" +
                        "COALESCE(FUNA.RDB$ARGUMENT_NAME, 'PARAM_' || FUNA.RDB$ARGUMENT_POSITION) AS COLUMN_NAME,\n" +
 * You may obtain a copy of the License at
                            columnSize = JDBCUtils.safeGetInt(dbResult, "CHAR_LEN");
                        "   WHEN COALESCE(FUNA.RDB$NULL_FLAG, F.RDB$NULL_FLAG) = 1 THEN TRUE\n" +
    }
    @Override
    @NotNull
                        "PP.RDB$PARAMETER_NUMBER + 1 AS ORDINAL_POSITION,\n" +
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ext.generic.model.*;
                        "INNER JOIN RDB$FUNCTION_ARGUMENTS FUNA ON\n" +
                        "F.RDB$FIELD_TYPE AS DATA_TYPE,\n" +
                        "   WHEN FUNA.RDB$MECHANISM = 1 THEN TRUE\n" +
import java.util.Map;
                        }
                        String remarks = JDBCUtils.safeGetStringTrimmed(dbResult, JDBCConstants.REMARKS);
    public void setObjectDefinitionText(String source) {
                        "   F.RDB$FIELD_NAME = FUNA.RDB$FIELD_SOURCE\n" +
                                scale,
                        "WHERE\n" +
                        "COALESCE(FUNA.RDB$CHARACTER_SET_ID, F.RDB$CHARACTER_SET_ID) AS CHARACTER_SET_ID,\n" +
                        "COALESCE(PP.RDB$DEFAULT_SOURCE, F.RDB$DEFAULT_SOURCE) AS DEFAULT_VALUE\n" +
                        int dataType = JDBCUtils.safeGetInt(dbResult, JDBCConstants.DATA_TYPE);
                        FireBirdFieldType fieldDT = FireBirdFieldType.getById(dataType, subType);
                        String defaultValue = JDBCUtils.safeGetStringTrimmed(dbResult, "DEFAULT_VALUE");
                            relationName = JDBCUtils.safeGetStringTrimmed(dbResult, "RELATION_NAME");
                        }
                                    parameterType = DBSProcedureParameterKind.UNKNOWN;
                                    break;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load procedure columns")) {
                        if (isProcedure) {
                        "COALESCE(FUNA.RDB$FIELD_NAME, F.RDB$FIELD_NAME) AS FIELD_NAME,\n" +
            String sql;
            boolean versionAtLeast3 = getDataSource().isServerVersionAtLeast(3, 0);
            throw new DBDatabaseException(e, getDataSource());
                        addColumn(parameter);
                        "CAST(PP.RDB$PARAMETER_NAME AS varchar(63)) AS COLUMN_NAME,\n" +
                                this,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public GenericCatalog getCatalog() {
    }
                        "   PP.RDB$FIELD_SOURCE = F.RDB$FIELD_NAME\n" +
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                        String parameterName = JDBCUtils.safeGetStringTrimmed(dbResult, JDBCConstants.COLUMN_NAME);
package org.jkiss.dbeaver.ext.firebird.model;
                sql = "SELECT\n" +
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                        int precision = JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION);
 *
                            } else {
                        "FROM\n" +
                        "PP.RDB$DESCRIPTION AS REMARKS,\n" +
import org.jkiss.code.NotNull;
    @Property(hidden = true, editable = true, updatable = true)
                        "COALESCE(FUNA.RDB$FIELD_SUB_TYPE, F.RDB$FIELD_SUB_TYPE) AS FIELD_SUB_TYPE,\n" +
                        "END AS ORDINAL_POSITION,\n" +
                        "   WHEN FUNA.RDB$MECHANISM = 0 THEN TRUE\n" +
                                    parameterType = DBSProcedureParameterKind.OUT;
                        DBSProcedureParameterKind parameterType;
                        if (versionAtLeast3) {
 * limitations under the License.
                                precision,
            boolean isProcedure = getProcedureType() == DBSProcedureType.PROCEDURE;
 * DBeaver - Universal Database Manager
                        "WHERE\n" +
                        "   FUNA.RDB$FUNCTION_NAME = FUN.RDB$FUNCTION_NAME\n" +
                            int paramTypeNum = JDBCUtils.safeGetInt(dbResult, JDBCConstants.COLUMN_TYPE);
                        "COALESCE(FUNA.RDB$FIELD_PRECISION, F.RDB$FIELD_PRECISION) AS \"PRECISION\",\n" +
                        "F.RDB$CHARACTER_LENGTH AS CHAR_LEN,\n" +
                        "COALESCE(FUNA.RDB$CHARACTER_LENGTH, F.RDB$CHARACTER_LENGTH) AS CHAR_LEN,\n" +
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return super.getCatalog();
                                fieldName,
                                case 1:
                            switch (paramTypeNum) {
                        "COALESCE(FUNA.RDB$DEFAULT_SOURCE, F.RDB$DEFAULT_SOURCE) AS DEFAULT_VALUE,\n" +
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                                columnSize,

}
    @Override
                        "   RDB$PROCEDURE_PARAMETERS PP,\n" +
                        "COALESCE(FUNA.RDB$FIELD_SCALE, F.RDB$FIELD_SCALE) AS \"SCALE\",\n" +
                                    parameterType = DBSProcedureParameterKind.IN;

                                case 0:
                        "   RDB$FUNCTIONS FUN\n" +
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
