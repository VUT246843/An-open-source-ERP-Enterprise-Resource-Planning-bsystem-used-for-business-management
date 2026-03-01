        if (!CommonUtils.isEmpty(name)) {
            this.tableMetaData = null;
 *
            log.debug("Can't get column type ID: " + e.getMessage());
    }
            log.error(e);
        try {
                dataKind = JDBCUtils.resolveDataKind(dataSource, typeName, typeID);
 * limitations under the License.
    @Override
    }
import org.jkiss.dbeaver.model.sql.SQLDialect;
import org.jkiss.dbeaver.model.DBPDataKind;

            db.append(name);
            this.sequence = resultSetMeta.isAutoIncrement(ordinalPosition + 1);
    @NotNull
    private JDBCTableMetaData tableMetaData;
        // Sometimes [DBSPEC: Informix] it contains schema/catalog name inside
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 4)
    @Override
    }
    public Integer getScale() {
        return schemaName;
                }
        }
    @Nullable
        }
            log.debug("Can't get column nullability: " + e.getMessage());
                    final int catDivPos = fetchedTableName.indexOf(catalogSeparator);
import java.lang.reflect.Modifier;
        try {


        }

        }
    }
    private DBCExecutionSource source;

    @Override
    @Override
    }
    public String getLabel() {
            this.typeName = resultSetMeta.getColumnTypeName(ordinalPosition + 1);
    private static final Log log = Log.getLog(JDBCColumnMetaData.class);
    }

            this.scale = 0;
            this.notNull = false;
            // NumberFormatException occurred in Oracle on BLOB columns
        StringBuilder db = new StringBuilder();
    @Override
        String fetchedTableName = null;

            this.scale = resultSetMeta.getScale(ordinalPosition + 1);

    @Override
        }
        if (!CommonUtils.isEmpty(label)) {
        if (!CommonUtils.isEmpty(this.tableName)) {
    public JDBCColumnMetaData(JDBCResultSetMetaDataImpl resultSetMeta, int ordinalPosition)
 *
                SQLDialect sqlDialect = dataSource.getSQLDialect();
        return precision;

    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 2)

    private boolean notNull;
        } catch (Throwable e) {
 * See the License for the specific language governing permissions and
                if (dataType != null) {
                    if (catDivPos != -1 && (sqlDialect.getCatalogUsage() & SQLDialect.USAGE_DML) != 0) {
    private long displaySize;
            DBPDataKind dataKind = null;
    @Override
 * Unless required by applicable law or agreed to in writing, software
        return ordinalPosition;
        return catalogName;
    }
        } catch (Throwable e) {
        } else {
            catalogName = resultSetMeta.getCatalogName(ordinalPosition + 1);
    public int getTypeID() {
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 6)
        return sequence;
    }
            this.displaySize = 0;


                        return field.getName();
    }
package org.jkiss.dbeaver.model.impl.jdbc.exec;
    }
    @Override
    public DBPDataKind getDataKind() {
            {
 */
                        // Catalog in table name - extract it
        return source;
    public boolean isRequired() {
        return label;
/**
        }
    @Override
    {
        if (this.tableMetaData != null) {
    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            this.typeID = -1;
    public String getFullTypeName() {
 *
        return tableName;
 */
import org.jkiss.dbeaver.model.struct.DBSDataType;
    @NotNull
public class JDBCColumnMetaData implements DBCAttributeMetaData, DBSTypedObjectJDBC {
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 23)
        // Check for tables name
        }
                    final int schemaDivPos = fetchedTableName.indexOf(structSeparator);
    public static final String PROP_CATEGORY_COLUMN = "Column";
}
    private int typeID;
        }
            this.tableMetaData = resultSetMeta.getTableMetaData(catalogName, schemaName, tableName);
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 21)
import org.jkiss.dbeaver.model.DBUtils;
        return String.valueOf(typeID);
        // Some drivers (mysql-connector-java) return null instead of empty strings
        } catch (Exception e) {

                        catalogName = fetchedTableName.substring(0, catDivPos);
                        // Schema in table name - extract it
    private boolean sequence;
    private final String tableName;
            this.precision = 0;
            this.notNull = resultSetMeta.isNullable(ordinalPosition + 1) == ResultSetMetaData.columnNoNulls;
import org.jkiss.code.Nullable;
        return typeID;
            this.dataKind = dataKind;
                }
        }
            db.append(tableName).append('.');
        this.tableName = fetchedTableName;
 * Licensed under the Apache License, Version 2.0 (the "License");
            this.tableMetaData.addAttribute(this);
import org.jkiss.dbeaver.model.DBPDataSource;
                if (!DBUtils.isQuotedIdentifier(dataSource, fetchedTableName)) {

            log.debug("Can't get column catalog name: " + e.getMessage());
        return scale;
        return 0;
        return readOnly;
    public long getTypeModifiers() {

    public String getCatalogName() {
            log.debug("Can't get column auto increment: " + e.getMessage());
        return typeName;
        throws SQLException
        } catch (Throwable e) {
    }
        return db.toString();
import org.jkiss.dbeaver.model.exec.DBCStatement;
    private int precision;
                DBSDataType dataType = ((DBPDataTypeProvider) dataSource).getLocalDataType(typeName);

            this.displaySize = resultSetMeta.getColumnDisplaySize(ordinalPosition + 1);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.lang.reflect.Field;
import org.jkiss.dbeaver.model.meta.Property;
            this.dataKind = DBPDataKind.UNKNOWN;

        this.label = CommonUtils.notEmpty(resultSetMeta.getColumnLabel(ordinalPosition + 1));
import java.sql.ResultSetMetaData;
        try {
            this.precision = resultSetMeta.getPrecision(ordinalPosition + 1);
    public String toString() {
                    if (value != null && typeID == value) {
            this.sequence = false;
    public long getMaxLength() {
            }
            if (dataSource instanceof DBPDataTypeProvider) {
    private String typeName;
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 30)
    public JDBCColumnMetaData(DBPDataSource dataSource, ResultSetMetaData resultSetMeta, int ordinalPosition)
        } catch (Throwable e) {
        if (!CommonUtils.isEmpty(fetchedTableName) && CommonUtils.isEmpty(catalogName) && CommonUtils.isEmpty(schemaName)) {



        this.source = rsSource != null ? rsSource.getStatementSource() : null;
        try {
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
    {
        }
    public String getTypeName() {
        try {
            for (Field field : Types.class.getFields()) {
        this.ordinalPosition = ordinalPosition;
        this.readOnly = false;//resultSetMeta.isReadOnly(ordinalPosition + 1);
    private final String label;
    public String getEntityName() {
        } catch (Throwable e) {
        // read-only connections are detected separately.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }


        try {
import org.jkiss.dbeaver.model.struct.DBSTypedObjectJDBC;
        this(resultSetMeta.getResultSet().getSession().getDataSource(), resultSetMeta, ordinalPosition);
    @Override
    @NotNull
    public boolean isReadOnly() {
        try {

        } catch (Throwable e) {
        // TODO: some drivers (DB2) always mark all columns as read only. Dunno why. So let's ignore this property
    @Override
    private String schemaName;
            }
    }
        }
    public int getOrdinalPosition() {
    }
    public String getName() {
        try {
    public JDBCTableMetaData getEntityMetaData() {
    @NotNull
            log.debug("Can't get column type name: " + e.getMessage());
    }
                        fetchedTableName = fetchedTableName.substring(schemaDivPos + 1);
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 30)


        }
    @Nullable

        }
        int typeID = getTypeID();
    private int scale;

        return notNull;
import org.jkiss.code.NotNull;

        this.name = CommonUtils.notEmpty(resultSetMeta.getColumnName(ordinalPosition + 1));
 * You may obtain a copy of the License at
        return tableMetaData;
    }
        } catch (Throwable e) {
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 1)
                    final String catalogSeparator = sqlDialect.getCatalogSeparator();
    @Override
        try {
        if (!CommonUtils.isEmpty(tableName)) {
            }
        throws SQLException

    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 7)
            log.debug("Can't get column table name: " + e.getMessage());
            db.append(" as ").append(label);
    }

            log.debug("Can't get column schema name: " + e.getMessage());
    @NotNull
            this.typeName = "unknown";

    @Override

import org.jkiss.utils.CommonUtils;
/*
    }
                if ((field.getModifiers() & Modifier.STATIC) != 0 && field.getType() == Integer.TYPE) {
                    typeID = dataType.getTypeID();
    @Override
                        schemaName = fetchedTableName.substring(0, schemaDivPos);
    @Override
        }
                    if (schemaDivPos != -1 && (sqlDialect.getSchemaUsage() & SQLDialect.USAGE_DML) != 0) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
                    }
        return displaySize;
 * JDBCColumnMetaData
import java.sql.Types;
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 22)
                    dataKind = dataType.getDataKind();
 * DBeaver - Universal Database Manager
        try {
            this.typeID = typeID;
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 5)
        } catch (Throwable e) {

    private boolean readOnly;
    private String catalogName;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private DBPDataKind dataKind;

import org.jkiss.dbeaver.Log;
    @Override
                    final char structSeparator = sqlDialect.getStructSeparator();
        try {
    public DBCExecutionSource getSource() {
            fetchedTableName = resultSetMeta.getTableName(ordinalPosition + 1);

        return DBUtils.getFullTypeName(this);
        DBCStatement rsSource = resultSetMeta.getResultSet().getSourceStatement();
        }
        }
        return name;
                }
    private final int ordinalPosition;
        return dataKind;
import java.sql.SQLException;
                        fetchedTableName = fetchedTableName.substring(catDivPos + catalogSeparator.length());

    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 3)
            int typeID = resultSetMeta.getColumnType(ordinalPosition + 1);
        } catch (Throwable e) {
    private final String name;
    @NotNull
    }
                    Integer value = (Integer) field.get(null);
    public Integer getPrecision() {
    }


    }
    public String getSchemaName() {
    }
            this.writable = resultSetMeta.isWritable(ordinalPosition + 1);
        } catch (Throwable e) {
            log.debug("Can't get column writable flag: " + e.getMessage());
        } catch (Throwable e) {
                    }
        try {
import org.jkiss.dbeaver.model.DBPDataTypeProvider;
    public String getJdbcType() {
    private boolean writable;
                    }
        return writable;


            schemaName = resultSetMeta.getSchemaName(ordinalPosition + 1);
    }
    @Property(viewable = true, category = PROP_CATEGORY_COLUMN, order = 20)
    public boolean isAutoGenerated() {
            }
        }
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
 * you may not use this file except in compliance with the License.
            if (dataKind == null) {
        }
    public boolean isWritable() {
