                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
                {

                hasParam = true;
        this.specificName = specificName;
                }
                        // position is contained in column name
/*
    @NotNull
package org.jkiss.dbeaver.ext.generic.model;
    @Nullable
    }
            getSchema(),
        } else {
                            null :
    }
                        remarks,
    @NotNull

import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        // Some drivers do not return ordinal position (PostgreSQL) but
import org.jkiss.code.NotNull;

        return getContainer() instanceof GenericPackage ? (GenericPackage) getContainer() : null;
                    getSchema() == null ? null : JDBCUtils.escapeWildCards(session, getSchema().getName()),
        return columns;
                    int columnSize = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.LENGTH);
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                );

import org.jkiss.dbeaver.ext.generic.GenericConstants;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

                    getDataSource().getAllObjectsPattern()

                        position,
        }
        GenericStructContainer container,
        String source,
        if (columns == null) {
                    }
                    String remarks = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.REMARKS);
 */
            };
    @Property(viewable = true, order = 7)
    public GenericFunctionResultType getFunctionResultType() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.meta.Property;

    public GenericProcedure(

                case DatabaseMetaData.functionColumnResult -> DBSProcedureParameterKind.RESULTSET;

    @Property(viewable = true, order = 5)
 * DBeaver - Universal Database Manager

            final JDBCResultSet dbResult;
    {
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
        } else {
                    JDBCUtils.escapeWildCards(session, getName()),
    public void setSource(String source) {
                    procedure.addColumn(column);
    private String specificName;
        this.procedureType = procedureType;

        String description,
        }
        this.source = null;
                    if (procedure == null || (previousPosition >= 0 && position <= previousPosition && procIter.hasNext())) {
        }
                    int precision = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.PRECISION);
                    int columnTypeNum = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.COLUMN_TYPE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return procedureType;
        return source;
                case DatabaseMetaData.procedureColumnReturn -> DBSProcedureParameterKind.RETURN;
    }
    public String getProcedureSignature(DBRProgressMonitor monitor, boolean showParamNames) throws DBException {
            return "";
            return paramsSignature.toString();
    public void loadProcedureColumns(DBRProgressMonitor monitor) throws DBException
                    GenericProcedureParameter column = new GenericProcedureParameter(
                            position = Integer.parseInt(numberMatcher.group(1));
                case DatabaseMetaData.procedureColumnIn -> DBSProcedureParameterKind.IN;
        }
            if (columns == null) {
 *
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load procedure columns")) {
    {
        this.procedureType = procedureType;
        return DBUtils.getFullQualifiedName(getDataSource(),
        }
            if (DBSProcedureType.PROCEDURE == procedureType) {
                if (param.getParameterKind() != DBSProcedureParameterKind.IN &&
                    previousPosition = position;
                        columnName = "RETURN";
        DBSProcedureType procedureType,
                case DatabaseMetaData.functionColumnIn -> DBSProcedureParameterKind.IN;
            try {
        if (source == null) {

import java.util.*;
    }
    private final DBSProcedureType procedureType;
                        columnSize,
    {
                        this.getPackage() == null || !this.getPackage().isNameFromCatalog() ?
        GenericFunctionResultType functionResultType)
                case DatabaseMetaData.functionReturn -> DBSProcedureParameterKind.RETURN;

import org.jkiss.dbeaver.DBException;
                }
    public DBSProcedureType getProcedureType()
 */
    @NotNull
                    String typeName = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.TYPE_NAME);
 *

import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
    }
 * You may obtain a copy of the License at
            parameterType = switch (columnTypeNum) {
    implements GenericScriptObject, DBPUniqueObject, DBPRefreshableObject
        String procedureName,
                    getCatalog() == null ? null : getCatalog().getName(),
    ) {
                columns = new ArrayList<>();
            getCatalog(),
        throws DBException
    private DBSProcedureParameterKind getParameterKind(int columnTypeNum) {
                        Matcher numberMatcher = PATTERN_COL_NAME_NUMERIC.matcher(columnName);
                case DatabaseMetaData.functionColumnOut -> DBSProcedureParameterKind.OUT;
    private static final Pattern PATTERN_COL_NAME_NUMERIC = Pattern.compile("\\$?([0-9]+)");
    @Override
    @Nullable
        if (this.columns == null) {
    @Override
                default -> DBSProcedureParameterKind.UNKNOWN;
                    //int radix = GenericUtils.safeGetInt(dbResult, JDBCConstants.RADIX);
                    }
            this);
        Collection<GenericProcedureParameter> parameters = getParameters(monitor);
                    paramsSignature.append(param.getName()).append(' ');
    private String source;
                        }
    }

import java.util.regex.Pattern;
public class GenericProcedure extends AbstractProcedure<GenericDataSource, GenericStructContainer>
    @Override
            source = getDataSource().getMetaModel().getProcedureDDL(monitor, this);
    }
        return getContainer().getCatalog();
                );
                        if (numberMatcher.matches()) {

        this.columns.add(column);
    public void addColumn(GenericProcedureParameter column)
    {
                        valueType,
                        typeName,
            } else {
    public String getSource() {
    public String getUniqueName()
                    int valueType = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.DATA_TYPE);
        if (!CommonUtils.isEmpty(parameters)) {
import org.jkiss.utils.CommonUtils;
            loadProcedureColumns(monitor);
    }
        return CommonUtils.isEmpty(specificName) ? getName() : specificName;
                    param.getParameterKind() != DBSProcedureParameterKind.INOUT)
                    getCatalog() == null ?
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
        } catch (SQLException e) {
 * Unless required by applicable law or agreed to in writing, software
                case DatabaseMetaData.procedureColumnOut -> DBSProcedureParameterKind.OUT;
        boolean persisted
                    }
            }
    {
                default -> DBSProcedureParameterKind.UNKNOWN;
    @Override
        return getContainer().getSchema();
        }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {

    private String makeSignature(DBRProgressMonitor monitor, boolean showParamNames) throws DBException {
                    String columnName = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.COLUMN_NAME);
                dbResult = session.getMetaData().getProcedureColumns(
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
import org.jkiss.dbeaver.DBDatabaseException;
    }

        return source;

        Collection<? extends GenericProcedure> procedures = getContainer().getProcedures(monitor, getName());
    @NotNull
        return functionResultType;
            StringBuilder paramsSignature = new StringBuilder(64);
                    continue;
    public GenericCatalog getCatalog()
    @Property(viewable = true, order = 6)
    @Nullable
    public GenericSchema getSchema()
    }
                        parameterType);
    }
        GenericStructContainer container,
    }
        }
    @NotNull
    public GenericProcedure(
                case DatabaseMetaData.procedureColumnInOut -> DBSProcedureParameterKind.INOUT;
        GenericProcedure procedure = null;
            throw new DBException("Internal error - cannot read columns for procedure '" + getName() + "' because its not found in container");
 * See the License for the specific language governing permissions and

    @Override
                paramsSignature.append(param.getFullTypeName());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
                    int scale = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.SCALE);
{
    {
    {
 *
 * GenericProcedure

                while (dbResult.next()) {
            boolean hasParam = false;

    private List<GenericProcedureParameter> columns;
    private GenericFunctionResultType functionResultType;
    @Property(viewable = true, labelProvider = GenericSchema.SchemaNameTermProvider.class, order = 4)
 * Copyright (C) 2010-2025 DBeaver Corp and others
        super(container, true, procedureName, description);
        final GenericMetaObject pcObject = getDataSource().getMetaObject(GenericConstants.OBJECT_PROCEDURE_COLUMN);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
 * you may not use this file except in compliance with the License.
        String description,
        if (DBSProcedureType.PROCEDURE == procedureType) {
                        getCatalog().getName(),
            this.columns = new ArrayList<>();
        this.source = source;
    }
                int previousPosition = -1;
 * distributed under the License is distributed on an "AS IS" BASIS,
}
        String name,
                    if (position == 0) {
                        procedure = procIter.next();
                        columnName,
import org.jkiss.dbeaver.model.DBPRefreshableObject;
                            this.getPackage().getName() :
        super(container, persisted, name, description);
    @Override
                    if (CommonUtils.isEmpty(columnName) && parameterType == DBSProcedureParameterKind.RETURN) {
    {
    {

/**
import org.jkiss.dbeaver.model.DBPUniqueObject;
import java.util.regex.Matcher;
        if (procedures == null || !procedures.contains(this)) {
                case DatabaseMetaData.functionColumnInOut -> DBSProcedureParameterKind.INOUT;
            } finally {
                dbResult.close();
    {
                    int position = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.ORDINAL_POSITION);
    }
    @Property(viewable = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
    public Collection<GenericProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor)
    }
                dbResult = session.getMetaData().getFunctionColumns(
                if (hasParam) paramsSignature.append(',');
            for (GenericProcedureParameter param : parameters) {
                if (showParamNames) {
            parameterType = switch (columnTypeNum) {
                    DBSProcedureParameterKind parameterType = getParameterKind(columnTypeNum);
        DBSProcedureParameterKind parameterType;
                case DatabaseMetaData.procedureColumnResult -> DBSProcedureParameterKind.RESULTSET;
        String specificName,
import java.sql.SQLException;
        this.source = source;
                    getDataSource().getAllObjectsPattern()
    }
        Iterator<? extends GenericProcedure> procIter = procedures.iterator();
            }
                        procedure,

            throw new DBDatabaseException(e, getDataSource());
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
        DBSProcedureType procedureType,


                    JDBCUtils.escapeWildCards(session, getName()),
import java.sql.DatabaseMetaData;

        return getFullyQualifiedName(DBPEvaluationContext.DML) + "(" + makeSignature(monitor, showParamNames) + ")";
        return this;
 * limitations under the License.
    }
            };
                    getSchema() == null ? null : JDBCUtils.escapeWildCards(session, getSchema().getName()),
        return parameterType;
                    boolean notNull = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.NULLABLE) == DatabaseMetaData.procedureNoNulls;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
                        scale, precision, notNull,
        this.functionResultType = functionResultType;
    }
    public GenericPackage getPackage()
