                    if (procedure == null || (previousPosition >= 0 && position <= previousPosition && procIter.hasNext())) {
import org.jkiss.dbeaver.model.DBPUniqueObject;
 * Unless required by applicable law or agreed to in writing, software
        this.type = JDBCUtils.safeGetString(dbResult, "procedure_type");
    }
import java.util.regex.Pattern;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        switch (columnTypeNum) {
        this.definition = JDBCUtils.safeGetString(dbResult, "function_definition");
                    String remarks = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.REMARKS);

    {
                    if (CommonUtils.isEmpty(columnName) && parameterType == DBSProcedureParameterKind.RETURN) {
                            default:
    {
                    int scale = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.SCALE);
    public Collection<GenericProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor)
                                parameterType = DBSProcedureParameterKind.RESULTSET;

        this.isStrict = JDBCUtils.safeGetBoolean(dbResult, "is_strict");
                                break;
        this.returnType = JDBCUtils.safeGetString(dbResult, "function_return_type");
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    {
        this.columns.add(column);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    String columnName = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.COLUMN_NAME);
import java.util.Collection;
                            case DatabaseMetaData.procedureColumnReturn:
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    procedure.addColumn(column);
        }
    private String returnType;
    {
                    previousPosition = position;
    }
                    if (functionResultType == null) {
            throw new DBException(e, getDataSource());
                        Matcher numberMatcher = PATTERN_COL_NAME_NUMERIC.matcher(columnName);
                    int precision = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.PRECISION);
*/
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
                            this.getPackage().getName() :
import java.util.Map;
        JDBCResultSet dbResult)
                    //int radix = GenericUtils.safeGetInt(dbResult, JDBCConstants.RADIX);
            } finally {
    private void loadProcedureColumns(DBRProgressMonitor monitor) throws DBException
                    int valueType = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.DATA_TYPE);


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPEvaluationContext;
{

                    getDataSource().getAllObjectsPattern()
                            position = Integer.parseInt(numberMatcher.group(1));
                        procedure = procIter.next();
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
                                break;
                            case DatabaseMetaData.functionColumnInOut:
        return definition;
    @Property(viewable = true, order = 3, labelProvider = GenericCatalog.CatalogNameTermProvider.class)
                }
import org.jkiss.dbeaver.model.meta.Property;
                dbResult = session.getMetaData().getFunctionColumns(
            getContainer(),
                            case DatabaseMetaData.functionColumnOut:
                        if (numberMatcher.matches()) {
    public DBSProcedureType getProcedureType()
    {
            this);
                    }
    @Override
/*
                                parameterType = DBSProcedureParameterKind.OUT;
    }
                        columnName,
                                break;
        return getName();
        return getContainer().getCatalog();
            } else {
                    boolean notNull = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.NULLABLE) == DatabaseMetaData.procedureNoNulls;
                    int columnSize = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.LENGTH);

                                break;
 * You may obtain a copy of the License at
    @Override
import org.jkiss.code.NotNull;
 * GenericProcedure
        if (procedures == null || !procedures.contains(this)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public VerticaUDF(
        this.argumentType = JDBCUtils.safeGetString(dbResult, "function_argument_type");
    {
        if (columns == null) {
                dbResult = session.getMetaData().getProcedureColumns(
    public String getUniqueName()
                                break;
import org.jkiss.dbeaver.model.struct.DBSObject;
            loadProcedureColumns(monitor);
                            case DatabaseMetaData.procedureColumnInOut:
                        }
                                break;
    private String definition;
                                break;
                    getName(),
        return null;
                        columnSize,
                        }
                    getDataSource().getAllObjectsPattern()
    @Override
 *
                        getCatalog().getName(),

    @NotNull
                                break;
                    DBSProcedureParameterKind parameterType;
                            case DatabaseMetaData.procedureColumnOut:
    @Nullable
    }
            }
                                parameterType = DBSProcedureParameterKind.RESULTSET;
                            null :
 * DBeaver - Universal Database Manager
                            case DatabaseMetaData.procedureColumnIn:
            try {

                        procedure,
                    getSchema() == null ? null : getSchema().getName(),
            throw new DBException("Internal error - cannot read columns for procedure '" + getName() + "' because its not found in container");
                    getSchema() == null ? null : getSchema().getName(),
                int previousPosition = -1;
                        columnName = "RETURN";
            }
                                parameterType = DBSProcedureParameterKind.UNKNOWN;
                    getCatalog() == null ? null : getCatalog().getName(),
                            case DatabaseMetaData.functionColumnResult:
            if (functionResultType == null) {
                        // position is contained in column name
                    }
        final GenericMetaObject pcObject = getDataSource().getMetaObject(GenericConstants.OBJECT_PROCEDURE_COLUMN);
                                parameterType = DBSProcedureParameterKind.RETURN;
                dbResult.close();
    private boolean isFenced;
        return this;
                                parameterType = DBSProcedureParameterKind.IN;
                        typeName,
    private static final Pattern PATTERN_COL_NAME_NUMERIC = Pattern.compile("\\$?([0-9]+)");
    private void addColumn(GenericProcedureParameter column)
                        switch (columnTypeNum) {

 * distributed under the License is distributed on an "AS IS" BASIS,
                    int columnTypeNum = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.COLUMN_TYPE);
 */

        Collection<? extends VerticaUDF> procedures = getContainer().getProcedures(monitor, getName());

                        scale, precision, notNull,
    }
                    getName(),

                                break;
    @Override
public class VerticaUDF extends AbstractProcedure<GenericDataSource, GenericStructContainer> implements GenericScriptObject, DBPUniqueObject, DBPRefreshableObject
                                parameterType = DBSProcedureParameterKind.INOUT;

                    int position = GenericUtils.safeGetInt(pcObject, dbResult, JDBCConstants.ORDINAL_POSITION);
        super(container, true, JDBCUtils.safeGetString(dbResult, "function_name"), null);
        return DBSProcedureType.FUNCTION;
                        parameterType);
    private boolean isStrict;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                                parameterType = DBSProcedureParameterKind.INOUT;
                                parameterType = DBSProcedureParameterKind.IN;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        }
    @Override
 */
                                break;
        if (this.columns == null) {
import org.jkiss.dbeaver.DBException;
        VerticaUDF procedure = null;
 *
        }
        return columns;
                            case DatabaseMetaData.functionColumnIn:
import org.jkiss.dbeaver.ext.generic.model.*;
            final JDBCResultSet dbResult;
        this.volatility = JDBCUtils.safeGetString(dbResult, "volatility");
    {
import org.jkiss.code.Nullable;
 * you may not use this file except in compliance with the License.
                );
                                parameterType = DBSProcedureParameterKind.RETURN;
    }
                    }
                        position,

                            case DatabaseMetaData.procedureColumnResult:
    private String argumentType;
        VerticaSchema container,
                        remarks,
            this.columns = new ArrayList<>();
        Iterator<? extends VerticaUDF> procIter = procedures.iterator();
                            default:
                            case DatabaseMetaData.functionReturn:

                    } else {
                    GenericProcedureParameter column = new GenericProcedureParameter(
package org.jkiss.dbeaver.ext.vertica.model;


        try (JDBCSession session = DBUtils.openMetaSession(monitor, getDataSource(), "Load procedure columns")) {
                    getCatalog() == null ?

                while (dbResult.next()) {
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
                                break;
 * See the License for the specific language governing permissions and
        throws DBException
                        this.getPackage() == null || !this.getPackage().isNameFromCatalog() ?
    {
    //private List<GenericProcedureParameter> columns;

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        } catch (SQLException e) {
    }
    public GenericCatalog getCatalog()
        setDescription(JDBCUtils.safeGetString(dbResult, "comment"));
/*
/**
                        // Some drivers do not return ordinal position (PostgreSQL) but
import org.jkiss.dbeaver.model.DBPRefreshableObject;
                                parameterType = DBSProcedureParameterKind.UNKNOWN;
}
                    }
    private String volatility;
                        }
    }
                    if (position == 0) {
        return DBUtils.getFullQualifiedName(getDataSource(),
 *
    private String type;
*/
                                break;
/*

        this.isFenced = JDBCUtils.safeGetBoolean(dbResult, "is_fenced");
 * Licensed under the Apache License, Version 2.0 (the "License");
                                parameterType = DBSProcedureParameterKind.OUT;
                    String typeName = GenericUtils.safeGetString(pcObject, dbResult, JDBCConstants.TYPE_NAME);
                        valueType,
    @Override
    @NotNull
    }
        }

                );
    @NotNull
