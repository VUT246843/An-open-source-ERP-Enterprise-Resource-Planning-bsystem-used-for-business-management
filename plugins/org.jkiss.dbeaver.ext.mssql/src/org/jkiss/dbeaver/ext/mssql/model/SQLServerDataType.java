        SQLServerTableType type = getTableType(monitor);
import org.jkiss.code.Nullable;
        if (owner instanceof SQLServerDatabase) {
            case "decimal":
            case SQLServerConstants.TYPE_TIME:
            case SQLServerConstants.TYPE_SQL_VARIANT:
 *
 */

        
                this.dataKind = systemDataType == null ? DBPDataKind.UNKNOWN : systemDataType.getDataKind();

            case SQLServerConstants.TYPE_NTEXT:


            case SQLServerConstants.TYPE_NVARCHAR:
    @Property(order = 25)
import org.jkiss.dbeaver.model.*;

        }
    @Override
        }

        }
            case "sql_variant":
            case SQLServerConstants.TYPE_NUMERIC:
            sql.append(typeName.toUpperCase(Locale.ENGLISH));
    public SQLServerDataType(DBSObject owner, ResultSet dbResult) {
/*
        if (!isTableType()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            sql.append("CREATE TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append("\n").append("FROM ");
            }
    @NotNull

        SQLServerTableType type = getTableType(monitor);
import org.jkiss.dbeaver.DBException;
    }
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        return sql.toString();
            case SQLServerConstants.TYPE_XML:

        this.maxLength = JDBCUtils.safeGetInt(dbResult, "max_length");

        this.dataKind = dataKind;
                return Types.VARBINARY;
    }
    }
            case "sysname":
            case SQLServerConstants.TYPE_FLOAT:
    }
        this.collationName = JDBCUtils.safeGetString(dbResult, "collation_name");
        if (userType) {
            case "datetime2":
    @NotNull
        return null;
    @NotNull
    private int precision;
    public Integer getPrecision() {
        this.assemblyType = JDBCUtils.safeGetInt(dbResult, "is_assembly_type") != 0;

    }
        return null;
        return DBSEntityType.TYPE;
            if (!nullable) {
        } else {
            case SQLServerConstants.TYPE_DATETIME:

    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    public List<SQLServerTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {

        return owner;
            case SQLServerConstants.TYPE_BIT:
        sql.append("-- DROP TYPE ").append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(";\n\n"); //$NON-NLS-1$ //$NON-NLS-2$
            case "text":
        }
    @Property(order = 5)
    }
    }
    @Override
        this.systemTypeId = JDBCUtils.safeGetInt(dbResult, "system_type_id");
                return Types.OTHER;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
    }
    private boolean persisted;
        if (tableTypeId == 0) {
        if (type != null) {
                return DBPDataKind.NUMERIC;
    }
                        "-- Error generating table DDL\n" +
        return null;
            return db.getSysSchema(monitor);
        return null;
public class SQLServerDataType implements DBSDataType, SQLServerObject, DBPQualifiedObject, DBPScriptObject, DBSObjectWithScript, DBSEntity {
            case "tinyint":
 * You may obtain a copy of the License at
    }
        if (owner instanceof SQLServerDatabase) return (SQLServerDatabase) owner;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                return DBPDataKind.DATETIME;
    private int tableTypeId = 0;
                } else {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

            case "int":
            default:
            case "datetime":
    @Override
            case SQLServerConstants.TYPE_BIGINT:

    }
                return Types.DECIMAL;
        return collationName;

            case "bit":
    @NotNull
    @Override

    public long getMaxLength() {
        this.precision = JDBCUtils.safeGetInt(dbResult, "precision");
            case SQLServerConstants.TYPE_DECIMAL:
                return Types.REAL;
    public String toString() {
    public SQLServerDatabase getContainer() {

    @Override
    @Nullable
    private final String name;
    @Override
        this.schemaId = JDBCUtils.safeGetLong(dbResult, "schema_id");
            case "xml":
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.tableTypeId = JDBCUtils.safeGetInt(dbResult, "type_table_object_id");

    @NotNull

            case "bigint":
        return 0;
 * SQL Server data type
    private boolean userType;
    @Override
    public void setObjectDefinitionText(String source) {
    @Override
                return DBPDataKind.OBJECT;
            case SQLServerConstants.TYPE_IMAGE:
            this.dataKind = getDataKindByName(this.name);
        if (owner instanceof SQLServerDatabase db) {
        if (isTableType) {
    @Override
    public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
 * Unless required by applicable law or agreed to in writing, software
                return DBPDataKind.DATETIME;
import org.jkiss.dbeaver.model.meta.Property;
        return schemaId;
    @Override
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
    }
            case SQLServerConstants.TYPE_TIMESTAMP:
    public String getCollationName() {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return null;
    private final DBSObject owner;
            case "timestamp":
    public SQLServerSchema getSysSchema(DBRProgressMonitor monitor) throws DBException {
                return DBPDataKind.CONTENT;
        }

            case SQLServerConstants.TYPE_VARBINARY:
    @Nullable
    @Property(order = 21)
 * distributed under the License is distributed on an "AS IS" BASIS,
                return Types.BIT;

    }
            SQLServerTypedObject serverTypedObjects = new SQLServerTypedObject(typeName, getDataTypeIDByName(typeName), dataKind, scale, precision, maxLength);
import java.util.Map;
        }
            case "nchar":
        return null;
            case SQLServerConstants.TYPE_SMALLINT:
                return ds.getDefaultDatabase(monitor) != null ? ds.getDefaultDatabase(monitor).getSysSchema(monitor) : null;
package org.jkiss.dbeaver.ext.mssql.model;
            return type.getAttribute(monitor, attributeName);
    public String getFullTypeName() {
    public Collection<SQLServerTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
            case SQLServerConstants.TYPE_INT:
        return persisted;
            case SQLServerConstants.TYPE_VARCHAR:

        return dataKind;

        }
        return (SQLServerDataSource) owner.getDataSource();


    }
                return Types.VARCHAR;
    public int getMaxScale() {

                this.dataKind = DBPDataKind.OBJECT;
            }
    @Override
                return Types.TIMESTAMP;
    }
                return Types.NCHAR;
            case SQLServerConstants.TYPE_CHAR:
                return Types.BIGINT;
        switch (systemTypeName) {
    @Property(order = 70)
            } catch (DBException e) {
            case "geometry":

                return Types.NVARCHAR;
        return owner instanceof SQLServerDatabase db ? db.getSchema(monitor, schemaId) : null;
        return DBUtils.getDefaultOperators(this);
    public Integer getScale() {
            case "hierarchyid":
import org.jkiss.dbeaver.model.exec.DBCException;
    }
        SQLServerSchema sysSchema = owner instanceof SQLServerDatabase db ? db.getSchema(monitor, tableTypeSchemaId) : null;
    }
 * See the License for the specific language governing permissions and
    @Override
            String typeName = systemDataType.getName();
            if (modifiers != null) {
        return null;

    @Override
    }
 *
    }

    @Override
            }

    public boolean isTableType() {
                }
    }
    }
        return userTypeId;
    public String getTypeName() {
    @Nullable


    }
                return Types.SMALLINT;
            }
import java.util.Locale;

                return Types.OTHER;
    public long getObjectId() {
                return Types.VARBINARY;

    public long getTypeModifiers() {
    public boolean isUserType() {
            case "ntext":
        this.name = name;
            case "uniqueidentifier":
        this.userType = JDBCUtils.safeGetInt(dbResult, "is_user_defined") != 0;
            case SQLServerConstants.TYPE_TEXT:
        return null;
            if (owner instanceof SQLServerDataSource ds) {



    public Collection<SQLServerTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
        return name;
        return owner instanceof SQLServerSchema ?
import org.jkiss.utils.CommonUtils;
            case SQLServerConstants.TYPE_GEOMETRY:

    private boolean assemblyType;

    public String getDescription() {
            return type.getConstraints(monitor);
            String modifiers = SQLUtils.getColumnTypeModifiers(getDataSource(), serverTypedObjects, typeName, dataKind);
            case SQLServerConstants.TYPE_DATETIMEOFFSET:
    public int getTableTypeId() {
        this.owner = owner;

    public SQLServerDataSource getDataSource() {
        switch (systemTypeName) {
            SQLServerTableType tableType = sysSchema.getTableType(monitor, tableTypeId);
 */
            } else {
                if (tableType != null) {
                return tableType;
        return tableTypeId;
            case SQLServerConstants.TYPE_UNIQUEIDENTIFIER:

    public static DBPDataKind getDataKindByName(String systemTypeName) {
        } else {
        this.persisted = true;
    public boolean isAssemblyType() {
            case "date":
        StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.Log;
    public DBSEntityType getEntityType() {
                return DBPDataKind.BINARY;
    @Override
    }
        return ((SQLServerDataSource) owner).getDefaultDatabase(new VoidProgressMonitor()); // Monitor is not significant here, so we can use Void monitor
        return userTypeId;
    @Property(order = 20)
                    options.put(DBPScriptObject.OPTION_USE_SPECIAL_NAME, name);
            return null;

    }
    @Override
                return Types.BINARY;
        return scale;

    }
        this.valueType = valueType;
                return DBPDataKind.BINARY;
                return Types.INTEGER;
    @Property(order = 24)
            case "smallmoney":
        }
    @NotNull
            case "sysname":
    private boolean nullable;
            case "char":
                return Types.TIMESTAMP;
            case "smallint":
            default:
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        SQLServerTableType type = getTableType(monitor);
    private String collationName;
            if (tableType != null) {
    private int scale;
        }
            DBUtils.getFullQualifiedName(getDataSource(), ((SQLServerSchema) owner).getDatabase(), owner, this) :
            case "nvarchar":

 * DBeaver - Universal Database Manager
                        "-- Table type " + tableTypeId + " not found in system catalog (" + tableTypeSchemaId + ")";

    public boolean isNullable() {
    @NotNull
        return this;
    }
        this.nullable = JDBCUtils.safeGetInt(dbResult, "is_nullable") != 0;
            case SQLServerConstants.TYPE_DATETIME2:

    long getSchemaId() {
    public Collection<SQLServerTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
    }
                return DBPDataKind.STRING;
import org.jkiss.dbeaver.model.struct.*;
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;


    private SQLServerTableType getTableType(@NotNull DBRProgressMonitor monitor) throws DBException {
            case "time":

    @Nullable
                return Types.CHAR;
    private final int valueType;
    private int tableTypeSchemaId = 0;
        }
    @NotNull

 * limitations under the License.
    @Override
        this.systemTypeId = userTypeId = systemId;
    public int getMinScale() {
            log.debug("Table type " + tableTypeId + " schema " + tableTypeSchemaId + " not found in database");
        this.scale = JDBCUtils.safeGetInt(dbResult, "scale");

    }
        }
        return valueType;
            case "image":
    @Override
        return assemblyType;
import java.util.List;
        this.owner = owner;
        if (type != null) {
        return maxLength;
                SQLServerDataType systemDataType = getSystemDataType();
            case SQLServerConstants.TYPE_GEOGRAPHY:
            } else {
 * you may not use this file except in compliance with the License.

            case "geography":
                log.debug("Table type " + tableTypeId + " not found in schema " + sysSchema.getName());

    public boolean isPersisted() {
        return nullable;
            return getDataSource().getSystemDataType(systemTypeId);
                SQLServerTableType tableType = getTableType(monitor);
                return DBPDataKind.STRING;
                log.debug("Cannot load table type definition", e);
                return Types.SQLXML;
    }
                return Types.TIME;
            case SQLServerConstants.TYPE_MONEY:
            case "varchar":

    @Nullable


        }
    @Override
        boolean isTableType = JDBCUtils.safeGetInt(dbResult, "is_table_type") != 0;
import java.sql.Types;
            case SQLServerConstants.TYPE_NCHAR:
 *
            if (systemTypeId == SQLServerConstants.TABLE_TYPE_SYSTEM_ID) { // 243 - ID of user defined table types
    public SQLServerSchema getSchema(DBRProgressMonitor monitor) throws DBException {
            case "real":
    @Override
            case SQLServerConstants.TYPE_HIERARCHYID:
        if (userType) {
                sql.append(" NOT NULL;");

            this.tableTypeSchemaId = JDBCUtils.safeGetInt(dbResult, "type_table_schema_id");
    @Override
import java.sql.ResultSet;
                return Types.VARCHAR;
                return Types.VARCHAR;
            return (SQLServerDatabase) owner;
                return Types.TIMESTAMP;
    public SQLServerDatabase getDatabase() {
    @Nullable

    }
    }
                this.valueType = Types.OTHER;
            case "binary":
    public DBSObject getParentObject() {
    @Override
            }
    }
                sql.append(modifiers);
            case SQLServerConstants.TYPE_BINARY:
        String nameValue = JDBCUtils.safeGetString(dbResult, "name");
    @Override
    @Override
    @Property(order = 26)
    @Property(order = 80)
            case SQLServerConstants.TYPE_REAL:
    }
            case SQLServerConstants.TYPE_SMALLMONEY:
            case "float":
                return Types.FLOAT;
                return Types.NUMERIC;
}
    public SQLServerDataType(DBSObject owner, String name, int systemId, DBPDataKind dataKind, int valueType) {
        }
            case SQLServerConstants.TYPE_TINYINT:
    public SQLServerDataType getComponentType(@NotNull DBRProgressMonitor monitor) {
            case "datetimeoffset":
    @Override
        this.userTypeId = JDBCUtils.safeGetInt(dbResult, "user_type_id");

    }

    }
    public static int getDataTypeIDByName(String systemTypeName) {
import org.jkiss.code.NotNull;
        this.name = DBUtils.getUnQuotedIdentifier(owner.getDataSource(), CommonUtils.notEmpty(nameValue));
        return tableTypeId != 0;
        return DBUtils.getFullTypeName(this);
    private int maxLength;
                return DBPDataKind.CONTENT;


            case SQLServerConstants.TYPE_DATE:
            case "varbinary":
    }
        return scale == 0 ? null : scale;
    public int getTypeID() {
        return scale;
    }
    private final int systemTypeId;
    @Override
            this.valueType = getDataTypeIDByName(this.name);
    private final int userTypeId;
    @Nullable
        return precision == 0 ? null : precision;

    @Nullable
    }
    @Override
        return getFullyQualifiedName(DBPEvaluationContext.DDL);
        return getFullyQualifiedName(DBPEvaluationContext.UI);
            case "numeric":
    public DBPDataKind getDataKind() {
        if (sysSchema != null) {

    private final DBPDataKind dataKind;

                return Types.TINYINT;
    @Override
    @Property(order = 22)
        return null;


            return type.getAttributes(monitor);
    }
        } else {
    }
    private static final Log log = Log.getLog(SQLServerDataType.class);
                    return


 * Copyright (C) 2010-2025 DBeaver Corp and others
            name;
import org.jkiss.dbeaver.model.sql.SQLUtils;
            case SQLServerConstants.TYPE_SMALLDATETIME:
                return Types.BINARY;
                    String objectDefinitionText = tableType.getObjectDefinitionText(monitor, options);


                    sql.append(objectDefinitionText);
    }
    }
            try {
            case "smalldatetime":

    @Property(order = 23)
    }
/**
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBCException {

import java.util.Collection;
    public String getName() {
                return Types.DATE;

    public Object geTypeExtension() {
            case "money":
    @NotNull
    private long schemaId;
    }
    public SQLServerTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    }

        } else {
        return null;
    public SQLServerDataType getSystemDataType() {
                this.valueType = systemDataType == null ? Types.OTHER : systemDataType.getTypeID();
        if (type != null) {
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
        return userType;
            SQLServerDataType systemDataType = getSystemDataType();
    @Override
                return DBPDataKind.OBJECT;

