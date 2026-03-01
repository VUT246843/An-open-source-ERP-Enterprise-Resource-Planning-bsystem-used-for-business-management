 */
    protected OBJECT makeDataType(@NotNull JDBCResultSet dbResult, String name, int valueType) {
            }

            makeDataType(owner, Types.BOOLEAN, "BOOLEAN", null, false, true, 0, 0, 0),
            makeDataType(owner, Types.BLOB, "BLOB", null, false, true, 0, 0, 0),
    // plus a few de-facto standard types
        }
    public void fillStandardTypes(OWNER owner)
        if ((valueType == Types.BINARY  && name.toLowerCase(Locale.ROOT).contains(SQLConstants.DATA_TYPE_VARCHAR)) ||
    {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner) throws SQLException

    @Override
            makeDataType(owner, Types.SMALLINT, "SMALLINT", null, false, true, 0, 0, 0),
        return object.getDataKind() != DBPDataKind.UNKNOWN;
}

import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.code.NotNull;
    {
 * See the License for the specific language governing permissions and
                this.owner,
    protected final Set<String> ignoredTypes = new HashSet<>();
/*
            makeDataType(owner, Types.VARBINARY, "VARBINARY", null, false, true, 0, 0, 0),
import org.jkiss.dbeaver.model.struct.DBSDataType;
            JDBCUtils.safeGetBoolean(dbResult, JDBCConstants.UNSIGNED_ATTRIBUTE),
            makeDataType(owner, Types.DOUBLE, "DOUBLE PRECISION", null, false, true, 0, 0, 0),

            JDBCUtils.safeGetInt(dbResult, JDBCConstants.MINIMUM_SCALE),
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;

            JDBCUtils.safeGetString(dbResult, JDBCConstants.LOCAL_TYPE_NAME),
        String name = JDBCUtils.safeGetString(dbResult, JDBCConstants.TYPE_NAME);
                remarks,
                unsigned,
        // Check for bad value type for strings: #494 && 19219
package org.jkiss.dbeaver.model.impl.jdbc.cache;
import org.jkiss.dbeaver.model.sql.SQLConstants;
        return (OBJECT) new JDBCDataType(
                maxScale);
    public DBSDataType getCachedObject(int typeID) {
    private static final Log log = Log.getLog(JDBCBasicDataTypeCache.class);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    protected boolean isValidDuplicateObject(OBJECT object) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
            (valueType == Types.JAVA_OBJECT && SQLConstants.DATA_TYPE_VARCHAR.equalsIgnoreCase(name))

    // SQL-92 standard types
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.PRECISION),

import java.sql.Types;
    private OBJECT makeDataType(OWNER owner, int valueType, String name, @Nullable String remarks, boolean unsigned, boolean searchable, int precision, int minScale, int maxScale) {
        }
            makeDataType(owner, Types.DECIMAL, "DECIMAL", null, false, true, 0, 0, 0),
            if (type.getTypeID() == typeID) {
            return null;
 * You may obtain a copy of the License at
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            valueType,
    @NotNull
    protected final OWNER owner;
            makeDataType(owner, Types.OTHER, "OBJECT", null, false, true, 0, 0, 0));
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
        ) {
public class JDBCBasicDataTypeCache<OWNER extends DBSObject, OBJECT extends JDBCDataType> extends JDBCObjectCache<OWNER, OBJECT> {
import org.jkiss.utils.CommonUtils;
        setCaseSensitive(false);
    }
 *
    @SuppressWarnings("unchecked")
        int valueType = JDBCUtils.safeGetInt(dbResult, JDBCConstants.DATA_TYPE);
 * you may not use this file except in compliance with the License.
        if (CommonUtils.isEmpty(name)) {
            makeDataType(owner, Types.REAL, "REAL", null, false, true, 0, 0, 0),
        }
        return (OBJECT) new JDBCDataType(
import org.jkiss.dbeaver.model.DBPDataKind;

            name,
                name,
    @SuppressWarnings("unchecked")

    @SuppressWarnings("unchecked")

            JDBCUtils.safeGetInt(dbResult, JDBCConstants.SEARCHABLE) != 0,
    }
 * DBeaver - Universal Database Manager
                return type;
            this.owner,
            makeDataType(owner, Types.DATE, "DATE", null, false, true, 0, 0, 0),

        if (ignoredTypes.contains(name.toUpperCase(Locale.ENGLISH))) {
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
            makeDataType(owner, Types.CLOB, "CLOB", null, false, true, 0, 0, 0),
    @NotNull
            makeDataType(owner, Types.NUMERIC, "NUMBER", null, false, true, 0, 0, 0),
 * distributed under the License is distributed on an "AS IS" BASIS,
            makeDataType(owner, Types.TIME, "TIME", null, false, true, 0, 0, 0),
 * Copyright (C) 2010-2024 DBeaver Corp and others
            makeDataType(owner, Types.FLOAT, "FLOAT", null, false, true, 0, 0, 0),
    {

    }
    @SuppressWarnings("unchecked")
    @Override
    {
 * Unless required by applicable law or agreed to in writing, software

            makeDataType(owner, Types.BIGINT, "BIGINT", null, false, true, 0, 0, 0),
            valueType = Types.VARCHAR;
            JDBCUtils.safeGetInt(dbResult, JDBCConstants.MAXIMUM_SCALE));
 *
        }
import org.jkiss.dbeaver.Log;
                minScale,
            makeDataType(owner, Types.VARCHAR, "VARCHAR", null, false, true, 0, 0, 0),
    }
        setCache(standardTypes);
            makeDataType(owner, Types.BIT, "BIT", null, false, true, 0, 0, 0),
            makeDataType(owner, Types.INTEGER, "INTEGER", null, false, true, 0, 0, 0),
    protected OBJECT fetchObject(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
    public JDBCBasicDataTypeCache(OWNER owner)
import java.util.*;
        return null;
        Collections.addAll(standardTypes,
                searchable,
    @Override
                valueType,
    }
 *
            return null;
        for (JDBCDataType<?> type : getCachedObjects()) {
import java.sql.SQLException;
        return session.getMetaData().getTypeInfo().getSourceStatement();
            makeDataType(owner, Types.TIMESTAMP, "TIMESTAMP", null, false, true, 0, 0, 0),

import org.jkiss.code.Nullable;

                precision,
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
            log.warn("Inconsistent string data type name/id: " + name + "(" + valueType + "). Setting to " + Types.VARCHAR);
        return makeDataType(dbResult, name, valueType);
        this.owner = owner;
    }
        List<OBJECT> standardTypes = new ArrayList<>();
