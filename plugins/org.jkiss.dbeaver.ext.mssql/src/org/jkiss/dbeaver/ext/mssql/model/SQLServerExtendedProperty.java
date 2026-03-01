        }
    @Override
/*
    public SQLServerExtendedProperty(@NotNull SQLServerExtendedPropertyOwner owner, @NotNull SQLServerDataType type, @NotNull String name, @NotNull String value) {
        this.value = value;

            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_TEXT);
import org.jkiss.dbeaver.model.sql.SQLUtils;

            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_DATETIMEOFFSET);
    @Override
    }
        this.name = name;
            update ? "sp_updateextendedproperty" : delete ? "sp_dropextendedproperty" : "sp_addextendedproperty"
    public SQLServerExtendedProperty(@NotNull DBRProgressMonitor monitor, @NotNull SQLServerExtendedPropertyOwner owner, @NotNull ResultSet dbResult) throws DBException {

    private static void appendLevelDefinitionText(@NotNull StringBuilder ddl, @NotNull SQLDialect dialect, @NotNull Pair<String, SQLServerObject> level, int index) {
    public SQLServerDataType getValueType() {
    public String getName() {
 * DBeaver - Universal Database Manager
        }

import java.util.HashSet;
import org.jkiss.code.Nullable;
    private final SQLServerExtendedPropertyOwner owner;
        return owner.getDatabase();

        return name;
 *
            // https://docs.microsoft.com/en-us/sql/t-sql/data-types/sql-variant-transact-sql#restrictions


    @Property(viewable = true, editable = true, updatable = true, order = 3, listProvider = DataTypeListProvider.class)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static final Log log = Log.getLog(SQLServerExtendedProperty.class);

    @NotNull
        this.value = JDBCUtils.safeGetString(dbResult, "value");
        }
        public Object[] getPossibleValues(SQLServerExtendedProperty object) {
        if (level0 == null || (level1 == null && level2 == null)) {
    @NotNull
import java.util.Set;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_SQL_VARIANT);
    @Override
import java.util.Map;
import org.jkiss.dbeaver.model.struct.DBSObject;
            appendLevelDefinitionText(ddl, dialect, level1, 1);
    }
    @Override
        @Nullable
import org.jkiss.code.NotNull;


import org.jkiss.dbeaver.Log;

        if (type == null) {


    }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

        this.name = JDBCUtils.safeGetString(dbResult, "name");

    }

    }
    private String name;
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_NTEXT);
            ddl.append(", @value=").append(SQLUtils.convertValueToSQL(getDataSource(), type, value));
    public SQLServerDatabase getDatabase() {
        if (level2 != null) {
    @NotNull
        final SQLDialect dialect = SQLUtils.getDialectFromObject(this);

import org.jkiss.dbeaver.model.DBPUniqueObject;
    @NotNull
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_IMAGE);
        return persisted;
 *
        }
            owner.getDatabase(),
import org.jkiss.dbeaver.model.DBPScriptObject;
        this.owner = owner;

        ddl.append(", @level").append(index).append("type=").append(dialect.getQuotedString(level.getFirst()));
        this.type = type;
        SQLServerDataType type = owner.getDatabase().getDataTypeByUserTypeId(monitor, JDBCUtils.safeGetInt(dbResult, "value_type"));
        @Override

        }
    public String getObjectDefinitionText(DBRProgressMonitor monitor, boolean update, boolean delete) throws DBException {
        return owner.getDataSource();
        return name + ':' + owner.getMajorObjectId() + ':' + owner.getMinorObjectId();
 */
    }
        final Pair<String, SQLServerObject> level1 = owner.getExtendedPropertyObject(monitor, 1);
    @Override
        if (update && delete) {
            log.debug("Can't get definition for extended property of class '" + owner.getExtendedPropertyObjectClass().getClassName() + "'");
    private String value;
import org.jkiss.dbeaver.model.meta.Property;
    public String getDescription() {
    public long getObjectId() {
        this.name = name;
    }
        }
        this.value = value;

            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_GEOGRAPHY);
        }
        ));

    }
            type = getDataSource().getLocalDataType(SQLServerConstants.TYPE_NVARCHAR);
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_XML);
    public SQLServerDataSource getDataSource() {
 *
    }


        this.owner = owner;
}

    private SQLServerDataType type;
    @Property(viewable = true, editable = true, updatable = true, order = 2)
    @NotNull
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_GEOMETRY);

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPNamedObject2;

        this.type = type;
        if (!delete) {
        }
    public void setValueType(@NotNull SQLServerDataType type) {
    @Nullable
import org.jkiss.utils.CommonUtils;
        ddl.append(" @name=").append(dialect.getQuotedString(name));
    @NotNull
        public boolean allowCustomValue() {

    private final boolean persisted;
        this.type = type;
import org.jkiss.utils.Pair;
        if (objectClass != owner.getExtendedPropertyObjectClass() || majorId != owner.getMajorObjectId() || minorId != owner.getMinorObjectId()) {

            return null;
    public boolean isPersisted() {
        return CommonUtils.toString(value, null);
    public void setValue(@Nullable String value) {
        private static final Set<String> RESTRICTED_TYPE_NAMES;
 * You may obtain a copy of the License at
    @Property(viewable = true, editable = true, order = 1)
            throw new DBException("Can't get object definition text for both 'update' and 'delete'");
                .filter(type -> !RESTRICTED_TYPE_NAMES.contains(type.getName()))
        final long majorId = JDBCUtils.safeGetLong(dbResult, "major_id");
    public SQLServerExtendedPropertyOwner getParentObject() {
        final SQLServerObjectClass objectClass = CommonUtils.valueOf(SQLServerObjectClass.class, JDBCUtils.safeGetStringTrimmed(dbResult, "class_desc"));
    }
        }
        return getObjectDefinitionText(monitor, false, false);
public class SQLServerExtendedProperty implements SQLServerObject, DBPUniqueObject, DBPRefreshableObject, DBPScriptObject, DBPNamedObject2 {
        @Override
        final long minorId = JDBCUtils.safeGetLong(dbResult, "minor_id");
            RESTRICTED_TYPE_NAMES = new HashSet<>();

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        return owner.getMinorObjectId();
            appendLevelDefinitionText(ddl, dialect, level2, 2);

            return object.getDataSource().getLocalDataTypes().stream()
    }
    }
    }
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return type;
            RESTRICTED_TYPE_NAMES.add(SQLServerConstants.TYPE_HIERARCHYID);
    public static class DataTypeListProvider implements IPropertyValueListProvider<SQLServerExtendedProperty> {

                .toArray();
        this.persisted = false;
            throw new DBException("Extended property owner mismatch");
    @Override

    public String getValue() {
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.mssql.SQLServerConstants;
    @Override
    @Override
        ddl.append(SQLServerUtils.getSystemTableName(
import org.jkiss.dbeaver.model.sql.SQLDialect;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

        return ddl.toString();
import java.sql.ResultSet;
        static {
        final StringBuilder ddl = new StringBuilder("EXEC ");


    @Nullable
    }
    public String getUniqueName() {
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.ext.mssql.model;
    }
        this.persisted = true;
        final Pair<String, SQLServerObject> level0 = owner.getExtendedPropertyObject(monitor, 0);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        return owner.getExtendedPropertyCache().refreshObject(monitor, owner, this);
    @Nullable
        ddl.append(", @level").append(index).append("name=").append(dialect.getQuotedString(level.getSecond().getName()));

        if (level1 != null) {
        return owner;
        return null;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            return false;
 * limitations under the License.

    public void setName(@NotNull String name) {

import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        final Pair<String, SQLServerObject> level2 = owner.getExtendedPropertyObject(monitor, 2);
        appendLevelDefinitionText(ddl, dialect, level0, 0);

    }
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;

 * you may not use this file except in compliance with the License.
    }
    }
    @Nullable
        }

