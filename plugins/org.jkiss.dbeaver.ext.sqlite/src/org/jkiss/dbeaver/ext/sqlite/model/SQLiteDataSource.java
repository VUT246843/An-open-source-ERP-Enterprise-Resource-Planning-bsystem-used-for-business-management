 *
import java.util.Locale;
    ) throws DBException {
            affinity = defaultAffinity();
    public boolean supportsStrictTyping() {
    protected Map<String, String> getInternalConnectionProperties(
    }
import org.jkiss.dbeaver.ext.generic.model.GenericDataSource;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
            affinity = SQLiteAffinity.BLOB;
        } else {

    }

    @NotNull
import org.jkiss.dbeaver.model.sql.SQLDialect;
        return super.getLocalDataType(affinity.name());
        return true;
import org.jkiss.dbeaver.model.exec.DBCException;
        if (typeName == null) {
    }
    public SQLiteDataSource(
package org.jkiss.dbeaver.ext.sqlite.model;
 * you may not use this file except in compliance with the License.
        @NotNull DBRProgressMonitor monitor,
    public ErrorType discoverErrorType(@NotNull Throwable error) {
        @NotNull DBRProgressMonitor monitor,
        connectionsProps.put("enable_load_extension", String.valueOf(true));
        @NotNull DBPConnectionConfiguration connectionInfo
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    }
            connectionsProps.put("open_mode", "1");  //1 == readonly
    }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.connection.DBPDriver;
        }
        return false;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull JDBCExecutionContext context,
        @NotNull String purpose,
import org.jkiss.dbeaver.model.struct.DBSDataType;
        // If type is unknown, let's assume it's a text. Otherwise, search and data editor doesn't work right.
 *

import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
        return SQLiteTable.class;
    }
        } else if (typeName.contains("BLOB") || typeName.contains("GUID")) {
        if (error instanceof SQLException && ((SQLException) error).getErrorCode() == 19) {
    @Override


    @NotNull
        return new SQLiteDataSourceInfo(container.getDriver(), metaData);

            // Read-only prop
    @Override
        typeName = typeName.toUpperCase(Locale.ENGLISH);
import org.jkiss.dbeaver.model.DBPDataSourceInfo;
    @Override
import org.jkiss.code.NotNull;

        // Resolve type name according to https://www.sqlite.org/datatype3.html
        SQLiteAffinity affinity;
import java.sql.SQLException;
        }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCExecutionContext;
            affinity = SQLiteAffinity.TEXT;
        @NotNull SQLDialect dialect

        }

        return super.discoverErrorType(error);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        if (getContainer().isConnectionReadOnly()) {
import org.jkiss.dbeaver.model.sql.SQLConstants;
    }
        } else if (typeName.startsWith("REAL") || typeName.startsWith("FLOA") || typeName.startsWith("DOUB")) {
        @NotNull DBPDataSourceContainer container,
}
    @Override
import java.util.Map;
public class SQLiteDataSource extends GenericDataSource {
    }

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
/*
    }
            typeName.contains("BOOL")) {
        } else if (typeName.contains("CHAR") || typeName.contains("CLOB") || typeName.contains("TEXT") || typeName.startsWith("DATE") || typeName.startsWith("TIME")) {
        @NotNull DBPDataSourceContainer container,
    public SQLiteDataSource(
        return isServerVersionAtLeast(3, 37);
            // SQLite doesn't have a specific Exception SQL state for the constraint violation, but it has a specific vendor code
import org.jkiss.code.Nullable;
import java.util.HashMap;
    }

            affinity = SQLiteAffinity.REAL;
 */
    protected boolean isConnectionReadOnlyBroken() {
 * Unless required by applicable law or agreed to in writing, software
            affinity = SQLiteAffinity.INTEGER;
        } else if (typeName.contains(SQLConstants.DATA_TYPE_INT) || typeName.contains("NUMERIC") || typeName.contains("DECIMAL") ||
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    @Nullable
 *
        if (typeName.startsWith(SQLConstants.DATA_TYPE_INT)) {
        super(monitor, container, metaModel, dialect);
            affinity = SQLiteAffinity.NUMERIC;
            return super.getLocalDataType(defaultAffinity().name());
    protected boolean isPopulateClientAppName() {

    ) throws DBCException {
        @NotNull DBPDriver driver,

        Map<String, String> connectionsProps = new HashMap<>();
    @Override
            return ErrorType.UNIQUE_KEY_VIOLATION;
    protected DBPDataSourceInfo createDataSourceInfo(DBRProgressMonitor monitor, @NotNull JDBCDatabaseMetaData metaData) {
        GenericMetaModel metaModel

        // except for the GUID type name considered as BLOB to allow its conversion to UUID
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

        super(monitor, container, metaModel, new SQLiteSQLDialect());
    private static SQLiteAffinity defaultAffinity() {
    ) throws DBException {
    public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {

        return connectionsProps;
    public DBSDataType getLocalDataType(@Nullable String typeName) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
        @NotNull GenericMetaModel metaModel,
        return SQLiteAffinity.TEXT;
